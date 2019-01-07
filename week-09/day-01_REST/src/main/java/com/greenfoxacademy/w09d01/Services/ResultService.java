package com.greenfoxacademy.w09d01.Services;

import com.greenfoxacademy.w09d01.Models.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultService {
    private Result result;

    public ResultService() {
    }

    public ResultService(Result result) {
        this.result = result;
    }

    public Integer sumUntil(Integer until) {
        Integer sum = 0;
        for (int i = 0; i <= until; i++) {
            sum += i;
        }
        return sum;
    }

    public Integer factor(Integer until) {
        Integer factor = 1;
        for (int i = 1; i <= until ; i++) {
            factor *= i;
        }
        return factor;
    }

    public Integer sumAll(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public Integer multiply(List<Integer> numbers) {
        Integer multiply = 1;
        for (Integer number : numbers) {
            multiply *= number;
        }
        return multiply;
    }

    public List<Integer> doubler(List<Integer> numbers) {
        List<Integer> doubledList = new ArrayList<>();
        for (Integer number : numbers) {
            doubledList.add(number * 2);
        }
        return doubledList;
    }






    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
