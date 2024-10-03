import java.util.Scanner;


public class questao1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número a ser verificado: ");
        int numero = scanner.nextInt();

        boolean verificador = verificador(numero);
        System.out.println("A sequência de Fibonacci até "+numero+ " é: ");
        imprimirSequencia(numero);

        if(verificador){
            System.out.println(numero+" pertence à sequência de Fibonacci!");
        } else {
            System.out.println(numero+" não pertence à sequência de Fibonacci :(");
        }

        scanner.close();

    }

    public static boolean verificador(int n){
        int a = 0;
        int b = 1;

        if (n == a || n == b){
            return true;
        }

        int c = a+b;
        while (c <= n){
            if (c==n){
                return true;
            }
            a = b;
            b = c;
            c = a+b;
        }
        return false;
    }


    public static void imprimirSequencia(int max){
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");

        int c = a+b;
        while (c <= max){
            System.out.print(c+ " ");
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println();
    }


}
