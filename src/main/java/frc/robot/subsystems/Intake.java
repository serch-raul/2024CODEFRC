// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Intake extends SubsystemBase {

  CANSparkMax MotorA;
  CANSparkMax MotorB;
  MotorControllerGroup SHOOTER;

  /** Creates a new Intake. */
  public Intake() {
    MotorA = new CANSparkMax(Constants.MOTORAID, MotorType.kBrushless);
    MotorB = new CANSparkMax(Constants.MOTORBID, MotorType.kBrushless);
    MotorB.setInverted(true);

    SHOOTER = new MotorControllerGroup(MotorA, MotorB);
  }

  public void llantas(double Vel){
    SHOOTER.set(Vel);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void stop(){
    SHOOTER.set(0);
  }

}