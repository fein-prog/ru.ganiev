package ru.ganiev.task6;

//Технологическое бюро является потомком инженерного центра - Принцип НАСЛЕДОВАНИЕ
class TechnologicalOffice extends EngineeringDepartment {

    int salary;
    int numberOfIngeneers;

    TechnologicalOffice(int salary, int numberOfIngeneers) {
        super(wageFund);
        this.numberOfIngeneers = numberOfIngeneers;
        this.salary = salary;
    }

    int getWageFund () {
        return salary * numberOfIngeneers;
    }
}
