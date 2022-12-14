// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.OmniWheel;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DefaultOmniWheel extends CommandBase {
  XboxController m_joy;
  OmniWheel m_ow;
  /** Creates a new DefaultOmniWheel. */
  public DefaultOmniWheel(XboxController joy, OmniWheel ow) {
    m_joy = joy;
    m_ow = ow;
    addRequirements(m_ow);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double y = m_joy.getLeftY();
    m_ow.setPercent(y);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
