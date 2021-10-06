package main;

public class Programm {
	public static void main(String[] args) {
      int s1 = 2, s2 = 3;
      System.out.println("Ergebnis Addition = " + addNumbers(s1, s2));
      System.out.println("Ergebnis Subtraction = " + subtractNumbers(s1, s2));
	}

  private static int addNumbers(int s1, int s2) {
    return s1 + s2;
  }

  private static int subtractNumbers(int s1, int s2) {
    return s1 - s2;
  }
}
