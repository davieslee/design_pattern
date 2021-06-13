package com.davieslee.design_pattern.behavioral.state;

public class SpeedState extends CourseVideoState{
    
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY);
    }

    @Override
    public void speed() {
        System.out.println("快进状态");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP);
    }
}
