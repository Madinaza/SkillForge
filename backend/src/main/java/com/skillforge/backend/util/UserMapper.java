package com.skillforge.backend.util;

import com.skillforge.backend.dto.UserDTO;
import com.skillforge.backend.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        if (user == null) return null;
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.getCareerGoal(),
                user.getLevel()
        );
    }

    public static User toEntity(UserDTO dto) {
        if (dto == null) return null;
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());
        user.setCareerGoal(dto.getCareerGoal());
        user.setLevel(dto.getLevel());
        return user;
    }

    public static void updateEntityFromDTO(UserDTO dto, User entity) {
        if (dto == null || entity == null) return;
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setRole(dto.getRole());
        entity.setCareerGoal(dto.getCareerGoal());
        entity.setLevel(dto.getLevel());
    }
}
