package com.Ukasz09.ValentineGame.gameModules.sprites.others;

import com.Ukasz09.ValentineGame.gameModules.gameUtils.ViewManager;
import com.Ukasz09.ValentineGame.gameModules.sprites.creatures.Sprite;
import com.Ukasz09.ValentineGame.soundsModule.Sounds;
import com.Ukasz09.ValentineGame.soundsModule.SoundsPlayer;
import javafx.scene.image.Image;

public class MoneyBag extends Sprite {

    private static final SoundsPlayer DEFAULT_COLLECT_SOUND = Sounds.collectMoneySound;

    private SoundsPlayer collectSound;
    private double soundVolume;

    private int value;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public MoneyBag(Image image, int value, ViewManager manager) {

        super(image, manager);
        this.value = value;
        collectSound = DEFAULT_COLLECT_SOUND;
        soundVolume = 0.1;
    }

    public MoneyBag(Image image, int value, SoundsPlayer collectSound, double soundVolume, ViewManager manager) {

        this(image, value, manager);
        this.collectSound = collectSound;
        this.soundVolume = soundVolume;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void playCollectSound() {
        collectSound.playSound(soundVolume, false);
    }

}
