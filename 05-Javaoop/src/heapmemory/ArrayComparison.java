package heapmemory;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;// 문자열과 다르게 힙 주소를 arr1과 같은 주소로 받음
		int[] arr3 = {1, 2, 3, 4, 5};// 문자열와 다르게 내용이 같더라도 공유하지 않고 힙에 독자적으로 배열 생성
		arr1[0] = 10; 
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		// 주소값이 아닌 전체 배열 데이터를 보고싶다면
		// Arrays.toString(배열); 문법을 사용합니다. import해야함.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
