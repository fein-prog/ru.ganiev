package ru.ganiev.task6;

//Конструкторское бюро является потомком инженерного центра - Принцип НАСЛЕДОВАНИЕ
class DesignOffice extends EngineeringDepartment {
    private int salary;
    private int numberOfIngeneers;
    private int coefImpPlan;

    DesignOffice(int salary, int numberOfIngeneers, int coefImpPlan, int wageFund) {
        super(wageFund);
        this.numberOfIngeneers = numberOfIngeneers;
        this.salary = salary;
        this.coefImpPlan = coefImpPlan;
    }

    @Override
    int getWageFund() {
        return salary * numberOfIngeneers * coefImpPlan * super.getWageFund();
    }
}
