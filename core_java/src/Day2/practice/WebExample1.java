package Day2.practice;

public class WebExample1 {

	  public static void main(String args[]) 
        {
           int a[] = {1,2,3,4,5};
	    int d[] = a;
	    int sum = 0;
	    for (int j = 0; j < 3; ++j) {
	    		System.out.println(j);
	    		System.out.println("a[j]:"+a[j]);
	    		System.out.println("d[j+1]:"+d[j+1]);
                System.out.println(sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]));
               }
	    System.out.println(sum);
	    
	    /*int e[]= {'a'};
	    System.out.println(e[0]);*/
        } 
	  
    
}
