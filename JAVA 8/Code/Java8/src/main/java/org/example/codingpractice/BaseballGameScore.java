package org.example.codingpractice;
import java.util.Stack;
public class BaseballGameScore {

    public static int calPoints(String ops)
    {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        String[] tokens = ops.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "C":
                    stack.pop(); // Remove the last valid score
                    break;
                case "D":
                    int prev = stack.peek();
                    stack.push(prev * 2); // Double the last valid score and add to the stack
                    break;
                case "+":
                    int prev1 = stack.pop();
                    int prev2 = stack.peek();
                    stack.push(prev1); // Restore the first popped score
                    stack.push(prev1 + prev2); // Add the sum of the last two valid scores to the stack
                    break;
                default:
                    stack.push(Integer.parseInt(token)); // Parse and add the score to the stack
                    break;
            }
        }
        for (int score : stack) {
            result += score; // Calculate the sum of all valid scores
        }
        return  result;
    }
    public static void main(String[] args) {
        String str = "5 2 C D +";
        System.out.println(BaseballGameScore.calPoints(str));
    }
}
