package pl.sda.javastart.Homework2.School;

public class Classroom implements Room {

    private String name;

    public Classroom(String name) {
        this.name = name;
    }

    @Override
    public boolean open(int accessLevel) {
        if (accessLevel>=2){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
