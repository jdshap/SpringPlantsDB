package io.github.jdshap.plants;

import org.springframework.data.repository.CrudRepository;
import io.github.jdshap.plants.Plant;

import java.util.List;

public interface PlantRepository extends CrudRepository<Plant, Integer>{
    List<Plant> findPlantsByCommonName(String commonName);
}
