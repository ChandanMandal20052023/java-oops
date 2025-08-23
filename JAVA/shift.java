import java.util.*;
public class shift {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int n;
         System.out.print("enter your choice press 0 for leftshift and 1 for rightshift: ");
         int choice=sc.nextInt();
         System.out.print("enter your number: ");
         n=sc.nextInt();
         if(choice==0){
            System.err.println("leftshift:"+(n<<2));
         }
         else{
            System.err.println("rightshift:"+(n>>2));
         }
         
    }
}
