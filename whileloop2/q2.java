package whileloop2;

// WAJP to print sum of all even numbers
// from 1 to 100.

// 2+4+6+8+.........upto 100

public class q2 {
    public static void main(String[] args) {
        int i = 1 ;
        int sum = 0 ;
        while(i<=100){
            if(i%2==0){
                sum=sum+i;
                // i++;
            }
        //    sum=sum+i;
            i++; 
        }
        System.out.println(sum);
    }
}
