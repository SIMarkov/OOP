package examFigure;
import exam.ExamMain;
public abstract class Figure implements Initialize {
	
	static public Figure newFigure() {
		
		System.out.print("Choose 1 for Sphere or any other number for Prism: ");
		Figure f;
		if (ExamMain.scan.nextInt() == 1) f = new Sphere();
		else f = new Prism();
		return f;
	
	}
}
