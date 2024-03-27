package org.firstinspires.ftc.teamcode.teleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.systems.pidStuff.MotorControler;
import org.firstinspires.ftc.teamcode.systems.Hardware;

public class TeleOp2024 extends LinearOpMode {

    private Hardware hardware = new Hardware();

    private MotorControler m = new MotorControler(hardware.frontLeft);

    @Override
    public void runOpMode() throws InterruptedException {
    hardware.initHardware(hardwareMap, this);
        m.setPID(1,1,1);
        m.setTarget(3);
    }
}
