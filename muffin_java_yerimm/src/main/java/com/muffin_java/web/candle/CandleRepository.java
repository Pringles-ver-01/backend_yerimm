package com.muffin_java.web.candle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandleRepository extends JpaRepository<Candle, Long>, ICandleRepository {
}
