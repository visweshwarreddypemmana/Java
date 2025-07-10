import java.io.*;
class Switch_Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number:");
        double num1 = Double.parseDouble(br.readLine());

        System.out.println("Enter second number:");
        double num2 = Double.parseDouble(br.readLine());

        System.out.println("Enter operator (+, -, *, /, %, ^):");
        char operator = (char) br.read();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    valid = false;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }

        if (valid == true) {
            System.out.println("Final Result:");
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
