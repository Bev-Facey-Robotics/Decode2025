package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.internal.HardwareElement;

public class Spindexer extends HardwareElement {
    public CRServo dexerServo = null;
    public ColorRangeSensor intakeSensor = null;

    public void init(HardwareMap hardwareMap) {
        this.dexerServo = hardwareMap.get(CRServo.class, "spindexerServo");
        this.intakeSensor = hardwareMap.get(ColorRangeSensor.class, "spindexerBallDetector");
    }

    public void calibrate() {

    }

    public void self_test() {
    }

//    public void MovePower (double power) {
//        motorIntake.setPower(power);
//    }



    public void stop() {
        this.dexerServo.setPower(0);
        this.dexerServo = null;
        this.intakeSensor = null;
    }

    public boolean change = false;
}
