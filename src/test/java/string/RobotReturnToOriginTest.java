package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RobotReturnToOriginTest {
	
	
	@ParameterizedTest
	@CsvSource({
		"UD, true",
		"LL, false",
		"RL, true",
		"ULL, false"
	})
	public void judgeCircleTest(String moves, boolean expected) {
		boolean actual = new RobotReturnToOrigin().judgeCircle(moves);
		assertEquals(expected, actual);
	}

}
