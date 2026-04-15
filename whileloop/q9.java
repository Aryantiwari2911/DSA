package whileloop;

public class q9 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0 ;
        while(i*i*i<=100){
            System.out.println(i*i*i);
            i++;
            count++;
        }
        System.out.println("total no from 1 to 100 is :"+count);
    }
    
}
