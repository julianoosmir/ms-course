package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{

    private String  name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Payment name(String name) {
        setName(name);
        return this;
    }


    public Double getDailyIncome() {
        return this.dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Payment dailyIncome(Double dailyIncome) {
        setDailyIncome(dailyIncome);
        return this;
    }

    public Integer getDays() {
        return this.days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Payment days(Integer days) {
        setDays(days);
        return this;
    }

    public double getTotal(){
        return this.days * this.dailyIncome;
    }
}
