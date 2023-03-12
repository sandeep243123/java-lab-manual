import p1.Person;
class Teacher extends Person
{
    Teacher t;
    public void insert()
    {
        t=new Teacher();
        t.setAge(12);
        t.setName("Alice");
        t.setGender("Male");
        System.out.println(t.getName());
        System.out.println(t.getGender());
        System.out.println(t.getAge());
    }

}
public class Pack {
    public static void main(String[] args)
    {
        Teacher t=new Teacher();
        t.insert();
    }
}
