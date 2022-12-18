package practice.Recursion.easy.Adhoc;

public class PrintNto1 {

    static void printNto1WithRecursion(int N) {
        if (N == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(N + " ");
        printNto1WithRecursion(N - 1);
    }

    public static void main(String[] args) {
        printNto1WithRecursion(15);
    }
}
