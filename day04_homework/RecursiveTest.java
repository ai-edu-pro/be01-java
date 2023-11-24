package day04_homework;

import java.util.Scanner;

// 재귀(recursion)는 어떠한 것을 정의할 때 자기 자신을 참조하는 것.
// 함수 내부에서 자기 자신 함수를 다시 호출하는 것
// 반복문은 for문과 while문이 있는데 저는 이 두 가지 반복문으로 로직을 구현할 수 없다고 생각이 될 때 재귀 함수를 사용
/*
  https://www.w3schools.com/java/java_recursion.asp
  
*/

//*
public class RecursiveTest {  // 1번 과제 재귀함수로 구현
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(4));
    }
    public static int factorial(int n) {
        int sum = 0;
        if (n==1) return 1;
        else {
            for(int i=1; i<=n; i++) {
                sum += i;
            }
            return factorial(n-1) + sum;
        }
    }
}
//*/


/*
public class RecursiveTest {
	
	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
	}

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
}
//*/
