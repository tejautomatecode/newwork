package Exam;

public class Return {
	 
	public int sum(int a,int b ) {
		 return a+b;
	 }
	 public String word(String c) {
		 return c;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return obj = new Return();
		
		System.out.println(obj.sum(10,20));
	    System.out.println(obj.word("Hello This Is Teja"));
		
	}

}
