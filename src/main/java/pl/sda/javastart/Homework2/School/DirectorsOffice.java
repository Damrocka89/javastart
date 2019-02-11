package pl.sda.javastart.Homework2.School;

public class DirectorsOffice implements Room {

    private String name;

    public DirectorsOffice() {
        this.name = "Director's Office";
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
