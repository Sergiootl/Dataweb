/**
 */
package dataweb.tests;

import dataweb.CrearInstancia;
import dataweb.DatawebFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Crear Instancia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrearInstanciaTest extends DependienteDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CrearInstanciaTest.class);
	}

	/**
	 * Constructs a new Crear Instancia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrearInstanciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Crear Instancia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CrearInstancia getFixture() {
		return (CrearInstancia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createCrearInstancia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CrearInstanciaTest
