class calculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java calculator <num1> <operator> <num2>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        char op = args[1].charAt(0);
        double b = Double.parseDouble(args[2]);

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
