/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link dataweb.Pregunta#getEncuestas <em>Encuestas</em>}</li>
 *   <li>{@link dataweb.Pregunta#getCuestionarios <em>Cuestionarios</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getPregunta()
 * @model
 * @generated
 */
public interface Pregunta extends Interactiva {
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
	 * Returns the value of the '<em><b>Encuestas</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Encuesta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encuestas</em>' reference list.
	 * @see dataweb.DatawebPackage#getPregunta_Encuestas()
	 * @model
	 * @generated
	 */
	EList<Encuesta> getEncuestas();

	/**
	 * Returns the value of the '<em><b>Cuestionarios</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Cuestionario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuestionarios</em>' reference list.
	 * @see dataweb.DatawebPackage#getPregunta_Cuestionarios()
	 * @model
	 * @generated
	 */
	EList<Cuestionario> getCuestionarios();

} // Pregunta
