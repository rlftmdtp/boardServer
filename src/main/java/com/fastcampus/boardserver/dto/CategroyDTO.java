package com.fastcampus.boardserver.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CategroyDTO {
    public enum SortStatus{
        CATEGORYIES, NEWEST, OLDEST
    }

    private int id;
    private String name;
    private SortStatus sortStatus;
    private int searchCount;
    private int pagingStartOffset;


}
