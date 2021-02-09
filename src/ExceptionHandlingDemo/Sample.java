package ExceptionHandlingDemo;

public class Sample {

	public static void main(String[] args) {
		
		try {
			int age = 15;
			if(age <18)
			{
				throw new NagendraException();
			}
			else if (age >70)
			{
				throw new BigAgeException();
			}
			else
			{
				System.out.println("you are eligible");
			}
		} 
		
		catch (NagendraException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(BigAgeException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

class NagendraException extends Exception
{
	
}
class BigAgeException extends Exception
{
	
}
