package com.civ.control;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Polygon;
import com.civ.model.Map.Earth;
import com.civ.model.Map.Point;
import com.civ.model.Map.Water;
import com.civ.view.GameScreen;

public class PointController {
    //TODO поинты статичны, поэтому здесь не нуден полигон
    private Polygon pointBounds;
    public PointController(Polygon pointBounds){
        this.pointBounds = pointBounds;
    }

    public boolean handleClicked(float tx, float ty){
        if(pointBounds.contains(tx, ty)){
            return true;
        }
        else{
            return false;
        }
    }

}
