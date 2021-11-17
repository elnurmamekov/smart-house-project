package StrategyPattern.AbstractClass;


import StrategyPattern.Interfaces.ICleanBehavior;
import StrategyPattern.Interfaces.IOpenDoorBehavior;
import StrategyPattern.Interfaces.ITurnOnLightLampBehavior;
import StrategyPattern.Interfaces.IPlayMusicBehavior;

public abstract class Device {
    private ICleanBehavior cleanBehavior;
    private ITurnOnLightLampBehavior turnOnLight;
    private IPlayMusicBehavior playMusicBehavior;
    private IOpenDoorBehavior openDoorBehavior;



    public void setCleanBehavior(ICleanBehavior cleanBehavior) {
        this.cleanBehavior = cleanBehavior;
    }
    public void setTurnOnLight(ITurnOnLightLampBehavior turnOnLight) {
        this.turnOnLight = turnOnLight;
    }
    public void setPlayMusicBehavior(IPlayMusicBehavior playMusicBehavior) {
        this.playMusicBehavior = playMusicBehavior;
    }

    public void performCleaning(){ cleanBehavior.clean(); }
    public void performTurnOnLight(){ turnOnLight.turnOnLight(); }
    public void performPlayMusic(){ playMusicBehavior.playIn("All rooms"); }

    public abstract void deviceDescription();
}
