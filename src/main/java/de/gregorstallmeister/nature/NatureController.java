package de.gregorstallmeister.nature;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nature")
public class NatureController {

    private final PlantRepository plantRepository;

    public NatureController(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
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
}
