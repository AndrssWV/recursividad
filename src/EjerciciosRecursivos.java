
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

    public int getPotencia(int b, int e) {
        if (e<=1) return b*1;
        return b*getPotencia(b, e-1);
    }

    public int sumaDig(int n) {
        if (n<10) return n;
        return (n%10)+sumaDig(n/10);
    }

    public void printNums(int n) {
        if (n<=1) System.out.println(1);
        else {
            System.out.print(n+" ");
            printNums(n-1);
        }
    }

    public int inverso(int n) {
        if (n<10) return n;
        return Integer.parseInt(""+(n%10)+inverso(n/10));
    }

}
