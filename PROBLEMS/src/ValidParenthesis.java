import java.util.Stack;

public class ValidParenthesis {
    public boolean checkValidString(String s) {
        Stack<Integer> stackOpen = new Stack<>();
        Stack<Integer> stackAsterisk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stackOpen.push(i);
            } else if (ch == '*') {
                stackAsterisk.push(i);
            } else { // Closing parenthesis ')'
                if (!stackOpen.isEmpty()) {
                    stackOpen.pop();
                } else if (!stackAsterisk.isEmpty()) {
                    stackAsterisk.pop();
                } else {
                    return false; // No matching '(' or '*' found
                }
            }
        }

        // Check remaining '(' and '*' in the stacks
        while (!stackOpen.isEmpty() && !stackAsterisk.isEmpty()) {
            if (stackOpen.pop() > stackAsterisk.pop()) {
                return false; // '*' appears before '('
            }
        }

        return stackOpen.isEmpty();
    }

}

