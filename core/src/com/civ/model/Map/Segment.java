package com.civ.model.Map;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.civ.model.Settlements.Settlement;

public class Segment {
    Point point;
    Settlement settlement;
    Sprite country;
    public Segment(Point p){
        point = p;
        settlement = null;
        country = null;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setColor(Sprite sprite) {
        country = new Sprite(sprite);
        country.setPosition(point.getBounds().getX(), point.getBounds().getY());
        country.setSize(point.width, point.height);
        country.setAlpha(0.4f);
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }


    public void draw(SpriteBatch batch){
        point.draw(batch);
        if(settlement != null)
            settlement.draw(batch);
        if(country != null)
            country.draw(batch);

    }

    public Point getPoint() {
        return point;
    }
}
