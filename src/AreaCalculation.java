import java.sql.SQLOutput;
import java.util.Scanner;

class Area{
    private double area;

    public double getArea() {
        return area;
    }
    public void setAreaCircle(double radius){
        area=Math.PI*Math.pow(radius,2);//Circle area formula: A = πr²
    }
    public void setAreaSquare(int length){
        area=Math.pow(length,2);//Square area formula: A = a²
    }
    public void setAreaRectangle(int length,int width){
        area=length*width;//Rectangle area formula: A = a * b.
    }
    public void setAreaTriangle(int len_a,int len_b,int len_c){
        double s = (len_a + len_b + len_c) / 2.0;
        double x = s * (s - len_a) * (s - len_b) * (s - len_c);
        area = Math.sqrt(x);
    }
}
public class AreaCalculation {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        int ch;
        Area abc= new Area();
        System.out.println("1 for Circle");
        System.out.println("2 for Square");
        System.out.println("3 for Rectangle");
        System.out.println("4 for Triangle");
        System.out.println("Enter your choice= ");
        ch=ac.nextInt();

        switch (ch){
            case 1:
                System.out.println("Enter the radius Circle= ");
                double radius=ac.nextInt();
                abc.setAreaCircle(radius);
                System.out.println("Area= "+abc.getArea());
                break;
            case 2:
                System.out.println("Enter the Length of a side= ");
                int length=ac.nextInt();
                abc.setAreaSquare(length);
                System.out.println("Area= "+abc.getArea());
            case 3:
                System.out.println("Enter length and width= ");
                int len=ac.nextInt();
                int wid=ac.nextInt();
                abc.setAreaRectangle(len,wid);
                System.out.println("Area= "+abc.getArea());
            case 4:
                System.out.println("Enter three side of length of Triangle= ");
                int a=ac.nextInt();
                int b=ac.nextInt();
                int c=ac.nextInt();
                abc.setAreaTriangle(a,b,c);
                System.out.println("Area= "+abc.getArea());
        }

    }
}
