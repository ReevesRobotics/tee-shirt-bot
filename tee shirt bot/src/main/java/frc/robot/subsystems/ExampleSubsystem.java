// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  public TalonSRX m_FrontRight;
  public TalonSRX m_BackRight;
  public TalonSRX m_FrontLeft;
  public TalonSRX m_BackLeft;

  private DifferentialDrive m_robotDrive;


  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    m_FrontRight = new WPI_TalonSRX(1);
    m_BackRight = new WPI_TalonSRX(2);
    m_FrontLeft = new WPI_TalonSRX(3);
    m_BackLeft = new WPI_TalonSRX(4);

    m_robotDrive = new DifferentialDrive(m_FrontLeft::set, m_FrontRight::set);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
