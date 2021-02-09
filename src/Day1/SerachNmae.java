package Day1;

public class SerachNmae {

	public static void main(String[] args) {
		
		String arr[] = {"Nagendra","Deepak","Kranthi"};
		String name="John";
		boolean flag = false;
		
		for(String abc:arr)
			
		{
			
			if(abc.equals(name))
			{
				System.out.println("Element found");
				
			flag = true;
				break;
			}
			
			
			
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
		
		
		

	}

}
