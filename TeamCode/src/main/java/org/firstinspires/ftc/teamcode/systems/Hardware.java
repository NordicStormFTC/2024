package org.firstinspires.ftc.teamcode.systems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {

    public static Gamepad ethan = new Gamepad();
    public static Gamepad mica = new Gamepad();

    public DcMotorEx frontLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backLeft;
    public DcMotorEx backRight;

    public void initHardware(HardwareMap hardwareMap, LinearOpMode opMode){

        frontLeft = (DcMotorEx) hardwareMap.get(DcMotor.class, "1");
        frontRight = (DcMotorEx) hardwareMap.get(DcMotor.class, "2");
        backLeft = (DcMotorEx) hardwareMap.get(DcMotor.class, "3");
        backRight = (DcMotorEx) hardwareMap.get(DcMotor.class, "4");

        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    
}
