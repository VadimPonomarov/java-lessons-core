package lesson4.Task3;

public enum AnimalSpecies {
    DOG("Собака"), CAT("Кошка"), OTHER("Другое животное");

    private final String animal;

    AnimalSpecies(String animal) {
        this.animal = animal;
    }
}
