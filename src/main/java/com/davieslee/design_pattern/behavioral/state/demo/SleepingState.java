package com.davieslee.design_pattern.behavioral.state.demo;

public class SleepingState extends State {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间："+w.Hour+"点睡着了");
    }
}
