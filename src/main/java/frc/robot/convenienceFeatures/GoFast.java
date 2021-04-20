// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.convenienceFeatures;

/** This POJO is the new implementation of the Oscat's magic GoFast button
 * During events, use the controller as normal for controlled driving, but when you need some more oomf,
 * use the trigger to send it.
 * 
 * Here is our intial implementation from our 2019 drive code. This was written in Python...
 * # drive motors 
        self.drive.arcadeDrive(
            ((self.stick.getTriggerAxis(Hand.kRight)*((1-self.driveLimit)/1))
            +self.driveLimit)*-1*(self.stick.getY(Hand.kRight)), 
            (self.stick.getTriggerAxis(Hand.kRight)*((1-self.driveLimit)/1)
            +self.driveLimit)*(self.stick.getX(Hand.kRight))
            )
 */
public class GoFast {

    
}
