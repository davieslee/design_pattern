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
        System.out.println("ζεηΆζ");
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP);
    }
}
