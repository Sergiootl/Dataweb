/**
 */
package dataweb.impl;

import dataweb.Cuestionario;
import dataweb.DatawebPackage;
import dataweb.Respuesta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.RespuestaImpl#getRcorrecta <em>Rcorrecta</em>}</li>
 *   <li>{@link dataweb.impl.RespuestaImpl#getTexto <em>Texto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RespuestaImpl extends MinimalEObjectImpl.Container implements Respuesta {
	/**
	 * The cached value of the '{@link #getRcorrecta() <em>Rcorrecta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcorrecta()
	 * @generated
	 * @ordered
	 */
	protected Cuestionario rcorrecta;

	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cuestionario getRcorrecta() {
		if (rcorrecta != null && rcorrecta.eIsProxy()) {
			InternalEObject oldRcorrecta = (InternalEObject)rcorrecta;
			rcorrecta = (Cuestionario)eResolveProxy(oldRcorrecta);
			if (rcorrecta != oldRcorrecta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatawebPackage.RESPUESTA__RCORRECTA, oldRcorrecta, rcorrecta));
			}
		}
		return rcorrecta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuestionario basicGetRcorrecta() {
		return rcorrecta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRcorrecta(Cuestionario newRcorrecta) {
		Cuestionario oldRcorrecta = rcorrecta;
		rcorrecta = newRcorrecta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.RESPUESTA__RCORRECTA, oldRcorrecta, rcorrecta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.RESPUESTA__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatawebPackage.RESPUESTA__RCORRECTA:
				if (resolve) return getRcorrecta();
				return basicGetRcorrecta();
			case DatawebPackage.RESPUESTA__TEXTO:
				return getTexto();
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
			case DatawebPackage.RESPUESTA__RCORRECTA:
				setRcorrecta((Cuestionario)newValue);
				return;
			case DatawebPackage.RESPUESTA__TEXTO:
				setTexto((String)newValue);
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
			case DatawebPackage.RESPUESTA__RCORRECTA:
				setRcorrecta((Cuestionario)null);
				return;
			case DatawebPackage.RESPUESTA__TEXTO:
				setTexto(TEXTO_EDEFAULT);
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
			case DatawebPackage.RESPUESTA__RCORRECTA:
				return rcorrecta != null;
			case DatawebPackage.RESPUESTA__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
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
		result.append(" (Texto: ");
		result.append(texto);
		result.append(')');
		return result.toString();
	}

} //RespuestaImpl
