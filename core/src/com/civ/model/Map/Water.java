package com.civ.model.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.civ.view.GameScreen;

public class Water extends Point {
    private static TextureRegion WATER = new TextureRegion(GameScreen.textureAtlas.findRegion("watertexture"));
    public Water(float x, float y, float w, float h) {
        super(WATER, x, y, w, h);
    }
}
