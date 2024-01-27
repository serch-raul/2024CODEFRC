// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainPrueba extends SubsystemBase {
  
  TalonFX motorDerecha1;
  TalonFX motorDerecha2;
  TalonFX motorIzquierda1;
  TalonFX motorIzquierda2;

  MotorControllerGroup derecho;
  MotorControllerGroup izquierdo;

  DifferentialDrive drive;
  /** Creates a new DriveTrain. */
  public DriveTrainPrueba() {
    motorDerecha1 = new TalonFX(Constants.IDMOTOR1);
    motorDerecha1.setInverted(false);
    motorDerecha2 = new TalonFX(Constants.IDMOTOR2);
    motorDerecha2.setInverted(false);
    motorIzquierda1 = new TalonFX(Constants.IDMOTOR3);
    motorIzquierda1.setInverted(false);
    motorIzquierda2 = new TalonFX(Constants.IDMOTOR4);
    motorIzquierda2.setInverted(false);

    derecho = new MotorControllerGroup(motorDerecha1, motorDerecha2);
    izquierdo = new MotorControllerGroup(motorIzquierda1, motorIzquierda2);

    drive = new DifferentialDrive(izquierdo, derecho);
  }

public void DriveJoysticks(XboxController control1, double speed){
  drive.arcadeDrive(control1.getRawAxis(Constants.XBOXSPEED), control1.getRawAxis(Constants.XBOXROTATION));
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
