/**
  * General type to represent any traversal of the AST.
  * TP is the generic type of the parameter passed in the traversal.
  * TR is the generic return type returned in the traversal.
  * If neither of these types are required, they should be instantiated with Void.
  * @see AbstractVisitor for its default implementation.
  * 
  * @author  Francisco Ortin
  */

package visitor;
import ast.*;
import types.*;
import types.ErrorType;

public interface Visitor<TP, TR> {
	
	// ********* Expressions **********

	 public TR visit(Arithmetic arithmetic, TP param);	
	
	 public TR visit(Variable variable, TP param);

	 public TR visit(IntLiteral intLiteral, TP param);

	 public TR visit(RealLiteral realLiteral, TP param);
	 
	 public TR visit(CharLiteral charLiteral, TP param);
	 
	 public TR visit(Comparison comparison, TP param);
	 
	 public TR visit(DotNotation dotNotation, TP param);
	 
	 public TR visit(Cast cast, TP param);
	 
	 public TR visit(Indexing indexing, TP param);

	 public TR visit(Logical logical, TP param);
	 
	 public TR visit(RecordField record, TP param);
	 
	 public TR visit(UnaryMinus unaryMinus, TP param);

	 public TR visit(UnaryNot unaryNot, TP param);
	 
	 public TR visit(TypeDefinition typeDef, TP param);


	// ************ Statements ***************
	
	 public TR visit(Write write, TP param);
	
	 public TR visit(Assignment assignment, TP param);
		
 	 public  TR visit(VarDefinition varDefinition, TP param);
 	 
 	 public  TR visit(FuncDefinition funcDefinition, TP param);
 	 
 	 public  TR visit(FuncInvocation funcInvocation, TP param);
 	 
 	 public  TR visit(IfElse ifElse, TP param);
 	 
	 public  TR visit(Read read, TP param);
	 
	 public  TR visit(Return rStatement, TP param);

	 public  TR visit(While wStatement, TP param);
 	
	// ************ Program ****************

	 public TR visit(Program program, TP param);

	// ************ Types ****************

	 public TR visit(IntType intType, TP param);

	 public TR visit(ErrorType errorType, TP param);

	 public TR visit(RealType realType, TP param);
	 
	 public TR visit(ArrayType arrayType, TP param);
	 
	 public TR visit(CharType charType, TP param);
	 
	 public TR visit(CustomType type, TP param);

	 public TR visit(FuncType type, TP param);

	 public TR visit(StructType type, TP param);
	 
	 public TR visit(VoidType type, TP param);

}
