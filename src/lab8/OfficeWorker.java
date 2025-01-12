package lab8;

public class OfficeWorker extends Employee implements Worker{

    public OfficeWorker(String name, String surname, String gender, boolean active, String position, double salary, int experience, String department) {
        super(name, surname, gender, active, position, salary, experience, department);
    }
    @Override
    public void work(){
        System.out.println("Office Worker "+getName()+" is coding like there is no tomorrow");
    }
}
