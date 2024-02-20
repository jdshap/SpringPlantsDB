package io.github.jdshap.plants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/plants")
public class MainController {
    @Autowired
    private PlantRepository plantRepository;

    @GetMapping(path="/read")
    public @ResponseBody Iterable<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    @GetMapping(path="/read/byName")
    public @ResponseBody Iterable<Plant> getPlantName(@RequestParam String name) {
        return plantRepository.findPlantsByCommonName(name);
    }

    @GetMapping(path="/read/byId")
    public @ResponseBody Plant getPlantId(@RequestParam short id) {
        return plantRepository.findPlantById(id);
    }

    @PostMapping(path="/create")
    public  Plant newPlant(@RequestBody Plant newPlant) {
        return plantRepository.save(newPlant);
    }

    @DeleteMapping(path="/delete")
    public void deletePlant(@RequestParam int id) {
        plantRepository.deleteById(id);
    }
}
