package Exam;

public class ArrayWorkTwo
{

	public boolean aray() 
	 {
		 String ar1[]= {"BMW","VOLVO","BENZ","SKODA"};
		 System.out.println("The length of the ar1: "+ar1.length);
		 String check = "BMW" ;
		 System.out.println("Is " +check+ " present in the array:");
		 
		 for(int i=0;i<=ar1.length;i++)
		 if(ar1[i]=="BMW")
		 {
			return true; 
		 }
		 return false;
		 
		 /*for(String m : ar1)
		 {
			 if(m ==check)
			 {
				return true;
			 }
		 }
		 return false; */
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayWorkTwo ar = new ArrayWorkTwo();
		System.out.println(ar.aray());

	}

}
