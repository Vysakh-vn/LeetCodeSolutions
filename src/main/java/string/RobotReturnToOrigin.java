package string;

public class RobotReturnToOrigin {

	public boolean judgeCircle(String moves) {
		int l = moves.length();
		float t = 0;
		for (int i = 0; i < l; i++) {
			char c = moves.charAt(i);
			switch (c) {
			case 'U':
				t += 1;
				break;
			case 'D':
				t -= 1;
				break;
			case 'R':
				t += 1000;
				break;
			case 'L':
				t -= 1000;
				break;
			}
		}
		return (t == 0);
	}

}
