package StrategyPattern.Extentions;

import StrategyPattern.Interfaces.IPlayMusicBehavior;

public class PlayMusicInChosenRooms implements IPlayMusicBehavior {
    @Override
    public void playIn(String rooms) {
        System.out.println("Music is playing in " + rooms);
    }
}
