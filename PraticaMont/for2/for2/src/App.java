import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    int numero;
    int i = 1;
    long fatorial = 1;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número positivo inteiro: ");
    numero = scanner.nextInt();

    for ( i=1; i<=numero; i++) {
        fatorial *= i;
    }

    System.out.println(numero + "! = " + fatorial);

    }
}
