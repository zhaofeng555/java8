package org.test01.lambda;

@FunctionalInterface
interface Interface2{
	int doubleNum(int i);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Interface2 i1 = (i)->i*2;
		System.out.println(i1.doubleNum(3));
		
		Interface2 i2 = i -> i*2;
		
		Interface2 i3 = (int i)->i*2;
		
		Interface2 i4 = (int i)->{
			System.out.println(i);
			return i*2;
		};
		System.out.println(i4.doubleNum(5));
	}
	
}
