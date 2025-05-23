/**
 */
package dataweb.impl;

import dataweb.ContenidoMultimedia;
import dataweb.DatawebPackage;
import dataweb.Normal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.NormalImpl#getContenido <em>Contenido</em>}</li>
 *   <li>{@link dataweb.impl.NormalImpl#getContenidomultimedia <em>Contenidomultimedia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalImpl extends PaginaPantallaImpl implements Normal {
	/**
	 * The default value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected String contenido = CONTENIDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContenidomultimedia() <em>Contenidomultimedia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenidomultimedia()
	 * @generated
	 * @ordered
	 */
	protected EList<ContenidoMultimedia> contenidomultimedia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.NORMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContenido() {
		return contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContenido(String newContenido) {
		String oldContenido = contenido;
		contenido = newContenido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.NORMAL__CONTENIDO, oldContenido, contenido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContenidoMultimedia> getContenidomultimedia() {
		if (contenidomultimedia == null) {
			contenidomultimedia = new EObjectContainmentEList<ContenidoMultimedia>(ContenidoMultimedia.class, this, DatawebPackage.NORMAL__CONTENIDOMULTIMEDIA);
		}
		return contenidomultimedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.NORMAL__CONTENIDOMULTIMEDIA:
				return ((InternalEList<?>)getContenidomultimedia()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.NORMAL__CONTENIDO:
				return getContenido();
			case DatawebPackage.NORMAL__CONTENIDOMULTIMEDIA:
				return getContenidomultimedia();
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
			case DatawebPackage.NORMAL__CONTENIDO:
				setContenido((String)newValue);
				return;
			case DatawebPackage.NORMAL__CONTENIDOMULTIMEDIA:
				getContenidomultimedia().clear();
				getContenidomultimedia().addAll((Collection<? extends ContenidoMultimedia>)newValue);
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
			case DatawebPackage.NORMAL__CONTENIDO:
				setContenido(CONTENIDO_EDEFAULT);
				return;
			case DatawebPackage.NORMAL__CONTENIDOMULTIMEDIA:
				getContenidomultimedia().clear();
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
			case DatawebPackage.NORMAL__CONTENIDO:
				return CONTENIDO_EDEFAULT == null ? contenido != null : !CONTENIDO_EDEFAULT.equals(contenido);
			case DatawebPackage.NORMAL__CONTENIDOMULTIMEDIA:
				return contenidomultimedia != null && !contenidomultimedia.isEmpty();
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
		result.append(" (Contenido: ");
		result.append(contenido);
		result.append(')');
		return result.toString();
	}

} //NormalImpl
