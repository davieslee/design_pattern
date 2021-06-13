package com.davieslee.design_pattern.behavioral.state.demo;

public class AfternoonState extends State{
    @Override
    public void WriteProgram(Work w) {
        if(w.Hour < 17){
            System.out.println("当前时间："+w.Hour+"点,下午状态不错，继续努力");
        }else {
            w.setState(new EventingState());
            w.writeProgram();
        }
    }
}
