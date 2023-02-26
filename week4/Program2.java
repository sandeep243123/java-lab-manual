class Employee
{
    int Salary=10000;

}
class Marketer extends Employee
{

    public void advertise()
    {
        int Salary=50000;
        System.out.println("Special Employee Salary $"+(Salary+super.Salary));
        System.out.println("General Employee Salary $"+Salary);
    }

}
public class Program2 {
    public static void main(String[] args){
    Marketer m=new Marketer();
    m.advertise();
    }
}
