package practice.Recursion.Stack;

import java.util.Stack;

public class ReverseStack {

    static void reverseInsert(Stack<Integer> stk, Integer j) {
        if (stk.isEmpty())
            stk.push(j);
        else {
            Integer curr = stk.pop();
            reverseInsert(stk, j);
            stk.push(curr);
        }
    }

    static void reverseStack(Stack<Integer> stk) {
        if (!stk.isEmpty()) {
            Integer i = stk.pop();
            reverseStack(stk);
            reverseInsert(stk, i);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.push(15);
        stk.push(16);
        stk.push(17);

        System.out.print("Stack --> [ ");
        stk.stream().forEach((x) -> {
            System.out.print(x + " ");
        });
        System.out.println("]");

        reverseStack(stk);

        System.out.print("Reverse Stack --> [ ");
        stk.stream().forEach((x) -> {
            System.out.print(x + " ");
        });
        System.out.println("]");

    }
}
