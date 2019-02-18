package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MYAppTest {
	cart c=new cart();
	@Test
	public void test() {
	
	assertTrue(c.count(0)==0);
	}

	
	@Test 
	public void test1() {
		int val=127;
		int co=1;
	assertTrue(c.count(1)==co);
	assertTrue(c.value(127)==val);
	}
	
	@Test
	public void test2() {
		int val=227;
		int co=2;
	assertTrue(c.count(2)==co);
	assertTrue(c.value(227)==val);
	}
}
