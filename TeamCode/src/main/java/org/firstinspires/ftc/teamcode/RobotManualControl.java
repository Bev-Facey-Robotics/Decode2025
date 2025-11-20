package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.actions.AutoPieceDelivery;
import org.firstinspires.ftc.teamcode.actions.manual.ManualDrive;
import org.firstinspires.ftc.teamcode.actions.manual.ManualIntake;
import org.firstinspires.ftc.teamcode.hardware.Drive;
import org.firstinspires.ftc.teamcode.hardware.FrontCombine;
import org.firstinspires.ftc.teamcode.hardware.HangExtention;
import org.firstinspires.ftc.teamcode.hardware.Intake;
import org.firstinspires.ftc.teamcode.internal.BaseOpMode;
import org.firstinspires.ftc.teamcode.internal.HardwareManager;

@TeleOp(name = "Robot Manual Control", group = "Competition Ready")
public class RobotManualControl extends BaseOpMode {
    // Hardwarez
    private final Drive HW_Drive = new Drive();
    private final Intake HW_Intake = new Intake();
    private final FrontCombine HW_FrontCombine = new FrontCombine();
    private final HangExtention HW_HangExtension = new HangExtention();

    // Manual Actions
    private final ManualDrive AC_Drive = new ManualDrive();
    private final ManualIntake AC_Intake = new ManualIntake();

    private final AutoPieceDelivery AC_PieceDelivery = new AutoPieceDelivery();

    //private final AutoHang AC_HangExtension = new AutoHang();

    @Override
    public void initializeHardware() {
        // Initialize the hardware
        HardwareManager.init(HW_Drive, hardwareMap);
        HardwareManager.init(HW_Intake, hardwareMap);
        HardwareManager.init(HW_FrontCombine, hardwareMap);
      //  HardwareManager.init(HW_HangExtension, hardwareMap);
    }

    @Override
    public void calibrateHardware() {
        // Calibrate the hardware
        HardwareManager.calibrate(HW_Intake);
        // unsure if this is needed with my lib, but better safe than sorry.
        HardwareManager.calibrate(HW_Drive);
        HardwareManager.calibrate(HW_FrontCombine);

       // HardwareManager.calibrate(HW_HangExtension);
    }

    @Override
    public void main() {
        HardwareManager.StartAction(AC_Drive);
        HardwareManager.StartAction(AC_Intake);


        while (opModeIsActive()) {
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }



