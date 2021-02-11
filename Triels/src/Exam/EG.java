package Exam;

public class EG {
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int avg(int a,int b)
	{
		int c=sum(a,b)/2;
		return c;
	}
	public int bonus(int a,int b) {
		int d=avg(a,b)+60;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EG e = new EG();
		System.out.println(e.avg(10, 20));
		System.out.println(e.sum(20,15));
		System.out.println(e.bonus(50,60));
	}

}
