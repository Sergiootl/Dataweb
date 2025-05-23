/*
 * 
 */
package dataweb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dataweb.diagram.edit.parts.ActualizacionInstanciaEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaEditPart;
import dataweb.diagram.edit.parts.CRUDEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaEditPart;
import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaEditPart;
import dataweb.diagram.edit.parts.EncuestaEditPart;
import dataweb.diagram.edit.parts.IndexEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoEditPart;
import dataweb.diagram.edit.parts.NormalEditPart;
import dataweb.diagram.edit.parts.RedSocialEditPart;
import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebModelingAssistantProvider;

/**
 * @generated
 */
public class DatawebModelingAssistantProviderOfRedSocialEditPart extends DatawebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RedSocialEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RedSocialEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RedSocialEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RedSocialEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IndiceExtendidoEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof IndiceEntidadEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof IndiceDetalleEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof CrearInstanciaEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof DetallesInstanciaEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof ActualizacionInstanciaEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof BorradoInstanciaEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof CuestionarioEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof EncuestaEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof CRUDEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof NormalEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		if (targetEditPart instanceof IndexEditPart) {
			types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RedSocialEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RedSocialEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.RedSocialPaginapantalla_4006) {
			types.add(DatawebElementTypes.IndiceExtendido_2001);
			types.add(DatawebElementTypes.IndiceEntidad_2002);
			types.add(DatawebElementTypes.IndiceDetalle_2003);
			types.add(DatawebElementTypes.CrearInstancia_2004);
			types.add(DatawebElementTypes.DetallesInstancia_2005);
			types.add(DatawebElementTypes.ActualizacionInstancia_2006);
			types.add(DatawebElementTypes.BorradoInstancia_2007);
			types.add(DatawebElementTypes.Cuestionario_2008);
			types.add(DatawebElementTypes.Encuesta_2009);
			types.add(DatawebElementTypes.CRUD_2010);
			types.add(DatawebElementTypes.Normal_2011);
			types.add(DatawebElementTypes.Index_2012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RedSocialEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RedSocialEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DatawebElementTypes.PaginaPantallaRedsocial_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RedSocialEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RedSocialEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.PaginaPantallaRedsocial_4008) {
			types.add(DatawebElementTypes.IndiceExtendido_2001);
			types.add(DatawebElementTypes.IndiceEntidad_2002);
			types.add(DatawebElementTypes.IndiceDetalle_2003);
			types.add(DatawebElementTypes.CrearInstancia_2004);
			types.add(DatawebElementTypes.DetallesInstancia_2005);
			types.add(DatawebElementTypes.ActualizacionInstancia_2006);
			types.add(DatawebElementTypes.BorradoInstancia_2007);
			types.add(DatawebElementTypes.Cuestionario_2008);
			types.add(DatawebElementTypes.Encuesta_2009);
			types.add(DatawebElementTypes.CRUD_2010);
			types.add(DatawebElementTypes.Normal_2011);
			types.add(DatawebElementTypes.Index_2012);
		}
		return types;
	}

}
