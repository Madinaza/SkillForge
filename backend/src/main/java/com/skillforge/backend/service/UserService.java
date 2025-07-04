package com.skillforge.backend.service;

import com.skillforge.backend.dto.PasswordUpdateDTO;
import com.skillforge.backend.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDTO> getAllUsers();
    Optional<UserDTO> getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    void updatePassword(Long id, PasswordUpdateDTO passwordUpdateDTO);
    void deleteUser(Long id);
}
