package com.davieslee.design_pattern.behavioral.state.demo;

public class Work {

   private State state;

    public Work() {
        this.state = new ForenoonState();
    }

    public double Hour;

    public boolean TaskFinished;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram(){
        state.WriteProgram(this);
    }
}
