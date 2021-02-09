package ConsDemo;

public class Sample {

	static int a;

	
	public Sample()
	{
		a=10;
		int a;
		
	}
	
	public Sample(int a)
	{
		System.out.println("This is one parameter constructor");
	}
	public Sample(int b, int c)
	{
		System.out.println("This is one parameter constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s = new Sample(10,20);
		

	}

}
