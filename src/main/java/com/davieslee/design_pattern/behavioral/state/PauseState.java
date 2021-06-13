package com.davieslee.design_pattern.behavioral.state;

public class PauseState extends CourseVideoState{
    
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY);
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED);
    }

    @Override
    public void pause() {
        System.out.println("暂停状态");
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP);
    }
}
