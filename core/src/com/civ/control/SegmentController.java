package com.civ.control;

import com.badlogic.gdx.Gdx;
import com.civ.model.Map.Earth;
import com.civ.model.Map.Point;
import com.civ.model.Map.Segment;
import com.civ.view.GameScreen;

public class SegmentController {

    public static void handleInput(){
        GameScreen.temp.set(Gdx.input.getX(), Gdx.input.getY(), 0);
        GameScreen.camera.unproject(GameScreen.temp);
        float touchX = GameScreen.temp.x;
        float touchY = GameScreen.temp.y;
        Segment s;
        for (int i = 0; i < GameScreen.map.getMap().size(); i++) {
            s = GameScreen.map.getMap().get(i);
            if(s.getPoint().clicked(touchX, touchY)){
                GameScreen.currentCountry.addSegment(s);
            }
        }
    }

}
