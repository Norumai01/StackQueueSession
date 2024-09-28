import java.util.Stack;

public class BaseBallStack {
    static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    stack.push(stack.pop() + stack.pop());
                }
                case "C" -> {
                    stack.push(stack.pop() * stack.pop());
                }
                case "D":
                    break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // URL: https://leetcode.com/problems/baseball-game/

        String[] ops = {"5","2","C","D","+"};
        System.out.println("Total Points: " + calPoints(ops));

        ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println("Total Points: " + calPoints(ops));

        ops = new String[]{"1","C"};
        System.out.println("Total Points: " + calPoints(ops));
    }
}
