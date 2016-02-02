// https://xkcd.com/1188/
class Person {
	Person target;

	Person(Person target) {
		this.target = target;
	}

	void aim(Ball ball) {
		try {
			throw ball;
		} catch (Ball b) {
			target.aim(b);
		}
	}

}

public class Ball extends Throwable {
	public static void main(String[] args) {
		Person parent = new Person(null);
		Person child = new Person(parent);
		parent.target = child;
		parent.aim(new Ball());
	}
}
