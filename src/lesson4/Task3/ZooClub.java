package lesson4.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> map = new LinkedHashMap<>();

    public void addPerson(Person person) {
        this.map.put(person, new ArrayList<>());
    }

    public void addPet(Person person, Pet pet) {
        List<Pet> petList = this.map.get(person);
        petList.add(pet);
    }

    public void deletePet(Person person, Pet pet) {
        this.map.get(person).removeIf(p -> p.equals(pet));
    }

    public void deletePerson(Person person) {
        this.map.remove(person);
    }

    public void deletePetAll(Pet pet) {
        map.entrySet()
                .forEach(personListEntry -> {
                    personListEntry
                            .setValue(
                                    personListEntry
                                            .getValue()
                                            .stream()
                                            .filter(pet1 -> !pet1.equals(pet))
                                            .toList()
                            );
                });
    }

    @Override
    public String toString() {
        return "ZooClub:\n" + map;
    }
}