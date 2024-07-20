package com.project.repository.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
@Table(name="Status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    @OneToMany(mappedBy="statusEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AssetEntity> assets;
}

