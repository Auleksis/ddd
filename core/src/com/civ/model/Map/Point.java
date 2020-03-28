package com.civ.model.Map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.civ.control.PointController;
import com.civ.model.GAmeObject;

public abstract class Point extends GAmeObject {
    PointController pointController;
    public float width, height;
    public Point(TextureRegion texture, float x, float y, float w, float h) {
        super(texture, x, y, w, h);
        width = w;
        height = h;
        pointController = new PointController(bounds);
    }

    public boolean clicked(float tx, float ty){
        if(pointController.handleClicked(tx, ty)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
    }
}
