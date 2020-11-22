public class PlusOne {
//    public int[] plusOne(int[] digits) {
//        boolean inc = false;
//        for (int i = digits.length - 1; i >= 0 ; i--) {
//            if (i != (digits.length - 1) && !inc) {
//                return digits;
//            }
//
//            int sum = digits[i] + 1;
//
//            if (i == 0 && sum == 10) {
//                digits = new int[digits.length + 1];
//                digits[0] = 1;
//            } else if (sum == 10) {
//                digits[i] = 0;
//                inc = true;
//            } else {
//                digits[i] = sum;
//                inc = false;
//            }
//        }
//
//        return digits;
//    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
