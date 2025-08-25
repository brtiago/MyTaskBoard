package model;

import java.time.LocalDateTime;

public class Block {

    Long id;
    String blockedReason;
    String unblockedReason;
    LocalDateTime blockedAt;
    LocalDateTime unblockedAt;

}
