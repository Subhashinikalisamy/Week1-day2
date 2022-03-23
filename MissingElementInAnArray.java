package week1.day2.classroom.arrays;


import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);
		for(int i=arr[0];i<arr.length-1;i++)
		{
			int sum=(i+1);
			
			if(sum!=arr[i])
			{
				System.out.println(sum);
				break;
	
}

	}
	}
}
	
