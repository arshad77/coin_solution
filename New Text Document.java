package sampleProjects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int h;
public static void main(String[] args) {
	int[] a=new int[8];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<8;i++) {
		a[i]=sc.nextInt();
	}
	sc.close();
	
	
	do {
	a=check(a);
    }while( h>=1);
	System.out.println(Arrays.toString(a));}
    public static int[] compare(int[] a,int[] b) {
	int sum=0;
	for( int i :a){
		sum = sum +i;		
	}
	int sum1=0;
	for( int i :b){
		sum1 = sum1 +i;		
	}
	if(sum>sum1) {
		return a;}
	else {
		return b;
		}
}

public static int[] check(int[] a) {
	
		int[] b=Arrays.copyOfRange(a,0,a.length/2);
		int[] c=Arrays.copyOfRange(a,a.length/2,a.length); 
		
		
	    int[]d=compare(b,c);
	    
	    h=d.length/2;
			return d;
}}

