package org.lanqiao.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSayHello {
	@Test
	public void testSayHello(){
		SayHello sayHello=new SayHello();
		String result= sayHello.say("zhangsan");
		assertEquals("hello,zhangsan",result);
	}
}
