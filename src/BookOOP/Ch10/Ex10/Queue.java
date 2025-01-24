package BookOOP.Ch10.Ex10;

public class Queue {
    public static final int DEFAULT_CAPACITY = 16;
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }
    public boolean empty(){
        return size == 0;
    }
    public void enqueue(int v){
        if(size >= elements.length) {
            int[] newElements = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

        elements[size++] = v;

    }
    public int dequeue(){
        int element=elements[0];

        int j=0;
        for (int i = 1; i < elements.length; i++) {
            elements[j] = elements[i];
            j++;
        }

        size--;
        return element;


    }

    public int getSize() {
        return size;
    }
}
