package assessments;

abstract public class abstraction {
	public abstraction(){
		
	}
	abstract public void leaves();
	abstract public void holidays();
	public void method() {
		System.out.println("hey i am in method 1");
	}
	public static void main(String[] args) {	
       abstraction a=new hello();
       a.leaves();
       a.holidays();
       a.method();
	}

}
abstract class mindsprint extends abstraction{
	public mindsprint() {
		
	}
	abstract public void leaves();
	public void holidays() {
		System.out.println("hey i am in mindsprint holidays method");
	}
}
class hello extends mindsprint{
	public void leaves() {
		System.out.println("hey i am leaves from hello");
	}
	public void method() {
		System.out.println("hey i am method 2 from hello");
	}
}
