package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testITER_1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
		assertEquals(Welcome.welcome("amy"), "Hello, Amy");
	}
	
	@Test
	void testITER_2() {
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome(null), "Hello, my friend");
		assertEquals(Welcome.welcome("   "), "Hello, my friend");
	}
	
	@Test
	void testITER_3() {
		assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY");
		assertEquals(Welcome.welcome("TOM"), "HELLO, TOM");
	}
	
//	@Test
//	void testITER_4() {
//		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, Bob");
//	}
//	
//	@Test
//	void testITER_5() {
//		assertEquals(Welcome.welcome("Amy,bob,jerry"), "Hello, Amy, Bob, Jerry");
//	}
//	
//	@Test
//	void testITER_6() {
//		assertEquals(Welcome.welcome("Amy,BOB,Jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
//	}
//	
	@Test
	void testITER_7() {
		assertEquals(Welcome.welcome("bob, amy, jerry"), "Hello, Bob, Amy and Jerry");
		assertEquals(Welcome.welcome("bob, AMY, jerry, JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}
	
}
