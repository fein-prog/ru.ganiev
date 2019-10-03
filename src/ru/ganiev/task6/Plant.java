package ru.ganiev.task6;
//расчет прибыли на заводе
class Plant {
    Ceh price;
    Ceh quantityOfDetails;
    Ceh revenue;
    EngineeringDepartment[] wageFund;


    public static void main(String[] args) {


        Ceh price = new Ceh(100000);
        quantityOfDetails = new Ceh(50);

        wageFund[0] = new DesignOffice(30000, 2, 1);
        wageFund[1] = new TechnologicalOffice(25000, 2);

        int sum = 0;
        for (EngineeringDepartment m : wageFund) {
            sum += m.getWageFund();
        }
        return sum;
        int profitFull = revenue - sum;
        return profitFull;

        System.out.println("Прибыль завода: " + profitFull);
    }
}
