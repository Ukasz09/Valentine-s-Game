package com.Ukasz09.ValentineGame.graphicModule.texturesPath;

import javafx.scene.image.Image;

public class SpritesImages {
    //Player
    public static Image playerRightImage = new Image(SpritesPath.PLAYER_RIGHT_PATH);

    //Enemy's
    public static Image littleMonsterImage = new Image(SpritesPath.LITTLE_MONSTER_1_PATH);
    public static Image fishMonsterRightImage = new Image(SpritesPath.FISH_MONSTER_PATH);
    public static Image fishMonsterMinibossRightImage = new Image(SpritesPath.FISH_MONSTER_BOSS_PATH);

    //Other
    public static Image playerShieldImage = new Image(SpritesPath.PROTECTION_ORBIT_PATH);
    public static Image playerShotImage = new Image(SpritesPath.PLAYER_BULLET_SHOT_PATH);
    private static Image[] ukaszBombShotImages = new Image[2];
    public static Image heartFullImage = new Image(SpritesPath.HEART_FULL_PATH);
    public static Image heartHalfImage = new Image(SpritesPath.HEART_HALF_PATH);
    public static Image heartEmptyImage = new Image(SpritesPath.HEART_EMPTY_PATH);
    private static Image[] batteryImages = new Image[5];
    public static Image fishMinibossShieldImage = new Image(SpritesPath.FISH_MONSTER_BOSS_SHIELD_PATH);

    //endPanel
    public static Image kasiaImage = new Image(SpritesPath.KASIA_IMAGE_PATH);
    public static Image heartFlareImage = new Image(SpritesPath.HEART_FLARE_PATH);
    public static Image kasiaWingsImage = new Image(SpritesPath.WINGS_PATH);

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Image[] getBatteryImages() {
        for (int i = 0; i < batteryImages.length; i++)
            batteryImages[i] = new Image(SpritesPath.BATTERY_PREFIX + (i + 1) + ".png");

        return batteryImages;
    }

    public static Image[] getUkaszBombShotImages() {
        ukaszBombShotImages[0] = new Image(SpritesPath.PLAYER_BOMB_SHOT_PATH_1);
        ukaszBombShotImages[1] = new Image(SpritesPath.PLAYER_BOMB_SHOT_PATH_2);

        return ukaszBombShotImages;
    }
}
