/**
 */
package dataweb;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Indice#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getIndice()
 * @model abstract="true"
 *        annotation="DSLDoc"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R09_atributos_en_indice_pertenecen_a_entidad'"
 * @generated
 */
public interface Indice extends DependienteDeEntidad {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' attribute.
	 * @see #setAtributos(String)
	 * @see dataweb.DatawebPackage#getIndice_Atributos()
	 * @model
	 * @generated
	 */
	String getAtributos();

	/**
	 * Sets the value of the '{@link dataweb.Indice#getAtributos <em>Atributos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributos</em>' attribute.
	 * @see #getAtributos()
	 * @generated
	 */
	void setAtributos(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \tAtributos-&gt;forAll(a | self.entidad.atributos-&gt;exists(at | at.Nombre = a))'"
	 * @generated
	 */
	boolean R09_atributos_en_indice_pertenecen_a_entidad(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Indice
