import java.util.Scanner;
 void main(String[] args) {
        System.out.println("This is a simple Calculator, it has Addition, Subtraction, Division, and Multiplication");
        Scanner num = new Scanner(System.in);

        System.out.println("First Number: ");
        double num1 = num.nextInt();

        System.out.println("Second Number: ");
        double num2 = num.nextInt();

        // this buffer!
        num.nextLine();

        System.out.println("Choose method of operation. Sum, Sub, Div, Mul.");
        String method = num.nextLine();

        switch (method) {
            case "Sum":
                System.out.println(Calculator.Sum.Result(num1,num2));
                break;
            case "Sub":
                System.out.println(Calculator.Sub.Result(num1,num2));
                break;
            case "Div":
                System.out.println(Calculator.Div.Result(num1,num2));
                break;
            case "Mul":
                System.out.println(Calculator.Mul.Result(num1,num2));
                break;
            default: System.out.println("Your desired operation is invalid");
        }

 }






