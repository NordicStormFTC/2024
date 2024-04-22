package org.firstinspires.ftc.teamcode.systems.commands;

import org.firstinspires.ftc.teamcode.auto.Auto2024;
import org.firstinspires.ftc.teamcode.teleOp.TeleOp2024;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scheduler {

    private TeleOp2024 teleOp;
    private Auto2024 auto;

    public static List<Command> commandList = new ArrayList<>();

    public Scheduler() {

    }

    public void schedule(Command command) {
        commandList.add(command);
    }

    public void run() {
        if (commandList.size() > 0) {
            while (commandList.size() > 0) {
                for (int i = 0; i < commandList.size(); i++) {
                    while (!commandList.get(i).isDone()) {
                        commandList.get(i).initialize();
                        commandList.get(i).execute();
                        break;
                    }
                    commandList.get(i).end();
                }
                break;
            }
        }
    }

}
