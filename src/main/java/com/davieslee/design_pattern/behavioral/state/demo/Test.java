package com.davieslee.design_pattern.behavioral.state.demo;

public class Test {

    public static void main(String[] args) {
        Work work = new Work();
        work.Hour = 9;
        work.writeProgram();
        work.Hour = 10;
        work.writeProgram();
        work.Hour = 12;
        work.writeProgram();
        work.Hour = 13;
        work.writeProgram();
        work.Hour = 14;
        work.writeProgram();
        work.Hour = 17;
        work.writeProgram();

        work.TaskFinished = true;

        work.Hour = 19;
        work.writeProgram();

        work.Hour = 22;
        work.writeProgram();
    }

}
