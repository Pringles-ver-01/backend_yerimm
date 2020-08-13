package com.muffin_java.web.asset;

import com.muffin_java.web.utils.Box;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer>, IAssetRepository{

}
