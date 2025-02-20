package de.gregorstallmeister.nature;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Animal(

        @Id
        String id,
        String species,
        String name,
        Boolean eatable
) {
}
