package LAB4;

/**
 * Your Name:        Beren Ayça SAĞ
 * Your Student ID:  240446029
 * Your Date:        26/10/2026
 */
public class BracketStack {
    private class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public BracketStack() {
        top = null;
    }
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char value = top.data;
        top = top.next;
        return value;
    }
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
