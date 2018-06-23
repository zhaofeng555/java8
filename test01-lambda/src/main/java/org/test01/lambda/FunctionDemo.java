package org.test01.lambda;

import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {
		//断言函数接口
		Predicate<Integer> pre = i->i>0;
		System.out.println(pre.test(9));
		
		IntPredicate pre2 = i-> i>0;
		System.out.println(pre2.test(9));
		
		
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("输入参数");
		
	}
	
}
