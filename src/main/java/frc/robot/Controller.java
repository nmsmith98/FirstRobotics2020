package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj.Joystick;

public class Controller{
    Joystick joystick = new Joystick(0);

    boolean toggleOn = false;
    boolean togglePressed = false;

    public void teleopPeriodic(){
        updateToggle();

        if (toggleOn){
            // Do something when toggled on
        } else{
            // Do something when toggled off
        }
    }

    public void updateToggle()
    {
        if (joystick.getRawButton(1)){
            if (!togglePressed){
                toggleOn = !toggleOn;
                togglePressed = true;
            }
        } else{
            togglePressed = false;
        }
    }
}