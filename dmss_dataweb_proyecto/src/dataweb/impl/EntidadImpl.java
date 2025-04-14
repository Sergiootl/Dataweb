/**
 */
package dataweb.impl;

import dataweb.Atributo;
import dataweb.DatawebPackage;
import dataweb.Entidad;
import dataweb.Indice;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.EntidadImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getIndice <em>Indice</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getEntidadRefereenciada <em>Entidad Refereenciada</em>}</li>
 *   <li>{@link dataweb.impl.EntidadImpl#getUsuarios <em>Usuarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends MinimalEObjectImpl.Container implements Entidad {
	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos;

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
	 * The cached value of the '{@link #getIndice() <em>Indice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected Indice indice;

	/**
	 * The cached value of the '{@link #getEntidadRefereenciada() <em>Entidad Refereenciada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadRefereenciada()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidadRefereenciada;

	/**
	 * The cached value of the '{@link #getUsuarios() <em>Usuarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> usuarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Atributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, DatawebPackage.ENTIDAD__ATRIBUTOS);
		}
		return atributos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ENTIDAD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indice getIndice() {
		if (indice != null && indice.eIsProxy()) {
			InternalEObject oldIndice = (InternalEObject)indice;
			indice = (Indice)eResolveProxy(oldIndice);
			if (indice != oldIndice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatawebPackage.ENTIDAD__INDICE, oldIndice, indice));
			}
		}
		return indice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indice basicGetIndice() {
		return indice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndice(Indice newIndice) {
		Indice oldIndice = indice;
		indice = newIndice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ENTIDAD__INDICE, oldIndice, indice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entidad> getEntidadRefereenciada() {
		if (entidadRefereenciada == null) {
			entidadRefereenciada = new EObjectResolvingEList<Entidad>(Entidad.class, this, DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA);
		}
		return entidadRefereenciada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rol> getUsuarios() {
		if (usuarios == null) {
			usuarios = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this, DatawebPackage.ENTIDAD__USUARIOS, DatawebPackage.ROL__ENTIDADES);
		}
		return usuarios;
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
			case DatawebPackage.ENTIDAD__USUARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsuarios()).basicAdd(otherEnd, msgs);
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case DatawebPackage.ENTIDAD__USUARIOS:
				return ((InternalEList<?>)getUsuarios()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				return getAtributos();
			case DatawebPackage.ENTIDAD__NOMBRE:
				return getNombre();
			case DatawebPackage.ENTIDAD__INDICE:
				if (resolve) return getIndice();
				return basicGetIndice();
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				return getEntidadRefereenciada();
			case DatawebPackage.ENTIDAD__USUARIOS:
				return getUsuarios();
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributo>)newValue);
				return;
			case DatawebPackage.ENTIDAD__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.ENTIDAD__INDICE:
				setIndice((Indice)newValue);
				return;
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				getEntidadRefereenciada().clear();
				getEntidadRefereenciada().addAll((Collection<? extends Entidad>)newValue);
				return;
			case DatawebPackage.ENTIDAD__USUARIOS:
				getUsuarios().clear();
				getUsuarios().addAll((Collection<? extends Rol>)newValue);
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				getAtributos().clear();
				return;
			case DatawebPackage.ENTIDAD__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.ENTIDAD__INDICE:
				setIndice((Indice)null);
				return;
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				getEntidadRefereenciada().clear();
				return;
			case DatawebPackage.ENTIDAD__USUARIOS:
				getUsuarios().clear();
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
			case DatawebPackage.ENTIDAD__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case DatawebPackage.ENTIDAD__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.ENTIDAD__INDICE:
				return indice != null;
			case DatawebPackage.ENTIDAD__ENTIDAD_REFEREENCIADA:
				return entidadRefereenciada != null && !entidadRefereenciada.isEmpty();
			case DatawebPackage.ENTIDAD__USUARIOS:
				return usuarios != null && !usuarios.isEmpty();
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

} //EntidadImpl
