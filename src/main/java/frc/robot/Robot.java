package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  private Compressor m_Compressor = new Compressor(PneumaticsModuleType.CTREPCM);
  private Solenoid m_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
  private Joystick m_Joystick = new Joystick(0);

  public Robot() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    if(m_Joystick.getRawButton(0))
      m_Solenoid.set(true);
  }
}
