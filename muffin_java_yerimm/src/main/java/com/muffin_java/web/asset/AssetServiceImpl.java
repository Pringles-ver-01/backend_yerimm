package com.muffin_java.web.asset;

import com.muffin_java.web.utils.Box;
import com.muffin_java.web.utils.JpaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface AssetService extends JpaService<Asset> {

}

@Service
public class AssetServiceImpl implements AssetService {

    private final AssetRepository repository;
    private final Box<List<Asset>> assets;

    public AssetServiceImpl(AssetRepository repository, Box<List<Asset>> assets) {
        this.repository = repository;
        this.assets = assets;
    }

    @Override
    public Optional<Asset> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Asset> findAll() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean exists(String id) {
        return false;
    }
}
