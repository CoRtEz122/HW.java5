package ru.gb.lesson6;

import java.util.Objects;

public class Cat {

    // private недоступно никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем

    String name; // поле, содержащее имя кота
    int appetite; // аппетит кота (столько он съедает за раз)
    int satiety; // сытость (голодный или нет)

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety*10;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety > plate.food) {

            satiety = satiety - plate.food;
            plate.food = 0;
            
        }else{

           plate.food = plate.food - satiety;
           satiety = satiety-satiety;

        }

       
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety: " + satiety;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    // // setter
    // public void setName(String catName) {
    // name = catName;
    // }

}
