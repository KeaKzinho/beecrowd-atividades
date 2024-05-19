import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int senhaDigitada;

        senhaDigitada = sc.nextInt();

        while (senha != senhaDigitada) {
            System.out.println("Senha Invalida");
            senhaDigitada = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
