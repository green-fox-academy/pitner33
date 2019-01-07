package com.greenfoxacademy.w09d01.Models;

import java.util.List;

public class ArrayToWorkWith {
    private String what;
    private List<Integer> numbers;

    public ArrayToWorkWith() {
    }

    public ArrayToWorkWith(String what, List<Integer> numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
