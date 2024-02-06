package examFigure;
import exam.ExamMain;
public class Prism extends Figure implements Initialize
{ // обектът представя правилна триъгълна призма чрез размерите й
  double a = 1.0, h = 10.0;
  public void setA(double newA) {
    if (newA > 0.0) a = newA;
  }
  public double getH() { return h; }
  public void setH(double newH) {
    if (newH > 0.0) h = newH;
  }
  public double getA() { return a; }
  public Prism() {
  }
  public Prism(double a, double h) {
    setA(a);
    setH(h);
  }
  public Prism(Prism original) {
    if (original != null) { setA(original.a); setH(original.h); }
  }
  @Override
  public String toString() {
    return String
      .format("A regular triangular prism of base edge %.2f, "
              + "height %.2f and volume %.2f.", getA(), getH(),
              v());
  }
  public double v() { // обем на призмата
    return a * a * Math.sqrt(3.0) / 4.0;
  }
  
  public void read() {
    System.out
      .println("Enter new dimensions for\n " + toString());
    double newA, newH;
    do {
      System.out.format(" new base edge: ");
      newA = ExamMain.scan.nextDouble();
    } while (newA <= 0.0);
    setA(newA);
    do {
      System.out.format(" new height: ");
      newH = ExamMain.scan.nextDouble();
    } while (newH <= 0.0);
    setH(newH);
    System.out
    .println(toString());
  }
  public static Prism randomFigure(int min, int max) {
	// създава и връща призма с размери, избирани случайно
	// от интервала с краища minR и maxR, затворен отляво
    if (min > max) { int i = min; min = max; max = i; }
    if (max < 2) return new Prism(1, 1);
    if (min <= 0)
      return new Prism(ExamMain.rnd.nextDouble(1, max),
                       ExamMain.rnd.nextDouble(1, max));
    return new Prism(ExamMain.rnd.nextDouble(min, max),
                     ExamMain.rnd.nextDouble(min, max));
  }
}
