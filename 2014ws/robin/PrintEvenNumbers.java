class PrintEvenNumbers {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) { //  modulo 2
				System.out.println(i);
			}
			i++;
		}
		System.out.println("----------------");
		for(i = 2; i <=20; i = i + 2) {
			System.out.println(i);
		}
	}
}