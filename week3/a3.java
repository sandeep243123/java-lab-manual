
class Box
{
    int len,width,height;
    Box(int l,int w,int h)
    {
        len=l;
        width=w;
        height=h;
    }
    Box(Box b)
    {
        len=b.len;
        width=b.width;
        height=b.height;
    }
    Box()
    {

    }
    boolean equals(Box b1,Box b2)
    {
        if(b1.height!=b2.height||b1.len!=b2.len||b1.width!=b2.width)
            return false;
        return true;
    }
}
public class a3 {
    public static void main(String[] args){
        Box b1=new Box(4,5,6);
        Box b2=new Box(4,5,4);
        Box b3=new Box(b2);
        if(b1.equals(b1,b2))
            System.out.println("Box are Equals");
        else
            System.out.println("Box are not Equals");
//        if(b1.equals(b3,b2))
//            System.out.println("Box are Equals");
//        else
//            System.out.println("Box are not Equals");

    }
}
