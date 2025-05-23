/**
 */
package dataweb;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Entidad#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link dataweb.Entidad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.Entidad#getEntidadRefereenciada <em>Entidad Refereenciada</em>}</li>
 *   <li>{@link dataweb.Entidad#getUsuarios <em>Usuarios</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getEntidad()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Nombre' color='0,255,255'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R06_no_referencia_inversa'"
 * @generated
 */
public interface Entidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link dataweb.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see dataweb.DatawebPackage#getEntidad_Atributos()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Atributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getEntidad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.Entidad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Entidad Refereenciada</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Entidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Refereenciada</em>' reference list.
	 * @see dataweb.DatawebPackage#getEntidad_EntidadRefereenciada()
	 * @model annotation="gmf.link source='Entidad' target='Entidad' target.decoration='arrow' color='255,0,0' width='3'"
	 * @generated
	 */
	EList<Entidad> getEntidadRefereenciada();

	/**
	 * Returns the value of the '<em><b>Usuarios</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Rol}.
	 * It is bidirectional and its opposite is '{@link dataweb.Rol#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuarios</em>' reference list.
	 * @see dataweb.DatawebPackage#getEntidad_Usuarios()
	 * @see dataweb.Rol#getEntidades
	 * @model opposite="entidades" required="true"
	 *        annotation="gmf.link source='EntidadRol' target='Rol' target.decoration='arrow' color='255,0,0' width='3'"
	 * @generated
	 */
	EList<Rol> getUsuarios();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \tnot entidadRefereenciada-&gt;includes(self)'"
	 * @generated
	 */
	boolean R05_no_autorreferencia(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t    let pp = Aplicacion.allInstances()-&gt;any(true).paginapantallas-&gt;select(p | p.entidad = self) in\n\t    (pp-&gt;exists(p | p.oclIsTypeOf(IndiceEntidad) or p.oclIsTypeOf(IndiceExtendido))) =\n\t    (pp-&gt;exists(p | p.oclIsTypeOf(DetallesInstancia)))'"
	 * @generated
	 */
	boolean R03_indice_y_detalle_van_juntos(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t    let pp = Aplicacion.allInstances()-&gt;any(true).paginapantallas-&gt;select(p | p.entidad = self) in\n\t    pp-&gt;exists(p | p.oclIsTypeOf(CRUD)) implies\n\t    pp-&gt;forAll(p | not (\n\t        p.oclIsTypeOf(IndiceEntidad) or\n\t        p.oclIsTypeOf(IndiceExtendido) or\n\t        p.oclIsTypeOf(IndiceDetalle) or\n\t        p.oclIsTypeOf(DetallesInstancia) or\n\t        p.oclIsTypeOf(CrearInstancia) or\n\t        p.oclIsTypeOf(ActualizacionInstancia) or\n\t        p.oclIsTypeOf(BorradoInstancia)\n\t    ))'"
	 * @generated
	 */
	boolean R02_crud_no_combinado(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t    Aplicacion.allInstances()-&gt;any(true).paginapantallas\n\t      -&gt;select(p | p.entidad = self and p.oclIsTypeOf(IndiceEntidad))-&gt;size() &lt;= 1'"
	 * @generated
	 */
	boolean R08_indice_unico_por_entidad(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \tentidadRefereenciada-&gt;forAll(e | not e.entidadRefereenciada-&gt;includes(self))'"
	 * @generated
	 */
	boolean R06_no_referencia_inversa(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entidad
