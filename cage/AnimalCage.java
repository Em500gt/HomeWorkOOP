package cage;

import animals.Animal;

public interface AnimalCage<T extends Animal> {
    
    int addAnimal(T animals);

    int deliverFood(int wietghOfFood);

    int cleanCage();

    void getFirstAnimals();

    T takeOffAnimal();

}
