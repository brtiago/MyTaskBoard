package model;

import java.time.LocalDateTime;

public class CardBlock {

    private Long id;
    private Card card;

    private String blockedReason;
    private String unblockedReason;

    private LocalDateTime blockedAt;
    private LocalDateTime unblockedAt;
}
