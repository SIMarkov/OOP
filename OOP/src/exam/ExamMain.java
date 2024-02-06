package exam;
import java.util.Random;
import java.util.Scanner;

import examFigure.Figure;
public class ExamMain
{
  public static final Random rnd = new Random();
  public static final Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
	  
	  Figure first = Figure.newFigure();
	  first.read();
	  Figure second = Figure.newFigure();
	  second.read();
	  
	  double compV = (Double.compare(first.v(), second.v()));
	  if (compV>0) {
		    System.out.printf("The first figure has a larger volume: %.2f", first.v());
		   }
		else if (compV<0){
		     System.out.printf("The second figure has a larger volume: %.2f", second.v());
		   }
		else {
		    System.out.printf("The volumes are equal.");
		   }  
  }
}

