/*
* 
*/
package dataweb.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import dataweb.diagram.edit.parts.ActualizacionInstanciaEditPart;
import dataweb.diagram.edit.parts.AplicacionEditPart;
import dataweb.diagram.edit.parts.AtributoEditPart;
import dataweb.diagram.edit.parts.BaseDatosBaseDatosTablasCompartmentEditPart;
import dataweb.diagram.edit.parts.BaseDatosEditPart;
import dataweb.diagram.edit.parts.BorradoInstanciaEditPart;
import dataweb.diagram.edit.parts.CRUDEditPart;
import dataweb.diagram.edit.parts.ContenidoMultimediaEditPart;
import dataweb.diagram.edit.parts.CrearInstanciaEditPart;
import dataweb.diagram.edit.parts.CuestionarioCuestionarioPreguntasCCompartmentEditPart;
import dataweb.diagram.edit.parts.CuestionarioEditPart;
import dataweb.diagram.edit.parts.DetallesInstanciaEditPart;
import dataweb.diagram.edit.parts.EncuestaEditPart;
import dataweb.diagram.edit.parts.EncuestaEncuestaPreguntasECompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadAtributosCompartmentEditPart;
import dataweb.diagram.edit.parts.EntidadEntidadRefereenciadaEditPart;
import dataweb.diagram.edit.parts.EntidadUsuariosEditPart;
import dataweb.diagram.edit.parts.IndexEditPart;
import dataweb.diagram.edit.parts.IndiceDetalleEditPart;
import dataweb.diagram.edit.parts.IndiceEntidadEditPart;
import dataweb.diagram.edit.parts.IndiceExtendidoEditPart;
import dataweb.diagram.edit.parts.NormalEditPart;
import dataweb.diagram.edit.parts.NormalNormalContenidomultimediaCompartmentEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaEntidadEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaRedsocialEditPart;
import dataweb.diagram.edit.parts.PaginaPantallaUsuarioEditPart;
import dataweb.diagram.edit.parts.Pregunta2EditPart;
import dataweb.diagram.edit.parts.PreguntaEditPart;
import dataweb.diagram.edit.parts.PreguntaPreguntaRespuestasCompartment2EditPart;
import dataweb.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart;
import dataweb.diagram.edit.parts.PreguntaRcorrectaEditPart;
import dataweb.diagram.edit.parts.RedSocialEditPart;
import dataweb.diagram.edit.parts.RedSocialPaginapantallaEditPart;
import dataweb.diagram.edit.parts.RespuestaEditPart;
import dataweb.diagram.edit.parts.RolAccesoapaginapantallaEditPart;
import dataweb.diagram.edit.parts.RolEditPart;
import dataweb.diagram.edit.parts.RolEntidadesEditPart;
import dataweb.diagram.part.DatawebVisualIDRegistry;
import dataweb.diagram.part.Messages;

/**
 * @generated
 */
