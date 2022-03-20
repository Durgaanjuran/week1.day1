package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secondNum = 1, sum;
		
		
System.out.println(firstNum);
System.out.println(secondNum);

for(int i=1 ; i<=range ; i++)
{
	sum = firstNum + secondNum;
	System.out.println(sum);
	
	firstNum = secondNum;
	secondNum = sum;
}

	}

}
