/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Timer;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import frc.robot.Robot;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Timer elapsedTime;
  VictorSPX intakeMotor;
  DoubleSolenoid intakeOut;
  static final DoubleSolenoid.Value RETRACT = DoubleSolenoid.Value.kForward;
  static final DoubleSolenoid.Value EXTEND = DoubleSolenoid.Value.kReverse;
  static double motorPower = RobotMap.intakeMotorPower;
  double startTime;
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  
    intakeMotor = new VictorSPX(RobotMap.intakeMotor);
    intakeOut = new DoubleSolenoid(RobotMap.intakeOut, RobotMap.intakeIn);

  }

 // public Intake() {

    

  // }



public void IntakeUp() {

intakeOut.set(EXTEND);
startTime = elapsedTime.get();
  if (startTime + RobotMap.intakeMotorStart <= startTime){

    intakeMotor.set(ControlMode.PercentOutput, motorPower);

  }
Robot.intakeOut = true; //Used to track the state of the intake arm
}

public void IntakeDown() {

intakeMotor.set(ControlMode.PercentOutput, 0);
startTime = elapsedTime.get();
  if (startTime + RobotMap.intakeMotorStart <= startTime){

    intakeOut.set(RETRACT);

  }
Robot.intakeOut = false;  //Used to track the state of the intake arm
}

}
