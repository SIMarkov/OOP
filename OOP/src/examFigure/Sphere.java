package examFigure;
import exam.ExamMain;
public class Sphere extends Figure implements Initialize
{ // обектът от този клас представя кълбо чрез размерите му
  double r = 1.0;
  public void setR(double newR) {
    if (newR > 0.0) r = newR;
  }
  public double getR() { return r; }
  public Sphere() {
  }
  public Sphere(double r) {
    setR(r);
  }
  public Sphere(Sphere original) {
    if (original != null) setR(original.r);
  }
  @Override
  public String toString() {
   return String.format("A sphere of radius %.2f and volume %.2f.",
                         getR(), v());
  }
  public double v() { // обем на кълбото
    return 4.0 / 3.0 * Math.PI * r * r * r;
  }

	  
  public void read() {
    double newR;
    do {
      System.out
        .format("Enter a new radius (the previous one is %.2f): ", getR());
      newR = ExamMain.scan.nextDouble();
    } while (newR <= 0.0);
    setR(newR);
    System.out
    .println(toString());
  }
  public static Sphere randomFigure(int min, int max) {
	// създава и връща кълбо с радиус, избиран по случаен начин
	// от интервала с краища minR и maxR, затворен отляво
    if (min > max) { int i = min; min = max; max = i; }
    if (max < 2) return new Sphere(1);
    if (min <= 0)
      return new Sphere(ExamMain.rnd.nextDouble(1, max));
    return new Sphere(ExamMain.rnd.nextDouble(min, max));
  }
}
