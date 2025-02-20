package de.gregorstallmeister.nature;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nature")
public class NatureController {

    private final PlantRepository plantRepository;
    private final AnimalRepository animalRepository;

    public NatureController(PlantRepository plantRepository, AnimalRepository animalRepository) {
        this.plantRepository = plantRepository;
        this.animalRepository = animalRepository;
    }

    @PostMapping("/plants")
    public Plant postPlant(@RequestBody Plant plant) {
        plantRepository.insert(plant);

        return plant;
    }

    @GetMapping("/plants")
    public List<Plant> getPlants (@RequestParam (required = false) Boolean eatable) {
        if (eatable == null)
            return plantRepository.findAll();
        else
            return plantRepository.findByEatableEquals(eatable);
    }

    @PostMapping("/animals")
    public Animal postAnimal(@RequestBody Animal animal) {
        animalRepository.insert(animal);

        return animal;
    }

    @GetMapping("/animals")
    public List<Animal> getAnimals(@RequestParam (required = false) Boolean eatable) {
        if (eatable == null)
            return animalRepository.findAll();
        else
            return animalRepository.findAllByEatable(eatable);
    }
}
