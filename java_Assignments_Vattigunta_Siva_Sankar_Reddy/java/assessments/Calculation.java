package assessments;
public class Calculation {
    public int method(int a,int b) {
    	return a+b;
    }
    public float method(float a,float b) {
    	return a-b;
    }
    public long method(long a,long b) {
    	return a*b;
    }
    public double method(double a,double b) {
    	return a/b;
    }
    public boolean checkeven(int a) {
    	return a%2==0;
    }
    public boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Calculation c=new Calculation();
	System.out.println(c.method(100,2));	
	System.out.println(c.method(10,5.0));
	System.out.println(c.method(100l,20l));
	System.out.println(c.method(10.0f,9.0f));
	System.out.println(c.checkeven(9));
	System.out.println(c.isPrime(7));
	}
}
