package whileloop;

// WAP to print and count all the numbers
// from 1 to 100 which are perfect square.

public class q5 {
    public static void main(String[] args) {
        int i = 1 ;
        // int Count = 1;
        while (i*i<=100){
            System.out.println(i*i);
            i++ ;
            // Count ++;
        }
        System.out.println(i-1);
    }
}
