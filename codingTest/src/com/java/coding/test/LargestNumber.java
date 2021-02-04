package com.java.coding.test;


import java.util.Arrays;
import java.util.Comparator;
 
public class LargestNumber  {
	
    public static String solution(int[] numbers) {
        String answer = "";
        
		// 정렬이 용이한 String형태로 변환
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = (String.valueOf(numbers[i]));
        }
        
		// Arrays.sort를 활용하여 정렬
		// Comparator 활용: 두 String을 합하여 더 큰 쪽이 우선순위가 있도록 구성
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2 + s1).compareTo(s1 + s2);
			}
		});
		
		// print: [4, 3, 2, 2, 2, 1]
		System.out.println(Arrays.toString(arr));

		// 예외처리
        // 정렬 후 배열에 담긴 가장 큰 수가 0이라면, 배열이 0으로만 구성되었다는 의미
        if (arr[0].equals("0")) return "0";

        
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}

		return answer;
	}
}
