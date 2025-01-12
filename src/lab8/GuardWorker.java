package lab8;

public class GuardWorker extends Employee implements Worker{
    public GuardWorker(String name, String surname, String gender, boolean active, String position, double salary, int experience, String department) {
        super(name, surname, gender, active, position, salary, experience, department);
    }
    @Override
    public void work(){
        System.out.println("Guard "+getName()+" thinks it was just the wind");
    }
}
