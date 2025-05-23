/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dataweb.diagram.edit.commands.Pregunta2CreateCommand;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class EncuestaEncuestaPreguntasECompartmentItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EncuestaEncuestaPreguntasECompartmentItemSemanticEditPolicy() {
		super(DatawebElementTypes.Encuesta_2009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatawebElementTypes.Pregunta_3003 == req.getElementType()) {
			return getGEFWrapper(new Pregunta2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
