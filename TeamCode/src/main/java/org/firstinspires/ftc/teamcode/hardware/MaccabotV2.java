package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class MaccabotV2 {

    private OpMode parentOpMode;
    //private HardwareMap hardwareMap;

    public MaccaDrive drive;
    public MaccaSucc intake;
    public MaccaLift lift;

    public MaccabotV2(OpMode parentOpMode) {
        this.parentOpMode = parentOpMode;
        //this.hardwareMap = parentOpMode.hardwareMap;
    }

    public void initialize(boolean auto) {
        parentOpMode.telemetry.addLine("*** Welcome to MACCABOT v1 ***");

        drive = new MaccaDrive(parentOpMode);
        drive.initializeDrive(auto);

        intake = new MaccaSucc(parentOpMode);
        intake.initializeIntake();

        lift = new MaccaLift(parentOpMode);
        lift.initializeLift();

        parentOpMode.telemetry.addLine("Initialization Complete.");
    }

    public void drawTelemetry() {
        parentOpMode.telemetry.addData("Claw Position", lift.getChadPosition());
        parentOpMode.telemetry.addData("Lift Position", lift.getLiftPosition());
        parentOpMode.telemetry.addData("Lift Target Position", lift.getLiftTargetPosition());
    }

}
