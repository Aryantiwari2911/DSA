package whileloop;

// WAP to print all the factors of a number.
// i/p: 28
// o/p: 1 2 4 7 14 28

public class q16 {
    public static void main(String[] args) {
        int i = 1 ;
        int n = 28 ;
        while (i<=n){
            if (n%i==0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
