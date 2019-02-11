package pl.sda.javastart.Homework2.School;

public class UtilityRoom implements Room {

    private String name;

    public UtilityRoom(String name) {
        this.name = name;
    }

    @Override
    public boolean open(int accessLevel) {
        if (accessLevel>=4){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
