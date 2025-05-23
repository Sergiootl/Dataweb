/**
 */
package dataweb.impl;

import dataweb.Atributo;
import dataweb.DatawebPackage;
import dataweb.TipoAtributo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.impl.AtributoImpl#getTipoAtributo <em>Tipo Atributo</em>}</li>
 *   <li>{@link dataweb.impl.AtributoImpl#isPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends EObjectImpl implements Atributo {
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
	 * The default value of the '{@link #getTipoAtributo() <em>Tipo Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAtributo TIPO_ATRIBUTO_EDEFAULT = TipoAtributo.INTEGER;

	/**
	 * The cached value of the '{@link #getTipoAtributo() <em>Tipo Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAtributo()
	 * @generated
	 * @ordered
	 */
	protected TipoAtributo tipoAtributo = TIPO_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.ATRIBUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoAtributo getTipoAtributo() {
		return tipoAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoAtributo(TipoAtributo newTipoAtributo) {
		TipoAtributo oldTipoAtributo = tipoAtributo;
		tipoAtributo = newTipoAtributo == null ? TIPO_ATRIBUTO_EDEFAULT : newTipoAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ATRIBUTO__TIPO_ATRIBUTO, oldTipoAtributo, tipoAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.ATRIBUTO__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatawebPackage.ATRIBUTO__NOMBRE:
				return getNombre();
			case DatawebPackage.ATRIBUTO__TIPO_ATRIBUTO:
				return getTipoAtributo();
			case DatawebPackage.ATRIBUTO__PRIMARY_KEY:
				return isPrimaryKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatawebPackage.ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DatawebPackage.ATRIBUTO__TIPO_ATRIBUTO:
				setTipoAtributo((TipoAtributo)newValue);
				return;
			case DatawebPackage.ATRIBUTO__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
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
			case DatawebPackage.ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DatawebPackage.ATRIBUTO__TIPO_ATRIBUTO:
				setTipoAtributo(TIPO_ATRIBUTO_EDEFAULT);
				return;
			case DatawebPackage.ATRIBUTO__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
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
			case DatawebPackage.ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DatawebPackage.ATRIBUTO__TIPO_ATRIBUTO:
				return tipoAtributo != TIPO_ATRIBUTO_EDEFAULT;
			case DatawebPackage.ATRIBUTO__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
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
		result.append(", TipoAtributo: ");
		result.append(tipoAtributo);
		result.append(", PrimaryKey: ");
		result.append(primaryKey);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
