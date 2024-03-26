package org.firstinspires.ftc.teamcode.systems.vision;

public class Pixy {

    public Pixy(){

    }

    private int cvt(byte lower, byte upper){
        return (((int) upper & 0xff) | ((int) lower & 0xff ));
    }
    

}
