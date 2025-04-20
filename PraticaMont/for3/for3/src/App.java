public class App {
    public static void main(String[] args) throws Exception {

    int [] numeros = {10,50,100,150,200};
    int soma = 0;
    int i;

    for (i = 0; i < numeros.length; i++) {
        soma += numeros [i];
    }

    System.out.println("Soma: " + soma);

    }
}