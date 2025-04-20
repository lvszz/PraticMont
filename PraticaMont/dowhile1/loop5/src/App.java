import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    int numero;
    int i = 0;
    
     Scanner scanner = new Scanner(System.in);
    do { System.out.print("Digite um número entre 1 e 100: ");
         numero = scanner.nextInt();
     
    if (numero>=1 && numero<= 100) {
        i = numero;
    } else {
        System.out.print("Número inválido! O ultimo número válido foi: " + i);
    }
    } while (numero>=1 && numero<=100);
}
}
