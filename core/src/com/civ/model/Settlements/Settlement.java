package com.civ.model.Settlements;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.civ.model.GAmeObject;

public abstract class Settlement extends GAmeObject {
    public Settlement(TextureRegion texture, float x, float y, float w, float h) {
        super(texture, x, y, w, h);
    }
}
