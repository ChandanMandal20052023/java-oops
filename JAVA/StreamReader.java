import java.io.*;

class Demo{
    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) {
        
        // Input stream
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int a, b, c;

        System.out.print("Enter first number: ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        b = Integer.parseInt(br.readLine());

        c = a + b;

        System.out.println("Sum = " + c);
    }
}
