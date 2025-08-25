package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Board {

    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Column> columns = new ArrayList<>();

    public Board(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    

}
