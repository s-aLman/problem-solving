package practice.Recursion.easy.Stack;

import java.util.Stack;

public class DeleteMiddleInStack {

    static void pushAndPop(Stack<Integer> stk, int mid) {
        if (mid == 1)
            stk.pop();
        else if (mid > 1) {
            Integer i = stk.pop();
            pushAndPop(stk, --mid);
            stk.push(i);
        }
    }

    static void deleteMiddleElementFromStack(Stack<Integer> stk) {
        int size = stk.size();
        int mid;

        if (size % 2 == 0)
            mid = (size / 2);
        else
            mid = (size + 1) / 2;

        if (size > 0)
            pushAndPop(stk, mid);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.push(16);
        stk.push(17);

        System.out.print("Stack --> [ ");
        stk.stream().forEach((x) -> {
            System.out.print(x + " ");
        });
        System.out.println("]");

        deleteMiddleElementFromStack(stk);

        System.out.print("Stack --> [ ");
        stk.stream().forEach((x) -> {
            System.out.print(x + " ");
        });
        System.out.print("]");
    }
}
