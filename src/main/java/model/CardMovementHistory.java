package model;

import java.time.LocalDateTime;

public class CardMovementHistory {

    private Long id;
    private Card card;
    private Column fromColumn;
    private Column toColumn;
    private LocalDateTime enteredAt;
    private LocalDateTime exitedAt;

}