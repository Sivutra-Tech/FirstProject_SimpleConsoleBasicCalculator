class Calculator {
    // Addition
    class Sum {
        public double number1;
        public double number2;
        static double Result(double number1, double number2) {
            return number1 + number2;
        }
    }
    // Subtraction
    class Sub {
        static double Result(double number1, double number2) {
            return number1 - number2;
        }
    }
    //Mul
    class Mul {
        static double Result(double number1, double number2) {
            return number1 * number2;
        }
    }
    // Division
    class Div {
        static String Result(double number1, double number2) {
            if (number2 == 0) {
                return "invaild";
            } else {
                double result = number1 / number2;
                return Double.toString(result);
            }
        }
    }
}