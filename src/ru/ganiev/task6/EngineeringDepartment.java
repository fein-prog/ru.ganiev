package ru.ganiev.task6;

class EngineeringDepartment {
    //ограниченный доступ поля фонда оплаты труда - ИНКАПСУЛЯЦИЯ, класс доступен в пределах пакета task6
    private int wageFund; //модификатор доступа

    //ПОЛИМОРФИЗМ - одинаковая функция для технологов и конструкторов
    EngineeringDepartment (int wageFund) {
        this.wageFund = wageFund;
    }

    int getWageFund () {
        return wageFund;
    }

}

