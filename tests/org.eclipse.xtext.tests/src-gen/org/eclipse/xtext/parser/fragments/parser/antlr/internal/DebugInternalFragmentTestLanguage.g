/*
 * generated by Xtext
 */
grammar DebugInternalFragmentTestLanguage ;

// Rule ParserRuleFragments
ruleParserRuleFragments :
	'#1' rulePRFNamed |
	'#2' rulePRFNamed '->' RULE_ID |
	'#3' rulePRFNamedRefFirst |
	'#4' rulePRFNamedWithAction |
	'#8' rulePRFNamedWithFQN |
	'#9' rulePRFWithPredicate
;

// Rule PRFNamed
rulePRFNamed :
	rulePRFNamedFragment (
		':' RULE_ID |
		'-' rulePRFNamedRef
	)?
;

// Rule PRFNamedRefFirst
rulePRFNamedRefFirst :
	RULE_ID '<-' rulePRFNamedFragment
;

// Rule PRFNamedWithAction
rulePRFNamedWithAction :
	rulePRFNamed RULE_ID (
		RULE_ID RULE_ID
	)?
;

// Rule PRFNamedWithFQN
rulePRFNamedWithFQN :
	ruleFQN (
		'-' ruleFQN2
	)?
;

// Rule PRFWithPredicate
rulePRFWithPredicate :
	rulePRFNamedFragment ( (
	'-' rulePRFNamedRef
	) => (
		'-' rulePRFNamedRef
	) )?
;

// Rule FQN
ruleFQN :
	RULE_ID ruleSuffix?
;

// Rule FQN2
ruleFQN2 :
	RULE_ID ruleSuffix2*
;

// Rule Suffix
ruleSuffix :
	'.' RULE_ID ruleSuffix?
;

// Rule Suffix2
ruleSuffix2 :
	'.' RULE_ID
;

// Rule PRFNamedFragment
rulePRFNamedFragment :
	RULE_ID
;

// Rule PRFNamedRef
rulePRFNamedRef :
	RULE_ID
;

RULE_ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_' |
		'0' .. '9'
	)*
;

RULE_INT :
	'0' .. '9'+
;

RULE_STRING :
	'"' (
		'\\' . |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' . |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

RULE_ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/' { skip(); }
;

RULE_SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)? { skip(); }
;

RULE_WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+ { skip(); }
;

RULE_ANY_OTHER :
	.
;