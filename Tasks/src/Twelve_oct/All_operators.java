package Twelve_oct;
public class All_operators {
public static void main(String[] args) {

        int a = 10, b = 3;

        // 1. Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Unary Operators
        int x = 5;
        System.out.println("Unary Plus: " + (+x));
        System.out.println("Unary Minus: " + (-x));
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
        System.out.println("Logical NOT: " + (!true));

        // 3. Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Less or Equal: " + (a <= b));

        // 4. Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b < 5));
        System.out.println("Logical OR: " + (a < 5 || b < 5));
        System.out.println("Logical NOT: " + !(a > b));

        // 5. Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("Add Assignment: " + c);
        c -= 3;
        System.out.println("Subtract Assignment: " + c);
        c *= 2;
        System.out.println("Multiply Assignment: " + c);
        c /= 4;
        System.out.println("Divide Assignment: " + c);
        c %= 4;
        System.out.println("Modulus Assignment: " + c);

        // 6. Bitwise Operators
        int p = 5, q = 3;
        System.out.println("Bitwise AND: " + (p & q));
        System.out.println("Bitwise OR: " + (p | q));
        System.out.println("Bitwise XOR: " + (p ^ q));
        System.out.println("Bitwise Complement: " + (~p));

        // 7. Shift Operators
        System.out.println("Left Shift: " + (p << 1));
        System.out.println("Right Shift: " + (p >> 1));
        System.out.println("Unsigned Right Shift: " + (p >>> 1));

        // 8. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);

        // 9. instance of Operator
        String name = "Java";
        System.out.println("Is name a String? " +
                           (name instanceof String));

        // 10. String Concatenation Operator
        String first = "Hello";
        String second = " Java";
        System.out.println("Concatenation: " + (first + second));
    }
}
