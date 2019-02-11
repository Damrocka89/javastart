package pl.sda.javastart.Homework2.School;

public class MainSchool {

    public static void main(String[] args) {
        Director maciejZent=new Director("Maciej Zent");
        Caretaker paniMariola=new Caretaker("Pani Mariola");
        Teacher facetOdFizyki=new Teacher("Facet od Fizyki");
        Pupil kumpel=new Pupil("Gość");

        StaffRoom pokojNauczycielski=new StaffRoom();
        LockerRoom szatnia=new LockerRoom("Szatnia pierwszej klasy");
        DirectorsOffice komnataTajemnic=new DirectorsOffice();
        UtilityRoom pokójNaSzczotki=new UtilityRoom("Pokój na szczotki");

        Employee[] pracownicyIReszta={maciejZent, paniMariola, facetOdFizyki, kumpel};
        Room[] pomieszczenia ={pokojNauczycielski, szatnia, komnataTajemnic, pokójNaSzczotki};

        School szkoła=new School("Im. somsiada",pomieszczenia,pracownicyIReszta);
        szkoła.showAccess();
    }
}
