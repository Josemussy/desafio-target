import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        int n = contador(texto);
        System.out.println("A Letra 'a' aparece "+n+ " vezes na string");

        scanner.close();
    }

    public static int contador (String texto){
        int n = 0;
        for (int i=0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A'){
                n++;
            }
        }
        return n;
    }

}
