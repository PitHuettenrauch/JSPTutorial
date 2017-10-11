package beanTutorial;

public class DataBean

{
    //private static final long serialVersionUID = 1L;
    private String name = "Karl Ruprecht";
    private String occupation = "Scheidungsrichter";
    private int age = 58;
    private int workingHours = 1337;



    public String getName()
    {
        return name;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public int getAge()
    {
        return age;
    }

    public int getWorkingHours()
    {
        return workingHours;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }


}