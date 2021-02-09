package ExceptionHandlingDemo;

public class Demo {

	public static void main(String[] args) {
		System.out.println("first line main");
		
			try {
				Demo.show();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("last  line mane ");

	}
	
	static void show() throws Exception
	{
		System.out.println("first line");
	
			try {
				System.out.println(10/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("last line");
	}

}
