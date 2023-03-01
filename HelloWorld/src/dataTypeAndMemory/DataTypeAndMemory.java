package dataTypeAndMemory;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		String str = "A";
		System.out.println(str);
		
		String str2 = "Hello Java";
		System.out.println(str2);
		
		int fujiElevation = 3776;
		System.out.println(fujiElevation);
		
		double pi = 3.14;
		System.out.printf("%.2f\n", pi);
		
		int[] nums = {10, 100, 1000};
		System.out.println(nums[1]);
		
		int[] nums2 = {10, 100, 1000};
		int[] b = nums2;
		b[1] = 8;
		System.out.println(nums2[1]);
		System.out.println(b[1]);

	}

}
