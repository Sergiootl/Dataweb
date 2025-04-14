/**
 */
package dataweb.tests;

import dataweb.ActualizacionInstancia;
import dataweb.DatawebFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actualizacion Instancia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualizacionInstanciaTest extends DependienteDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActualizacionInstanciaTest.class);
	}

	/**
	 * Constructs a new Actualizacion Instancia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualizacionInstanciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actualizacion Instancia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActualizacionInstancia getFixture() {
		return (ActualizacionInstancia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createActualizacionInstancia());
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

} //ActualizacionInstanciaTest
