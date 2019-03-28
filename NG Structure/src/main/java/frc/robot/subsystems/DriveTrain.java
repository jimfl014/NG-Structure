/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
//import frc.robot.OI;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_TalonSRX frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor;
  MecanumDrive mecDrive;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
public void MoveRobot() {

  frontLeftMotor = new WPI_TalonSRX(RobotMap.frontLeftMotor);
  rearLeftMotor = new WPI_TalonSRX(RobotMap.rearLeftMotor);
  frontRightMotor = new WPI_TalonSRX(RobotMap.frontRightMotor);
  rearRightMotor = new WPI_TalonSRX(RobotMap.rearRightMotor);

  mecDrive = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

  double X = Robot.m_oi.xSpeed;
  double Y = Robot.m_oi.ySpeed;
  double Z = Robot.m_oi.zSpeed;

  mecDrive.driveCartesian(Y, X, Z);


}

}
