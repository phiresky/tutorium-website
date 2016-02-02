class Call {
	
	public void main(String[] args) {
		Call c = new Call();
		double doubleVal = c.callMe(5.5);
		c.printMe(doubleVal);
	}
	
	double callMe(double val) {
		return 2 * val;
	}
	
	void printMe(double val) {
		System.out.println(val);
	}
}