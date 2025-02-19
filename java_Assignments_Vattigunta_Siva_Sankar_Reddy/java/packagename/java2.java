package packagename;

public class java2 {

     public int si(int principle,int interest,int t){
    	return t*principle*interest/100;
    }
	public static void main(String[] args) {
		java2 j=new java2();
		
		
		System.out.println(j.si(100,20,2));

	}

}
