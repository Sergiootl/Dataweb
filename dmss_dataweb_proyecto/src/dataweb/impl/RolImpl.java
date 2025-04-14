/**
 */
package dataweb.impl;

import dataweb.DatawebPackage;
import dataweb.Entidad;
import dataweb.PaginaPantalla;
import dataweb.Rol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.RolImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.RolImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link dataweb.impl.RolImpl#getAccesoapaginapantalla <em>Accesoapaginapantalla</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolImpl extends MinimalEObjectImpl.Container implements Rol {
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
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidades;

	/**
	 * The cached value of the '{@link #getAccesoapaginapantalla() <em>Accesoapaginapantalla</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesoapaginapantalla()
	 * @generated
	 * @ordered
	 */
	protected EList<PaginaPantalla> accesoapaginapantalla;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.ROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ROL__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entidad> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectWithInverseResolvingEList.ManyInverse<Entidad>(Entidad.class, this, DatawebPackage.ROL__ENTIDADES, DatawebPackage.ENTIDAD__USUARIOS);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaginaPantalla> getAccesoapaginapantalla() {
		if (accesoapaginapantalla == null) {
			accesoapaginapantalla = new EObjectWithInverseResolvingEList.ManyInverse<PaginaPantalla>(PaginaPantalla.class, this, DatawebPackage.ROL__ACCESOAPAGINAPANTALLA, DatawebPackage.PAGINA_PANTALLA__USUARIO);
		}
		return accesoapaginapantalla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.ROL__ENTIDADES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntidades()).basicAdd(otherEnd, msgs);
			case DatawebPackage.ROL__ACCESOAPAGINAPANTALLA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccesoapaginapantalla()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.ROL__ENTIDADES:
				return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
			case DatawebPackage.ROL__ACCESOAPAGINAPANTALLA:
				return ((InternalEList<?>)getAccesoapaginapantalla()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.ROL__NOMBRE:
				return getNombre();
			case DatawebPackage.ROL__ENTIDADES:
				return getEntidades();
			case DatawebPackage.ROL__ACCESOAPAGINAPANTALLA:
				return getAccesoapaginapantalla();
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
			case DatawebPackage.ROL__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.ROL__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends Entidad>)newValue);
				return;
			case DatawebPackage.ROL__ACCESOAPAGINAPANTALLA:
				getAccesoapaginapantalla().clear();
				getAccesoapaginapantalla().addAll((Collection<? extends PaginaPantalla>)newValue);
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
			case DatawebPackage.ROL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.ROL__ENTIDADES:
				getEntidades().clear();
				return;
			case DatawebPackage.ROL__ACCESOAPAGINAPANTALLA:
				getAccesoapaginapantalla().clear();
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
			case DatawebPackage.ROL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.ROL__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case DatawebPackage.ROL__ACCESOAPAGINAPANTALLA:
				return accesoapaginapantalla != null && !accesoapaginapantalla.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RolImpl
