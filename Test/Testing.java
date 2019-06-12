package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Remove_A.Remove_First_A;

class Testing {
	
	

	@Test
	void test() {
		Remove_First_A obj=new Remove_First_A();
		assertEquals(obj.Replace("ABCD"),"BCD");
		assertEquals(obj.Replace("AACD"),"CD");
		assertEquals(obj.Replace("BACD"),"BCD");
		assertEquals(obj.Replace("AABAA"),"BAA");
	}

}
