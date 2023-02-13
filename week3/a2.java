import java.util.*;
class Complex
{
    int real,img;
    Complex(int real,int img)
    {
        this.img=img;
        this.real=real;
    }
    public void sum(Complex c1,Complex c2){
        System.out.println("Sum: "+(c1.real+c2.real)+" "+(c2.img+c1.img)+"i");
    }
    public void sub(Complex c1,Complex c2){
        System.out.println("Subtraction: "+(c1.img-c2.img)+" "+(c1.real-c2.real)+"i");
    }
    public void mul(Complex c1,Complex c2){
        System.out.println("Multiplication: "+((c1.img*c2.img)+(c2.real*c1.real))+" "+((c1.real*c2.img)+(c1.img*c2.real))+"i");
    }
}
class a2
{
    public static void main(String[] args){
        Complex c1=new Complex(4,5);
        Complex c2=new Complex(5,6);
        c1.sum(c1,c2);
        c1.sub(c1,c2);
        c1.mul(c1,c2);
    }
}