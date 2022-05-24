/******************************************************************************
Programmer: Your name 
Date: 03/10/2022
Lab 8
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/


public class ArrayMethodDemo {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int limit = 7;
		display(nums);
		displayRe(nums);
		displaySum(nums);
		displayLim(nums, limit);
		displayAvg(nums);
	}

	/* After initializing required array / variables. 
	Begin constructing functions to call from main!*/
	
	//First func to display in order.
	public static void display(int[] nums) {
		for (int x=0; x<nums.length; x++) {
			System.out.print(nums[x] + " ");
		}
		System.out.println();
	}
	//Next func to reverse order.
	public static void displayRe(int[] nums) {
		for (int x=0; x<nums.length; x++) {
			System.out.print(nums[nums.length-x-1] + " ");
		}
		System.out.println();
	}
	//Next func to display sum.
	public static void displaySum(int[] nums) {
		int sum = 0;
		for (int x=0;x<nums.length;x++) {
			sum += nums[x];
		}
		System.out.println(sum);
	}
	//Next to display all values less than limit.
	public static void displayLim(int[] nums, int limit) {
		for (int x=0; x<nums.length; x++) {
			if(nums[x] < limit)
				System.out.print(nums[x] + " ");
		}
		System.out.println();
	}
	//Display all values higher than calculated average.
	public static void displayAvg(int[] nums) {
		int sum = 0;
		for (int x=0; x<nums.length; x++) {
			sum += nums[x];
		}
		double avg = sum / (double)nums.length;
		for (int x = 0;x<nums.length;x++) {
			if (nums[x]>avg)
				System.out.print(nums[x] + " ");
		}
		System.out.println();
	}
	
}
