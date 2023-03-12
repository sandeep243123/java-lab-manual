package p1;
public class Person
{
    private String name,gender;
    private int age;
    public Person()
    {
        age=0;
        name=null;
        gender=null;
    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
    this.name=name;
    }
    protected void setAge(int age) {
        this.age = age;
    }
    public String getGender(){return gender;}
    public void setGender(String gender){
        this.gender=gender;
    }

}
class Student extends Person{
    private double gpa;
    private int num;
    public Student(){
        gpa=0;
        num=0;
    }
    public void setNum(int num){
    this.num=num;
    }
    public void setGpa(double gpa)
    {
    this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public int getNum(){
        return num;
    }
}
