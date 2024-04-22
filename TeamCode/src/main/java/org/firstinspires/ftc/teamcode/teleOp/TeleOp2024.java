package org.firstinspires.ftc.teamcode.teleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.systems.commands.Command;
import org.firstinspires.ftc.teamcode.systems.commands.Scheduler;
import org.firstinspires.ftc.teamcode.systems.commands.Thing;
import org.firstinspires.ftc.teamcode.systems.pidStuff.MotorControler;
import org.firstinspires.ftc.teamcode.systems.Hardware;

public class TeleOp2024 extends LinearOpMode {

    private Hardware hardware = new Hardware();
    private MotorControler FLMC= new MotorControler(hardware.frontLeft);
    private Scheduler scheduler = new Scheduler();

    @Override
    public void runOpMode() throws InterruptedException {
        hardware.initHardware(hardwareMap, this);
        FLMC.setPID(1,1,1);

        waitForStart();
        scheduler.run();
        scheduler.schedule(new Thing());

    }

}
