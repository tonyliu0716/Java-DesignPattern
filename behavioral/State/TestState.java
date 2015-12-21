package behavioral.State;

//状态模式在日常开发中用的挺多的，尤其是做网站的时候，
//我们有时希望根据对象的某一属性，区别开他们的一些功能，比如说简单的权限控制等。
public class TestState {
	
	public static void main(String[] args){
		State state = new State();
		Context context = new Context(state);
		
		//设置第一种状态
		state.setValue("state1");
		context.method();
		
		//设置第二种状态
		state.setValue("state2");
		context.method();
	}
	
}
