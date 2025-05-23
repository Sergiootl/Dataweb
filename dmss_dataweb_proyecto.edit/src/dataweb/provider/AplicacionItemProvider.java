/**
 */
package dataweb.provider;


import dataweb.Aplicacion;
import dataweb.DatawebFactory;
import dataweb.DatawebPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dataweb.Aplicacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AplicacionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AplicacionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNombrePropertyDescriptor(object);
			addDescripcionPropertyDescriptor(object);
			addPaginasMediasAccesiblesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aplicacion_Nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aplicacion_Nombre_feature", "_UI_Aplicacion_type"),
				 DatawebPackage.Literals.APLICACION__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Descripcion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescripcionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aplicacion_Descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aplicacion_Descripcion_feature", "_UI_Aplicacion_type"),
				 DatawebPackage.Literals.APLICACION__DESCRIPCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paginas Medias Accesibles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginasMediasAccesiblesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aplicacion_paginasMediasAccesibles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aplicacion_paginasMediasAccesibles_feature", "_UI_Aplicacion_type"),
				 DatawebPackage.Literals.APLICACION__PAGINAS_MEDIAS_ACCESIBLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DatawebPackage.Literals.APLICACION__ROLES);
			childrenFeatures.add(DatawebPackage.Literals.APLICACION__REDESSOCIALES);
			childrenFeatures.add(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS);
			childrenFeatures.add(DatawebPackage.Literals.APLICACION__BASEDATOS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Aplicacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Aplicacion"));
	}

	/**
	 * This returns <code>getImage(object)</code> for the column index <code>0</code> or <code>super.getImage(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(Object)
	 * @see #getColumnText(Object, int)
	 * @generated
	 */
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getImage(object) : super.getImage(object);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Aplicacion)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Aplicacion_type") :
			getString("_UI_Aplicacion_type") + " " + label;
	}

	/**
	 * This returns <code>getText(object)</code> for the column index <code>0</code> or <code>super.getText(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage(Object)
	 * @see #getColumnImage(Object, int)
	 * @generated
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getText(object) : super.getText(object);
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Aplicacion.class)) {
			case DatawebPackage.APLICACION__NOMBRE:
			case DatawebPackage.APLICACION__DESCRIPCION:
			case DatawebPackage.APLICACION__PAGINAS_MEDIAS_ACCESIBLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DatawebPackage.APLICACION__ROLES:
			case DatawebPackage.APLICACION__REDESSOCIALES:
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
			case DatawebPackage.APLICACION__BASEDATOS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__ROLES,
				 DatawebFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__REDESSOCIALES,
				 DatawebFactory.eINSTANCE.createRedSocial()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createCrearInstancia()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createIndiceExtendido()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createDetallesInstancia()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createActualizacionInstancia()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createIndiceEntidad()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createIndiceDetalle()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createBorradoInstancia()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createCuestionario()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createNormal()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createEncuesta()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS,
				 DatawebFactory.eINSTANCE.createCRUD()));

		newChildDescriptors.add
			(createChildParameter
				(DatawebPackage.Literals.APLICACION__BASEDATOS,
				 DatawebFactory.eINSTANCE.createBaseDatos()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DatawebEditPlugin.INSTANCE;
	}

}
