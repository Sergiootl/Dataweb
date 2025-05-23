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
import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.IndexEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoEditPart;
import dataweb.diagram.edit.parts.NormalEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebModelingAssistantProvider;

/**
 * @generated
 */
public class DatawebModelingAssistantProviderOfRolEditPart extends DatawebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RolEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RolEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DatawebElementTypes.RolEntidades_4004);
		types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RolEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RolEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntidadEditPart) {
			types.add(DatawebElementTypes.RolEntidades_4004);
		}
		if (targetEditPart instanceof IndiceExtendidoEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof IndiceEntidadEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof IndiceDetalleEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof CrearInstanciaEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof DetallesInstanciaEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof ActualizacionInstanciaEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof BorradoInstanciaEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof CuestionarioEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof EncuestaEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof CRUDEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof NormalEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		if (targetEditPart instanceof IndexEditPart) {
			types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RolEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RolEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.RolEntidades_4004) {
			types.add(DatawebElementTypes.Entidad_3005);
		} else if (relationshipType == DatawebElementTypes.RolAccesoapaginapantalla_4005) {
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
		return doGetRelTypesOnTarget((RolEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RolEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DatawebElementTypes.EntidadUsuarios_4002);
		types.add(DatawebElementTypes.PaginaPantallaUsuario_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RolEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RolEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.EntidadUsuarios_4002) {
			types.add(DatawebElementTypes.Entidad_3005);
		} else if (relationshipType == DatawebElementTypes.PaginaPantallaUsuario_4007) {
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
