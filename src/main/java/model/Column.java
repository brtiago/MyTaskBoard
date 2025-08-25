package model;

import java.util.ArrayList;
import java.util.List;

public class Column {

    private Long id;
    private String name;
    private Board board;
    private ColumnType type;
    private Integer order;
    private List<Card> cards = new ArrayList<>();

}
