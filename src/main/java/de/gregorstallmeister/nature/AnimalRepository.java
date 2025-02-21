package de.gregorstallmeister.nature;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AnimalRepository extends MongoRepository<Animal, String> {

    List<Animal> findAllByEatable(Boolean eatable);

    Optional<Animal> findById(String id);
}
