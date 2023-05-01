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



}
