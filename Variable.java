/**
 * 
 */
package coreJavaBasics;

/**
 * @author rahul
 *
 */
public class Variable {

	/**
	 * @param args
	 */
	int myNum = 5;
	float myFloatNum = 5.99f;
	char myLetter = 'D';
	boolean myBool = true;
	String myText = "Hello";

	public static void main(String[] args) {
		Variable v= new Variable();
		System.out.println(v.myNum);
		System.out.println(v.myBool);
		System.out.println(v.myLetter);
		System.out.println(v.myFloatNum);
		System.out.println(v.myText);
	}

}
