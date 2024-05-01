package chap07_class.circle;

public class Circle {
	// 필드는 선언과 동시에 초기화된 상수 PI(3.14), int radius 두 개를 만들고
	// 기본 생성자 하나랑 int 값을 받아서 radius 필드를 초기화하는 생성자를 만드세요.
	
	public final double PI = 3.14;
		// final 까먹음.
	public int radius;
	
	public Circle() {
	}
		
		public Circle(int radius) {
			this.radius = radius;
		}
	
	// 기능
		public double round() {
			return 2 * PI * radius;
		}
		
		public double area() {
			return 3.14 * PI * radius;
		}
	
	}

