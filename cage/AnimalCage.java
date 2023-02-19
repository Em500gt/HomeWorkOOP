package cage;

import animals.*;

public interface AnimalCage {
    
    int addAnimal(Animal animals);

    int deliverFood(int wietghOfFood);

    int cleanCage();

   void getFirstAnimals();
}
