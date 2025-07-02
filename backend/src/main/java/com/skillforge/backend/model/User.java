package com.skillforge.backend.model;

import com.skillforge.backend.model.LearningPath;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String role; // ADMIN, USER

    private String careerGoal;
    private String level;

    @OneToMany(mappedBy = "user")
    private List<LearningPath> learningPaths;
}