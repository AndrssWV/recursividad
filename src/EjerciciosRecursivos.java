public class EjerciciosRecursivos {

    public int fact(int n) {
        if (n==0) return 1;
        return n*fact(n-1);
    }

    public int fibonacci(int n) {
        if (n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumaCons(int n) {
        if (n==1) return 1;
        return n+sumaCons(n-1);
    }

}
