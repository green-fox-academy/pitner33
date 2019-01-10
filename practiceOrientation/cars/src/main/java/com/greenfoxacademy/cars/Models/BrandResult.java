package com.greenfoxacademy.cars.Models;

import java.util.List;

public class BrandResult {
    private String result;
    private List<Car> data;

    public BrandResult() {
    }

    public BrandResult(String result, List<Car> data) {
        this.result = result;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }
}
