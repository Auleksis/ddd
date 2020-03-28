package com.civ.model.Map;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.civ.model.GAmeObject;
import com.civ.view.GameScreen;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    ArrayList<Segment> map;
    public ArrayList<Country> countries;
    int WIDTH;
    int HEIGHT;
    public Map(ArrayList<Segment> map){
        this.map = map;
        WIDTH = 40;
        HEIGHT = 40;
    }

    public Map(int width, int height){
        WIDTH = width;
        HEIGHT = height;
        generateMap();
    }

    void generateRightMap(){
        Random rnd = new Random();
        float x = 0, y = 0;
        Point p;
        map = new ArrayList<>();
    }

    void generateMap(){
        countries = new ArrayList<>();
        countries.add(new Country(GameScreen.textureAtlas.findRegion("c1"), "Suran"));
        countries.add(new Country(GameScreen.textureAtlas.findRegion("c4"), "Nydhon"));
        Random rnd = new Random();
        float x = 0, y = 0;
        Segment s;
        Point p;
        map = new ArrayList<>();
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if(rnd.nextInt() % 2 == 0){
                    p = new Water(x, y, 1f, 1f);
                }else{
                    p = new Earth(x, y, 1f, 1f);
                }
                s = new Segment(p);
                x += 1;
                map.add(s);
            }
            y += 1;
            x = 0;
        }


    }

    public Country getCountry(String name){
        for (Country c:
             countries) {
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }

    public void draw(SpriteBatch batch){
        for (Segment i:
             map) {
            i.draw(batch);
        }
    }

    public ArrayList<Segment> getMap() {
        return map;
    }

}
