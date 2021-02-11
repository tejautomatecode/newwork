package Exam;

public class ArrayWork
    {
	public boolean ray()
	  {
	   int ar[]= {22,33,44,55,66};
	   System.out.println("The length is " +ar.length);
	   int check = 55;
	   System.out.println("Is " + check +" present in the array:" );
	/* for(int i=0;i<ar.length;i++) {
		 System.out.print(ar[i]+"\t");
	 }*/
	
	 for(int k : ar) 
	   {
		 if(k==check) 
		  {
			  return true;
		  }
	   }
	return false;
	
	}
	static public void main(String[] args)
	 {
		ArrayWork a = new ArrayWork();
		System.out.println(a.ray());     
     }
}

