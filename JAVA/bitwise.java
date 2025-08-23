import java.util.*;
class bitwise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a number to check even or odd");
        n=sc.nextInt();
        if((n&1)==0){
           System.out.println("number is odd");
        }
        else{
            System.out.println("number is even");
        }
    }
}