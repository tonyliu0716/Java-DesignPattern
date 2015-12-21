package behavioral.Interpreter;

//解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！

public class TestInterpreter {
	
	public static void main(String[] args){
		
		//计算9+2
		int result = new Plus().interpret(new Context(9, 2));
		
		//在上面的基础上再－8
		int fResult = (new Minus().interpret(new Context(result, 8)));
		System.out.println("最终结果是：" + fResult);
	}
	
}
