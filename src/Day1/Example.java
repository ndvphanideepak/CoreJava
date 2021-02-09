package Day1;


class ConstructorDemo1 {
	String channel;
	//this is a channel
	
	/*
	 * abc abc abc
	 */
	 

	ConstructorDemo1(String channel) {
	this.channel = channel;
	}

}
public class Example {
	public static void main(String[] args) {
		ConstructorDemo1 abc = new ConstructorDemo1("ATB");
		System.out.println(abc.channel);
	}
}
