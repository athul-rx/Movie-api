package com.project.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class Review {
    private ObjectId id;
    private String reviewBody;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(String reviewBody) {
        this.reviewBody = reviewBody;
    }
}
