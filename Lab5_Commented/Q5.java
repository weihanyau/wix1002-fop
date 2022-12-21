/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wei Han
 */
public class Q5 {

    public static void main(String[] args) {
        int[] nums = new int[20];
        Random r = new Random();

        //Fill the array with random number from 0-100
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(101);
        }

        //Display the array
        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(nums));

        //Bubble Sort
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j - 1] <= nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        //Display the array
        System.out.println("Array in descending order");
        System.out.println(Arrays.toString(nums));

        //Ask to input target number
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //Variable for storing number of loops the search has done
        int linearSearchLoops = 0;
        int binarySearchLoops = 0;

        //Linear Search
        //Go through every number and check
        for (int i = 0; i < nums.length; i++) {
            linearSearchLoops++;
            if (nums[i] == target) {
                System.out.println("Linear Search: ");
                System.out.println(target + " found in " + linearSearchLoops + " loops");
                break;
            }
        }

        //Binary Search
        //How to do binary Search?
        //Declare low and high values to act as the searching range
        int low = 0;
        int high = nums.length - 1;

        //Declare while loops, while 'low' is smaller than 'high' keep searching
        while (low < high) {
            binarySearchLoops++;

            //Find the mid values
            //Why not (low + high) / 2?
            //Because will integer overflow easily.
            //By deducting low from high then divide by 2 and adding it back to low,
            //We can the mid point without adding, so wont integer overflow easily
            //When there are an even number in the array, you need to choose lower mid or upper mid
            //The following formula will choose lower mid
            //To choose upper mid, can do low + (high - low + 1) / 2
            int mid = low + (high - low) / 2;

            //Adjust the condition based on the target and mid value
            //Note: To determine the condition, you need to consider
            //the way you choose upper mid or lower mid
            //Imagine only 2 values remains in the binary search
            //Example:
            //  3,   2
            // low, high
            //if you choose 3 as mid (lower mid),
            //    3,      2
            // low/mid,  high
            //if target <= nums[mid] (go to else statment), high = mid, lo >= high so the loops will stop, this is GOOD.
            //But if you choose 2 as mid (upper mid)
            //  3,     2
            // low, high/mid
            //if target <= nums[mid] (go to else statment), high = mid, lo < high, nothing will change
            //There will still be 2 values, causing infinite loops,
            //so you need to choose the condition
            //based on lower or upper mid
            //Think carefully, think about what will happen when only 2 values
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        //After the loops end, there will only have 1 value left
        //Since low == high
        //We can check whether the target value matches our binary searches value
        if (nums[low] == target) {
            System.out.println("Binary Search: ");
            System.out.println(target + " found " + binarySearchLoops + " loops");
        }
    }
}
