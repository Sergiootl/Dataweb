/**
 */
package dataweb.impl;

import dataweb.DatawebPackage;
import dataweb.Entidad;
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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagina Pantalla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.PaginaPantallaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.PaginaPantallaImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link dataweb.impl.PaginaPantallaImpl#getRedsocial <em>Redsocial</em>}</li>
 *   <li>{@link dataweb.impl.PaginaPantallaImpl#getEntidad <em>Entidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PaginaPantallaImpl extends EObjectImpl implements PaginaPantalla {
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
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> usuario;

	/**
	 * The cached value of the '{@link #getRedsocial() <em>Redsocial</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedsocial()
	 * @generated
	 * @ordered
	 */
	protected EList<RedSocial> redsocial;

	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginaPantallaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.PAGINA_PANTALLA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.PAGINA_PANTALLA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getUsuario() {
		if (usuario == null) {
			usuario = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this, DatawebPackage.PAGINA_PANTALLA__USUARIO, DatawebPackage.ROL__ACCESOAPAGINAPANTALLA);
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedSocial> getRedsocial() {
		if (redsocial == null) {
			redsocial = new EObjectWithInverseResolvingEList.ManyInverse<RedSocial>(RedSocial.class, this, DatawebPackage.PAGINA_PANTALLA__REDSOCIAL, DatawebPackage.RED_SOCIAL__PAGINAPANTALLA);
		}
		return redsocial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entidad getEntidad() {
		if (entidad != null && entidad.eIsProxy()) {
			InternalEObject oldEntidad = (InternalEObject)entidad;
			entidad = (Entidad)eResolveProxy(oldEntidad);
			if (entidad != oldEntidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatawebPackage.PAGINA_PANTALLA__ENTIDAD, oldEntidad, entidad));
			}
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidad() {
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntidad(Entidad newEntidad) {
		Entidad oldEntidad = entidad;
		entidad = newEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.PAGINA_PANTALLA__ENTIDAD, oldEntidad, entidad));
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
			case DatawebPackage.PAGINA_PANTALLA__USUARIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsuario()).basicAdd(otherEnd, msgs);
			case DatawebPackage.PAGINA_PANTALLA__REDSOCIAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedsocial()).basicAdd(otherEnd, msgs);
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
			case DatawebPackage.PAGINA_PANTALLA__USUARIO:
				return ((InternalEList<?>)getUsuario()).basicRemove(otherEnd, msgs);
			case DatawebPackage.PAGINA_PANTALLA__REDSOCIAL:
				return ((InternalEList<?>)getRedsocial()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.PAGINA_PANTALLA__NOMBRE:
				return getNombre();
			case DatawebPackage.PAGINA_PANTALLA__USUARIO:
				return getUsuario();
			case DatawebPackage.PAGINA_PANTALLA__REDSOCIAL:
				return getRedsocial();
			case DatawebPackage.PAGINA_PANTALLA__ENTIDAD:
				if (resolve) return getEntidad();
				return basicGetEntidad();
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
			case DatawebPackage.PAGINA_PANTALLA__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.PAGINA_PANTALLA__USUARIO:
				getUsuario().clear();
				getUsuario().addAll((Collection<? extends Rol>)newValue);
				return;
			case DatawebPackage.PAGINA_PANTALLA__REDSOCIAL:
				getRedsocial().clear();
				getRedsocial().addAll((Collection<? extends RedSocial>)newValue);
				return;
			case DatawebPackage.PAGINA_PANTALLA__ENTIDAD:
				setEntidad((Entidad)newValue);
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
			case DatawebPackage.PAGINA_PANTALLA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.PAGINA_PANTALLA__USUARIO:
				getUsuario().clear();
				return;
			case DatawebPackage.PAGINA_PANTALLA__REDSOCIAL:
				getRedsocial().clear();
				return;
			case DatawebPackage.PAGINA_PANTALLA__ENTIDAD:
				setEntidad((Entidad)null);
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
			case DatawebPackage.PAGINA_PANTALLA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.PAGINA_PANTALLA__USUARIO:
				return usuario != null && !usuario.isEmpty();
			case DatawebPackage.PAGINA_PANTALLA__REDSOCIAL:
				return redsocial != null && !redsocial.isEmpty();
			case DatawebPackage.PAGINA_PANTALLA__ENTIDAD:
				return entidad != null;
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

} //PaginaPantallaImpl
