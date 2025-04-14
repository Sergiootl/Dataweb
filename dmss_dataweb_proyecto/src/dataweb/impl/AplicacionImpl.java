/**
 */
package dataweb.impl;

import dataweb.Aplicacion;
import dataweb.BaseDatos;
import dataweb.DatawebPackage;
import dataweb.PaginaPantalla;
import dataweb.RedSocial;
import dataweb.Rol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.AplicacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getRedessociales <em>Redessociales</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getPaginapantallas <em>Paginapantallas</em>}</li>
 *   <li>{@link dataweb.impl.AplicacionImpl#getBasedatos <em>Basedatos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AplicacionImpl extends MinimalEObjectImpl.Container implements Aplicacion {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> roles;

	/**
	 * The cached value of the '{@link #getRedessociales() <em>Redessociales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedessociales()
	 * @generated
	 * @ordered
	 */
	protected EList<RedSocial> redessociales;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaginapantallas() <em>Paginapantallas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginapantallas()
	 * @generated
	 * @ordered
	 */
	protected EList<PaginaPantalla> paginapantallas;

	/**
	 * The cached value of the '{@link #getBasedatos() <em>Basedatos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedatos()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseDatos> basedatos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.APLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.APLICACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Rol>(Rol.class, this, DatawebPackage.APLICACION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedSocial> getRedessociales() {
		if (redessociales == null) {
			redessociales = new EObjectContainmentEList<RedSocial>(RedSocial.class, this, DatawebPackage.APLICACION__REDESSOCIALES);
		}
		return redessociales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.APLICACION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaginaPantalla> getPaginapantallas() {
		if (paginapantallas == null) {
			paginapantallas = new EObjectContainmentEList<PaginaPantalla>(PaginaPantalla.class, this, DatawebPackage.APLICACION__PAGINAPANTALLAS);
		}
		return paginapantallas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseDatos> getBasedatos() {
		if (basedatos == null) {
			basedatos = new EObjectContainmentEList<BaseDatos>(BaseDatos.class, this, DatawebPackage.APLICACION__BASEDATOS);
		}
		return basedatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.APLICACION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case DatawebPackage.APLICACION__REDESSOCIALES:
				return ((InternalEList<?>)getRedessociales()).basicRemove(otherEnd, msgs);
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				return ((InternalEList<?>)getPaginapantallas()).basicRemove(otherEnd, msgs);
			case DatawebPackage.APLICACION__BASEDATOS:
				return ((InternalEList<?>)getBasedatos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatawebPackage.APLICACION__NOMBRE:
				return getNombre();
			case DatawebPackage.APLICACION__ROLES:
				return getRoles();
			case DatawebPackage.APLICACION__REDESSOCIALES:
				return getRedessociales();
			case DatawebPackage.APLICACION__DESCRIPCION:
				return getDescripcion();
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				return getPaginapantallas();
			case DatawebPackage.APLICACION__BASEDATOS:
				return getBasedatos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatawebPackage.APLICACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.APLICACION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Rol>)newValue);
				return;
			case DatawebPackage.APLICACION__REDESSOCIALES:
				getRedessociales().clear();
				getRedessociales().addAll((Collection<? extends RedSocial>)newValue);
				return;
			case DatawebPackage.APLICACION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				getPaginapantallas().clear();
				getPaginapantallas().addAll((Collection<? extends PaginaPantalla>)newValue);
				return;
			case DatawebPackage.APLICACION__BASEDATOS:
				getBasedatos().clear();
				getBasedatos().addAll((Collection<? extends BaseDatos>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatawebPackage.APLICACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.APLICACION__ROLES:
				getRoles().clear();
				return;
			case DatawebPackage.APLICACION__REDESSOCIALES:
				getRedessociales().clear();
				return;
			case DatawebPackage.APLICACION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				getPaginapantallas().clear();
				return;
			case DatawebPackage.APLICACION__BASEDATOS:
				getBasedatos().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatawebPackage.APLICACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.APLICACION__ROLES:
				return roles != null && !roles.isEmpty();
			case DatawebPackage.APLICACION__REDESSOCIALES:
				return redessociales != null && !redessociales.isEmpty();
			case DatawebPackage.APLICACION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DatawebPackage.APLICACION__PAGINAPANTALLAS:
				return paginapantallas != null && !paginapantallas.isEmpty();
			case DatawebPackage.APLICACION__BASEDATOS:
				return basedatos != null && !basedatos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", Descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //AplicacionImpl
