package packagename;

public class constructoroverloading {
	public constructoroverloading() {
		int a=10;
		int b=20;
	}
	public constructoroverloading(int a,int b) {
		
	}
	public constructoroverloading(int a) {
		int b=20;
	}

	public static void main(String[] args) {

		constructoroverloading c1=new constructoroverloading();
		constructoroverloading c2=new constructoroverloading(10,20);
		constructoroverloading c3=new constructoroverloading(10);
	    
	    
		
	

	}

}
