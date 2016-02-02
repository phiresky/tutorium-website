class Square {

	Point p1;
	Point p2;
	
	Square(Point left, Point right) {
		p1 = left;
		p2 = right;
	}
	
	Square(Point left, int length) {
		this(left, new Point(left.x + length, left.y - length));
	}
	
	int getLength() {
		return p2.x - p1.x;
	}
	
	int getArea() {
		return getLength() * getLength();
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(0,2);
		Point p2 = new Point(2,0);
		int length = 3;
		Square s1 = new Square(p1, p2);
		System.out.println("Printing Square 1");
		System.out.println("(" + s1.p1.x + "|" + s1.p1.y + ")");
		System.out.println("(" + s1.p2.x + "|" + s1.p2.y + ")");
		System.out.println("Length: " + s1.getLength());
		System.out.println("Area: " + s1.getArea());
		System.out.println("------------------------------------------------");
		Square s2 = new Square(p1, length);

		System.out.println("Printing Square 2");
		System.out.println("(" + s2.p1.x + "|" + s2.p1.y + ")");
		System.out.println("(" + s2.p2.x + "|" + s2.p2.y + ")");
		System.out.println("Length: " + s2.getLength());
		System.out.println("Area: " + s2.getArea());
	}
}
