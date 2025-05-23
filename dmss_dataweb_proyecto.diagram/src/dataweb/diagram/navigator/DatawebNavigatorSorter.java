/*
* 
*/
package dataweb.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import dataweb.diagram.part.DatawebVisualIDRegistry;

/**
 * @generated
 */
public class DatawebNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7009;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7008;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof DatawebNavigatorItem) {
			DatawebNavigatorItem item = (DatawebNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DatawebVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
