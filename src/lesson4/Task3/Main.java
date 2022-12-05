package lesson4.Task3;

public class Main {
    public static void main(String[] args) {
        ZooClub newZoo = new ZooClub();
        Person viktor = new Person(1, "Viktor");
        Person maria = new Person(2, "Maria");
        Pet barry = new Pet(
                1,
                "Barry",
                AnimalSpecies.DOG
        );

        /**/
        newZoo.addPerson(viktor);
        newZoo.addPerson(maria);
        newZoo.addPet(viktor, barry);
        newZoo.addPet(maria, barry);
        /**/
        System.out.println(newZoo);

        /**/
        newZoo.deletePet(maria, barry);
        System.out.println(newZoo);

        /**/
        newZoo.deletePerson(maria);
        System.out.println(newZoo);

        /**/
        newZoo.deletePetAll(barry);
        System.out.println(newZoo);
    }
}
