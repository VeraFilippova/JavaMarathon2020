package day11.task1;

public class Courier implements Worker {
    private int salary;

    private static final int SALARY_COURIER = 100;
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Courier(Warehouse warehouse) {
        this.werehouse = warehouse;

    }


    @Override
    public void doWork() {
        salary += SALARY_COURIER;
        werehouse.plusCountDeliveredOrders();


    }

    @Override
    public void bonus() {
        if (werehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (countBonus >= 1) {
            System.out.println("Бонус уже выплачен");
            return;

        }
        salary += 50000;
        countBonus++;

    }
}
