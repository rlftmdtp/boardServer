package com.fastcampus.boardserver.mapper;

import com.fastcampus.boardserver.dto.CategroyDTO;

public interface CategoryMapper {
    public int register(CategroyDTO categoryDto);
    public void updateCategory(CategroyDTO categroyDTO);
    public void deleteCategory(int categoryId);
}
