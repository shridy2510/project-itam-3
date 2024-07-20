package com.project.repository;

import com.project.repository.entities.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<AssetEntity,Long> {
    @Query("SELECT a.name FROM AssetEntity a")
    List<String> findAllNames();

    @Query("SELECT COUNT(a) FROM AssetEntity a")
    long countAssets();

}
