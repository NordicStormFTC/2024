package org.firstinspires.ftc.teamcode.systems;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class MotorControler {

    private DcMotorEx motor;
    private double nullPos = motor.getCurrentPosition();

    public MotorControler(DcMotorEx motor) {
        this.motor = motor;
    }

    public void setTarget(double target){
        convertDegreesToPos(target);
    }

    public void setPIDCoefficiants(double p, double i, double d) {
        PID pid = new PID(nullPos, motor, p, i, d);
    }

    public double convertDegreesToPos(double degree){
        double targetPos = degree/5;
        return targetPos;
    }

}
