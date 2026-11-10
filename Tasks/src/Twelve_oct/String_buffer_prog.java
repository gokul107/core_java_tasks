package Twelve_oct;

public class String_buffer_prog {
public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        System.out.println("Append: " + sb);

        sb.insert(5, " World");
        System.out.println("Insert: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}
