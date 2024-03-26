package org.firstinspires.ftc.teamcode.systems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;

public class PID {

    private ElapsedTime ptime = new ElapsedTime();
    private ElapsedTime itime = new ElapsedTime();
    private ElapsedTime dtime = new ElapsedTime();



    public PID(double target, DcMotorEx motor, double p, double i, double d){
        p = proportional(target, motor);
        i = integral(target, motor);
        d = derivative(motor);
    }

    private double proportional(double target, DcMotorEx motor){
        return target - motor.getCurrentPosition();
    }

    private double integral(double target, DcMotorEx motor){
        itime.reset();
        double now = System.currentTimeMillis();
        double pos = motor.getCurrentPosition();
        double error = target - pos;
        if(target != pos){
            error += error;
        }
        return error;
    }

    private double derivative(DcMotorEx motor){
        final double posStamp = motor.getCurrentPosition();
        double x = posStamp;
        dtime.reset();
        double now = System.currentTimeMillis();
        double dx = x - motor.getCurrentPosition();
        double dt = now - dtime.startTime();
        double derivative = (dx)/(dt);
        return derivative;
    }
}
