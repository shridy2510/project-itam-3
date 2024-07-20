package com.project.util;

import com.project.displayDto.AssetDisplayDto;
import com.project.displayDto.AssetLogDisplayDto;
import com.project.displayDto.ModelDisplayDto;
import com.project.repository.entities.AssetEntity;
import com.project.repository.entities.AssetLogEntity;
import com.project.repository.entities.ModelEntity;

import java.time.LocalDateTime;

public class Mapper {
    public static ModelDisplayDto toModelDisplayDto (ModelEntity modelEntity){
        ModelDisplayDto modelDisplayDto = new ModelDisplayDto();
        modelDisplayDto.setModel_number(modelEntity.getModel_number());
        modelDisplayDto.setName(modelEntity.getName());
        // trả về là name nếu khác null, nếu null trả về là null
        modelDisplayDto.setCategoryName(modelEntity.getCategoryEntity() != null ? modelEntity.getCategoryEntity().getName() : null);
        modelDisplayDto.setManufacturerName(modelEntity.getManufacturerEntity() != null ? modelEntity.getManufacturerEntity().getName() : null);
        modelDisplayDto.setDescription(modelEntity.getDescription());
        return modelDisplayDto;

    }
    public static AssetDisplayDto toAssetDisplayDto (AssetEntity assetEntity){
        AssetDisplayDto assetDisplayDto = new AssetDisplayDto();
        assetDisplayDto.setAssetTag(assetEntity.getAssetTag());
        assetDisplayDto.setName(assetEntity.getName());
        assetDisplayDto.setSerial(assetEntity.getSerial());
        assetDisplayDto.setModelName(assetEntity.getModelEntity().getName());
        assetDisplayDto.setCompanyName(assetEntity.getCompanyEntity().getName());
        assetDisplayDto.setStatus(assetEntity.getStatusEntity().getName());
        assetDisplayDto.setAssignedUserName(assetEntity.getUserEntity() != null ? assetEntity.getUserEntity().getUsername() : null);
        assetDisplayDto.setDescription(assetEntity.getDescription());
        assetDisplayDto.setLastCheckout(assetEntity.getLastCheckout());
        assetDisplayDto.setExpectedCheckin(assetEntity.getExpectedCheckin());
        return assetDisplayDto;
    }
    public static AssetLogDisplayDto toAssetLogDisplayDto (AssetLogEntity assetLogEntity){
        AssetLogDisplayDto assetLogDisplayDto = new AssetLogDisplayDto();
        assetLogDisplayDto.setAssetName(assetLogEntity.getAssetEntity().getName());
        assetLogDisplayDto.setAction(assetLogEntity.getActionType());
        assetLogDisplayDto.setAdminName(assetLogEntity.getAdmin().getUsername());
        assetLogDisplayDto.setUserName(assetLogEntity.getUser()!=null ? assetLogEntity.getUser().getUsername() : null);
        assetLogDisplayDto.setTimestamp(assetLogEntity.getTimestamp());
        return assetLogDisplayDto;


    }



}
