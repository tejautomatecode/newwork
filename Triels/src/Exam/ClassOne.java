package Exam;

public class ClassOne {
	static int x=99;
	public int sum()
	{
		int a=10, b=30;
		int c= a+b;
		return c;
	}
	public int sum(int a, int b) 
	{
		int c=a+b;
		return c;
		
	}
	/*public int avg(int a, int b)
	{
		return sum(a,b)/2;
	}*/
	public int sum(int a,int b,int c)
	{
		return a*b+c;
	}
	public float fundTransfer(int d) 
	{
		return d/100*2;
	}
	public float sum(float a, float b, float c)
	{
		
		return a+b+c;
	}
	static {
		System.out.println("i am first");
	}
	public static void mul() {
		int a=10,b=30;
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main");
		ClassOne.main(1);
		mul();
		System.out.println(x);
		ClassOne obj = new ClassOne();
		int k= obj.sum();
		System.out.println(k);
		System.out.println(obj.sum());
		System.out.println(obj.sum(10,20));
		//System.out.println(obj.avg(k, k));
		System.out.println(obj.sum(10,30,50));
		System.out.println(obj.sum(10,25,65));
        System.out.println(obj.fundTransfer(5625));
        float v = obj.sum(5.1f, 6.1f, 9.2f);
        System.out.println(v);
    
        
        
	}
	static {
		System.out.println("i am second");
	}
	
	public static void main(int k) {
		System.out.println("I am 2nd main");
	}
	static {
		System.out.println("i am third");
	}

}
