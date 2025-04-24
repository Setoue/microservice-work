package com.setoue.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private int days;
    private Double total;

    public Payment() {}

    public Payment(String name, Double dailyIncome, int days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
        this.total = getTotal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Double getTotal() {
        return getDailyIncome() * getDays();
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;
        return getDays() == payment.getDays() && getName().equals(payment.getName()) && Objects.equals(getDailyIncome(), payment.getDailyIncome()) && Objects.equals(getTotal(), payment.getTotal());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + Objects.hashCode(getDailyIncome());
        result = 31 * result + getDays();
        result = 31 * result + Objects.hashCode(getTotal());
        return result;
    }
}
