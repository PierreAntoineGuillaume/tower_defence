package iut.tower_defence.directives;

import iut.tower_defence.data.character.Player;

/**
 * Created by julien on 04/12/2015.
 */
public class HitRight extends Control{

    public HitRight(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        target.attack(1);
    }
}
