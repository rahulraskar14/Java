
public class Test {
	static int a=4;
	Test(int a)
	{
		System.out.println(a);	
	 	
	}

	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("C");
	}
	public void display()
	{
		System.out.println("dispaly");
		a++;
		System.out.println(a);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		Test t=new Test(5);
		Test t1=new Test();
		t1.display();
		t.display();

	}

}
