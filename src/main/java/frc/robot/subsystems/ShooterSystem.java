// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSystem extends SubsystemBase {

    private final WPI_VictorSPX launchTalon;

    public ShooterSystem() {
        launchTalon = new WPI_VictorSPX(Constants.LaunchTalon);
    }

    public void launcherDrive(double speed) {
        launchTalon.set(speed);
    }

    public void stop() {
        launchTalon.set(0);
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }
}