public class DatawebNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DatawebNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<DatawebNavigatorItem> result = new ArrayList<DatawebNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, AplicacionEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof DatawebNavigatorGroup) {
			DatawebNavigatorGroup group = (DatawebNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DatawebNavigatorItem) {
			DatawebNavigatorItem navigatorItem = (DatawebNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DatawebVisualIDRegistry.getVisualID(view)) {

		case AplicacionEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DatawebNavigatorGroup links = new DatawebNavigatorGroup(Messages.NavigatorGroupName_Aplicacion_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceExtendidoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceEntidadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceDetalleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CrearInstanciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(DetallesInstanciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(ActualizacionInstanciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BorradoInstanciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CRUDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndexEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BaseDatosEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEntidadRefereenciadaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadUsuariosEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaRcorrectaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEntidadesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case IndiceExtendidoEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_IndiceExtendido_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_IndiceExtendido_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IndiceEntidadEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_IndiceEntidad_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_IndiceEntidad_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IndiceDetalleEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_IndiceDetalle_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_IndiceDetalle_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CrearInstanciaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_CrearInstancia_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_CrearInstancia_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DetallesInstanciaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_DetallesInstancia_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_DetallesInstancia_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActualizacionInstanciaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_ActualizacionInstancia_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_ActualizacionInstancia_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BorradoInstanciaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_BorradoInstancia_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_BorradoInstancia_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CuestionarioEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Cuestionario_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Cuestionario_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioCuestionarioPreguntasCCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(PreguntaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EncuestaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Encuesta_2009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Encuesta_2009_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEncuestaPreguntasECompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(Pregunta2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CRUDEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_CRUD_2010_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_CRUD_2010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NormalEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Normal_2011_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Normal_2011_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalNormalContenidomultimediaCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(ContenidoMultimediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IndexEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Index_2012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Index_2012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RolEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Rol_2013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Rol_2013_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadUsuariosEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEntidadesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolAccesoapaginapantallaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaUsuarioEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RedSocialEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RedSocial_2014_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RedSocial_2014_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialPaginapantallaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaRedsocialEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case BaseDatosEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BaseDatosBaseDatosTablasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(EntidadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PreguntaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Pregunta_3001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(RespuestaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaRcorrectaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RespuestaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Respuesta_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaRcorrectaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Pregunta2EditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Pregunta_3003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaPreguntaRespuestasCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(RespuestaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaRcorrectaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EntidadEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Node sv = (Node) view;
			DatawebNavigatorGroup incominglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Entidad_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup outgoinglinks = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_Entidad_3005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEntidadAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DatawebVisualIDRegistry.getType(AtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEntidadRefereenciadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEntidadRefereenciadaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadUsuariosEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEntidadesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PaginaPantallaEntidadEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EntidadEntidadRefereenciadaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_EntidadEntidadRefereenciada_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_EntidadEntidadRefereenciada_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EntidadUsuariosEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_EntidadUsuarios_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_EntidadUsuarios_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PreguntaRcorrectaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PreguntaRcorrecta_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PreguntaRcorrecta_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RespuestaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(PreguntaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(Pregunta2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RolEntidadesEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RolEntidades_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RolEntidades_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RolAccesoapaginapantallaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RolAccesoapaginapantalla_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RolAccesoapaginapantalla_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceExtendidoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceEntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CrearInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(DetallesInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(ActualizacionInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BorradoInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndexEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RedSocialPaginapantallaEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RedSocialPaginapantalla_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_RedSocialPaginapantalla_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceExtendidoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceEntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceDetalleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CrearInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(DetallesInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(ActualizacionInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BorradoInstanciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndexEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PaginaPantallaUsuarioEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PaginaPantallaUsuario_4007_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PaginaPantallaUsuario_4007_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RolEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceEntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CrearInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(DetallesInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(ActualizacionInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BorradoInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CRUDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndexEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PaginaPantallaRedsocialEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PaginaPantallaRedsocial_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PaginaPantallaRedsocial_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(RedSocialEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceEntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CrearInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(DetallesInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(ActualizacionInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BorradoInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CRUDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndexEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PaginaPantallaEntidadEditPart.VISUAL_ID: {
			LinkedList<DatawebAbstractNavigatorItem> result = new LinkedList<DatawebAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DatawebNavigatorGroup target = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PaginaPantallaEntidad_4009_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DatawebNavigatorGroup source = new DatawebNavigatorGroup(
					Messages.NavigatorGroupName_PaginaPantallaEntidad_4009_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceExtendidoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceEntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndiceDetalleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CrearInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(DetallesInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(ActualizacionInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(BorradoInstanciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CuestionarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(EncuestaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(CRUDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(NormalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DatawebVisualIDRegistry.getType(IndexEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return AplicacionEditPart.MODEL_ID.equals(DatawebVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DatawebNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<DatawebNavigatorItem> result = new ArrayList<DatawebNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new DatawebNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DatawebNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof DatawebAbstractNavigatorItem) {
			DatawebAbstractNavigatorItem abstractNavigatorItem = (DatawebAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
