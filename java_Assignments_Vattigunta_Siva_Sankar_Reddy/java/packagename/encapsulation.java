package packagename;

public class encapsulation {
    private void display() {
    	System.out.println("hey hi , this is siva from encapsulation class");
    }
    public void display1() {
    	display();
    }
	public static void main(String[] args) {
		encapsulation e=new encapsulation();
		e.display1();
		

	}

}
