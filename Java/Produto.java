import java.util.Scanner;

public class Produto {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int PROD;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        PROD  =  n1 * n2;

        System.out.printf("PROD = %d%n", PROD);

        sc.close();
    }
}
