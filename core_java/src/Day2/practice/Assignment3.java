package Day2.practice;
/*Write a Java program to check if a given element exists in the array or not,
 		int[] salaries= {20000,25000,55000,47000,38000};
				int salaryToFind=55500; 

*/
public class Assignment3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] salaries= {20000,25000,55000,47000,38000};
		
		int salaryToFind=55000; 
		for (int i = 0; i < salaries.length; i++) {
			if(salaryToFind==salaries[i]) {
				System.out.println("Number is found");
			}
			else {
				System.out.println("Not found");
			}
		}
 
		
	}

}
