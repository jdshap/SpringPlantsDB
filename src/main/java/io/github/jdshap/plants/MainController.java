package io.github.jdshap.plants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/plants")
public class MainController {
    @Autowired
    private PlantRepository plantRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    @GetMapping(path="/byName")
    public @ResponseBody Iterable<Plant> getFirstPlant(@RequestParam String name) {
        return plantRepository.findPlantsByCommonName(name);
    }
}
