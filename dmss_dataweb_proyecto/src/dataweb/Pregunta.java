/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Pregunta#getTipo <em>Tipo</em>}</li>
 *   <li>{@link dataweb.Pregunta#getRespuestas <em>Respuestas</em>}</li>
 *   <li>{@link dataweb.Pregunta#getTexto <em>Texto</em>}</li>
 *   <li>{@link dataweb.Pregunta#getRcorrecta <em>Rcorrecta</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getPregunta()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Texto' color='255,255,0'"
 * @generated
 */
public interface Pregunta extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link dataweb.TipoPregunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see dataweb.TipoPregunta
	 * @see #setTipo(TipoPregunta)
	 * @see dataweb.DatawebPackage#getPregunta_Tipo()
	 * @model
	 * @generated
	 */
	TipoPregunta getTipo();

	/**
	 * Sets the value of the '{@link dataweb.Pregunta#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see dataweb.TipoPregunta
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoPregunta value);

	/**
	 * Returns the value of the '<em><b>Respuestas</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Respuesta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respuestas</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getPregunta_Respuestas()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Respuesta> getRespuestas();

	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see dataweb.DatawebPackage#getPregunta_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link dataweb.Pregunta#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

	/**
	 * Returns the value of the '<em><b>Rcorrecta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcorrecta</em>' reference.
	 * @see #setRcorrecta(Respuesta)
	 * @see dataweb.DatawebPackage#getPregunta_Rcorrecta()
	 * @model annotation="gmf.link source='Pregunta' target='Respuesta' target.decoration='arrow' color='211,211,211' width='2'"
	 * @generated
	 */
	Respuesta getRcorrecta();

	/**
	 * Sets the value of the '{@link dataweb.Pregunta#getRcorrecta <em>Rcorrecta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcorrecta</em>' reference.
	 * @see #getRcorrecta()
	 * @generated
	 */
	void setRcorrecta(Respuesta value);

} // Pregunta
