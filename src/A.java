
class A {
	/* Online Java Compiler and Editor */
	public static boolean isAllDigits(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isValidCC(Long num) {
		String s = String.valueOf(num);
		if (s.length() != 16) {
			return false;
		}
		if (!isAllDigits(s)) {
			return false;
		}
		int sum = 0;
		if (s.charAt(0) == '4' || (s.charAt(0) == '3' && s.charAt(1) == '7')) {
			boolean flag = false;
			for (int i = s.length() - 1; i >= 0; i--) {
				int d = s.charAt(i) - '0';
				if (flag) {
					d = d * 2;
					if (d > 9) {
						d = d - 9;
					}
				}
				sum = sum + d;
				flag = !flag;
			}
		}
		else {
			return false;
		}
		return (sum % 10 == 0);

	}

	public static void main(String[] args) {
		//String s = "8745517520344005";
		Long num = 4375517520344005L;
		System.out.println(isValidCC(num));
	}
}