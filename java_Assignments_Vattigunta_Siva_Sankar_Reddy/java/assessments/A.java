package assessments;

public class A extends product  {
     String category ;
     int count;
     public A(){
    	 category="Butter";
    	 count=50;
     }
     public void display() {
    	 System.out.println("ID :"+this.id);
   	  System.out.println("Name : "+this.name);
   	  System.out.println("Category : "+this.category);
   	  System.out.println("Count : "+this.count);
     }
     

	public static void main(String[] args) {
		A a=new A();
		a.display();
	}
}
