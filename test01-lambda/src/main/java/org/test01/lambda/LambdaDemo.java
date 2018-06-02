package org.test01.lambda;

interface Interface1{
	int doubleNum(int i);
}

public class LambdaDemo {

	public static void main(String[] args) {
		Interface1 i1 = (i)->i*2;
		System.out.println(i1.doubleNum(3));
		
		Interface1 i2 = i -> i*2;
		
		Interface1 i3 = (int i)->i*2;
		
		Interface1 i4 = (int i)->{
			System.out.println(i);
			return i*2;
		};
	}
	
}
