
package ast;

import visitor.Visitor;

public interface Statement extends ASTNode {

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);

}
