package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int SALARY_PICKER = 80;
    private Warehouse werehouse;
    private int countBonus = 0;
    private int isPayed = countBonus;


    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Picker(Warehouse warehouse) {
        this.werehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += SALARY_PICKER;
        werehouse.plusCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (werehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (countBonus >= 1) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        countBonus++;

    }
}
