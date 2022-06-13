package org.java.array;

public class LottoEx {

	public static void main(String[] args) {
		System.out.println("배열 예시");
		
		int[] lotto=new int[45];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
		int box=0;
		
		for(int i=0; i<10000; i++) {
			int idx=(int)(Math.random()*45);
			box=lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=box;
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+",");
		}

		
		
	}
}
