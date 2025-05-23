/**
 */
package dataweb;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Encuesta#getPreguntasE <em>Preguntas E</em>}</li>
 *   <li>{@link dataweb.Encuesta#getNumeroPregVF <em>Numero Preg VF</em>}</li>
 *   <li>{@link dataweb.Encuesta#getNumeroPregSelect <em>Numero Preg Select</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getEncuesta()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Descripcion' color='255,253,208'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R07b_encuesta_sin_respuesta_correcta'"
 * @generated
 */
public interface Encuesta extends Interactiva {

	/**
	 * Returns the value of the '<em><b>Preguntas E</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas E</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getEncuesta_PreguntasE()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Pregunta> getPreguntasE();

	/**
	 * Returns the value of the '<em><b>Numero Preg VF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Preg VF</em>' attribute.
	 * @see #setNumeroPregVF(int)
	 * @see dataweb.DatawebPackage#getEncuesta_NumeroPregVF()
	 * @model required="true"
	 * @generated
	 */
	int getNumeroPregVF();

	/**
	 * Sets the value of the '{@link dataweb.Encuesta#getNumeroPregVF <em>Numero Preg VF</em>}' attribute.
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
	 * @see dataweb.DatawebPackage#getEncuesta_NumeroPregSelect()
	 * @model required="true"
	 * @generated
	 */
	int getNumeroPregSelect();

	/**
	 * Sets the value of the '{@link dataweb.Encuesta#getNumeroPregSelect <em>Numero Preg Select</em>}' attribute.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n  preguntasE-&gt;forAll(p |\n    p.Rcorrecta.oclIsUndefined()\n  )'"
	 * @generated
	 */
	boolean R07b_encuesta_sin_respuesta_correcta(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Encuesta
