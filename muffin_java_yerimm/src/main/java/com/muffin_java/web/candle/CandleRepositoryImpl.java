package com.muffin_java.web.candle;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

interface ICandleRepository {

}

@Repository
public class CandleRepositoryImpl extends QuerydslRepositorySupport implements ICandleRepository {

    private final JPAQueryFactory queryFactory;
    private final DataSource dataSource;


    public CandleRepositoryImpl(JPAQueryFactory queryFactory, DataSource dataSource) {
        super(Candle.class);
        this.queryFactory = queryFactory;
        this.dataSource = dataSource;
    }
}
