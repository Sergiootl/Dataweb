/**
 */
package dataweb.tests;

import dataweb.DatawebFactory;
import dataweb.DetallesInstancia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Detalles Instancia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetallesInstanciaTest extends DependienteDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DetallesInstanciaTest.class);
	}

	/**
	 * Constructs a new Detalles Instancia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetallesInstanciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Detalles Instancia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DetallesInstancia getFixture() {
		return (DetallesInstancia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createDetallesInstancia());
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

} //DetallesInstanciaTest
