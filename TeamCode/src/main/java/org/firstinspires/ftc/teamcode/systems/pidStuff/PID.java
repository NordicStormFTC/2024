package org.firstinspires.ftc.teamcode.systems.pidStuff;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.systems.Hardware;

public class PID {

    public double p;
    public double i;
    public double d;

    private ElapsedTime itime = new ElapsedTime();
    private ElapsedTime dtime = new ElapsedTime();

    public PID(double target, DcMotorEx motor, double p, double i, double d){
        p = proportional(target, motor);
        i = integral(target, motor);
        d = derivative(motor);
        this.p = p;
        this.i = i;
        this.d = d;

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
        } else {
            error = 0;
        }
        return error;
    }

    private double derivative(DcMotorEx motor){
        final double posStamp = motor.getCurrentPosition();
        double x = posStamp;
        dtime.reset();
        double now = System.currentTimeMillis();
        double dx = motor.getCurrentPosition() - x;
        double dt = now - dtime.startTime();
        double derivative = (dx)/(dt);
        return -derivative;
    }
}
