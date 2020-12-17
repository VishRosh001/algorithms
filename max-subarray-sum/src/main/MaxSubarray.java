package main;

public class MaxSubarray {

    public int maxSubarray(int[] array){
        int maxSum = Integer.MIN_VALUE;
        int prevSum = array[0];

        for(int i = 1; i < array.length; ++i){
            prevSum = Math.max(array[i], prevSum+array[i]);
            if(prevSum > maxSum)maxSum = prevSum;
        }
        return maxSum;
    }

}
