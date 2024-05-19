import java.util.Scanner;

public class ParOuImpar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int resultadoDivisao;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorNegativo = 0;
        int contadorPositivo = 0;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt(); 
        }

        for (int numero : numeros){
            resultadoDivisao = numero % 2;

            if (resultadoDivisao == 1 || resultadoDivisao == -1){
                contadorImpar += 1;
            } else{
                contadorPar += 1;
            }

            if (numero < 0){
                contadorNegativo += 1;
            } else if (numero > 0){
                contadorPositivo += 1;
            }
            } 

            System.out.printf("%d valor(es) par(es)%n", contadorPar);
            System.out.printf("%d valor(es) ímpar(es)%n", contadorImpar);
            System.out.printf("%d valor(es) positivo(s)%n", contadorPositivo);
            System.out.printf("%d valor(es) negativo(s)%n", contadorNegativo);

            sc.close();
        }
}