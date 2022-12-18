package practice.Recursion.easy.Adhoc;

public class Fibonacci {

    static int nThTerm(int N) {
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        return nThTerm(N - 1) + nThTerm(N - 2);
    }

    static void printFibonacci(int N) {
        if (N == 1)
            System.out.print(0 + " ");
        else if (N == 2)
            System.out.print(1 + " ");
        else
            System.out.print((nThTerm(N - 1) + nThTerm(N - 2)) + " ");
        if (N > 1)
            printFibonacci(N - 1);
    }

    public static void main(String[] args) {
        int N = 10;
        printFibonacci(N);
    }
}
