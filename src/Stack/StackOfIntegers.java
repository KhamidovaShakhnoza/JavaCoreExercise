package Stack;

public class StackOfIntegers {
    public static final int DEFAULT_CAPACITY = 16;
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int peek(){
        return elements[size - 1];

    }
    public void push(int value){
        if(size >= elements.length) {
            int[] newElements = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

       elements[size++] = value;

    }
    public int pop(){
        int element=elements[size - 1];
        size--;
        return element;

    }

    public int getSize() {
        return size;
    }
}
