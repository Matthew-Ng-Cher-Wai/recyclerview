package com.example.recyclerview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MyViewModel extends ViewModel {
    private MutableLiveData<ArrayList<String>> animals;
    public LiveData<ArrayList<String>> getAnimals() {
        //if (animals == null) {
        //    animals = new MutableLiveData<List<String>>();
        //    loadAnimals();
        //}

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Monkey");
        animalNames.add("Cow");
        animalNames.add("Jellyfish");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        animals.setValue(animalNames);

        return animals;
    }

    private void loadAnimals() {
        // Do an asynchronous operation to fetch data.
    }

    private MutableLiveData<ArrayList<Person>> persons;
    public LiveData<ArrayList<Person>> getPersons() {

        // data to populate the RecyclerView with
        ArrayList<Person> People = new ArrayList<>();
        People.add(new Person( "John", "Doe", 45));
        People.add(new Person( "Mary", "Jane", 27));
        People.add(new Person( "Buddy", "Holly", 89));
        People.add(new Person( "Peter", "Parker", 18));


        persons.setValue(People);

        return persons;
    }
}
