package impl.Recursion;

import java.util.Stack;

public class SortStack {

    static void insertAgain(Integer item, Stack<Integer> stk){
        if(stk.isEmpty()) {
            stk.push(item);
            return;
        }
        Integer top = stk.peek();
        if(top<=item){
            stk.push(item);
            return;
        }else{
            Integer curr = stk.pop();
            insertAgain(item, stk);
            insertAgain(curr, stk);
        }
    }

    static void sortStackWithRecursion(Stack<Integer> stk){
        if(stk.isEmpty())
            return;
        Integer item = stk.pop();
        sortStackWithRecursion(stk);
        insertAgain(item, stk);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(9);
        stk.push(8);
        stk.push(6);
        stk.push(5);
        stk.push(1);
        stk.push(1);
        stk.push(78);
        stk.push(100);
        stk.push(34);
        stk.push(768);
        stk.push(37);
        stk.push(1899);
        stk.push(13);
        stk.push(178);
        stk.push(235);
        stk.push(235);
        stk.push(89);
        stk.push(235);
        stk.push(37);
        stk.push(235);
        stk.push(235);
        stk.push(235);
        stk.push(65);
        stk.push(235);
        stk.push(235);
        stk.push(67);
        stk.push(235);
        stk.push(768);
        stk.push(768);
        stk.push(235);
        stk.push(235);
        stk.push(84);
        stk.push(235);
        stk.push(235);
        stk.push(768);
        stk.push(83);
        stk.push(235);
        stk.push(235);
        stk.push(17);
        stk.push(235);
        stk.push(235);
        stk.push(235);
        stk.push(77);
        stk.push(235);
        stk.push(235);
        stk.push(91);
        stk.push(235);
        stk.push(235);
        stk.push(768);
        stk.push(235);
        stk.push(9);
        stk.push(235);
        stk.push(235);
        stk.push(235);
        stk.push(90);
        stk.push(235);
        stk.push(235);
        stk.push(768);
        stk.push(31);
        stk.push(235);
        stk.push(4);

        long startTime = System.currentTimeMillis();
        sortStackWithRecursion(stk);
        System.out.println("Total time: "+(double)(System.currentTimeMillis()-startTime)/1000);
        stk.stream().forEach(System.out::println);
    }
}
