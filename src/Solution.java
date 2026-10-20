//vug-sen-24-11799
//Ogbobe Uchechukwu marian

import java.util.Arrays;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        // left[i] = product of all elements before i
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // right[i] = product of all elements after i
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // combine
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(sol.productExceptSelf(nums1)));
        System.out.println(Arrays.toString(sol.productExceptSelf(nums2)));
    }
}