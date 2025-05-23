/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /dmss_dataweb_proyecto/metamodel/dataweb.ecore
 * using:
 *   /dmss_dataweb_proyecto/metamodel/dataweb.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package dataweb;

// import dataweb.DatawebPackage;
// import dataweb.DatawebTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DatawebTables provides the dispatch tables for the dataweb for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DatawebTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DatawebPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_dataweb = IdManager.getNsURIPackageId("http://www.example.org/dataweb", null, DatawebPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_ActualizacionInstancia = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("ActualizacionInstancia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Aplicacion = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Aplicacion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Atributo = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Atributo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BaseDatos = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("BaseDatos", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BorradoInstancia = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("BorradoInstancia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CRUD = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("CRUD", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = DatawebTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ContenidoMultimedia = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("ContenidoMultimedia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CrearInstancia = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("CrearInstancia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Cuestionario = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Cuestionario", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DetallesInstancia = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("DetallesInstancia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Encuesta = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Encuesta", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entidad = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Entidad", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Index = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Indice = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Indice", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IndiceDetalle = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("IndiceDetalle", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IndiceEntidad = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("IndiceEntidad", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IndiceExtendido = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("IndiceExtendido", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Normal = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Normal", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PaginaPantalla = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("PaginaPantalla", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Pregunta = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Pregunta", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RedSocial = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("RedSocial", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Respuesta = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Respuesta", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Rol = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getClassId("Rol", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = DatawebTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TipoAtributo = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getEnumerationId("TipoAtributo");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TipoPregunta = DatawebTables.PACKid_http_c_s_s_www_example_org_s_dataweb.getEnumerationId("TipoPregunta");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Entidad = TypeId.BAG.getSpecializedId(DatawebTables.CLSSid_Entidad);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PaginaPantalla = TypeId.BAG.getSpecializedId(DatawebTables.CLSSid_PaginaPantalla);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Pregunta = TypeId.BAG.getSpecializedId(DatawebTables.CLSSid_Pregunta);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_OpcionMultiple = DatawebTables.ENUMid_TipoPregunta.getEnumerationLiteralId("OpcionMultiple");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_V_F = DatawebTables.ENUMid_TipoPregunta.getEnumerationLiteralId("V_F");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Atributo = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_Atributo);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_BaseDatos = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_BaseDatos);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ContenidoMultimedia = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_ContenidoMultimedia);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entidad = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_Entidad);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PaginaPantalla = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_PaginaPantalla);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Pregunta = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_Pregunta);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_RedSocial = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_RedSocial);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Respuesta = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_Respuesta);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Rol = TypeId.ORDERED_SET.getSpecializedId(DatawebTables.CLSSid_Rol);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_PaginaPantalla = TypeId.SEQUENCE.getSpecializedId(DatawebTables.CLSSid_PaginaPantalla);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Aplicacion = TypeId.SET.getSpecializedId(DatawebTables.CLSSid_Aplicacion);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DatawebTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _ActualizacionInstancia = new EcoreExecutorType(DatawebPackage.Literals.ACTUALIZACION_INSTANCIA, PACKAGE, 0);
		public static final EcoreExecutorType _Aplicacion = new EcoreExecutorType(DatawebPackage.Literals.APLICACION, PACKAGE, 0);
		public static final EcoreExecutorType _Atributo = new EcoreExecutorType(DatawebPackage.Literals.ATRIBUTO, PACKAGE, 0);
		public static final EcoreExecutorType _BaseDatos = new EcoreExecutorType(DatawebPackage.Literals.BASE_DATOS, PACKAGE, 0);
		public static final EcoreExecutorType _BorradoInstancia = new EcoreExecutorType(DatawebPackage.Literals.BORRADO_INSTANCIA, PACKAGE, 0);
		public static final EcoreExecutorType _CRUD = new EcoreExecutorType(DatawebPackage.Literals.CRUD, PACKAGE, 0);
		public static final EcoreExecutorType _ContenidoMultimedia = new EcoreExecutorType(DatawebPackage.Literals.CONTENIDO_MULTIMEDIA, PACKAGE, 0);
		public static final EcoreExecutorType _CrearInstancia = new EcoreExecutorType(DatawebPackage.Literals.CREAR_INSTANCIA, PACKAGE, 0);
		public static final EcoreExecutorType _Cuestionario = new EcoreExecutorType(DatawebPackage.Literals.CUESTIONARIO, PACKAGE, 0);
		public static final EcoreExecutorType _DependienteDeEntidad = new EcoreExecutorType(DatawebPackage.Literals.DEPENDIENTE_DE_ENTIDAD, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DetallesInstancia = new EcoreExecutorType(DatawebPackage.Literals.DETALLES_INSTANCIA, PACKAGE, 0);
		public static final EcoreExecutorType _Encuesta = new EcoreExecutorType(DatawebPackage.Literals.ENCUESTA, PACKAGE, 0);
		public static final EcoreExecutorType _Entidad = new EcoreExecutorType(DatawebPackage.Literals.ENTIDAD, PACKAGE, 0);
		public static final EcoreExecutorType _Index = new EcoreExecutorType(DatawebPackage.Literals.INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _Indice = new EcoreExecutorType(DatawebPackage.Literals.INDICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _IndiceDetalle = new EcoreExecutorType(DatawebPackage.Literals.INDICE_DETALLE, PACKAGE, 0);
		public static final EcoreExecutorType _IndiceEntidad = new EcoreExecutorType(DatawebPackage.Literals.INDICE_ENTIDAD, PACKAGE, 0);
		public static final EcoreExecutorType _IndiceExtendido = new EcoreExecutorType(DatawebPackage.Literals.INDICE_EXTENDIDO, PACKAGE, 0);
		public static final EcoreExecutorType _Interactiva = new EcoreExecutorType(DatawebPackage.Literals.INTERACTIVA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Normal = new EcoreExecutorType(DatawebPackage.Literals.NORMAL, PACKAGE, 0);
		public static final EcoreExecutorType _PaginaPantalla = new EcoreExecutorType(DatawebPackage.Literals.PAGINA_PANTALLA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Pregunta = new EcoreExecutorType(DatawebPackage.Literals.PREGUNTA, PACKAGE, 0);
		public static final EcoreExecutorType _RedSocial = new EcoreExecutorType(DatawebPackage.Literals.RED_SOCIAL, PACKAGE, 0);
		public static final EcoreExecutorType _Respuesta = new EcoreExecutorType(DatawebPackage.Literals.RESPUESTA, PACKAGE, 0);
		public static final EcoreExecutorType _Rol = new EcoreExecutorType(DatawebPackage.Literals.ROL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TipoAtributo = new EcoreExecutorEnumeration(DatawebPackage.Literals.TIPO_ATRIBUTO, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TipoPregunta = new EcoreExecutorEnumeration(DatawebPackage.Literals.TIPO_PREGUNTA, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_ActualizacionInstancia,
			_Aplicacion,
			_Atributo,
			_BaseDatos,
			_BorradoInstancia,
			_CRUD,
			_ContenidoMultimedia,
			_CrearInstancia,
			_Cuestionario,
			_DependienteDeEntidad,
			_DetallesInstancia,
			_Encuesta,
			_Entidad,
			_Index,
			_Indice,
			_IndiceDetalle,
			_IndiceEntidad,
			_IndiceExtendido,
			_Interactiva,
			_Normal,
			_PaginaPantalla,
			_Pregunta,
			_RedSocial,
			_Respuesta,
			_Rol,
			_TipoAtributo,
			_TipoPregunta
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _ActualizacionInstancia__ActualizacionInstancia = new ExecutorFragment(Types._ActualizacionInstancia, DatawebTables.Types._ActualizacionInstancia);
		private static final ExecutorFragment _ActualizacionInstancia__DependienteDeEntidad = new ExecutorFragment(Types._ActualizacionInstancia, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _ActualizacionInstancia__OclAny = new ExecutorFragment(Types._ActualizacionInstancia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActualizacionInstancia__OclElement = new ExecutorFragment(Types._ActualizacionInstancia, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ActualizacionInstancia__PaginaPantalla = new ExecutorFragment(Types._ActualizacionInstancia, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Aplicacion__Aplicacion = new ExecutorFragment(Types._Aplicacion, DatawebTables.Types._Aplicacion);
		private static final ExecutorFragment _Aplicacion__OclAny = new ExecutorFragment(Types._Aplicacion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Aplicacion__OclElement = new ExecutorFragment(Types._Aplicacion, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Atributo__Atributo = new ExecutorFragment(Types._Atributo, DatawebTables.Types._Atributo);
		private static final ExecutorFragment _Atributo__OclAny = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Atributo__OclElement = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BaseDatos__BaseDatos = new ExecutorFragment(Types._BaseDatos, DatawebTables.Types._BaseDatos);
		private static final ExecutorFragment _BaseDatos__OclAny = new ExecutorFragment(Types._BaseDatos, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BaseDatos__OclElement = new ExecutorFragment(Types._BaseDatos, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BorradoInstancia__BorradoInstancia = new ExecutorFragment(Types._BorradoInstancia, DatawebTables.Types._BorradoInstancia);
		private static final ExecutorFragment _BorradoInstancia__DependienteDeEntidad = new ExecutorFragment(Types._BorradoInstancia, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _BorradoInstancia__OclAny = new ExecutorFragment(Types._BorradoInstancia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BorradoInstancia__OclElement = new ExecutorFragment(Types._BorradoInstancia, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BorradoInstancia__PaginaPantalla = new ExecutorFragment(Types._BorradoInstancia, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _CRUD__CRUD = new ExecutorFragment(Types._CRUD, DatawebTables.Types._CRUD);
		private static final ExecutorFragment _CRUD__DependienteDeEntidad = new ExecutorFragment(Types._CRUD, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _CRUD__OclAny = new ExecutorFragment(Types._CRUD, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CRUD__OclElement = new ExecutorFragment(Types._CRUD, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CRUD__PaginaPantalla = new ExecutorFragment(Types._CRUD, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _ContenidoMultimedia__ContenidoMultimedia = new ExecutorFragment(Types._ContenidoMultimedia, DatawebTables.Types._ContenidoMultimedia);
		private static final ExecutorFragment _ContenidoMultimedia__OclAny = new ExecutorFragment(Types._ContenidoMultimedia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContenidoMultimedia__OclElement = new ExecutorFragment(Types._ContenidoMultimedia, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CrearInstancia__CrearInstancia = new ExecutorFragment(Types._CrearInstancia, DatawebTables.Types._CrearInstancia);
		private static final ExecutorFragment _CrearInstancia__DependienteDeEntidad = new ExecutorFragment(Types._CrearInstancia, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _CrearInstancia__OclAny = new ExecutorFragment(Types._CrearInstancia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CrearInstancia__OclElement = new ExecutorFragment(Types._CrearInstancia, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CrearInstancia__PaginaPantalla = new ExecutorFragment(Types._CrearInstancia, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Cuestionario__Cuestionario = new ExecutorFragment(Types._Cuestionario, DatawebTables.Types._Cuestionario);
		private static final ExecutorFragment _Cuestionario__Interactiva = new ExecutorFragment(Types._Cuestionario, DatawebTables.Types._Interactiva);
		private static final ExecutorFragment _Cuestionario__OclAny = new ExecutorFragment(Types._Cuestionario, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Cuestionario__OclElement = new ExecutorFragment(Types._Cuestionario, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Cuestionario__PaginaPantalla = new ExecutorFragment(Types._Cuestionario, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _DependienteDeEntidad__DependienteDeEntidad = new ExecutorFragment(Types._DependienteDeEntidad, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _DependienteDeEntidad__OclAny = new ExecutorFragment(Types._DependienteDeEntidad, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DependienteDeEntidad__OclElement = new ExecutorFragment(Types._DependienteDeEntidad, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DependienteDeEntidad__PaginaPantalla = new ExecutorFragment(Types._DependienteDeEntidad, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _DetallesInstancia__DependienteDeEntidad = new ExecutorFragment(Types._DetallesInstancia, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _DetallesInstancia__DetallesInstancia = new ExecutorFragment(Types._DetallesInstancia, DatawebTables.Types._DetallesInstancia);
		private static final ExecutorFragment _DetallesInstancia__OclAny = new ExecutorFragment(Types._DetallesInstancia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DetallesInstancia__OclElement = new ExecutorFragment(Types._DetallesInstancia, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DetallesInstancia__PaginaPantalla = new ExecutorFragment(Types._DetallesInstancia, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Encuesta__Encuesta = new ExecutorFragment(Types._Encuesta, DatawebTables.Types._Encuesta);
		private static final ExecutorFragment _Encuesta__Interactiva = new ExecutorFragment(Types._Encuesta, DatawebTables.Types._Interactiva);
		private static final ExecutorFragment _Encuesta__OclAny = new ExecutorFragment(Types._Encuesta, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Encuesta__OclElement = new ExecutorFragment(Types._Encuesta, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Encuesta__PaginaPantalla = new ExecutorFragment(Types._Encuesta, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Entidad__Entidad = new ExecutorFragment(Types._Entidad, DatawebTables.Types._Entidad);
		private static final ExecutorFragment _Entidad__OclAny = new ExecutorFragment(Types._Entidad, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entidad__OclElement = new ExecutorFragment(Types._Entidad, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Index__Index = new ExecutorFragment(Types._Index, DatawebTables.Types._Index);
		private static final ExecutorFragment _Index__OclAny = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Index__OclElement = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Index__PaginaPantalla = new ExecutorFragment(Types._Index, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Indice__DependienteDeEntidad = new ExecutorFragment(Types._Indice, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _Indice__Indice = new ExecutorFragment(Types._Indice, DatawebTables.Types._Indice);
		private static final ExecutorFragment _Indice__OclAny = new ExecutorFragment(Types._Indice, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Indice__OclElement = new ExecutorFragment(Types._Indice, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Indice__PaginaPantalla = new ExecutorFragment(Types._Indice, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _IndiceDetalle__DependienteDeEntidad = new ExecutorFragment(Types._IndiceDetalle, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _IndiceDetalle__Indice = new ExecutorFragment(Types._IndiceDetalle, DatawebTables.Types._Indice);
		private static final ExecutorFragment _IndiceDetalle__IndiceDetalle = new ExecutorFragment(Types._IndiceDetalle, DatawebTables.Types._IndiceDetalle);
		private static final ExecutorFragment _IndiceDetalle__OclAny = new ExecutorFragment(Types._IndiceDetalle, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IndiceDetalle__OclElement = new ExecutorFragment(Types._IndiceDetalle, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IndiceDetalle__PaginaPantalla = new ExecutorFragment(Types._IndiceDetalle, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _IndiceEntidad__DependienteDeEntidad = new ExecutorFragment(Types._IndiceEntidad, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _IndiceEntidad__Indice = new ExecutorFragment(Types._IndiceEntidad, DatawebTables.Types._Indice);
		private static final ExecutorFragment _IndiceEntidad__IndiceEntidad = new ExecutorFragment(Types._IndiceEntidad, DatawebTables.Types._IndiceEntidad);
		private static final ExecutorFragment _IndiceEntidad__OclAny = new ExecutorFragment(Types._IndiceEntidad, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IndiceEntidad__OclElement = new ExecutorFragment(Types._IndiceEntidad, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IndiceEntidad__PaginaPantalla = new ExecutorFragment(Types._IndiceEntidad, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _IndiceExtendido__DependienteDeEntidad = new ExecutorFragment(Types._IndiceExtendido, DatawebTables.Types._DependienteDeEntidad);
		private static final ExecutorFragment _IndiceExtendido__Indice = new ExecutorFragment(Types._IndiceExtendido, DatawebTables.Types._Indice);
		private static final ExecutorFragment _IndiceExtendido__IndiceExtendido = new ExecutorFragment(Types._IndiceExtendido, DatawebTables.Types._IndiceExtendido);
		private static final ExecutorFragment _IndiceExtendido__OclAny = new ExecutorFragment(Types._IndiceExtendido, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IndiceExtendido__OclElement = new ExecutorFragment(Types._IndiceExtendido, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IndiceExtendido__PaginaPantalla = new ExecutorFragment(Types._IndiceExtendido, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Interactiva__Interactiva = new ExecutorFragment(Types._Interactiva, DatawebTables.Types._Interactiva);
		private static final ExecutorFragment _Interactiva__OclAny = new ExecutorFragment(Types._Interactiva, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Interactiva__OclElement = new ExecutorFragment(Types._Interactiva, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Interactiva__PaginaPantalla = new ExecutorFragment(Types._Interactiva, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Normal__Normal = new ExecutorFragment(Types._Normal, DatawebTables.Types._Normal);
		private static final ExecutorFragment _Normal__OclAny = new ExecutorFragment(Types._Normal, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Normal__OclElement = new ExecutorFragment(Types._Normal, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Normal__PaginaPantalla = new ExecutorFragment(Types._Normal, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _PaginaPantalla__OclAny = new ExecutorFragment(Types._PaginaPantalla, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaginaPantalla__OclElement = new ExecutorFragment(Types._PaginaPantalla, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaginaPantalla__PaginaPantalla = new ExecutorFragment(Types._PaginaPantalla, DatawebTables.Types._PaginaPantalla);

		private static final ExecutorFragment _Pregunta__OclAny = new ExecutorFragment(Types._Pregunta, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Pregunta__OclElement = new ExecutorFragment(Types._Pregunta, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Pregunta__Pregunta = new ExecutorFragment(Types._Pregunta, DatawebTables.Types._Pregunta);

		private static final ExecutorFragment _RedSocial__OclAny = new ExecutorFragment(Types._RedSocial, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RedSocial__OclElement = new ExecutorFragment(Types._RedSocial, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RedSocial__RedSocial = new ExecutorFragment(Types._RedSocial, DatawebTables.Types._RedSocial);

		private static final ExecutorFragment _Respuesta__OclAny = new ExecutorFragment(Types._Respuesta, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Respuesta__OclElement = new ExecutorFragment(Types._Respuesta, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Respuesta__Respuesta = new ExecutorFragment(Types._Respuesta, DatawebTables.Types._Respuesta);

		private static final ExecutorFragment _Rol__OclAny = new ExecutorFragment(Types._Rol, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Rol__OclElement = new ExecutorFragment(Types._Rol, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Rol__Rol = new ExecutorFragment(Types._Rol, DatawebTables.Types._Rol);

		private static final ExecutorFragment _TipoAtributo__OclAny = new ExecutorFragment(Types._TipoAtributo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TipoAtributo__OclElement = new ExecutorFragment(Types._TipoAtributo, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TipoAtributo__OclEnumeration = new ExecutorFragment(Types._TipoAtributo, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TipoAtributo__OclType = new ExecutorFragment(Types._TipoAtributo, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TipoAtributo__TipoAtributo = new ExecutorFragment(Types._TipoAtributo, DatawebTables.Types._TipoAtributo);

		private static final ExecutorFragment _TipoPregunta__OclAny = new ExecutorFragment(Types._TipoPregunta, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TipoPregunta__OclElement = new ExecutorFragment(Types._TipoPregunta, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TipoPregunta__OclEnumeration = new ExecutorFragment(Types._TipoPregunta, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TipoPregunta__OclType = new ExecutorFragment(Types._TipoPregunta, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TipoPregunta__TipoPregunta = new ExecutorFragment(Types._TipoPregunta, DatawebTables.Types._TipoPregunta);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Aplicacion__Descripcion = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__DESCRIPCION, Types._Aplicacion, 0);
		public static final ExecutorProperty _Aplicacion__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__NOMBRE, Types._Aplicacion, 1);
		public static final ExecutorProperty _Aplicacion__basedatos = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__BASEDATOS, Types._Aplicacion, 2);
		public static final ExecutorProperty _Aplicacion__paginapantallas = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS, Types._Aplicacion, 3);
		public static final ExecutorProperty _Aplicacion__paginasMediasAccesibles = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__PAGINAS_MEDIAS_ACCESIBLES, Types._Aplicacion, 4);
		public static final ExecutorProperty _Aplicacion__redessociales = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__REDESSOCIALES, Types._Aplicacion, 5);
		public static final ExecutorProperty _Aplicacion__roles = new EcoreExecutorProperty(DatawebPackage.Literals.APLICACION__ROLES, Types._Aplicacion, 6);

		public static final ExecutorProperty _Atributo__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.ATRIBUTO__NOMBRE, Types._Atributo, 0);
		public static final ExecutorProperty _Atributo__PrimaryKey = new EcoreExecutorProperty(DatawebPackage.Literals.ATRIBUTO__PRIMARY_KEY, Types._Atributo, 1);
		public static final ExecutorProperty _Atributo__TipoAtributo = new EcoreExecutorProperty(DatawebPackage.Literals.ATRIBUTO__TIPO_ATRIBUTO, Types._Atributo, 2);
		public static final ExecutorProperty _Atributo__Entidad__atributos = new ExecutorPropertyWithImplementation("Entidad", Types._Atributo, 3, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.ENTIDAD__ATRIBUTOS));

		public static final ExecutorProperty _BaseDatos__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.BASE_DATOS__NOMBRE, Types._BaseDatos, 0);
		public static final ExecutorProperty _BaseDatos__tablas = new EcoreExecutorProperty(DatawebPackage.Literals.BASE_DATOS__TABLAS, Types._BaseDatos, 1);
		public static final ExecutorProperty _BaseDatos__Aplicacion__basedatos = new ExecutorPropertyWithImplementation("Aplicacion", Types._BaseDatos, 2, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.APLICACION__BASEDATOS));

		public static final ExecutorProperty _ContenidoMultimedia__Tipo = new EcoreExecutorProperty(DatawebPackage.Literals.CONTENIDO_MULTIMEDIA__TIPO, Types._ContenidoMultimedia, 0);
		public static final ExecutorProperty _ContenidoMultimedia__Normal__contenidomultimedia = new ExecutorPropertyWithImplementation("Normal", Types._ContenidoMultimedia, 1, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.NORMAL__CONTENIDOMULTIMEDIA));

		public static final ExecutorProperty _Cuestionario__Evaluado = new EcoreExecutorProperty(DatawebPackage.Literals.CUESTIONARIO__EVALUADO, Types._Cuestionario, 0);
		public static final ExecutorProperty _Cuestionario__numeroPregSelect = new EcoreExecutorProperty(DatawebPackage.Literals.CUESTIONARIO__NUMERO_PREG_SELECT, Types._Cuestionario, 1);
		public static final ExecutorProperty _Cuestionario__numeroPregVF = new EcoreExecutorProperty(DatawebPackage.Literals.CUESTIONARIO__NUMERO_PREG_VF, Types._Cuestionario, 2);
		public static final ExecutorProperty _Cuestionario__preguntasC = new EcoreExecutorProperty(DatawebPackage.Literals.CUESTIONARIO__PREGUNTAS_C, Types._Cuestionario, 3);

		public static final ExecutorProperty _Encuesta__numeroPregSelect = new EcoreExecutorProperty(DatawebPackage.Literals.ENCUESTA__NUMERO_PREG_SELECT, Types._Encuesta, 0);
		public static final ExecutorProperty _Encuesta__numeroPregVF = new EcoreExecutorProperty(DatawebPackage.Literals.ENCUESTA__NUMERO_PREG_VF, Types._Encuesta, 1);
		public static final ExecutorProperty _Encuesta__preguntasE = new EcoreExecutorProperty(DatawebPackage.Literals.ENCUESTA__PREGUNTAS_E, Types._Encuesta, 2);

		public static final ExecutorProperty _Entidad__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.ENTIDAD__NOMBRE, Types._Entidad, 0);
		public static final ExecutorProperty _Entidad__atributos = new EcoreExecutorProperty(DatawebPackage.Literals.ENTIDAD__ATRIBUTOS, Types._Entidad, 1);
		public static final ExecutorProperty _Entidad__entidadRefereenciada = new EcoreExecutorProperty(DatawebPackage.Literals.ENTIDAD__ENTIDAD_REFEREENCIADA, Types._Entidad, 2);
		public static final ExecutorProperty _Entidad__usuarios = new EcoreExecutorProperty(DatawebPackage.Literals.ENTIDAD__USUARIOS, Types._Entidad, 3);
		public static final ExecutorProperty _Entidad__BaseDatos__tablas = new ExecutorPropertyWithImplementation("BaseDatos", Types._Entidad, 4, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.BASE_DATOS__TABLAS));
		public static final ExecutorProperty _Entidad__Entidad__entidadRefereenciada = new ExecutorPropertyWithImplementation("Entidad", Types._Entidad, 5, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.ENTIDAD__ENTIDAD_REFEREENCIADA));
		public static final ExecutorProperty _Entidad__PaginaPantalla__entidad = new ExecutorPropertyWithImplementation("PaginaPantalla", Types._Entidad, 6, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.PAGINA_PANTALLA__ENTIDAD));

		public static final ExecutorProperty _Indice__Atributos = new EcoreExecutorProperty(DatawebPackage.Literals.INDICE__ATRIBUTOS, Types._Indice, 0);

		public static final ExecutorProperty _Interactiva__Descripcion = new EcoreExecutorProperty(DatawebPackage.Literals.INTERACTIVA__DESCRIPCION, Types._Interactiva, 0);

		public static final ExecutorProperty _Normal__Contenido = new EcoreExecutorProperty(DatawebPackage.Literals.NORMAL__CONTENIDO, Types._Normal, 0);
		public static final ExecutorProperty _Normal__contenidomultimedia = new EcoreExecutorProperty(DatawebPackage.Literals.NORMAL__CONTENIDOMULTIMEDIA, Types._Normal, 1);

		public static final ExecutorProperty _PaginaPantalla__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.PAGINA_PANTALLA__NOMBRE, Types._PaginaPantalla, 0);
		public static final ExecutorProperty _PaginaPantalla__entidad = new EcoreExecutorProperty(DatawebPackage.Literals.PAGINA_PANTALLA__ENTIDAD, Types._PaginaPantalla, 1);
		public static final ExecutorProperty _PaginaPantalla__redsocial = new EcoreExecutorProperty(DatawebPackage.Literals.PAGINA_PANTALLA__REDSOCIAL, Types._PaginaPantalla, 2);
		public static final ExecutorProperty _PaginaPantalla__usuario = new EcoreExecutorProperty(DatawebPackage.Literals.PAGINA_PANTALLA__USUARIO, Types._PaginaPantalla, 3);
		public static final ExecutorProperty _PaginaPantalla__Aplicacion__paginapantallas = new ExecutorPropertyWithImplementation("Aplicacion", Types._PaginaPantalla, 4, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.APLICACION__PAGINAPANTALLAS));

		public static final ExecutorProperty _Pregunta__Rcorrecta = new EcoreExecutorProperty(DatawebPackage.Literals.PREGUNTA__RCORRECTA, Types._Pregunta, 0);
		public static final ExecutorProperty _Pregunta__Texto = new EcoreExecutorProperty(DatawebPackage.Literals.PREGUNTA__TEXTO, Types._Pregunta, 1);
		public static final ExecutorProperty _Pregunta__Tipo = new EcoreExecutorProperty(DatawebPackage.Literals.PREGUNTA__TIPO, Types._Pregunta, 2);
		public static final ExecutorProperty _Pregunta__respuestas = new EcoreExecutorProperty(DatawebPackage.Literals.PREGUNTA__RESPUESTAS, Types._Pregunta, 3);
		public static final ExecutorProperty _Pregunta__Cuestionario__preguntasC = new ExecutorPropertyWithImplementation("Cuestionario", Types._Pregunta, 4, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.CUESTIONARIO__PREGUNTAS_C));
		public static final ExecutorProperty _Pregunta__Encuesta__preguntasE = new ExecutorPropertyWithImplementation("Encuesta", Types._Pregunta, 5, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.ENCUESTA__PREGUNTAS_E));

		public static final ExecutorProperty _RedSocial__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.RED_SOCIAL__NOMBRE, Types._RedSocial, 0);
		public static final ExecutorProperty _RedSocial__paginapantalla = new EcoreExecutorProperty(DatawebPackage.Literals.RED_SOCIAL__PAGINAPANTALLA, Types._RedSocial, 1);
		public static final ExecutorProperty _RedSocial__Aplicacion__redessociales = new ExecutorPropertyWithImplementation("Aplicacion", Types._RedSocial, 2, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.APLICACION__REDESSOCIALES));

		public static final ExecutorProperty _Respuesta__Texto = new EcoreExecutorProperty(DatawebPackage.Literals.RESPUESTA__TEXTO, Types._Respuesta, 0);
		public static final ExecutorProperty _Respuesta__Pregunta__Rcorrecta = new ExecutorPropertyWithImplementation("Pregunta", Types._Respuesta, 1, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.PREGUNTA__RCORRECTA));
		public static final ExecutorProperty _Respuesta__Pregunta__respuestas = new ExecutorPropertyWithImplementation("Pregunta", Types._Respuesta, 2, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.PREGUNTA__RESPUESTAS));

		public static final ExecutorProperty _Rol__Nombre = new EcoreExecutorProperty(DatawebPackage.Literals.ROL__NOMBRE, Types._Rol, 0);
		public static final ExecutorProperty _Rol__accesoapaginapantalla = new EcoreExecutorProperty(DatawebPackage.Literals.ROL__ACCESOAPAGINAPANTALLA, Types._Rol, 1);
		public static final ExecutorProperty _Rol__entidades = new EcoreExecutorProperty(DatawebPackage.Literals.ROL__ENTIDADES, Types._Rol, 2);
		public static final ExecutorProperty _Rol__numeroEntidadesAccesibles = new EcoreExecutorProperty(DatawebPackage.Literals.ROL__NUMERO_ENTIDADES_ACCESIBLES, Types._Rol, 3);
		public static final ExecutorProperty _Rol__Aplicacion__roles = new ExecutorPropertyWithImplementation("Aplicacion", Types._Rol, 4, new EcoreLibraryOppositeProperty(DatawebPackage.Literals.APLICACION__ROLES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _ActualizacionInstancia =
			{
				Fragments._ActualizacionInstancia__OclAny /* 0 */,
				Fragments._ActualizacionInstancia__OclElement /* 1 */,
				Fragments._ActualizacionInstancia__PaginaPantalla /* 2 */,
				Fragments._ActualizacionInstancia__DependienteDeEntidad /* 3 */,
				Fragments._ActualizacionInstancia__ActualizacionInstancia /* 4 */
			};
		private static final int /*@NonNull*/ [] __ActualizacionInstancia = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Aplicacion =
			{
				Fragments._Aplicacion__OclAny /* 0 */,
				Fragments._Aplicacion__OclElement /* 1 */,
				Fragments._Aplicacion__Aplicacion /* 2 */
			};
		private static final int /*@NonNull*/ [] __Aplicacion = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Atributo =
			{
				Fragments._Atributo__OclAny /* 0 */,
				Fragments._Atributo__OclElement /* 1 */,
				Fragments._Atributo__Atributo /* 2 */
			};
		private static final int /*@NonNull*/ [] __Atributo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BaseDatos =
			{
				Fragments._BaseDatos__OclAny /* 0 */,
				Fragments._BaseDatos__OclElement /* 1 */,
				Fragments._BaseDatos__BaseDatos /* 2 */
			};
		private static final int /*@NonNull*/ [] __BaseDatos = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BorradoInstancia =
			{
				Fragments._BorradoInstancia__OclAny /* 0 */,
				Fragments._BorradoInstancia__OclElement /* 1 */,
				Fragments._BorradoInstancia__PaginaPantalla /* 2 */,
				Fragments._BorradoInstancia__DependienteDeEntidad /* 3 */,
				Fragments._BorradoInstancia__BorradoInstancia /* 4 */
			};
		private static final int /*@NonNull*/ [] __BorradoInstancia = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CRUD =
			{
				Fragments._CRUD__OclAny /* 0 */,
				Fragments._CRUD__OclElement /* 1 */,
				Fragments._CRUD__PaginaPantalla /* 2 */,
				Fragments._CRUD__DependienteDeEntidad /* 3 */,
				Fragments._CRUD__CRUD /* 4 */
			};
		private static final int /*@NonNull*/ [] __CRUD = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContenidoMultimedia =
			{
				Fragments._ContenidoMultimedia__OclAny /* 0 */,
				Fragments._ContenidoMultimedia__OclElement /* 1 */,
				Fragments._ContenidoMultimedia__ContenidoMultimedia /* 2 */
			};
		private static final int /*@NonNull*/ [] __ContenidoMultimedia = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CrearInstancia =
			{
				Fragments._CrearInstancia__OclAny /* 0 */,
				Fragments._CrearInstancia__OclElement /* 1 */,
				Fragments._CrearInstancia__PaginaPantalla /* 2 */,
				Fragments._CrearInstancia__DependienteDeEntidad /* 3 */,
				Fragments._CrearInstancia__CrearInstancia /* 4 */
			};
		private static final int /*@NonNull*/ [] __CrearInstancia = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Cuestionario =
			{
				Fragments._Cuestionario__OclAny /* 0 */,
				Fragments._Cuestionario__OclElement /* 1 */,
				Fragments._Cuestionario__PaginaPantalla /* 2 */,
				Fragments._Cuestionario__Interactiva /* 3 */,
				Fragments._Cuestionario__Cuestionario /* 4 */
			};
		private static final int /*@NonNull*/ [] __Cuestionario = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DependienteDeEntidad =
			{
				Fragments._DependienteDeEntidad__OclAny /* 0 */,
				Fragments._DependienteDeEntidad__OclElement /* 1 */,
				Fragments._DependienteDeEntidad__PaginaPantalla /* 2 */,
				Fragments._DependienteDeEntidad__DependienteDeEntidad /* 3 */
			};
		private static final int /*@NonNull*/ [] __DependienteDeEntidad = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DetallesInstancia =
			{
				Fragments._DetallesInstancia__OclAny /* 0 */,
				Fragments._DetallesInstancia__OclElement /* 1 */,
				Fragments._DetallesInstancia__PaginaPantalla /* 2 */,
				Fragments._DetallesInstancia__DependienteDeEntidad /* 3 */,
				Fragments._DetallesInstancia__DetallesInstancia /* 4 */
			};
		private static final int /*@NonNull*/ [] __DetallesInstancia = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Encuesta =
			{
				Fragments._Encuesta__OclAny /* 0 */,
				Fragments._Encuesta__OclElement /* 1 */,
				Fragments._Encuesta__PaginaPantalla /* 2 */,
				Fragments._Encuesta__Interactiva /* 3 */,
				Fragments._Encuesta__Encuesta /* 4 */
			};
		private static final int /*@NonNull*/ [] __Encuesta = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entidad =
			{
				Fragments._Entidad__OclAny /* 0 */,
				Fragments._Entidad__OclElement /* 1 */,
				Fragments._Entidad__Entidad /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entidad = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Index =
			{
				Fragments._Index__OclAny /* 0 */,
				Fragments._Index__OclElement /* 1 */,
				Fragments._Index__PaginaPantalla /* 2 */,
				Fragments._Index__Index /* 3 */
			};
		private static final int /*@NonNull*/ [] __Index = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Indice =
			{
				Fragments._Indice__OclAny /* 0 */,
				Fragments._Indice__OclElement /* 1 */,
				Fragments._Indice__PaginaPantalla /* 2 */,
				Fragments._Indice__DependienteDeEntidad /* 3 */,
				Fragments._Indice__Indice /* 4 */
			};
		private static final int /*@NonNull*/ [] __Indice = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IndiceDetalle =
			{
				Fragments._IndiceDetalle__OclAny /* 0 */,
				Fragments._IndiceDetalle__OclElement /* 1 */,
				Fragments._IndiceDetalle__PaginaPantalla /* 2 */,
				Fragments._IndiceDetalle__DependienteDeEntidad /* 3 */,
				Fragments._IndiceDetalle__Indice /* 4 */,
				Fragments._IndiceDetalle__IndiceDetalle /* 5 */
			};
		private static final int /*@NonNull*/ [] __IndiceDetalle = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IndiceEntidad =
			{
				Fragments._IndiceEntidad__OclAny /* 0 */,
				Fragments._IndiceEntidad__OclElement /* 1 */,
				Fragments._IndiceEntidad__PaginaPantalla /* 2 */,
				Fragments._IndiceEntidad__DependienteDeEntidad /* 3 */,
				Fragments._IndiceEntidad__Indice /* 4 */,
				Fragments._IndiceEntidad__IndiceEntidad /* 5 */
			};
		private static final int /*@NonNull*/ [] __IndiceEntidad = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IndiceExtendido =
			{
				Fragments._IndiceExtendido__OclAny /* 0 */,
				Fragments._IndiceExtendido__OclElement /* 1 */,
				Fragments._IndiceExtendido__PaginaPantalla /* 2 */,
				Fragments._IndiceExtendido__DependienteDeEntidad /* 3 */,
				Fragments._IndiceExtendido__Indice /* 4 */,
				Fragments._IndiceExtendido__IndiceExtendido /* 5 */
			};
		private static final int /*@NonNull*/ [] __IndiceExtendido = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Interactiva =
			{
				Fragments._Interactiva__OclAny /* 0 */,
				Fragments._Interactiva__OclElement /* 1 */,
				Fragments._Interactiva__PaginaPantalla /* 2 */,
				Fragments._Interactiva__Interactiva /* 3 */
			};
		private static final int /*@NonNull*/ [] __Interactiva = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Normal =
			{
				Fragments._Normal__OclAny /* 0 */,
				Fragments._Normal__OclElement /* 1 */,
				Fragments._Normal__PaginaPantalla /* 2 */,
				Fragments._Normal__Normal /* 3 */
			};
		private static final int /*@NonNull*/ [] __Normal = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaginaPantalla =
			{
				Fragments._PaginaPantalla__OclAny /* 0 */,
				Fragments._PaginaPantalla__OclElement /* 1 */,
				Fragments._PaginaPantalla__PaginaPantalla /* 2 */
			};
		private static final int /*@NonNull*/ [] __PaginaPantalla = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Pregunta =
			{
				Fragments._Pregunta__OclAny /* 0 */,
				Fragments._Pregunta__OclElement /* 1 */,
				Fragments._Pregunta__Pregunta /* 2 */
			};
		private static final int /*@NonNull*/ [] __Pregunta = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RedSocial =
			{
				Fragments._RedSocial__OclAny /* 0 */,
				Fragments._RedSocial__OclElement /* 1 */,
				Fragments._RedSocial__RedSocial /* 2 */
			};
		private static final int /*@NonNull*/ [] __RedSocial = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Respuesta =
			{
				Fragments._Respuesta__OclAny /* 0 */,
				Fragments._Respuesta__OclElement /* 1 */,
				Fragments._Respuesta__Respuesta /* 2 */
			};
		private static final int /*@NonNull*/ [] __Respuesta = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Rol =
			{
				Fragments._Rol__OclAny /* 0 */,
				Fragments._Rol__OclElement /* 1 */,
				Fragments._Rol__Rol /* 2 */
			};
		private static final int /*@NonNull*/ [] __Rol = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TipoAtributo =
			{
				Fragments._TipoAtributo__OclAny /* 0 */,
				Fragments._TipoAtributo__OclElement /* 1 */,
				Fragments._TipoAtributo__OclType /* 2 */,
				Fragments._TipoAtributo__OclEnumeration /* 3 */,
				Fragments._TipoAtributo__TipoAtributo /* 4 */
			};
		private static final int /*@NonNull*/ [] __TipoAtributo = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TipoPregunta =
			{
				Fragments._TipoPregunta__OclAny /* 0 */,
				Fragments._TipoPregunta__OclElement /* 1 */,
				Fragments._TipoPregunta__OclType /* 2 */,
				Fragments._TipoPregunta__OclEnumeration /* 3 */,
				Fragments._TipoPregunta__TipoPregunta /* 4 */
			};
		private static final int /*@NonNull*/ [] __TipoPregunta = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._ActualizacionInstancia.initFragments(_ActualizacionInstancia, __ActualizacionInstancia);
			Types._Aplicacion.initFragments(_Aplicacion, __Aplicacion);
			Types._Atributo.initFragments(_Atributo, __Atributo);
			Types._BaseDatos.initFragments(_BaseDatos, __BaseDatos);
			Types._BorradoInstancia.initFragments(_BorradoInstancia, __BorradoInstancia);
			Types._CRUD.initFragments(_CRUD, __CRUD);
			Types._ContenidoMultimedia.initFragments(_ContenidoMultimedia, __ContenidoMultimedia);
			Types._CrearInstancia.initFragments(_CrearInstancia, __CrearInstancia);
			Types._Cuestionario.initFragments(_Cuestionario, __Cuestionario);
			Types._DependienteDeEntidad.initFragments(_DependienteDeEntidad, __DependienteDeEntidad);
			Types._DetallesInstancia.initFragments(_DetallesInstancia, __DetallesInstancia);
			Types._Encuesta.initFragments(_Encuesta, __Encuesta);
			Types._Entidad.initFragments(_Entidad, __Entidad);
			Types._Index.initFragments(_Index, __Index);
			Types._Indice.initFragments(_Indice, __Indice);
			Types._IndiceDetalle.initFragments(_IndiceDetalle, __IndiceDetalle);
			Types._IndiceEntidad.initFragments(_IndiceEntidad, __IndiceEntidad);
			Types._IndiceExtendido.initFragments(_IndiceExtendido, __IndiceExtendido);
			Types._Interactiva.initFragments(_Interactiva, __Interactiva);
			Types._Normal.initFragments(_Normal, __Normal);
			Types._PaginaPantalla.initFragments(_PaginaPantalla, __PaginaPantalla);
			Types._Pregunta.initFragments(_Pregunta, __Pregunta);
			Types._RedSocial.initFragments(_RedSocial, __RedSocial);
			Types._Respuesta.initFragments(_Respuesta, __Respuesta);
			Types._Rol.initFragments(_Rol, __Rol);
			Types._TipoAtributo.initFragments(_TipoAtributo, __TipoAtributo);
			Types._TipoPregunta.initFragments(_TipoPregunta, __TipoPregunta);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _ActualizacionInstancia__ActualizacionInstancia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActualizacionInstancia__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActualizacionInstancia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActualizacionInstancia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActualizacionInstancia__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Aplicacion__Aplicacion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Aplicacion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Aplicacion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BaseDatos__BaseDatos = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseDatos__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BaseDatos__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BorradoInstancia__BorradoInstancia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BorradoInstancia__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BorradoInstancia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BorradoInstancia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BorradoInstancia__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CRUD__CRUD = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CRUD__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CRUD__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CRUD__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CRUD__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ContenidoMultimedia__ContenidoMultimedia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContenidoMultimedia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContenidoMultimedia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CrearInstancia__CrearInstancia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CrearInstancia__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CrearInstancia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CrearInstancia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CrearInstancia__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Cuestionario__Cuestionario = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cuestionario__Interactiva = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cuestionario__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cuestionario__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cuestionario__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _DependienteDeEntidad__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DependienteDeEntidad__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DependienteDeEntidad__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DependienteDeEntidad__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _DetallesInstancia__DetallesInstancia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DetallesInstancia__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DetallesInstancia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DetallesInstancia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DetallesInstancia__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Encuesta__Encuesta = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Encuesta__Interactiva = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Encuesta__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Encuesta__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Encuesta__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Entidad__Entidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entidad__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entidad__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Index__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Indice__Indice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Indice__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Indice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Indice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Indice__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IndiceDetalle__IndiceDetalle = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceDetalle__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceDetalle__Indice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceDetalle__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceDetalle__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceDetalle__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IndiceEntidad__IndiceEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceEntidad__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceEntidad__Indice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceEntidad__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceEntidad__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceEntidad__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IndiceExtendido__IndiceExtendido = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceExtendido__DependienteDeEntidad = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceExtendido__Indice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceExtendido__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceExtendido__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IndiceExtendido__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Interactiva__Interactiva = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interactiva__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Interactiva__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Interactiva__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Normal__Normal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Normal__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Normal__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Normal__PaginaPantalla = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PaginaPantalla__PaginaPantalla = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaginaPantalla__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaginaPantalla__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Pregunta__Pregunta = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Pregunta__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pregunta__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RedSocial__RedSocial = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RedSocial__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RedSocial__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Respuesta__Respuesta = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Respuesta__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Respuesta__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Rol__Rol = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Rol__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TipoAtributo__TipoAtributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoAtributo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoAtributo__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoAtributo__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoAtributo__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TipoPregunta__TipoPregunta = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoPregunta__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoPregunta__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoPregunta__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoPregunta__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ActualizacionInstancia__ActualizacionInstancia.initOperations(_ActualizacionInstancia__ActualizacionInstancia);
			Fragments._ActualizacionInstancia__DependienteDeEntidad.initOperations(_ActualizacionInstancia__DependienteDeEntidad);
			Fragments._ActualizacionInstancia__OclAny.initOperations(_ActualizacionInstancia__OclAny);
			Fragments._ActualizacionInstancia__OclElement.initOperations(_ActualizacionInstancia__OclElement);
			Fragments._ActualizacionInstancia__PaginaPantalla.initOperations(_ActualizacionInstancia__PaginaPantalla);

			Fragments._Aplicacion__Aplicacion.initOperations(_Aplicacion__Aplicacion);
			Fragments._Aplicacion__OclAny.initOperations(_Aplicacion__OclAny);
			Fragments._Aplicacion__OclElement.initOperations(_Aplicacion__OclElement);

			Fragments._Atributo__Atributo.initOperations(_Atributo__Atributo);
			Fragments._Atributo__OclAny.initOperations(_Atributo__OclAny);
			Fragments._Atributo__OclElement.initOperations(_Atributo__OclElement);

			Fragments._BaseDatos__BaseDatos.initOperations(_BaseDatos__BaseDatos);
			Fragments._BaseDatos__OclAny.initOperations(_BaseDatos__OclAny);
			Fragments._BaseDatos__OclElement.initOperations(_BaseDatos__OclElement);

			Fragments._BorradoInstancia__BorradoInstancia.initOperations(_BorradoInstancia__BorradoInstancia);
			Fragments._BorradoInstancia__DependienteDeEntidad.initOperations(_BorradoInstancia__DependienteDeEntidad);
			Fragments._BorradoInstancia__OclAny.initOperations(_BorradoInstancia__OclAny);
			Fragments._BorradoInstancia__OclElement.initOperations(_BorradoInstancia__OclElement);
			Fragments._BorradoInstancia__PaginaPantalla.initOperations(_BorradoInstancia__PaginaPantalla);

			Fragments._CRUD__CRUD.initOperations(_CRUD__CRUD);
			Fragments._CRUD__DependienteDeEntidad.initOperations(_CRUD__DependienteDeEntidad);
			Fragments._CRUD__OclAny.initOperations(_CRUD__OclAny);
			Fragments._CRUD__OclElement.initOperations(_CRUD__OclElement);
			Fragments._CRUD__PaginaPantalla.initOperations(_CRUD__PaginaPantalla);

			Fragments._ContenidoMultimedia__ContenidoMultimedia.initOperations(_ContenidoMultimedia__ContenidoMultimedia);
			Fragments._ContenidoMultimedia__OclAny.initOperations(_ContenidoMultimedia__OclAny);
			Fragments._ContenidoMultimedia__OclElement.initOperations(_ContenidoMultimedia__OclElement);

			Fragments._CrearInstancia__CrearInstancia.initOperations(_CrearInstancia__CrearInstancia);
			Fragments._CrearInstancia__DependienteDeEntidad.initOperations(_CrearInstancia__DependienteDeEntidad);
			Fragments._CrearInstancia__OclAny.initOperations(_CrearInstancia__OclAny);
			Fragments._CrearInstancia__OclElement.initOperations(_CrearInstancia__OclElement);
			Fragments._CrearInstancia__PaginaPantalla.initOperations(_CrearInstancia__PaginaPantalla);

			Fragments._Cuestionario__Cuestionario.initOperations(_Cuestionario__Cuestionario);
			Fragments._Cuestionario__Interactiva.initOperations(_Cuestionario__Interactiva);
			Fragments._Cuestionario__OclAny.initOperations(_Cuestionario__OclAny);
			Fragments._Cuestionario__OclElement.initOperations(_Cuestionario__OclElement);
			Fragments._Cuestionario__PaginaPantalla.initOperations(_Cuestionario__PaginaPantalla);

			Fragments._DependienteDeEntidad__DependienteDeEntidad.initOperations(_DependienteDeEntidad__DependienteDeEntidad);
			Fragments._DependienteDeEntidad__OclAny.initOperations(_DependienteDeEntidad__OclAny);
			Fragments._DependienteDeEntidad__OclElement.initOperations(_DependienteDeEntidad__OclElement);
			Fragments._DependienteDeEntidad__PaginaPantalla.initOperations(_DependienteDeEntidad__PaginaPantalla);

			Fragments._DetallesInstancia__DependienteDeEntidad.initOperations(_DetallesInstancia__DependienteDeEntidad);
			Fragments._DetallesInstancia__DetallesInstancia.initOperations(_DetallesInstancia__DetallesInstancia);
			Fragments._DetallesInstancia__OclAny.initOperations(_DetallesInstancia__OclAny);
			Fragments._DetallesInstancia__OclElement.initOperations(_DetallesInstancia__OclElement);
			Fragments._DetallesInstancia__PaginaPantalla.initOperations(_DetallesInstancia__PaginaPantalla);

			Fragments._Encuesta__Encuesta.initOperations(_Encuesta__Encuesta);
			Fragments._Encuesta__Interactiva.initOperations(_Encuesta__Interactiva);
			Fragments._Encuesta__OclAny.initOperations(_Encuesta__OclAny);
			Fragments._Encuesta__OclElement.initOperations(_Encuesta__OclElement);
			Fragments._Encuesta__PaginaPantalla.initOperations(_Encuesta__PaginaPantalla);

			Fragments._Entidad__Entidad.initOperations(_Entidad__Entidad);
			Fragments._Entidad__OclAny.initOperations(_Entidad__OclAny);
			Fragments._Entidad__OclElement.initOperations(_Entidad__OclElement);

			Fragments._Index__Index.initOperations(_Index__Index);
			Fragments._Index__OclAny.initOperations(_Index__OclAny);
			Fragments._Index__OclElement.initOperations(_Index__OclElement);
			Fragments._Index__PaginaPantalla.initOperations(_Index__PaginaPantalla);

			Fragments._Indice__DependienteDeEntidad.initOperations(_Indice__DependienteDeEntidad);
			Fragments._Indice__Indice.initOperations(_Indice__Indice);
			Fragments._Indice__OclAny.initOperations(_Indice__OclAny);
			Fragments._Indice__OclElement.initOperations(_Indice__OclElement);
			Fragments._Indice__PaginaPantalla.initOperations(_Indice__PaginaPantalla);

			Fragments._IndiceDetalle__DependienteDeEntidad.initOperations(_IndiceDetalle__DependienteDeEntidad);
			Fragments._IndiceDetalle__Indice.initOperations(_IndiceDetalle__Indice);
			Fragments._IndiceDetalle__IndiceDetalle.initOperations(_IndiceDetalle__IndiceDetalle);
			Fragments._IndiceDetalle__OclAny.initOperations(_IndiceDetalle__OclAny);
			Fragments._IndiceDetalle__OclElement.initOperations(_IndiceDetalle__OclElement);
			Fragments._IndiceDetalle__PaginaPantalla.initOperations(_IndiceDetalle__PaginaPantalla);

			Fragments._IndiceEntidad__DependienteDeEntidad.initOperations(_IndiceEntidad__DependienteDeEntidad);
			Fragments._IndiceEntidad__Indice.initOperations(_IndiceEntidad__Indice);
			Fragments._IndiceEntidad__IndiceEntidad.initOperations(_IndiceEntidad__IndiceEntidad);
			Fragments._IndiceEntidad__OclAny.initOperations(_IndiceEntidad__OclAny);
			Fragments._IndiceEntidad__OclElement.initOperations(_IndiceEntidad__OclElement);
			Fragments._IndiceEntidad__PaginaPantalla.initOperations(_IndiceEntidad__PaginaPantalla);

			Fragments._IndiceExtendido__DependienteDeEntidad.initOperations(_IndiceExtendido__DependienteDeEntidad);
			Fragments._IndiceExtendido__Indice.initOperations(_IndiceExtendido__Indice);
			Fragments._IndiceExtendido__IndiceExtendido.initOperations(_IndiceExtendido__IndiceExtendido);
			Fragments._IndiceExtendido__OclAny.initOperations(_IndiceExtendido__OclAny);
			Fragments._IndiceExtendido__OclElement.initOperations(_IndiceExtendido__OclElement);
			Fragments._IndiceExtendido__PaginaPantalla.initOperations(_IndiceExtendido__PaginaPantalla);

			Fragments._Interactiva__Interactiva.initOperations(_Interactiva__Interactiva);
			Fragments._Interactiva__OclAny.initOperations(_Interactiva__OclAny);
			Fragments._Interactiva__OclElement.initOperations(_Interactiva__OclElement);
			Fragments._Interactiva__PaginaPantalla.initOperations(_Interactiva__PaginaPantalla);

			Fragments._Normal__Normal.initOperations(_Normal__Normal);
			Fragments._Normal__OclAny.initOperations(_Normal__OclAny);
			Fragments._Normal__OclElement.initOperations(_Normal__OclElement);
			Fragments._Normal__PaginaPantalla.initOperations(_Normal__PaginaPantalla);

			Fragments._PaginaPantalla__OclAny.initOperations(_PaginaPantalla__OclAny);
			Fragments._PaginaPantalla__OclElement.initOperations(_PaginaPantalla__OclElement);
			Fragments._PaginaPantalla__PaginaPantalla.initOperations(_PaginaPantalla__PaginaPantalla);

			Fragments._Pregunta__OclAny.initOperations(_Pregunta__OclAny);
			Fragments._Pregunta__OclElement.initOperations(_Pregunta__OclElement);
			Fragments._Pregunta__Pregunta.initOperations(_Pregunta__Pregunta);

			Fragments._RedSocial__OclAny.initOperations(_RedSocial__OclAny);
			Fragments._RedSocial__OclElement.initOperations(_RedSocial__OclElement);
			Fragments._RedSocial__RedSocial.initOperations(_RedSocial__RedSocial);

			Fragments._Respuesta__OclAny.initOperations(_Respuesta__OclAny);
			Fragments._Respuesta__OclElement.initOperations(_Respuesta__OclElement);
			Fragments._Respuesta__Respuesta.initOperations(_Respuesta__Respuesta);

			Fragments._Rol__OclAny.initOperations(_Rol__OclAny);
			Fragments._Rol__OclElement.initOperations(_Rol__OclElement);
			Fragments._Rol__Rol.initOperations(_Rol__Rol);

			Fragments._TipoAtributo__OclAny.initOperations(_TipoAtributo__OclAny);
			Fragments._TipoAtributo__OclElement.initOperations(_TipoAtributo__OclElement);
			Fragments._TipoAtributo__OclEnumeration.initOperations(_TipoAtributo__OclEnumeration);
			Fragments._TipoAtributo__OclType.initOperations(_TipoAtributo__OclType);
			Fragments._TipoAtributo__TipoAtributo.initOperations(_TipoAtributo__TipoAtributo);

			Fragments._TipoPregunta__OclAny.initOperations(_TipoPregunta__OclAny);
			Fragments._TipoPregunta__OclElement.initOperations(_TipoPregunta__OclElement);
			Fragments._TipoPregunta__OclEnumeration.initOperations(_TipoPregunta__OclEnumeration);
			Fragments._TipoPregunta__OclType.initOperations(_TipoPregunta__OclType);
			Fragments._TipoPregunta__TipoPregunta.initOperations(_TipoPregunta__TipoPregunta);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _ActualizacionInstancia = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Aplicacion = {
			DatawebTables.Properties._Aplicacion__Descripcion,
			DatawebTables.Properties._Aplicacion__Nombre,
			DatawebTables.Properties._Aplicacion__basedatos,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._Aplicacion__paginapantallas,
			DatawebTables.Properties._Aplicacion__paginasMediasAccesibles,
			DatawebTables.Properties._Aplicacion__redessociales,
			DatawebTables.Properties._Aplicacion__roles
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Atributo = {
			DatawebTables.Properties._Atributo__Nombre,
			DatawebTables.Properties._Atributo__PrimaryKey,
			DatawebTables.Properties._Atributo__TipoAtributo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BaseDatos = {
			DatawebTables.Properties._BaseDatos__Nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._BaseDatos__tablas
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BorradoInstancia = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CRUD = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContenidoMultimedia = {
			DatawebTables.Properties._ContenidoMultimedia__Tipo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CrearInstancia = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Cuestionario = {
			DatawebTables.Properties._Interactiva__Descripcion,
			DatawebTables.Properties._Cuestionario__Evaluado,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			DatawebTables.Properties._Cuestionario__numeroPregSelect,
			DatawebTables.Properties._Cuestionario__numeroPregVF,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._Cuestionario__preguntasC,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DependienteDeEntidad = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DetallesInstancia = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Encuesta = {
			DatawebTables.Properties._Interactiva__Descripcion,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			DatawebTables.Properties._Encuesta__numeroPregSelect,
			DatawebTables.Properties._Encuesta__numeroPregVF,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._Encuesta__preguntasE,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entidad = {
			DatawebTables.Properties._Entidad__Nombre,
			DatawebTables.Properties._Entidad__atributos,
			DatawebTables.Properties._Entidad__entidadRefereenciada,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._Entidad__usuarios
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Index = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Indice = {
			DatawebTables.Properties._Indice__Atributos,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IndiceDetalle = {
			DatawebTables.Properties._Indice__Atributos,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IndiceEntidad = {
			DatawebTables.Properties._Indice__Atributos,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IndiceExtendido = {
			DatawebTables.Properties._Indice__Atributos,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Interactiva = {
			DatawebTables.Properties._Interactiva__Descripcion,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Normal = {
			DatawebTables.Properties._Normal__Contenido,
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._Normal__contenidomultimedia,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaginaPantalla = {
			DatawebTables.Properties._PaginaPantalla__Nombre,
			DatawebTables.Properties._PaginaPantalla__entidad,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._PaginaPantalla__redsocial,
			DatawebTables.Properties._PaginaPantalla__usuario
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Pregunta = {
			DatawebTables.Properties._Pregunta__Rcorrecta,
			DatawebTables.Properties._Pregunta__Texto,
			DatawebTables.Properties._Pregunta__Tipo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._Pregunta__respuestas
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RedSocial = {
			DatawebTables.Properties._RedSocial__Nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DatawebTables.Properties._RedSocial__paginapantalla
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Respuesta = {
			DatawebTables.Properties._Respuesta__Texto,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Rol = {
			DatawebTables.Properties._Rol__Nombre,
			DatawebTables.Properties._Rol__accesoapaginapantalla,
			DatawebTables.Properties._Rol__entidades,
			DatawebTables.Properties._Rol__numeroEntidadesAccesibles,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TipoAtributo = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TipoPregunta = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._ActualizacionInstancia__ActualizacionInstancia.initProperties(_ActualizacionInstancia);
			Fragments._Aplicacion__Aplicacion.initProperties(_Aplicacion);
			Fragments._Atributo__Atributo.initProperties(_Atributo);
			Fragments._BaseDatos__BaseDatos.initProperties(_BaseDatos);
			Fragments._BorradoInstancia__BorradoInstancia.initProperties(_BorradoInstancia);
			Fragments._CRUD__CRUD.initProperties(_CRUD);
			Fragments._ContenidoMultimedia__ContenidoMultimedia.initProperties(_ContenidoMultimedia);
			Fragments._CrearInstancia__CrearInstancia.initProperties(_CrearInstancia);
			Fragments._Cuestionario__Cuestionario.initProperties(_Cuestionario);
			Fragments._DependienteDeEntidad__DependienteDeEntidad.initProperties(_DependienteDeEntidad);
			Fragments._DetallesInstancia__DetallesInstancia.initProperties(_DetallesInstancia);
			Fragments._Encuesta__Encuesta.initProperties(_Encuesta);
			Fragments._Entidad__Entidad.initProperties(_Entidad);
			Fragments._Index__Index.initProperties(_Index);
			Fragments._Indice__Indice.initProperties(_Indice);
			Fragments._IndiceDetalle__IndiceDetalle.initProperties(_IndiceDetalle);
			Fragments._IndiceEntidad__IndiceEntidad.initProperties(_IndiceEntidad);
			Fragments._IndiceExtendido__IndiceExtendido.initProperties(_IndiceExtendido);
			Fragments._Interactiva__Interactiva.initProperties(_Interactiva);
			Fragments._Normal__Normal.initProperties(_Normal);
			Fragments._PaginaPantalla__PaginaPantalla.initProperties(_PaginaPantalla);
			Fragments._Pregunta__Pregunta.initProperties(_Pregunta);
			Fragments._RedSocial__RedSocial.initProperties(_RedSocial);
			Fragments._Respuesta__Respuesta.initProperties(_Respuesta);
			Fragments._Rol__Rol.initProperties(_Rol);
			Fragments._TipoAtributo__TipoAtributo.initProperties(_TipoAtributo);
			Fragments._TipoPregunta__TipoPregunta.initProperties(_TipoPregunta);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _TipoAtributo__Integer = new EcoreExecutorEnumerationLiteral(DatawebPackage.Literals.TIPO_ATRIBUTO.getEEnumLiteral("Integer"), Types._TipoAtributo, 0);
		public static final EcoreExecutorEnumerationLiteral _TipoAtributo__Boolean = new EcoreExecutorEnumerationLiteral(DatawebPackage.Literals.TIPO_ATRIBUTO.getEEnumLiteral("Boolean"), Types._TipoAtributo, 1);
		public static final EcoreExecutorEnumerationLiteral _TipoAtributo__String = new EcoreExecutorEnumerationLiteral(DatawebPackage.Literals.TIPO_ATRIBUTO.getEEnumLiteral("String"), Types._TipoAtributo, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TipoAtributo = {
			_TipoAtributo__Integer,
			_TipoAtributo__Boolean,
			_TipoAtributo__String
		};

		public static final EcoreExecutorEnumerationLiteral _TipoPregunta__OpcionMultiple = new EcoreExecutorEnumerationLiteral(DatawebPackage.Literals.TIPO_PREGUNTA.getEEnumLiteral("OpcionMultiple"), Types._TipoPregunta, 0);
		public static final EcoreExecutorEnumerationLiteral _TipoPregunta__V_F = new EcoreExecutorEnumerationLiteral(DatawebPackage.Literals.TIPO_PREGUNTA.getEEnumLiteral("V_F"), Types._TipoPregunta, 1);
		public static final EcoreExecutorEnumerationLiteral _TipoPregunta__Corta = new EcoreExecutorEnumerationLiteral(DatawebPackage.Literals.TIPO_PREGUNTA.getEEnumLiteral("Corta"), Types._TipoPregunta, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TipoPregunta = {
			_TipoPregunta__OpcionMultiple,
			_TipoPregunta__V_F,
			_TipoPregunta__Corta
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._TipoAtributo.initLiterals(_TipoAtributo);
			Types._TipoPregunta.initLiterals(_TipoPregunta);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DatawebTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DatawebTables();
	}

	private DatawebTables() {
		super(DatawebPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		DatawebPackage.Literals.APLICACION
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
