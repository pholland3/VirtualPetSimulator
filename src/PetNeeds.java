package VirtualPetSimulator;

public class PetNeeds {
    private int hunger = 50;
    private int thirst = 50;
    private int happiness = 50;

    public PetNeeds() {
        hunger = 50;
        thirst = 50;
        happiness = 50;
    }

    public void decreaseHunger(int amount) {
        hunger -= amount;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void decreaseThirst(int amount) {
        thirst -= amount;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void increaseHappiness(int amount) {
        happiness += amount;
        if (happiness > 100) {
            happiness = 100;
        }
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}