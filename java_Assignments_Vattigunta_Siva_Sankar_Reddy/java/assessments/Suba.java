package assessments;

public class Suba extends A {
	int price;
	public Suba(){
		price=30;
	}
	public void display() {
		System.out.println(this.count*this.price);
		System.out.println(this.id);
		 System.out.println("Name : "+this.name);
		 System.out.println("category : "+this.category);	
	}
	public static void main(String[] args) {
		Suba a=new Suba();
		a.display();
	}
}
