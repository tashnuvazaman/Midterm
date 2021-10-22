package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		//implementation here...
int a[] = {121, 32, 44, 68, 96, 45, 21, 57, 89};


		System.out.println("Lowest number from array a: " + getSmallest(a,9));

	}
public static int getSmallest(int[]a, int total){
		Arrays.sort(a);
		return a[0];
}
}
