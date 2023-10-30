package interviewProgram;

public class PrimeNumber {
	public static void primeNumber(int num) {
		int i = 2;
		if (num == 0 || num == 1)
			System.out.println(num + " is not prime nor composite number.");
		else {
			while (i < num) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number.");
					break;
				}
				i++;
			}
			if (num == i)
				System.out.println(num + " is prime number.");
		}

	}

	public static void primeSeries(int num) {
		for (int i = 0; i <= num; i++) {
			if (i == 0 || i == 1)
				System.out.println(i + " is not prime or not non prime number.");
			else {
				int j = 2;
				while (j < i) {
					if (i % j == 0) {
						System.out.println(i + " is not a prime number.");
						break;
					}
					j++;
				}
				if (j == i) {
					System.out.println(i + " is prime number.");
				}
			}
		}

	}

	public static void main(String args[]) {
		primeNumber(97);
		primeSeries(100);
	}
}
