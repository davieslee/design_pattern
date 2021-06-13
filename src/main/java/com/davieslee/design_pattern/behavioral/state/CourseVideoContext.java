package com.davieslee.design_pattern.behavioral.state;

public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    public final static PlayState PLAY = new PlayState();
    public final static PauseState PAUSE = new PauseState();
    public final static SpeedState SPEED = new SpeedState();
    public final static StopState STOP = new StopState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}
