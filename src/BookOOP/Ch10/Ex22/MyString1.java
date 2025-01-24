package BookOOP.Ch10.Ex22;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }
    public char charAt(int index) {
        return chars[index];

    }
    public int length() {
        return chars.length;

    }
    public MyString1 substring(int start, int end) {
        char[] newChars = new char[end - start];
        for (int i = 0; i < newChars.length; i++) {
            newChars[i] = chars[start + i];

        }
        return new MyString1(newChars);

    }
    public MyString1 toLowerCase() {
        char[] newChars = new char[length()];
        for (int i = 0; i < newChars.length; i++) {
            newChars[i] = Character.toLowerCase(chars[i]);

        }
        return new MyString1(newChars);
    }
    public boolean equals(MyString1 other) {
        if (length() != other.length()) return false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != other.charAt(i)) return  false;

        }
        return true;

    }
    public static MyString1 valueOf(int i) {
        char[] newChars = new char[i];
        return new MyString1(newChars);

    }
}
