public class App {
    public static void main(String[] args) throws Exception {
    
    int i;

    for (i=1; i<=100; i++) {
        if (i % 2==0) {
            continue;
        }
        System.out.println(i);
    }
    }
}
