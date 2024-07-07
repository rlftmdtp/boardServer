package com.fastcampus.boardserver.dto.request;

import com.fastcampus.boardserver.dto.CategroyDTO;
import lombok.*;


@Builder // 객체를 생성하는 타입?
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PostSearchRequest {
    private int id;
    private String name;
    private String contents;
    private int view;
    private int categoryId;
    private int userId;
    private CategroyDTO.SortStatus sortStatus;
}
