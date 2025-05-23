/**
 */
package dataweb;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;


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
 *   <li>{@link dataweb.Cuestionario#getPreguntasC <em>Preguntas C</em>}</li>
 *   <li>{@link dataweb.Cuestionario#getNumeroPregVF <em>Numero Preg VF</em>}</li>
 *   <li>{@link dataweb.Cuestionario#getNumeroPregSelect <em>Numero Preg Select</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getCuestionario()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Nombre' color='0,255,255'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R07a_cuestionario_preguntas_con_respuesta_correcta'"
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

	/**
	 * Returns the value of the '<em><b>Preguntas C</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas C</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getCuestionario_PreguntasC()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Pregunta> getPreguntasC();

	/**
	 * Returns the value of the '<em><b>Numero Preg VF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Preg VF</em>' attribute.
	 * @see #setNumeroPregVF(int)
	 * @see dataweb.DatawebPackage#getCuestionario_NumeroPregVF()
	 * @model required="true"
	 * @generated
	 */
	int getNumeroPregVF();

	/**
	 * Sets the value of the '{@link dataweb.Cuestionario#getNumeroPregVF <em>Numero Preg VF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Preg VF</em>' attribute.
	 * @see #getNumeroPregVF()
	 * @generated
	 */
	void setNumeroPregVF(int value);

	/**
	 * Returns the value of the '<em><b>Numero Preg Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Preg Select</em>' attribute.
	 * @see #setNumeroPregSelect(int)
	 * @see dataweb.DatawebPackage#getCuestionario_NumeroPregSelect()
	 * @model required="true"
	 * @generated
	 */
	int getNumeroPregSelect();

	/**
	 * Sets the value of the '{@link dataweb.Cuestionario#getNumeroPregSelect <em>Numero Preg Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Preg Select</em>' attribute.
	 * @see #getNumeroPregSelect()
	 * @generated
	 */
	void setNumeroPregSelect(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n  preguntasC-&gt;forAll(p |\n    if p.Tipo = TipoPregunta::V_F or p.Tipo = TipoPregunta::OpcionMultiple then\n      not p.Rcorrecta.oclIsUndefined()\n    else\n      p.Rcorrecta.oclIsUndefined()\n    endif\n  )'"
	 * @generated
	 */
	boolean R07a_cuestionario_preguntas_con_respuesta_correcta(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Cuestionario
