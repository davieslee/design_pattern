package com.davieslee.design_pattern.behavioral.state;

public class StopState extends CourseVideoState{
    
    @Override
    public void play() {
        System.out.println("停止状态-不能播放");
    }

    @Override
    public void speed() {
        System.out.println("停止状态-不能快进");
    }

    @Override
    public void pause() {
        System.out.println("停止状态-不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止状态");
    }
}
