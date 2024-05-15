import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double expoente = 2;
        double raio;
        double area;
        double potencia;
        double pi = 3.14159; 

        raio = sc.nextDouble();
        potencia = Math.pow(raio, expoente);
        area = pi * potencia;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
