package ExceptionHandlingDemo;

public class RunTimeErrorDemo {

	public static void main(String[] args) {
		System.out.println("Second line");
		try {

			System.out.println(10 / 0);
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");

		} 
		
		catch (ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	
		finally
		{
			System.out.println("DB cleanup code");
		}

		
		
	}
}
