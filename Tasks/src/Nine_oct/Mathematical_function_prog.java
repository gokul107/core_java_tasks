package Nine_oct;
public class Mathematical_function_prog {
	public static void main(String[] args) {
        double num = -25.75;
        double num2 = 16.0;

        System.out.println("1. Absolute Value: " + Math.abs(num));
        System.out.println("2. Square Root: " + Math.sqrt(num2));
        System.out.println("3. Power: " + Math.pow(2, 3));
        System.out.println("4. Minimum Value: " + Math.min(10, 20));
        System.out.println("5. Maximum Value: " + Math.max(10, 20));
        System.out.println("6. Round Value: " + Math.round(25.65));
        System.out.println("7. Ceiling Value: " + Math.ceil(25.35));
        System.out.println("8. Floor Value: " + Math.floor(25.85));
        System.out.println("9. Random Number (1-100): "
                + (int)(Math.random() * 100) + 1);
        System.out.println("10. Sine Value: " + Math.sin(Math.toRadians(30)));
        System.out.println("11. Cosine Value: " + Math.cos(Math.toRadians(60)));
        System.out.println("12. Tangent Value: " + Math.tan(Math.toRadians(45)));
        System.out.println("13. Natural Log: " + Math.log(10));
        System.out.println("14. Exponential Value: " + Math.exp(2));
        System.out.println("15. Random Integer (1-100): "
                + ((int)(Math.random() * 100) + 1));
    }
}

