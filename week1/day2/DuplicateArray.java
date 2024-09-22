package week1.day2;

import java.util.Arrays;

import org.apache.logging.log4j.util.SortedArrayStringMap;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,5,7,7,5,9,2,3};

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println(num[i]+ " is a duplicate number");

				}

			}
		}

		Arrays.sort(num); 
		for (int k = 0; k < num.length-1; k++) {
			if(num[k]==num[k+1]) {
				System.out.println(num[k]+ " is a duplicate number");
			}

		}

	}



}
