package com.muffin_java.web.stock;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

interface IStockRepository {

}

@Repository
public class StockRepositoryImpl extends QuerydslRepositorySupport implements IStockRepository {

    private final JPAQueryFactory queryFactory;
    private final DataSource dataSource;


    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     * @param domainClass must not be {@literal null}.
     * @param queryFactory
     * @param dataSource
     */
    public StockRepositoryImpl(JPAQueryFactory queryFactory, DataSource dataSource) {
        super(Stock.class);
        this.queryFactory = queryFactory;
        this.dataSource = dataSource;
    }
}
