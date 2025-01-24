package BookOOP.Ch10.Ex10;

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++)
            q.enqueue(i);
        for (int i = 0; i < 20; i++)
            System.out.println(q.dequeue());

    }
}
