package org.swea.java;

import java.util.*;
import javax.print.attribute.IntegerSyntax;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int T=sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			int []A=new int[N];
			int []B=new int[M];
			
			for (int i=0; i<A.length; i++)
				A[i]=sc.nextInt();
			for (int i=0; i<B.length; i++)
				B[i]=sc.nextInt();
			
			int ret=0;
			
			if (N<M) {
				for (int i=0; i<M-N+1; i++) {
					int result=0;
					for (int j=0; j<N; j++) {
						result+=A[j]*B[i+j];
					}
					ret=Math.max(result, ret);
				}
			}
			else if (N>M) {
				for (int i=0; i<N-M+1; i++) {
					int result=0;
					for (int j=0; j<M; j++) {
						result+=A[i+j]*B[j];
					}
					ret=Math.max(result,  ret);
				}
			}
			else {
				for (int i=0; i<N; i++)
					ret+=A[i]*B[i];
			}
			
			System.out.printf("#%d %d\n", tc, ret);
			
		}
	}

}
