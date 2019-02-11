package pl.sda.javastart.Homework2.School;

public class StaffRoom implements Room {

    private String name;

    public StaffRoom() {
        this.name = "Staff Room";
    }

    @Override
    public boolean open(int accessLevel) {
        if (accessLevel>=3){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
