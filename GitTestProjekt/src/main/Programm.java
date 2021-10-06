package main;

public class Programm {
	public static void main(String[] args) {
		int s1 = 2, s2 = 3, s3;
		s3 = addNumbers(s1, s2) ;
		System.out.println("Ergebniss = " + s3);
	}

  private static int addNumbers(int s1, int s2) {
    return s1 + s2;
  }
}
