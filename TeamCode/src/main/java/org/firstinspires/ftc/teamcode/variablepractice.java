package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class variablepractice extends OpMode {
    @Override
    public void init() {
        int teamnumber = 22586;
        double motorspeed = 0.65;
        boolean clawclosed = true;
        String name = "CNapSys";

         telemetry.addData("Team number", teamnumber);
        telemetry.addData("Motor speed", motorspeed);
        telemetry.addData("Claw closed", clawclosed );
        telemetry.addData("Name", name);


    }

    @Override
    public void loop() {

    }
}
