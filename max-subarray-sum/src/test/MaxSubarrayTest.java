package test;

import main.MaxSubarray;

public class MaxSubarrayTest {

    public static void main(String[] args){
        MaxSubarray ms = new MaxSubarray();
        System.out.println(ms.maxSubarray(new int[]{5, -3, 10, 3, -16}));
        System.out.println(ms.maxSubarray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

}
