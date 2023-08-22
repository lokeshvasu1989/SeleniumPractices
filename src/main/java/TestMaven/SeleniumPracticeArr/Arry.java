package TestMaven.SeleniumPracticeArr;

import java.util.Arrays;

public class Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-1];
	      System.out.println("largest element is ::"+res);
	}

}
