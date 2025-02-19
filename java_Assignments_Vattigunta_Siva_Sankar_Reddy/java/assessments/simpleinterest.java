package assessments;
public class simpleinterest {
	 public int si(int principle,int interest,int t){
		 System.out.println(principle+interest);
	    	return t*principle*interest/100;
	    }
		public static void main(String[] args) {
		simpleinterest j=new simpleinterest();
			int p=100;
			int i=20;
			int t=2;		
			System.out.println(j.si(p,i,t));
}}
