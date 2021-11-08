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

    private MutableLiveData<ArrayList<String>> persons;
    public LiveData<ArrayList<String>> getPersons() {

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
}
