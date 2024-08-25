package string;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
	
	@Test
    public void reverseStringTest() {
		char[] actual = {'h','e','l','l','o'};
		char[] expected = {'o','l','l','e','h'};
        new ReverseString().reverseString(actual);
        assertArrayEquals(expected, actual);
    }
	
	@Test
	public void reverseStringTest2() {
		char[] actual = {'H','a','n','n','a','h'};
		char[] expected = {'h','a','n','n','a','H'};
		new ReverseString().reverseString(actual);
		assertArrayEquals(expected, actual);
	}

}
