import java.util.Scanner;

public class ContaAgua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int consumo = sc.nextInt();
        sc.close();
        
        int valorConta = calcularValorConta(consumo);
        
        System.out.println(valorConta);
    }
    
    public static int calcularValorConta(int consumo) {
        int valorConta = 7;
        
        if (consumo > 100) {
            valorConta += (consumo - 100) * 5;
            consumo = 100;
        }
        if (consumo > 30) {
            valorConta += (consumo - 30) * 2;
            consumo = 30;
        }
        if (consumo > 10) {
            valorConta += (consumo - 10) * 1;
        }
        
        return valorConta;
    }
}

