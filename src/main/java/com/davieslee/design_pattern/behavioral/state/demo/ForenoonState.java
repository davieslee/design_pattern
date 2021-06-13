package com.davieslee.design_pattern.behavioral.state.demo;

public class ForenoonState extends State{
    @Override
    public void WriteProgram(Work w) {
        if(w.Hour < 12){
            System.out.println("当前时间："+w.Hour+"点,上午工作精神百倍");
        }else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
