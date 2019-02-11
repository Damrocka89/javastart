package pl.sda.javastart.Homework2.School;

public class School {

    private String name;
    private Room[] roomsList;
    private Employee[] employeesList;

    public School(String name, Room[] roomsList, Employee[] employeesList) {
        this.name = name;
        this.roomsList = roomsList;
        this.employeesList =employeesList;
    }

    public void showAccess(){
        for (Room room : roomsList) {
            System.out.println("To " + room.getName()+" access has been granted for: ");
            for (Employee employee : employeesList) {
                if (room.open(employee.getAccessLevel())){
                    System.out.println(employee.getName());
                }
            }
        }

    }
}
