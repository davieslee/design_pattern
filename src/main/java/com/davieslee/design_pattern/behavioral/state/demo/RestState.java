package com.davieslee.design_pattern.behavioral.state.demo;

public class RestState extends State{

    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间："+w.Hour+"点下班回家了");
    }
}
