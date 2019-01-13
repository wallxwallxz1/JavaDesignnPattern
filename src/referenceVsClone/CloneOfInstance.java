package referenceVsClone;


public class CloneOfInstance extends Test2{
	
	/* Use of clone method to make a shallow copy of an instance
	 * Every class that implements clone() should call super.clone() 
	 * to obtain the cloned object reference.
	 * The class must also implement java.lang.Cloneable interface 
	 * whose object clone we want to create otherwise it will throw 
	 * CloneNotSupportedException when clone method is called on that 
	 * class’s object.
	 * 
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		Test2 t1 = new Test2();
		t1.a = 25;
		t1.b = 50;
		t1.c.x = 70;
		t1.c.y =100;
		
		Test2 t2 = (Test2) t1.clone();
		t2.a = 1000;
		t2.c.x = 2000;
		
		System.out.println(t1.a+" "+t1.b+" "+t1.c.x+" "+t1.c.y);
		

	}

}

class Test{
	
	/*
	 * An instance of this class is contain in class Test2
	 * 
	 */
	int x, y;
}

class Test2 implements Cloneable{
	
	int a , b;
	Test c = new Test();
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
}