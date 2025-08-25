package model;

import java.time.LocalDateTime;

public class Board {

    Long id;
    String name;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Board(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

}
