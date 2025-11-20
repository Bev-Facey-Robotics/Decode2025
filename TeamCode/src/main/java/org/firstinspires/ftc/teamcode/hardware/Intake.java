package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.internal.HardwareElement;
import org.firstinspires.ftc.teamcode.internal.TelemetryManager;

public class Intake extends HardwareElement {
    public DcMotor motorIntake = null;


    public void init(HardwareMap hardwareMap) {
        this.motorIntake = hardwareMap.get(DcMotor.class, "intakeMotor");
        this.motorIntake.setPower(0);
        this.motorIntake.setTargetPosition(0);
        this.motorIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        this.motorIntake.setDirection(DcMotorSimple.Direction.REVERSE);
        this.motorIntake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void calibrate() {

    }

    public void self_test() {
    }

    public void MovePower (double power) {
        motorIntake.setPower(power);
    }



    public void stop() {
        this.motorIntake.setPower(0);
        this.motorIntake.setTargetPosition(0);
        this.motorIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        this.motorIntake = null;
    }

    public boolean change = false;
}
