package org.firstinspires.ftc.teamcode.actions.manual;

import org.firstinspires.ftc.teamcode.hardware.Intake;
import org.firstinspires.ftc.teamcode.internal.ActionElement;
import org.firstinspires.ftc.teamcode.internal.HardwareManager;

public class ManualIntake extends ActionElement {

    @Override
    public void run() throws InterruptedException, NullPointerException  {
        // Reserve the hardware
        Intake intake = (Intake) HardwareManager.ReserveHardware(this, "Intake");

        while (!Thread.currentThread().isInterrupted()) {

            double slidePower = HardwareManager.opMode.gamepad2.right_trigger;
            intake.MovePower(slidePower);

            Thread.sleep(20);
        }
    }
    @Override
    public boolean isAutoRestart() {
        return true;
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
