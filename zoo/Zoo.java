package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

public class Zoo {
    
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium){
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeTerrarium = snakeTerrarium;
    }

    public Lion takeOfLion(){
        return this.lionCage.takeOffAnimal();
    }

    public int addLion(Lion animal){
        return this.lionCage.addAnimal(animal);
    }
    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }
}
