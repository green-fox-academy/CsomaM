package greenfoxorganisation;

public class Sponsor extends Person {

    protected String company;
    protected int hiredStudents;

    public Sponsor (String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "Female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void hire() {
        this.hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name +  ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }
}
