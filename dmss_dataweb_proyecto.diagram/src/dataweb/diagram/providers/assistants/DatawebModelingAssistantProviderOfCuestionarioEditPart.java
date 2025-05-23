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

import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.RedSocialEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.providers.DatawebElementTypes;
import dataweb.diagram.providers.DatawebModelingAssistantProvider;

/**
 * @generated
 */
public class DatawebModelingAssistantProviderOfCuestionarioEditPart extends DatawebModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CuestionarioEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CuestionarioEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DatawebElementTypes.PaginaPantallaUsuario_4007);
		types.add(DatawebElementTypes.PaginaPantallaRedsocial_4008);
		types.add(DatawebElementTypes.PaginaPantallaEntidad_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CuestionarioEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CuestionarioEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RolEditPart) {
			types.add(DatawebElementTypes.PaginaPantallaUsuario_4007);
		}
		if (targetEditPart instanceof RedSocialEditPart) {
			types.add(DatawebElementTypes.PaginaPantallaRedsocial_4008);
		}
		if (targetEditPart instanceof EntidadEditPart) {
			types.add(DatawebElementTypes.PaginaPantallaEntidad_4009);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CuestionarioEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CuestionarioEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.PaginaPantallaUsuario_4007) {
			types.add(DatawebElementTypes.Rol_2013);
		} else if (relationshipType == DatawebElementTypes.PaginaPantallaRedsocial_4008) {
			types.add(DatawebElementTypes.RedSocial_2014);
		} else if (relationshipType == DatawebElementTypes.PaginaPantallaEntidad_4009) {
			types.add(DatawebElementTypes.Entidad_3005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CuestionarioEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(CuestionarioEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DatawebElementTypes.RolAccesoapaginapantalla_4005);
		types.add(DatawebElementTypes.RedSocialPaginapantalla_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CuestionarioEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(CuestionarioEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DatawebElementTypes.RolAccesoapaginapantalla_4005) {
			types.add(DatawebElementTypes.Rol_2013);
		} else if (relationshipType == DatawebElementTypes.RedSocialPaginapantalla_4006) {
			types.add(DatawebElementTypes.RedSocial_2014);
		}
		return types;
	}

}
