package assessments;

public class functionoverloading {
   public void area() {
	   System.out.println("hey hi");
   }
   public void area(int a,int b) {
	   System.out.println("Area is "+(a+b));
	   
   }
   public void area(int a,int b, int c) {
	   System.out.println("Area is "+(a+b+c));
   }
   public void area(double a,double b) {
	   System.out.println(a*b);
   }
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		functionoverloading k=new functionoverloading();
		k.area();
		k.area(a,b);
		k.area(10.0,20.0);

	}

}
