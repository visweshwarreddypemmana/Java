import java.io.*;

class If_Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number:");
        double num1 = Double.parseDouble(br.readLine());

        System.out.println("Enter second number:");
        double num2 = Double.parseDouble(br.readLine());

        System.out.println("Enter operator (+, - *, /, %, ^):");
        char operator = (char) br.read();

        double result = 0;
        boolean valid = true;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error number is not  divisible by Zero");
                valid = false;
            }
        } else if (operator == '%') {
            result = num1 %num2;
        } else if (operator == '^') {
            result = Math.pow(num1, num2);
        }
        else{
            System.out.println("Enter valid operator");
        }
        if(valid == true){
            System.out.println("Final Result:");
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

    }
}


