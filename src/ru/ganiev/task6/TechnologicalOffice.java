package ru.ganiev.task6;

//Технологическое бюро является потомком инженерного центра - Принцип НАСЛЕДОВАНИЕ
class TechnologicalOffice extends EngineeringDepartment {

    private int salary;
    private int numberOfIngeneers;

    TechnologicalOffice(int salary, int numberOfIngeneers, int wageFund) {
        super(wageFund);
        this.numberOfIngeneers = numberOfIngeneers;
        this.salary = salary;
    }

    int getWageFund () {
        return salary * numberOfIngeneers * super.getWageFund();
    }
}