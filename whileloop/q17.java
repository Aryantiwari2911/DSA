package whileloop;

// WAP to count the factors of a number.
// i/p: 28
// o/p: Total Factors are: 6

public class q17 {
    public static void main(String[] args) {
        int i = 1 ;
        int n = 28 ;
        int count = 0 ;
        while (i<=n){
            if (n%i==0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("total count is :"+count);
    }
    
}
