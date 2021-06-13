package com.davieslee.design_pattern.behavioral.state;

public class PlayState extends CourseVideoState{

    @Override
    public void play() {
        System.out.println("正常播放状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED);
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
