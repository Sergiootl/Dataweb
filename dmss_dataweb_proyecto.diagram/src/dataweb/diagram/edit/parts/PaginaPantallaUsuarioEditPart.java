/*
 * 
 */
package dataweb.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import dataweb.diagram.edit.policies.PaginaPantallaUsuarioItemSemanticEditPolicy;

/**
 * @generated
 */
public class PaginaPantallaUsuarioEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4007;

	/**
	* @generated
	*/
	public PaginaPantallaUsuarioEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PaginaPantallaUsuarioItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new PaginaPantallaUsuarioFigure();
	}

	/**
	* @generated
	*/
	public PaginaPantallaUsuarioFigure getPrimaryShape() {
		return (PaginaPantallaUsuarioFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PaginaPantallaUsuarioFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public PaginaPantallaUsuarioFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 211, 211, 211);

}
