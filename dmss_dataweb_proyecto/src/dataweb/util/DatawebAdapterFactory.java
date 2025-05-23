/**
 */
package dataweb.util;

import dataweb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dataweb.DatawebPackage
 * @generated
 */
public class DatawebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatawebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatawebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatawebPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatawebSwitch<Adapter> modelSwitch =
		new DatawebSwitch<Adapter>() {
			@Override
			public Adapter caseAplicacion(Aplicacion object) {
				return createAplicacionAdapter();
			}
			@Override
			public Adapter caseBaseDatos(BaseDatos object) {
				return createBaseDatosAdapter();
			}
			@Override
			public Adapter caseEntidad(Entidad object) {
				return createEntidadAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseCrearInstancia(CrearInstancia object) {
				return createCrearInstanciaAdapter();
			}
			@Override
			public Adapter caseIndiceExtendido(IndiceExtendido object) {
				return createIndiceExtendidoAdapter();
			}
			@Override
			public Adapter caseDetallesInstancia(DetallesInstancia object) {
				return createDetallesInstanciaAdapter();
			}
			@Override
			public Adapter caseActualizacionInstancia(ActualizacionInstancia object) {
				return createActualizacionInstanciaAdapter();
			}
			@Override
			public Adapter caseIndiceEntidad(IndiceEntidad object) {
				return createIndiceEntidadAdapter();
			}
			@Override
			public Adapter caseIndiceDetalle(IndiceDetalle object) {
				return createIndiceDetalleAdapter();
			}
			@Override
			public Adapter caseBorradoInstancia(BorradoInstancia object) {
				return createBorradoInstanciaAdapter();
			}
			@Override
			public Adapter caseCuestionario(Cuestionario object) {
				return createCuestionarioAdapter();
			}
			@Override
			public Adapter casePregunta(Pregunta object) {
				return createPreguntaAdapter();
			}
			@Override
			public Adapter caseDependienteDeEntidad(DependienteDeEntidad object) {
				return createDependienteDeEntidadAdapter();
			}
			@Override
			public Adapter caseNormal(Normal object) {
				return createNormalAdapter();
			}
			@Override
			public Adapter caseEncuesta(Encuesta object) {
				return createEncuestaAdapter();
			}
			@Override
			public Adapter caseInteractiva(Interactiva object) {
				return createInteractivaAdapter();
			}
			@Override
			public Adapter caseRespuesta(Respuesta object) {
				return createRespuestaAdapter();
			}
			@Override
			public Adapter caseRol(Rol object) {
				return createRolAdapter();
			}
			@Override
			public Adapter caseRedSocial(RedSocial object) {
				return createRedSocialAdapter();
			}
			@Override
			public Adapter caseIndice(Indice object) {
				return createIndiceAdapter();
			}
			@Override
			public Adapter caseContenidoMultimedia(ContenidoMultimedia object) {
				return createContenidoMultimediaAdapter();
			}
			@Override
			public Adapter casePaginaPantalla(PaginaPantalla object) {
				return createPaginaPantallaAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseCRUD(CRUD object) {
				return createCRUDAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Aplicacion
	 * @generated
	 */
	public Adapter createAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.BaseDatos <em>Base Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.BaseDatos
	 * @generated
	 */
	public Adapter createBaseDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Entidad
	 * @generated
	 */
	public Adapter createEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.CrearInstancia <em>Crear Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.CrearInstancia
	 * @generated
	 */
	public Adapter createCrearInstanciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.IndiceExtendido <em>Indice Extendido</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.IndiceExtendido
	 * @generated
	 */
	public Adapter createIndiceExtendidoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.DetallesInstancia <em>Detalles Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.DetallesInstancia
	 * @generated
	 */
	public Adapter createDetallesInstanciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.ActualizacionInstancia <em>Actualizacion Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.ActualizacionInstancia
	 * @generated
	 */
	public Adapter createActualizacionInstanciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.IndiceEntidad <em>Indice Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.IndiceEntidad
	 * @generated
	 */
	public Adapter createIndiceEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.IndiceDetalle <em>Indice Detalle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.IndiceDetalle
	 * @generated
	 */
	public Adapter createIndiceDetalleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.BorradoInstancia <em>Borrado Instancia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.BorradoInstancia
	 * @generated
	 */
	public Adapter createBorradoInstanciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Cuestionario <em>Cuestionario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Cuestionario
	 * @generated
	 */
	public Adapter createCuestionarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Pregunta
	 * @generated
	 */
	public Adapter createPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.DependienteDeEntidad <em>Dependiente De Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.DependienteDeEntidad
	 * @generated
	 */
	public Adapter createDependienteDeEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Normal
	 * @generated
	 */
	public Adapter createNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Encuesta
	 * @generated
	 */
	public Adapter createEncuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Interactiva <em>Interactiva</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Interactiva
	 * @generated
	 */
	public Adapter createInteractivaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Respuesta
	 * @generated
	 */
	public Adapter createRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.RedSocial <em>Red Social</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.RedSocial
	 * @generated
	 */
	public Adapter createRedSocialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Indice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Indice
	 * @generated
	 */
	public Adapter createIndiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.ContenidoMultimedia <em>Contenido Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.ContenidoMultimedia
	 * @generated
	 */
	public Adapter createContenidoMultimediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.PaginaPantalla <em>Pagina Pantalla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.PaginaPantalla
	 * @generated
	 */
	public Adapter createPaginaPantallaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataweb.CRUD <em>CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataweb.CRUD
	 * @generated
	 */
	public Adapter createCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatawebAdapterFactory
