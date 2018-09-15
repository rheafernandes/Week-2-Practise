public class FactorialCheck {
    int getFactorial(int num) {
        int fact = 1;
        for (int j = 1; j <= num; j++) {
            fact *= j;
        }
        return fact;
    }

//    long longFactorial(long num) {
//        long fact = 1;
//        for (int j = 1; j <= num; j++) {
//            fact *= j;
//        }
//        return fact;
//    }

    void printFact() {
        int factorial = 1;
        int i = 1, k = 1;
        boolean flag = true;
        long factorialLong = 1;
        while (factorial <= 1073741824) {
            i++;
            factorial = getFactorial(i);
            System.out.println("Factorial of " + i + ":" + factorial);
        }
        System.out.println("Factorial of " + (++i) + " is out of bounds");
//        while (flag) {
//            try {
//                k++;
//                factorialLong = longFactorial(k);
//                System.out.println("Factorial of " + k + ":" + factorialLong);
//            } catch (ArithmeticException e) {
//                System.out.println("Factorial of " + (++k) + " is out of bounds");
//                flag = false;
//            }
//
//        }


    }
}
