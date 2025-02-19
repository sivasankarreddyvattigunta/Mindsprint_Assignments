package assessments;

public class Functionoverloading2 {
	int l,b,r;
	public Functionoverloading2() {
		
	}
   public float calculate(float r) {
	  return 3.14f*r*r;
   }
   public int calculate(int a) {
	   return a*a;
   }
   public float calculate(float a,float b) {
	   return a*b;
   }
   public int calculate(int a,int b) {
	   return a*b/2;
   }
   
 
	public static void main(String[] args) {
		
		Functionoverloading2 k=new Functionoverloading2();
		int circle=(int)k.calculate(1.2f);
		long square=k.calculate(4);
		float rect=k.calculate(4.0f,5.0f);
		int rhombus=k.calculate(2,4);
		System.out.println(circle);
		System.out.println(square);
		System.out.println(rect);
		System.out.println(rhombus);
		
		

	}

}
