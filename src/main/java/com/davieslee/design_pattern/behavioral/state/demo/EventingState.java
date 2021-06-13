package com.davieslee.design_pattern.behavioral.state.demo;

public class EventingState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.TaskFinished){
            w.setState(new RestState());
            w.writeProgram();
        }else {
            if(w.Hour < 21){
                System.out.println("当前时间："+w.Hour+"点,加班哦，疲累");
            }else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
