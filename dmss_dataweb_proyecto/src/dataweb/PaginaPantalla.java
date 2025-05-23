/**
 */
package dataweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina Pantalla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataweb.PaginaPantalla#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dataweb.PaginaPantalla#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link dataweb.PaginaPantalla#getRedsocial <em>Redsocial</em>}</li>
 *   <li>{@link dataweb.PaginaPantalla#getEntidad <em>Entidad</em>}</li>
 * </ul>
 *
 * @see dataweb.DatawebPackage#getPaginaPantalla()
 * @model abstract="true"
 *        annotation="DSLDoc"
 * @generated
 */
public interface PaginaPantalla extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dataweb.DatawebPackage#getPaginaPantalla_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dataweb.PaginaPantalla#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference list.
	 * The list contents are of type {@link dataweb.Rol}.
	 * It is bidirectional and its opposite is '{@link dataweb.Rol#getAccesoapaginapantalla <em>Accesoapaginapantalla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference list.
	 * @see dataweb.DatawebPackage#getPaginaPantalla_Usuario()
	 * @see dataweb.Rol#getAccesoapaginapantalla
	 * @model opposite="accesoapaginapantalla" required="true"
	 *        annotation="gmf.link source='PaginaPantalla' target='Rol' target.decoration='arrow' color='211,211,211' width='2'"
	 * @generated
	 */
	EList<Rol> getUsuario();

	/**
	 * Returns the value of the '<em><b>Redsocial</b></em>' reference list.
	 * The list contents are of type {@link dataweb.RedSocial}.
	 * It is bidirectional and its opposite is '{@link dataweb.RedSocial#getPaginapantalla <em>Paginapantalla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redsocial</em>' reference list.
	 * @see dataweb.DatawebPackage#getPaginaPantalla_Redsocial()
	 * @see dataweb.RedSocial#getPaginapantalla
	 * @model opposite="paginapantalla"
	 *        annotation="gmf.link source='PaginaPantalla' target='RedSocial' target.decoration='arrow' color='211,211,211' width='2'"
	 * @generated
	 */
	EList<RedSocial> getRedsocial();

	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' reference.
	 * @see #setEntidad(Entidad)
	 * @see dataweb.DatawebPackage#getPaginaPantalla_Entidad()
	 * @model required="true"
	 *        annotation="gmf.link source='PaginaPantalla' target='Entidad' target.decoration='arrow' color='211,211,211' width='2'"
	 * @generated
	 */
	Entidad getEntidad();

	/**
	 * Sets the value of the '{@link dataweb.PaginaPantalla#getEntidad <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad</em>' reference.
	 * @see #getEntidad()
	 * @generated
	 */
	void setEntidad(Entidad value);

} // PaginaPantalla
