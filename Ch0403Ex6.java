package ch04;

public class Ch0403Ex6 {

	public int sum(int num1, int num2){
		return num1+num2;
	}

	public int sum(int num1, int num2, int num3){
		return num1+num2+num3;
	}
	
	public static void main(String[] args){
		Ch0403Ex6 exam = new Ch0403Ex6();
		System.out.println(exam.sum(3, 5));
		System.out.println(exam.sum(3, 5, 8));
		
//		System.out.println(sum(3,5));
//		System.out.println(sum(3, 5, 8));
		}
} 
