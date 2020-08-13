package com.muffin_java.web.asset;

import com.muffin_java.web.utils.Box;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

import java.util.List;

import static com.muffin_java.web.asset.QAsset.asset;

interface IAssetRepository{
    Box<List<Asset>> getOneBudget(String userid);
    Asset showOneData();
}

@Repository
public class AssetRepositoryImpl extends QuerydslRepositorySupport implements IAssetRepository {

    private static final Logger logger = LoggerFactory.getLogger(AssetRepositoryImpl.class);
    private final JPAQueryFactory queryFactory;
    private final DataSource dataSource;

    public AssetRepositoryImpl(JPAQueryFactory queryFactory, DataSource dataSource) {
        super(Asset.class);
        this.queryFactory = queryFactory;
        this.dataSource = dataSource;
    }

    @Override
    public Box<List<Asset>> getOneBudget(String userid) {
        return (Box<List<Asset>>) queryFactory.select(asset.totalAsset).from(asset).fetch();
    }

    @Override
    public Asset showOneData() {
        logger.info("AssetRepositoryImpl : public List<Integer> showOneData()");
        return queryFactory.select(Projections.fields(Asset.class, asset.assetId, asset.priceEarnigsRatio, asset.profitLoss,
                asset.shareCount, asset.totalAsset)).from(asset).fetchOne();
    }
}
