/**
 * generated by Xtext
 */
package org.eclipse.xtext.idea.sdomain.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class SDomainLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public SDomainLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
