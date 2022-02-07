

class Outer{
	
	int a;
	public void show() {
		
		System.out.println("outer class");
	
	}
	
	class Inner{
		void display() {
			
		System.out.println("Inner class");
		}
	}
	
	
}



public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}

}



