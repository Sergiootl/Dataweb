/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dataweb.diagram.edit.commands.PreguntaCreateCommand;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class CuestionarioCuestionarioPreguntasCCompartmentItemSemanticEditPolicy
		extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CuestionarioCuestionarioPreguntasCCompartmentItemSemanticEditPolicy() {
		super(DatawebElementTypes.Cuestionario_2008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatawebElementTypes.Pregunta_3001 == req.getElementType()) {
			return getGEFWrapper(new PreguntaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
