
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
  private float base;
  private float altura;
  public Triangulo(float a, float b)
  {
    base=b;
    altura=a;
  }
  public void getArea()
  {
    area=base*altura/2;  
  }
}
