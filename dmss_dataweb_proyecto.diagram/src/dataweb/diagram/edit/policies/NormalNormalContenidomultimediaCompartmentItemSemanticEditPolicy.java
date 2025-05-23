/*
* 
*/
package dataweb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dataweb.diagram.edit.commands.ContenidoMultimediaCreateCommand;
import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class NormalNormalContenidomultimediaCompartmentItemSemanticEditPolicy
		extends DatawebBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NormalNormalContenidomultimediaCompartmentItemSemanticEditPolicy() {
		super(DatawebElementTypes.Normal_2011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatawebElementTypes.ContenidoMultimedia_3004 == req.getElementType()) {
			return getGEFWrapper(new ContenidoMultimediaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
