package de.gregorstallmeister.nature;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, String> {

    List<Animal> findAllByEatable(Boolean eatable);
}
