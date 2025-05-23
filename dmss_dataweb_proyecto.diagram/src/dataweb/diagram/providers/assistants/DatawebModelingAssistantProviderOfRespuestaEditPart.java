/*
 * 
 */
package dataweb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dataweb.diagram.edit.parts.RespuestaEditPart;
import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebModelingAssistantProvider;

/**
 * @generated
 */
public class DatawebModelingAssistantProviderOfRespuestaEditPart extends DatawebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RespuestaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RespuestaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DatawebElementTypes.PreguntaRcorrecta_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RespuestaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RespuestaEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.PreguntaRcorrecta_4003) {
			types.add(DatawebElementTypes.Pregunta_3001);
			types.add(DatawebElementTypes.Pregunta_3003);
		}
		return types;
	}

}
