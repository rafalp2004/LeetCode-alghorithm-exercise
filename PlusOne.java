public class PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{9});
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

        //MY FIRST SOLUTION - CONVERTING TAB INTO NUMBER - IT IS NOT EFFICIENT FOR LARGE NUMBERS
//        int number = 0;
//        for (int i = 0; i < digits.length; i++) {
//            number += (int) (digits[i] * Math.pow(10, digits.length - i - 1));
//        }
//        number++;
//        int counter = 0;
//
//        int tempNumber = number;
//        while (tempNumber > 0) {
//            tempNumber /= 10;
//            counter++;
//        }
//        int[] newDigits = new int[counter];
//        for (int i = 0; i < counter; i++) {
//            newDigits[counter - i - 1] = number % 10;
//            number /= 10;
//
//        }
//        return newDigits;
    }
}

