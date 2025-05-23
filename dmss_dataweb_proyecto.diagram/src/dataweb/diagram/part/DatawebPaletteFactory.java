
/*
 * 
 */
package dataweb.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import dataweb.diagram.providers.DatawebElementTypes;

/**
 * @generated
 */
public class DatawebPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActualizacionInstancia1CreationTool());
		paletteContainer.add(createAtributo2CreationTool());
		paletteContainer.add(createBaseDatos3CreationTool());
		paletteContainer.add(createBorradoInstancia4CreationTool());
		paletteContainer.add(createCRUD5CreationTool());
		paletteContainer.add(createContenidoMultimedia6CreationTool());
		paletteContainer.add(createCrearInstancia7CreationTool());
		paletteContainer.add(createCuestionario8CreationTool());
		paletteContainer.add(createDetallesInstancia9CreationTool());
		paletteContainer.add(createEncuesta10CreationTool());
		paletteContainer.add(createEntidad11CreationTool());
		paletteContainer.add(createIndex12CreationTool());
		paletteContainer.add(createIndiceDetalle13CreationTool());
		paletteContainer.add(createIndiceEntidad14CreationTool());
		paletteContainer.add(createIndiceExtendido15CreationTool());
		paletteContainer.add(createNormal16CreationTool());
		paletteContainer.add(createPregunta17CreationTool());
		paletteContainer.add(createRedSocial18CreationTool());
		paletteContainer.add(createRespuesta19CreationTool());
		paletteContainer.add(createRol20CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAccesoapaginapantalla1CreationTool());
		paletteContainer.add(createEntidad2CreationTool());
		paletteContainer.add(createEntidadRefereenciada3CreationTool());
		paletteContainer.add(createEntidades4CreationTool());
		paletteContainer.add(createPaginapantalla5CreationTool());
		paletteContainer.add(createRcorrecta6CreationTool());
		paletteContainer.add(createRedsocial7CreationTool());
		paletteContainer.add(createUsuario8CreationTool());
		paletteContainer.add(createUsuarios9CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActualizacionInstancia1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActualizacionInstancia1CreationTool_title,
				Messages.ActualizacionInstancia1CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.ActualizacionInstancia_2006));
		entry.setId("createActualizacionInstancia1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.ActualizacionInstancia_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Atributo2CreationTool_title,
				Messages.Atributo2CreationTool_desc, Collections.singletonList(DatawebElementTypes.Atributo_3006));
		entry.setId("createAtributo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Atributo_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBaseDatos3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BaseDatos3CreationTool_title,
				Messages.BaseDatos3CreationTool_desc, Collections.singletonList(DatawebElementTypes.BaseDatos_2015));
		entry.setId("createBaseDatos3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.BaseDatos_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBorradoInstancia4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BorradoInstancia4CreationTool_title,
				Messages.BorradoInstancia4CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.BorradoInstancia_2007));
		entry.setId("createBorradoInstancia4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.BorradoInstancia_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCRUD5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CRUD5CreationTool_title,
				Messages.CRUD5CreationTool_desc, Collections.singletonList(DatawebElementTypes.CRUD_2010));
		entry.setId("createCRUD5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.CRUD_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContenidoMultimedia6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContenidoMultimedia6CreationTool_title,
				Messages.ContenidoMultimedia6CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.ContenidoMultimedia_3004));
		entry.setId("createContenidoMultimedia6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.ContenidoMultimedia_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCrearInstancia7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CrearInstancia7CreationTool_title,
				Messages.CrearInstancia7CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.CrearInstancia_2004));
		entry.setId("createCrearInstancia7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.CrearInstancia_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCuestionario8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Cuestionario8CreationTool_title,
				Messages.Cuestionario8CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.Cuestionario_2008));
		entry.setId("createCuestionario8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Cuestionario_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetallesInstancia9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DetallesInstancia9CreationTool_title,
				Messages.DetallesInstancia9CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.DetallesInstancia_2005));
		entry.setId("createDetallesInstancia9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.DetallesInstancia_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncuesta10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Encuesta10CreationTool_title,
				Messages.Encuesta10CreationTool_desc, Collections.singletonList(DatawebElementTypes.Encuesta_2009));
		entry.setId("createEncuesta10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Encuesta_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entidad11CreationTool_title,
				Messages.Entidad11CreationTool_desc, Collections.singletonList(DatawebElementTypes.Entidad_3005));
		entry.setId("createEntidad11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Entidad_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndex12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Index12CreationTool_title,
				Messages.Index12CreationTool_desc, Collections.singletonList(DatawebElementTypes.Index_2012));
		entry.setId("createIndex12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Index_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndiceDetalle13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndiceDetalle13CreationTool_title,
				Messages.IndiceDetalle13CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.IndiceDetalle_2003));
		entry.setId("createIndiceDetalle13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.IndiceDetalle_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndiceEntidad14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndiceEntidad14CreationTool_title,
				Messages.IndiceEntidad14CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.IndiceEntidad_2002));
		entry.setId("createIndiceEntidad14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.IndiceEntidad_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndiceExtendido15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndiceExtendido15CreationTool_title,
				Messages.IndiceExtendido15CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.IndiceExtendido_2001));
		entry.setId("createIndiceExtendido15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.IndiceExtendido_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNormal16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Normal16CreationTool_title,
				Messages.Normal16CreationTool_desc, Collections.singletonList(DatawebElementTypes.Normal_2011));
		entry.setId("createNormal16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Normal_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPregunta17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DatawebElementTypes.Pregunta_3001);
		types.add(DatawebElementTypes.Pregunta_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Pregunta17CreationTool_title,
				Messages.Pregunta17CreationTool_desc, types);
		entry.setId("createPregunta17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Pregunta_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRedSocial18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RedSocial18CreationTool_title,
				Messages.RedSocial18CreationTool_desc, Collections.singletonList(DatawebElementTypes.RedSocial_2014));
		entry.setId("createRedSocial18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.RedSocial_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRespuesta19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Respuesta19CreationTool_title,
				Messages.Respuesta19CreationTool_desc, Collections.singletonList(DatawebElementTypes.Respuesta_3002));
		entry.setId("createRespuesta19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Respuesta_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Rol20CreationTool_title,
				Messages.Rol20CreationTool_desc, Collections.singletonList(DatawebElementTypes.Rol_2013));
		entry.setId("createRol20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.Rol_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAccesoapaginapantalla1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Accesoapaginapantalla1CreationTool_title,
				Messages.Accesoapaginapantalla1CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.RolAccesoapaginapantalla_4005));
		entry.setId("createAccesoapaginapantalla1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.RolAccesoapaginapantalla_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Entidad2CreationTool_title,
				Messages.Entidad2CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.PaginaPantallaEntidad_4009));
		entry.setId("createEntidad2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.PaginaPantallaEntidad_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidadRefereenciada3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EntidadRefereenciada3CreationTool_title,
				Messages.EntidadRefereenciada3CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.EntidadEntidadRefereenciada_4001));
		entry.setId("createEntidadRefereenciada3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				DatawebElementTypes.getImageDescriptor(DatawebElementTypes.EntidadEntidadRefereenciada_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidades4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Entidades4CreationTool_title,
				Messages.Entidades4CreationTool_desc, Collections.singletonList(DatawebElementTypes.RolEntidades_4004));
		entry.setId("createEntidades4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.RolEntidades_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginapantalla5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Paginapantalla5CreationTool_title,
				Messages.Paginapantalla5CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.RedSocialPaginapantalla_4006));
		entry.setId("createPaginapantalla5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.RedSocialPaginapantalla_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRcorrecta6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Rcorrecta6CreationTool_title,
				Messages.Rcorrecta6CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.PreguntaRcorrecta_4003));
		entry.setId("createRcorrecta6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.PreguntaRcorrecta_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRedsocial7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Redsocial7CreationTool_title,
				Messages.Redsocial7CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.PaginaPantallaRedsocial_4008));
		entry.setId("createRedsocial7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.PaginaPantallaRedsocial_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUsuario8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Usuario8CreationTool_title,
				Messages.Usuario8CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.PaginaPantallaUsuario_4007));
		entry.setId("createUsuario8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.PaginaPantallaUsuario_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUsuarios9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Usuarios9CreationTool_title,
				Messages.Usuarios9CreationTool_desc,
				Collections.singletonList(DatawebElementTypes.EntidadUsuarios_4002));
		entry.setId("createUsuarios9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatawebElementTypes.getImageDescriptor(DatawebElementTypes.EntidadUsuarios_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
