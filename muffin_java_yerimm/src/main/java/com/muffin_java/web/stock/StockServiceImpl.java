package com.muffin_java.web.stock;

import com.muffin_java.web.utils.JpaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface StockService extends JpaService<Stock>{

}

@Service
public class StockServiceImpl implements StockService{

    @Override
    public Optional<Stock> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Stock> findAll() {
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
