package day04_homework;

import java.util.Scanner;

public class Compare_nums2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int max = 0, mid = 0, min = 0;

		if (x > y && y > z) {
			max = x;
			mid = y;
			min = z;
		} else if (x > z && z > y) {
			max = x;
			mid = z;
			min = y;
		} else if (y > x && x > z) {
			max = y;
			mid = x;
			min = z;
		} else if (y > z && z > x) {
			max = y;
			mid = z;
			min = x;
		} else if (z > x && x > y) {
			max = z;
			mid = x;
			min = y;
		} else if (z > y && y > x) {
			max = z;
			mid = y;
			min = x;
		}
		System.out.println(max + " > " + mid + " > " + min);
	}
	
}
