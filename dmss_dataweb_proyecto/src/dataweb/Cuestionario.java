/**
 */
package dataweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cuestionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Cuestionario#isEvaluado <em>Evaluado</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getCuestionario()
 * @model
 * @generated
 */
public interface Cuestionario extends Interactiva {
	/**
	 * Returns the value of the '<em><b>Evaluado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluado</em>' attribute.
	 * @see #setEvaluado(boolean)
	 * @see dataweb.DatawebPackage#getCuestionario_Evaluado()
	 * @model required="true"
	 * @generated
	 */
	boolean isEvaluado();

	/**
	 * Sets the value of the '{@link dataweb.Cuestionario#isEvaluado <em>Evaluado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluado</em>' attribute.
	 * @see #isEvaluado()
	 * @generated
	 */
	void setEvaluado(boolean value);

} // Cuestionario
