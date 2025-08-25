package model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Card {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean blocked;
    private String blockedReason;

    private Column currentColumn;

    private List<CardMovementHistory> movementHistory = new ArrayList<>();

    private List<CardBlock> blockHistory = new ArrayList<>();

}
