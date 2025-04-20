import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    int menu;

    Scanner scanner = new Scanner(System.in);

    do{ System.out.println("Digite a opção que deseja: ");
    System.out.println("1- Adicionar");
    System.out.println("2- Remover");
    System.out.println("3- Sair");
    menu = scanner.nextInt();

    if (menu == 1){
        System.out.println(" ");
        System.out.println("Adicionado com sucesso! ");
        System.out.println(" ");
    } else if (menu == 2){
        System.out.println(" ");
        System.out.println("Removido com sucesso! ");
        System.out.println(" ");
    } 
}   while (menu != 3);
}
    }
