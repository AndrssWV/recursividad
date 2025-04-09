public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        if (n==0) return 1;
        return n*fact(n-1);
    }
    
}
