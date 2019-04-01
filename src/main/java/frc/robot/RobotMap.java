/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  // CAN Motors
  // TalonSRX
  public static final int frontLeftMotor = 2;
  public static final int frontRightMotor = 3;
  public static final int rearLeftMotor = 0;
  public static final int rearRightMotor = 1;
  // VictorSRX
  public static final int intakeMotor = 0;

  // PWM Motors
  // Spark
  public static final int liftA = 0;
  public static final int liftB = 1;

  // Pnuematics
  public static final int ballPusherOut = 1;
  public static final int ballPusherIn = 0;
  public static final int hatchCoverOut = 5;
  public static final int hatchCoverIn = 4;
  public static final int intakeOut = 2;
  public static final int intakeIn = 3;
  
  // Motor Power Variables
  public static final double liftSpeed = -0.8;
  public static final double intakeSpeed = -0.8;
  public static final double driveDeadpan = 0.2;
  public static final double intakeMotorPower = -0.8;

  public static final double delayAfterWheelIntakeOut = 0.5;
  public static final double delayBeforeRetract = 1.0;

  // Controllers
  public static final int driveJoystick = 1;
  public static final int buttonsJoystick = 0;
	public static final int driveController = 2;
  public static final int buttonsController = 3;
  
  // Timed values
  public static final double intakeMotorStart = 0.2;
		

}
