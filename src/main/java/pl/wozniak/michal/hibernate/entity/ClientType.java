package pl.wozniak.michal.hibernate.entity;

import java.math.BigDecimal;

public enum ClientType {
    NORMAL("Normal") {
        @Override
        BigDecimal discount() {
            return BigDecimal.ZERO;
        }
    }, SILVER("Silver") {
        @Override
        BigDecimal discount() {
            return BigDecimal.valueOf(0.1);
        }

    }, GOLD("Gold") {
        @Override
        BigDecimal discount() {
            return BigDecimal.valueOf(0.15);
        }
    }, PREMIUM("Premium") {
        @Override
        BigDecimal discount() {
            return BigDecimal.valueOf(0.2);
        }
    };
    private String desc;

    ClientType(String desc) {
        this.desc = desc;
    }

    abstract BigDecimal discount();
}
