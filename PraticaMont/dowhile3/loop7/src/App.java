import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    int aleatorio;
    int nmrdigitado;

    Random random = new Random();
    aleatorio = random.nextInt(20) +1;

    Scanner scanner = new Scanner(System.in);
    
    do { System.out.print("Adivinhe o número aleatório gerado, de 1 a 20: ");
        nmrdigitado = scanner.nextInt();

        if (nmrdigitado < aleatorio) {
            System.out.println("Você errou, tente novamente: ");
        } else if (nmrdigitado > aleatorio) {
            System.out.print("Você errou, tente novamente: ");
        } else {
                System.out.println("Parabéns, você acertou!!!");
            }
        } while (nmrdigitado!=aleatorio);
    }
}


