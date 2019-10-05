package ru.ganiev.task6;
//расчет прибыли на заводе
public class Accountant {
    private EngineeringDepartment[] wageFund;

    public Accountant() {


        wageFund = new EngineeringDepartment[2];
        wageFund[0] = new DesignOffice(30000, 2, 1, 1);
        wageFund[1] = new TechnologicalOffice(25000, 2,1);

    }

    int profitFull () {
        int sum = 0;
        for (EngineeringDepartment m : wageFund) {
            sum += m.getWageFund();
        }
        return sum;
    }

    public int calculation () {
        Ceh ceh = new Ceh(200_000, 2);
        int profit = ceh.getPrice() * ceh.getQuantityOfDetails();
        return profit - profitFull();
    }
}
