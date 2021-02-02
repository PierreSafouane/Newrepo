package pack;

public class Ackermann {

	public static int fonctiondAckermann(int m, int n) {
		if (m == 0) {
			return n += 1;
		}

		else if (n == 0) {
			return fonctiondAckermann(m - 1, 1);
		} else if (m != 0 && n != 0) {
			return fonctiondAckermann(m - 1, fonctiondAckermann(m, n - 1));
		}

		else {
			return 0;
		}
	}

	public static int fonctiondAckermann2(int m, int n) {
		if (m == 0 && n > 0) {
			return n + 1;
		}

		if (n == 0 && m > 0) {
			return fonctiondAckermann2(m - 1, 1);
		}
			return fonctiondAckermann2(m - 1, fonctiondAckermann2(m, n - 1));
		
	}

}
