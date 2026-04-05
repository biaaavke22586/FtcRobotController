package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //runs 50x second
        double speedforward = -gamepad1.left_stick_y/2.0;
        double x1x2 = gamepad1.left_stick_x-gamepad1.right_stick_x;
        double sumtriggers = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("left x", gamepad1.left_stick_x);
        telemetry.addData("left y", speedforward);
        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData("button a", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("difference", x1x2);
        telemetry.addData("sum triggers", sumtriggers);
    }
}
