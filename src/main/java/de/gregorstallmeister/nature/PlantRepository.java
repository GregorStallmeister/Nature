package de.gregorstallmeister.nature;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlantRepository extends MongoRepository<Plant, String> {

    public List<Plant> findByEatableEquals(Boolean eatable);
}
