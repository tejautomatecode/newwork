package Exam;

public class Array {
	public void arra1() {
		int ar[]= {22,33,44,55,66};
		
		/*for(int i=0;i<=ar.length;i++)
		  if(ar[i]==44) {
			  return true;
		}
		return false;*/
	
		
		for(int k : ar)
	{
			System.out.print( k+"\t");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Array a = new Array();
      a.arra1();
	}

}
