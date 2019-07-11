package com.Ukasz09.ValentineGame.gameModules.sprites.others.kickEffect;

import com.Ukasz09.ValentineGame.gameModules.gameUtils.ViewManager;
import com.Ukasz09.ValentineGame.gameModules.sprites.creatures.Monster;
import com.Ukasz09.ValentineGame.gameModules.sprites.creatures.Player;

public interface KindOfKick {

    void kick(Monster m, Player p, String kickDirection, ViewManager manager);
}
