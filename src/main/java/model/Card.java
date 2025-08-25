package model;

import java.time.LocalDateTime;

public class Card {

    Long id;
    String name;
    String description;
    LocalDateTime createdAt;
    Boolean blocked;
    String blockedReason;

}
