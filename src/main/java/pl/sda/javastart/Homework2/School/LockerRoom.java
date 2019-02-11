package pl.sda.javastart.Homework2.School;

public class LockerRoom implements Room {

    private String name;

    public LockerRoom(String name) {
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
