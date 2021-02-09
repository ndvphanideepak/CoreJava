package Day4;
class A
{
	int p;
	int q;
	int r;
	A()
	{
		
	}
	A(int p , int q , int r)
	{
		this.p = p;
		this.q=q;
		this.r =r;
		
	}
}

class B extends A
{
int s;
int t;
B()
{
	
}

B(int p,int q,int r,int s,int t)
{
	super(p,q,r);
	this.s=s;
	this.t = t;
}

void add()
{
	System.out.println(p+q+r+s+t);
}
}

public class SuperEx {

	public static void main(String[] args) {
		B obj = new B(10,20,30,40,50);
		obj.add();
		
		
	}

}




