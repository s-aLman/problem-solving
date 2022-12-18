package practice.Recursion.easy.Adhoc;

public class Print1toN {

    static void print1toNWithRecursion(int N) {
        if (N == 1) {
            System.out.print(1 + " ");
            return;
        }
        print1toNWithRecursion(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        print1toNWithRecursion(14);
    }
}
