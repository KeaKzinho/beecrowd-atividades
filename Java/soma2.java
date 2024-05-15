import java.util.Scanner;

public class soma2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.printf("SOMA = %d%n", A + B);

        sc.close();
    }
}
