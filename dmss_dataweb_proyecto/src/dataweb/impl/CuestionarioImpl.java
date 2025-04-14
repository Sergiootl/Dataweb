/**
 */
package dataweb.impl;

import dataweb.Cuestionario;
import dataweb.DatawebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cuestionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.CuestionarioImpl#isEvaluado <em>Evaluado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CuestionarioImpl extends InteractivaImpl implements Cuestionario {
	/**
	 * The default value of the '{@link #isEvaluado() <em>Evaluado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvaluado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVALUADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEvaluado() <em>Evaluado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvaluado()
	 * @generated
	 * @ordered
	 */
	protected boolean evaluado = EVALUADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuestionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.CUESTIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEvaluado() {
		return evaluado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvaluado(boolean newEvaluado) {
		boolean oldEvaluado = evaluado;
		evaluado = newEvaluado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.CUESTIONARIO__EVALUADO, oldEvaluado, evaluado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				return isEvaluado();
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
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				setEvaluado((Boolean)newValue);
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
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				setEvaluado(EVALUADO_EDEFAULT);
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
			case DatawebPackage.CUESTIONARIO__EVALUADO:
				return evaluado != EVALUADO_EDEFAULT;
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
		result.append(" (Evaluado: ");
		result.append(evaluado);
		result.append(')');
		return result.toString();
	}

} //CuestionarioImpl
