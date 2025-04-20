import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double nota;
        double soma = 0;
        double media;
        String continuar;
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        do {
         System.out.print("Insira a primeira nota: ");
        nota = scanner.nextDouble();
        soma += nota;
        i++;

        scanner.nextLine();
         System.out.print("Deseja inserir mais alguma nota? (sim/nao) ");
        continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));

        if (i>0) {
            media = soma / i;
            System.out.printf("Média das notas: %.2f", media);
        
        } else {}
        }
    }

