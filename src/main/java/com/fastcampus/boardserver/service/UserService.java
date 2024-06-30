package com.fastcampus.boardserver.service;

import com.fastcampus.boardserver.dto.UserDTO;

public interface UserService {

    void register(UserDTO userPriofile);

    UserDTO login(String id, String password);

    boolean isDuplicatedId(String id);

    UserDTO getUserInfo(String userId);

    void updatePassword(String id, String beforePassword, String afterPasswrod);

    void deleteId(String id, String password);
}
