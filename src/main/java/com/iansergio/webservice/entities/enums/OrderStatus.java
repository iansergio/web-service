package com.iansergio.webservice.entities.enums;

public enum OrderStatus {

    WAITING_PAYMANT(0),
    PAID(1),
    SHIPED(2),
    DELIVERED(3),
    CANCELLED(4);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code " + code);
    }
}
