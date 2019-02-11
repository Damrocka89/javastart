package pl.sda.javastart.Homework2.School;

public abstract class Employee{

    private String name;
    private int accessLevel;
    private String position;

    public Employee(String name, int accessLevel, String position) {
        this.name = name;
        this.accessLevel = accessLevel;
        this.position = position;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
