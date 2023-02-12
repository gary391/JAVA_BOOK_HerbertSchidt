package arrarys;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = { 99, -10, 200123, 18, -1978, 5623, 463, -9, 287, 49};

        int a, b, t;

        // Display the original array
        System.out.println("Original Array is: ");
        for(int i=0; i< nums.length; i++){

            System.out.print(nums[i]);
            System.out.print(" ");
        }

        // Bubble sort
        for(a=1; a<nums.length;a++){
            for(b=nums.length-1;b>=a;b--){
                // Swapping logic
                if(nums[b-1]>nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b]=t;
                }

            }
        }
        // Display the sorted array
        System.out.println();
        System.out.println("****************************");
        System.out.println("Sorted Array using bubble sort: ");
        for(int i=0; i< nums.length; i++){

            System.out.print(nums[i]);
            System.out.print(" ");
        }
    }
}
