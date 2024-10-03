public class questao3 {
    public static void main(String[] args){
        int indice  = 12;
        int soma    = 0;
        int k       = 1;

        while (k<indice){
            k++;
            soma += k;
        }
        System.out.println("Soma: "+soma);
    }
}
