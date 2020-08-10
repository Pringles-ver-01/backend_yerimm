package com.muffin_java.web.candle;

import com.muffin_java.web.utils.JpaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface CandleService extends JpaService<Candle> {

}

@Service
public class CandleServiceImpl implements CandleService {

    @Override
    public Optional<Candle> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Candle> findAll() {
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
