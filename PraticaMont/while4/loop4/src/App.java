public class App {
    public static void main(String[] args) throws Exception {
        
        int primeiro = 0;
        int segundo = 1;
        int contador = 10;
        int i = 1;
        int proximo;

        System.out.println(primeiro);

        while (i<contador) {
            System.out.println(segundo);

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            i++;

        }

    }
}
