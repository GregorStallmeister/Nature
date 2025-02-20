package de.gregorstallmeister.nature;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Plant(
        @Id
        String id,
        String name,
        String species,
        Boolean eatable
) {
}
