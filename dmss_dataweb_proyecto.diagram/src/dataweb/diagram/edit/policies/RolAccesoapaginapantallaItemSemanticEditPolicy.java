/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class RolAccesoapaginapantallaItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RolAccesoapaginapantallaItemSemanticEditPolicy() {
		super(DatawebElementTypes.RolAccesoapaginapantalla_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
