class A{
	public void show() {
		System.out.println("in a");
	}
}

class B extends A{
	public void show() {
		System.out.println("in B");
	}
	public void config() {
		System.out.println();
	}
}

class c extends A{
	public void show() {
		System.out.println("in c");
	}
}
public class overridingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.show();

	}

}
