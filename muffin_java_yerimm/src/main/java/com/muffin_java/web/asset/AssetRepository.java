package com.muffin_java.web.asset;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer>, IAssetRepository{
}
