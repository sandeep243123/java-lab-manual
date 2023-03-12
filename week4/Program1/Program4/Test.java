package JavaProgramms.p1;
abstract class Shape {
    abstract void area();
}
class Triangle extends Shape
{
    int base,height;
    Triangle(int b,int h){
        base=b;
        height=h;
    }
    void area(){
        System.out.println("Triangle "+(1/2)*(height*base));
    }

}
class Rectangle extends Shape
{
    int length,width;
    Rectangle(int l,int w){
        length=l;
        width=w;
    }
    void area(){
        System.out.println("Rectangle "+length*width);
    }

}
class Circle extends Shape
{
    double r;
    Circle(double r){
        this.r=r;
    }
    void area(){
        System.out.println("Circle "+(Math.PI)*r*r);
    }
}
public class Test
{
    public static void main(String[] args){
        Shape s;
        s=new Triangle(5,6);
        s.area();
        s=new Circle(5);
        s.area();
        s=new Rectangle(4,8);
        s.area();
    }
}