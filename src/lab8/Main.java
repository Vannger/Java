package lab8;

public class Main {
    public static void main(String[] args) {
        KitchenWorker kitchenWorker = new KitchenWorker("Eugene", "Vladimirovic", "Male", false, "Chef", 200000, 7, "Dolba Iebb Entertainment");
        OfficeWorker officeWorker = new OfficeWorker("Kirill", "Maltsev", "Email", true, "Idiot", -100, 2, "MSPU");
        GuardWorker guardWorker = new GuardWorker("Vasilii", "Pietrovic", "Male", true, "Master Chief", 50000, 10, "Delta Securities");
        kitchenWorker.work();
        officeWorker.work();
        guardWorker.work();
    }
}

