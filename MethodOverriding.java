package oops_polymorphism_methooverridig;

public class MethodOverriding {

	
	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.car();
		p.marry();
		Child1 c=new Child1();
		c.marry();
		System.out.println("=====Method Overriding===");
		Parent1 p1=new Child1();
		p1.car();
		p1.marry();
	}

}

class Parent1 {
	public void car() {
		System.out.println("I20,Creta,Tucson");
	}
	public void marry() {
		System.out.println("Anushka shetty");
	}
}
class Child1 extends Parent1 {
	public void marry() {
		System.out.println("Sreeleela");
	}
}