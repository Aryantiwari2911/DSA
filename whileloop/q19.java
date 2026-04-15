package whileloop;

// WAP to print a number is a prime number
// or not.

public class q19 {
    public static void main(String[] args) {
        int i = 1 ;
        while (i<=100) {
            if (i%i==0 & i%1==0) {
                System.out.println(i);
            }
          i++;  
        }
    }
    
}
