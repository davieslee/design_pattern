package com.davieslee.design_pattern.behavioral.state.demo;

public class NoonState extends State{
    @Override
    public void WriteProgram(Work w) {
        if(w.Hour < 13){
            System.out.println("当前时间："+w.Hour+"点,饿了，午饭");
        }else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
