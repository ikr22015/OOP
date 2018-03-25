package profile;

public class Student
{
    int id = 0;
    String name = "default name";
    String grade = "default grade";
    String location = "default location";

    public Student()
    {

    }

    public Student(int id)
    {
        this.id = id;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getname()
    {
        return name;
    }
}
