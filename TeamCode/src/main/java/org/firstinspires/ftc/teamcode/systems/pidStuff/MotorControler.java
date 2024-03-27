package org.firstinspires.ftc.teamcode.systems.pidStuff;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class MotorControler {

    private DcMotorEx motor;
    private double target;
    private double p;
    private double i;
    private double d;

    public MotorControler(DcMotorEx motor) {
        this.motor = motor;
    }

    public void setTarget(double target){
        this.target = target;
        motor.setPower(p + i + d);
    }

//    public double getTarget(){
//        return target;
//    }

    public void setPID(double kp, double ki, double kd) {
        PID pid = new PID(target,motor, kp, ki, kd);
        p = kp * pid.p;
        i = ki * pid.i;
        d = kd * pid.d;
    }

    public double convertDegreesToPos(double degree){
        double targetPos = degree/5;
        return targetPos;
    }

}
