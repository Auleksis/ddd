package com.civ.model;


import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;

public abstract class GAmeObject {
    protected Polygon bounds;
    protected Sprite sprite;

    public GAmeObject(TextureRegion texture, float x, float y, float w, float h){
        bounds = new Polygon(new float[]{0f,0f, w, 0f, w, h, 0f, h});
        bounds.setPosition(x, y);
        bounds.setOrigin(w / 2f, h / 2f);

        sprite = new Sprite(texture);
        sprite.setSize(w, h);
        sprite.setOrigin(w / 2f, h / 2f);
        sprite.setPosition(x, y);
    }

    public void draw(SpriteBatch batch){
        sprite.setPosition(bounds.getX(), bounds.getY());
        sprite.setRotation(bounds.getRotation());
        sprite.draw(batch);
    }

    public Polygon getBounds() {
        return bounds;
    }
}
