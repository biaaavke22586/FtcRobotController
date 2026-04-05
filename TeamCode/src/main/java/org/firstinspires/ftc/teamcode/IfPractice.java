package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice  extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
       double lefty = gamepad1.left_stick_y;
       boolean buttonA = gamepad1.a;
       double motorspeed = 0.6767;
      if(lefty<0.1 && lefty>-0.1){
          telemetry.addData("Left Stick", "In dead zone");
      }
       telemetry.addData("Left stick value", lefty);
      if(buttonA == false){
          motorspeed*=2;
          telemetry.addData("Motor speed", motorspeed);
      }

    }
}
