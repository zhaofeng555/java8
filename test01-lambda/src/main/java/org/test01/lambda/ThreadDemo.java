package org.test01.lambda;

/**
 * Hello world!
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		testThread();
	}
	
	static void testThread(){
		new Thread(()->{
			System.out.println("hello");
		}).start();
	}
}
