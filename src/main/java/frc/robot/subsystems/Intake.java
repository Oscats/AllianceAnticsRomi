package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  Spark intake = new Spark(2);
  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runIntake(double speed){

    intake.set(speed);

  }
}
