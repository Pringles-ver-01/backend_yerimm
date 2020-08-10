package com.muffin_java.web.candle;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "candle")
public class Candle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candle_id") private Long candleId;
    @Column(name = "date") private String date;
    @Column(name = "close") private String close;
    @Column(name = "open") private String open;
    @Column(name = "high") private String high;
    @Column(name = "low") private String low;
    @Column(name = "volume") private String volume;
    @Column(name = "change") private int change;
    @Column(name = "change_ratio") private int changeRatio;

    public Candle() {}

    @Builder
    public Candle(Long candleId, String date, String close, String open, String high, String low, String volume, int change, int changeRatio) {
        this.candleId = candleId;
        this.date = date;
        this.close = close;
        this.open = open;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.change = change;
        this.changeRatio = changeRatio;
    }
}

