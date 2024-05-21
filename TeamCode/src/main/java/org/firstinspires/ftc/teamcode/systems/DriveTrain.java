package org.firstinspires.ftc.teamcode.systems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.IMU;

public class DriveTrain extends SubsystemBase {

    private Motor frontLeft;
    private Motor frontRight;
    private Motor backLeft;
    private Motor backRight;

    Gamepad ethan = new Gamepad();
    Gamepad mica = new Gamepad();


    private MecanumDrive drive = new MecanumDrive(frontLeft, frontRight, backLeft, backRight);


    public DriveTrain() {
        frontLeft = hardwareMap.get(Motor.class, "frontleft");
        frontRight = hardwareMap.get(Motor.class, "frontRight");
        backLeft = hardwareMap.get(Motor.class, "backRight");
        backRight = hardwareMap.get(Motor.class, "BackLeft");


    }
    @Override
    public void periodic() {
        drive.driveFieldCentric(mica.left_stick_x, mica.left_stick_y, mica.right_stick_x, 0);
    }
}
