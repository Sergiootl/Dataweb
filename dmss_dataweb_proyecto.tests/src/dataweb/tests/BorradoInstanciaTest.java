/**
 */
package dataweb.tests;

import dataweb.BorradoInstancia;
import dataweb.DatawebFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Borrado Instancia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BorradoInstanciaTest extends DependienteDeEntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BorradoInstanciaTest.class);
	}

	/**
	 * Constructs a new Borrado Instancia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorradoInstanciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Borrado Instancia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BorradoInstancia getFixture() {
		return (BorradoInstancia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatawebFactory.eINSTANCE.createBorradoInstancia());
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

} //BorradoInstanciaTest
