package test;

public class SemiFib {
	int semifib(int n) {
		int cache[] = new int[n+1];
		for(int i = 0; i <= n; i++) {
			if(i<=1) cache[i] = 1;
			else if(n%2==0) cache[i] = cache[i/2];
			else cache[i] = cache[i-1]+cache[i-2];
		}
		return cache[n];
	}
	
	int semifib_recursive(int n) {
		if (n <= 1)
			return 1;
		if (n % 2 == 0)
			return semifib_recursive(n / 2);
		else
			return semifib_recursive(n - 1) + semifib_recursive(n - 2);
	}
}
