package io.github.jdshap.plants;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlantRepository extends CrudRepository<Plant, Integer>{
    List<Plant> findPlantsByCommonName(String commonName);
    Plant findPlantById(short id);
}
