package chap05_array;

public class _02_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장하세요.
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (i + 1) * 3;
		
		System.out.println(numArr[i]);
		}
		
		
		System.out.println("--------------");
		
		int j = 0;
			
		
		while(j < numArr.length) {
			numArr[j] = (j + 1) * 3;
			System.out.println(numArr[j]);
			j++;
		}
		
		
		
		
		
	}

}
