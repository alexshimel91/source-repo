package Homework2;

import java.util.Arrays;

public class Palindrome {


    public void findPalindrome(int[] array) {
        String[] result = new String[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            String s = array[i] + "";
            StringBuilder str = new StringBuilder(s);
            str.reverse();
            if (str.toString().equals(s)) {
                result[index++] = s;
                //findMax(result);
                System.out.println(Arrays.toString(result));
            }
        }
    }
        private void findMax(String[] result) throws NullPointerException {
        try {
            Arrays.sort(result);
            String max = result[result.length - 1];
            System.out.println(max);
        } catch (Exception e) {
            System.out.println("null found");
        }

        }
}