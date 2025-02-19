package assessments;

public class B extends product  {
     String category ;
     int count;
     public B(){
    	 category="Milk";
    	 count=90;
     }
     public void display() {
    	 System.out.println("ID :"+this.id);
   	  System.out.println("Name : "+this.name);
   	  System.out.println("Category : "+this.category);
   	  System.out.println("Count : "+this.count);
     }
     

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}
}
