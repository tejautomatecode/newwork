package Exam;

public class Break {

	public void B()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==4) 
			{
			 continue;
			}
			if(i==8)
			{
			 break;
			}
			System.out.print(i+"\t");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Break b = new Break();
		b.B();
		
	}

}
