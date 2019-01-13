package referenceVsClone;
import java.io.*;

public class CopyOfReferenceVariable {

	public static void main(String[] args) {
		
		
		
		Driver obj1 = new Driver();
		
		System.out.println(obj1.x +" : "+obj1.y);
		
		Driver obj2 = obj1;
		System.out.println(obj2.x +" : "+obj2.y);
		
		/*set object2 x = 100 and its y = 250
		notice how both object two and one corresponding values are same
		thats because there are both pointing to same object.
		Recall obj1 and two obj2 are pointing to same object.
		thanks to assignment of:
		 	obj1 = obj2;
		 	
		 	Also recall an assign operator "=" creates a copy of the reference 
		 	variable and an instance.
		 	
		 	In java if you want to create a an instance of a class you use the 
		 		call to constructor "new ClassNname();"
		 	OR 
		 		by clone an existing object. 
		 		Cloning make an identical copy of an instance with similar 
		 		attributes and methods.
		 		
		*/		
		obj2.x = 250;
		obj2.y = 100;
		
		
		System.out.println("from Obj 1: "+obj1.x +" : "+obj1.y);
		System.out.println();
		System.out.println("from Object2: "+obj2.x +" : "+obj2.y);
		
		
	}

	
	

}

class Driver {
	
	int x, y;

	public Driver() {
		/*
		 * constructor wit default value for x=10 and y =20
		 * 
		 */
		super();
		this.x = 10;
		this.y = 20;
	}
	
	
}

