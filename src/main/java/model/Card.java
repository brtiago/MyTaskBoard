package model;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Card {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean blocked;
    private String blockedReason;

    private Color currentColumn;

    private List<CardMovementHistory> movementHistory = new ArrayList<>();

    private List<CardBlock> blockHistory = new ArrayList<>();

}
