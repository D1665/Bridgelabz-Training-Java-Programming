package Collections;

import java.util.Stack;

public class BalancedParentheses {

    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "{[()]}",
            "{[(])}",
            "((()))",
            "{[}",
            "()",
            "",
            "{{{}}}",
            "([)]"
        };

        System.out.printf("%-20s %s%n", "Expression", "Result");
        System.out.println("-".repeat(35));
        for (String t : testCases) {
            String display = t.isEmpty() ? "(empty)" : t;
            System.out.printf("%-20s %s%n", display,
                isBalanced(t) ? "✓ Balanced" : "✗ Not Balanced");
        }
    }
}
