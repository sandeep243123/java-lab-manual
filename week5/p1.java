import java.util.*;
interface Area{
    double area();
}
class Circle implements Area{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*r*r;
    }
}
class Rectangle implements Area{
    double len,wid;
    Rectangle(double l,double w){
        len=l;
        wid=w;
    }
    public double area(){
        return len*wid;
    }
}
public class p1 {
    public static void main(String[] args){
        Area a=new Circle(5);
        System.out.println("Area of Circle: "+a.area());
        a=new Rectangle(5,6);
        System.out.println("Area of Rectangle: "+a.area());
    }
}
