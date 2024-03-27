package org.firstinspires.ftc.teamcode.systems.commands;

public interface Command {

    void initialize();

    void execute();

    boolean isDone();

    void end();
}
