/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dataweb.diagram.edit.commands.EntidadCreateCommand;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class BaseDatosBaseDatosTablasCompartmentItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BaseDatosBaseDatosTablasCompartmentItemSemanticEditPolicy() {
		super(DatawebElementTypes.BaseDatos_2015);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatawebElementTypes.Entidad_3005 == req.getElementType()) {
			return getGEFWrapper(new EntidadCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
