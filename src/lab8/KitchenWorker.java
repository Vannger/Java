package lab8;

public class KitchenWorker extends Employee implements Worker{
    public KitchenWorker(String name, String surname, String gender, boolean active, String position, double salary, int experience, String department) {
        super(name, surname, gender, active, position, salary, experience, department);
    }
    @Override
    public void work(){
        System.out.println("Kitchen Worker "+getName()+" is cooking🔥🔥🗣🗣");
    }
}
