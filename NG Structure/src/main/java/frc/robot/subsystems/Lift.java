/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */



public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark liftA, liftB;
  SpeedControllerGroup lift;

  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    
  }

public void upDown() {

  liftA = new Spark(RobotMap.liftA);
  liftB = new Spark(RobotMap.liftB);
  lift = new SpeedControllerGroup(liftA, liftB);  

  lift.set(0);

}


}
