package com.civ.model.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.civ.view.GameScreen;

public class Earth extends Point {
    private final static TextureRegion EARTH = new TextureRegion(GameScreen.textureAtlas.findRegion("earthTexture"));
    public Earth(float x, float y, float w, float h) {
        super(EARTH, x, y, w, h);
    }
}
