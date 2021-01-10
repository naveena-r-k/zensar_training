package Day2.practice;
/**
*
Write a program that prints the integers from 1 to 100.
But for multiples of 3 print "Fizz" instead of the
number, and for the multiples of 5 print "Buzz".
For numbers which are multiples of both 3 and 5
print "FizzBuzz".
For the rest, print the actual number*/

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100; i++) {
			int num=i;
			if(num%3==0) {
				System.out.println("Fizz");
				continue;
			} else if (num%5==0) {
				System.out.println("Buzz");
				continue;
			}else if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		}
		System.out.println(i);
	}

}
}
