package com.fastcampus.boardserver.service;


import com.fastcampus.boardserver.dto.CategroyDTO;

public interface CategoryService {
    void register(String accountId, CategroyDTO categroyDTO);
    void update(CategroyDTO categroyDTO);
    void delete(int categoryId);
}
