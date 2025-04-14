/**
 */
package dataweb.impl;

import dataweb.Cuestionario;
import dataweb.DatawebPackage;
import dataweb.Encuesta;
import dataweb.Pregunta;
import dataweb.Respuesta;
import dataweb.TipoPregunta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataweb.impl.PreguntaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link dataweb.impl.PreguntaImpl#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link dataweb.impl.PreguntaImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link dataweb.impl.PreguntaImpl#getEncuestas <em>Encuestas</em>}</li>
 *   <li>{@link dataweb.impl.PreguntaImpl#getCuestionarios <em>Cuestionarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreguntaImpl extends InteractivaImpl implements Pregunta {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPregunta TIPO_EDEFAULT = TipoPregunta.OPCION_MULTIPLE;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoPregunta tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRespuestas() <em>Respuestas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespuestas()
	 * @generated
	 * @ordered
	 */
	protected EList<Respuesta> respuestas;

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
	 * The cached value of the '{@link #getEncuestas() <em>Encuestas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncuestas()
	 * @generated
	 * @ordered
	 */
	protected EList<Encuesta> encuestas;

	/**
	 * The cached value of the '{@link #getCuestionarios() <em>Cuestionarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuestionarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Cuestionario> cuestionarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreguntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatawebPackage.Literals.PREGUNTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoPregunta getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(TipoPregunta newTipo) {
		TipoPregunta oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.PREGUNTA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Respuesta> getRespuestas() {
		if (respuestas == null) {
			respuestas = new EObjectContainmentEList<Respuesta>(Respuesta.class, this, DatawebPackage.PREGUNTA__RESPUESTAS);
		}
		return respuestas;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatawebPackage.PREGUNTA__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Encuesta> getEncuestas() {
		if (encuestas == null) {
			encuestas = new EObjectResolvingEList<Encuesta>(Encuesta.class, this, DatawebPackage.PREGUNTA__ENCUESTAS);
		}
		return encuestas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cuestionario> getCuestionarios() {
		if (cuestionarios == null) {
			cuestionarios = new EObjectResolvingEList<Cuestionario>(Cuestionario.class, this, DatawebPackage.PREGUNTA__CUESTIONARIOS);
		}
		return cuestionarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatawebPackage.PREGUNTA__RESPUESTAS:
				return ((InternalEList<?>)getRespuestas()).basicRemove(otherEnd, msgs);
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
			case DatawebPackage.PREGUNTA__TIPO:
				return getTipo();
			case DatawebPackage.PREGUNTA__RESPUESTAS:
				return getRespuestas();
			case DatawebPackage.PREGUNTA__TEXTO:
				return getTexto();
			case DatawebPackage.PREGUNTA__ENCUESTAS:
				return getEncuestas();
			case DatawebPackage.PREGUNTA__CUESTIONARIOS:
				return getCuestionarios();
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
			case DatawebPackage.PREGUNTA__TIPO:
				setTipo((TipoPregunta)newValue);
				return;
			case DatawebPackage.PREGUNTA__RESPUESTAS:
				getRespuestas().clear();
				getRespuestas().addAll((Collection<? extends Respuesta>)newValue);
				return;
			case DatawebPackage.PREGUNTA__TEXTO:
				setTexto((String)newValue);
				return;
			case DatawebPackage.PREGUNTA__ENCUESTAS:
				getEncuestas().clear();
				getEncuestas().addAll((Collection<? extends Encuesta>)newValue);
				return;
			case DatawebPackage.PREGUNTA__CUESTIONARIOS:
				getCuestionarios().clear();
				getCuestionarios().addAll((Collection<? extends Cuestionario>)newValue);
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
			case DatawebPackage.PREGUNTA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case DatawebPackage.PREGUNTA__RESPUESTAS:
				getRespuestas().clear();
				return;
			case DatawebPackage.PREGUNTA__TEXTO:
				setTexto(TEXTO_EDEFAULT);
				return;
			case DatawebPackage.PREGUNTA__ENCUESTAS:
				getEncuestas().clear();
				return;
			case DatawebPackage.PREGUNTA__CUESTIONARIOS:
				getCuestionarios().clear();
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
			case DatawebPackage.PREGUNTA__TIPO:
				return tipo != TIPO_EDEFAULT;
			case DatawebPackage.PREGUNTA__RESPUESTAS:
				return respuestas != null && !respuestas.isEmpty();
			case DatawebPackage.PREGUNTA__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
			case DatawebPackage.PREGUNTA__ENCUESTAS:
				return encuestas != null && !encuestas.isEmpty();
			case DatawebPackage.PREGUNTA__CUESTIONARIOS:
				return cuestionarios != null && !cuestionarios.isEmpty();
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
		result.append(" (Tipo: ");
		result.append(tipo);
		result.append(", Texto: ");
		result.append(texto);
		result.append(')');
		return result.toString();
	}

} //PreguntaImpl
