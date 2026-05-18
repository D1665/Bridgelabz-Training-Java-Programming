package DataStructureandAlgorithm.Data_Structure;

import java.util.Stack;

public class BrowserNavigation {
    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    String current;

    void visit(String url) {
        if (current != null) backStack.push(current);
        current = url;
        forwardStack.clear();
        System.out.println("Visited: " + current);
    }

    void back() {
        if (backStack.isEmpty()) { System.out.println("No back history."); return; }
        forwardStack.push(current);
        current = backStack.pop();
        System.out.println("Back to: " + current);
    }

    void forward() {
        if (forwardStack.isEmpty()) { System.out.println("No forward history."); return; }
        backStack.push(current);
        current = forwardStack.pop();
        System.out.println("Forward to: " + current);
    }

    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");
        browser.back();
        browser.back();
        browser.forward();
    }
}