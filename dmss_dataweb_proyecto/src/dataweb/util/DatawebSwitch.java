/**
 */
package dataweb.util;

import dataweb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dataweb.DatawebPackage
 * @generated
 */
public class DatawebSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatawebPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatawebSwitch() {
		if (modelPackage == null) {
			modelPackage = DatawebPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatawebPackage.APLICACION: {
				Aplicacion aplicacion = (Aplicacion)theEObject;
				T result = caseAplicacion(aplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.BASE_DATOS: {
				BaseDatos baseDatos = (BaseDatos)theEObject;
				T result = caseBaseDatos(baseDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.ENTIDAD: {
				Entidad entidad = (Entidad)theEObject;
				T result = caseEntidad(entidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.CREAR_INSTANCIA: {
				CrearInstancia crearInstancia = (CrearInstancia)theEObject;
				T result = caseCrearInstancia(crearInstancia);
				if (result == null) result = caseDependienteDeEntidad(crearInstancia);
				if (result == null) result = casePaginaPantalla(crearInstancia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.INDICE_EXTENDIDO: {
				IndiceExtendido indiceExtendido = (IndiceExtendido)theEObject;
				T result = caseIndiceExtendido(indiceExtendido);
				if (result == null) result = caseIndice(indiceExtendido);
				if (result == null) result = caseDependienteDeEntidad(indiceExtendido);
				if (result == null) result = casePaginaPantalla(indiceExtendido);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.DETALLES_INSTANCIA: {
				DetallesInstancia detallesInstancia = (DetallesInstancia)theEObject;
				T result = caseDetallesInstancia(detallesInstancia);
				if (result == null) result = caseDependienteDeEntidad(detallesInstancia);
				if (result == null) result = casePaginaPantalla(detallesInstancia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.ACTUALIZACION_INSTANCIA: {
				ActualizacionInstancia actualizacionInstancia = (ActualizacionInstancia)theEObject;
				T result = caseActualizacionInstancia(actualizacionInstancia);
				if (result == null) result = caseDependienteDeEntidad(actualizacionInstancia);
				if (result == null) result = casePaginaPantalla(actualizacionInstancia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.INDICE_ENTIDAD: {
				IndiceEntidad indiceEntidad = (IndiceEntidad)theEObject;
				T result = caseIndiceEntidad(indiceEntidad);
				if (result == null) result = caseIndice(indiceEntidad);
				if (result == null) result = caseDependienteDeEntidad(indiceEntidad);
				if (result == null) result = casePaginaPantalla(indiceEntidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.INDICE_DETALLE: {
				IndiceDetalle indiceDetalle = (IndiceDetalle)theEObject;
				T result = caseIndiceDetalle(indiceDetalle);
				if (result == null) result = caseIndice(indiceDetalle);
				if (result == null) result = caseDependienteDeEntidad(indiceDetalle);
				if (result == null) result = casePaginaPantalla(indiceDetalle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.BORRADO_INSTANCIA: {
				BorradoInstancia borradoInstancia = (BorradoInstancia)theEObject;
				T result = caseBorradoInstancia(borradoInstancia);
				if (result == null) result = caseDependienteDeEntidad(borradoInstancia);
				if (result == null) result = casePaginaPantalla(borradoInstancia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.CUESTIONARIO: {
				Cuestionario cuestionario = (Cuestionario)theEObject;
				T result = caseCuestionario(cuestionario);
				if (result == null) result = caseInteractiva(cuestionario);
				if (result == null) result = casePaginaPantalla(cuestionario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.PREGUNTA: {
				Pregunta pregunta = (Pregunta)theEObject;
				T result = casePregunta(pregunta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.DEPENDIENTE_DE_ENTIDAD: {
				DependienteDeEntidad dependienteDeEntidad = (DependienteDeEntidad)theEObject;
				T result = caseDependienteDeEntidad(dependienteDeEntidad);
				if (result == null) result = casePaginaPantalla(dependienteDeEntidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.NORMAL: {
				Normal normal = (Normal)theEObject;
				T result = caseNormal(normal);
				if (result == null) result = casePaginaPantalla(normal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.ENCUESTA: {
				Encuesta encuesta = (Encuesta)theEObject;
				T result = caseEncuesta(encuesta);
				if (result == null) result = caseInteractiva(encuesta);
				if (result == null) result = casePaginaPantalla(encuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.INTERACTIVA: {
				Interactiva interactiva = (Interactiva)theEObject;
				T result = caseInteractiva(interactiva);
				if (result == null) result = casePaginaPantalla(interactiva);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.RESPUESTA: {
				Respuesta respuesta = (Respuesta)theEObject;
				T result = caseRespuesta(respuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.RED_SOCIAL: {
				RedSocial redSocial = (RedSocial)theEObject;
				T result = caseRedSocial(redSocial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.INDICE: {
				Indice indice = (Indice)theEObject;
				T result = caseIndice(indice);
				if (result == null) result = caseDependienteDeEntidad(indice);
				if (result == null) result = casePaginaPantalla(indice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.CONTENIDO_MULTIMEDIA: {
				ContenidoMultimedia contenidoMultimedia = (ContenidoMultimedia)theEObject;
				T result = caseContenidoMultimedia(contenidoMultimedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.PAGINA_PANTALLA: {
				PaginaPantalla paginaPantalla = (PaginaPantalla)theEObject;
				T result = casePaginaPantalla(paginaPantalla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = casePaginaPantalla(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatawebPackage.CRUD: {
				CRUD crud = (CRUD)theEObject;
				T result = caseCRUD(crud);
				if (result == null) result = caseDependienteDeEntidad(crud);
				if (result == null) result = casePaginaPantalla(crud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAplicacion(Aplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseDatos(BaseDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidad(Entidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crear Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crear Instancia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrearInstancia(CrearInstancia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indice Extendido</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indice Extendido</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndiceExtendido(IndiceExtendido object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detalles Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detalles Instancia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetallesInstancia(DetallesInstancia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actualizacion Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actualizacion Instancia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualizacionInstancia(ActualizacionInstancia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indice Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indice Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndiceEntidad(IndiceEntidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indice Detalle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indice Detalle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndiceDetalle(IndiceDetalle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Borrado Instancia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Borrado Instancia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorradoInstancia(BorradoInstancia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuestionario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuestionario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuestionario(Cuestionario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregunta(Pregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependiente De Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependiente De Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependienteDeEntidad(DependienteDeEntidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormal(Normal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncuesta(Encuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactiva</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactiva</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractiva(Interactiva object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuesta(Respuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Red Social</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Red Social</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedSocial(RedSocial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndice(Indice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenido Multimedia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenido Multimedia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenidoMultimedia(ContenidoMultimedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagina Pantalla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagina Pantalla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginaPantalla(PaginaPantalla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRUD(CRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DatawebSwitch
