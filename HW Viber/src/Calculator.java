import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            double num1 = getNumber();
            double num2 = getNumber();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            System.out.println("Result:" + result);
        }

        public static double getNumber() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            if(sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Error. Try again");
                return getNumber();
            }
        }

        public static char getOperation() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the operation number:\n1 - +\n2 - -\n3 - *\n4 - /");
            int operationNumber = 0;
            if(sc.hasNextInt()) {
                operationNumber = sc.nextInt();
            } else {
                System.out.println("This isn't number. Try again!");
                return getOperation();
            }
            switch (operationNumber) {
                case 1:
                    return '+';
                case 2:
                    return '-';
                case 3:
                    return '*';
                case 4:
                    return '/';
                default:
                    System.out.println("Error operation. Try again!");
                    return getOperation();
            }
        }

        public static double add(double num1, double num2) {
            return num1+num2;
        }

        public static double sub(double num1, double num2) {
            return num1-num2;
        }

        public static double mul(double num1, double num2) {
            return num1*num2;
        }

        public static double div(double num1, double num2) {
            if(num2 != 0.0) {
                return num1/num2;
            } else {
                System.out.println("Сan't be divided by 0");
                return Double.NaN;
            }
        }

        public static double calc(double num1, double num2, char operation) {
            switch (operation) {
                case '+':
                    return add(num1, num2);
                case '-':
                    return sub(num1, num2);
                case '*':
                    return mul(num1, num2);
                case '/':
                    return div(num1, num2);
                default:
                    return Double.NaN;
            }
        }
    }

