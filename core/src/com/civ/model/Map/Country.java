package com.civ.model.Map;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class Country {
    Sprite color;
    ArrayList<Segment> country;
    String name;

    public Country(TextureRegion textureRegion, String name){
        color = new Sprite(textureRegion);
        this.name = name;
        country = new ArrayList<>();
    }

    public void addSegment(Segment s){
        s.setColor(color);
        country.add(s);
    }

    public void deleteSegment(Segment s){
        country.remove(s);
    }

    public ArrayList<Segment> getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
