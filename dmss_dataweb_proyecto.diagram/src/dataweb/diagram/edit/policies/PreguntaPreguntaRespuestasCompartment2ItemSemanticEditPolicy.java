/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dataweb.diagram.edit.commands.RespuestaCreateCommand;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class PreguntaPreguntaRespuestasCompartment2ItemSemanticEditPolicy extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PreguntaPreguntaRespuestasCompartment2ItemSemanticEditPolicy() {
		super(DatawebElementTypes.Pregunta_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatawebElementTypes.Respuesta_3002 == req.getElementType()) {
			return getGEFWrapper(new RespuestaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
