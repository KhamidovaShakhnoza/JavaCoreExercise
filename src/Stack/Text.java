package Stack;

public class Text {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i++)
            stack.push(i);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
