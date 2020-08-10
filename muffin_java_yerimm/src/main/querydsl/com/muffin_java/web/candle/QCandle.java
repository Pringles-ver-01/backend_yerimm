package com.muffin_java.web.candle;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCandle is a Querydsl query type for Candle
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCandle extends EntityPathBase<Candle> {

    private static final long serialVersionUID = 113422477L;

    public static final QCandle candle = new QCandle("candle");

    public final NumberPath<Long> candleId = createNumber("candleId", Long.class);

    public final NumberPath<Integer> change = createNumber("change", Integer.class);

    public final NumberPath<Integer> changeRatio = createNumber("changeRatio", Integer.class);

    public final StringPath close = createString("close");

    public final StringPath date = createString("date");

    public final StringPath high = createString("high");

    public final StringPath low = createString("low");

    public final StringPath open = createString("open");

    public final StringPath volume = createString("volume");

    public QCandle(String variable) {
        super(Candle.class, forVariable(variable));
    }

    public QCandle(Path<? extends Candle> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCandle(PathMetadata metadata) {
        super(Candle.class, metadata);
    }

}

