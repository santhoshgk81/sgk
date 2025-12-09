package org.dp;

public class MaximumContigousSum {

    public static void main (String[] ar) {
        int[] input =  {-2, 11, -4, 13, -5, 2};
        int maxSum = input[0];
        int sum = 0;
        for(int i=1; i<input.length; i++) {
            sum = Math.max(sum + input[i], input[i]);
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Maximum contigous Sum : " +maxSum);
    }

    private static void withoutDP() {

    }
}
