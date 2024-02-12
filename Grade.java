package GullyGirl;

public class Grade {
	public static void main(String [] args) {
		int Marks = 10;
		if (Marks >=90 && Marks <= 100) {
		System.out.println("A Grade");
		}
		else if (Marks >= 80 && Marks < 90) {
			System.out.println("B Grade");
		}
		else if(Marks >= 70 && Marks < 80) {
			System.out.println("C Grade");
		}
		else if(Marks >= 60 && Marks < 70) {
			System.out.println("D Grade");
		}
		else if(Marks < 60) {
			System.out.println("Fail");
		}
		

	}
}
