/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.Rol#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.Rol#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link dataweb.Rol#getAccesoapaginapantalla <em>Accesoapaginapantalla</em>}</li>
 *   <li>{@link dataweb.Rol#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getRol()
 * @model annotation="DSLDoc"
 *        annotation="gmf.node label='Nombre' color='255,215,0'"
 * @generated
 */
public interface Rol extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getRol_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.Rol#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Entidad}.
	 * It is bidirectional and its opposite is '{@link dataweb.Entidad#getUsuarios <em>Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' reference list.
	 * @see dataweb.DatawebPackage#getRol_Entidades()
	 * @see dataweb.Entidad#getUsuarios
	 * @model opposite="usuarios"
	 *        annotation="gmf.link source='Rol' target='Entidad' target.decoration='arrow' color='211,211,211' width='2'"
	 * @generated
	 */
	EList<Entidad> getEntidades();

	/**
	 * Returns the value of the '<em><b>Accesoapaginapantalla</b></em>' reference list.
	 * The list contents are of type {@link dataweb.PaginaPantalla}.
	 * It is bidirectional and its opposite is '{@link dataweb.PaginaPantalla#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesoapaginapantalla</em>' reference list.
	 * @see dataweb.DatawebPackage#getRol_Accesoapaginapantalla()
	 * @see dataweb.PaginaPantalla#getUsuario
	 * @model opposite="usuario"
	 *        annotation="gmf.link source='Rol' target='PaginaPantalla' target.decoration='arrow' color='211,211,211' width='2'"
	 * @generated
	 */
	EList<PaginaPantalla> getAccesoapaginapantalla();

	/**
	 * Returns the value of the '<em><b>Numero Entidades Accesibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Entidades Accesibles</em>' attribute.
	 * @see #setNumeroEntidadesAccesibles(int)
	 * @see dataweb.DatawebPackage#getRol_NumeroEntidadesAccesibles()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getNumeroEntidadesAccesibles();

	/**
	 * Sets the value of the '{@link dataweb.Rol#getNumeroEntidadesAccesibles <em>Numero Entidades Accesibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Entidades Accesibles</em>' attribute.
	 * @see #getNumeroEntidadesAccesibles()
	 * @generated
	 */
	void setNumeroEntidadesAccesibles(int value);

} // Rol
