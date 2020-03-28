package com.civ.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.civ.Game;
import com.civ.view.GameScreen;

public class UICreator {
    Stage stage;
    Window window;

    float X;

    TextButton c1;
    TextButton c2;
    TextButton addCountry;
    /*
    TextButton c3;
    TextButton c4;
    TextButton c5;
    TextButton c6;
    TextButton c7;
    TextButton c8;
    TextButton c9;
    TextButton c10;
    TextButton c11;

     */
    public UICreator(){
        stage = new Stage(new FitViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()));
        addToStage();
        X = Gdx.graphics.getWidth()/Gdx.graphics.getHeight();
    }

    void addToStage(){
        window = new Window("Countries", new Skin(Gdx.files.internal("windowStyle.json"), GameScreen.textureAtlas));
        window.setPosition(0, 0);
        window.setSize(Gdx.graphics.getWidth(), 200);

        addCountry = new TextButton("C", new Skin(Gdx.files.internal("cou.json"), GameScreen.textureAtlas));
        addCountry.setPosition(0, Gdx.graphics.getHeight() - addCountry.getHeight());
        addCountry.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if(window.isVisible()){
                    window.setVisible(false);
                }else {
                    window.setVisible(true);
                }
            }
        });
        stage.addActor(addCountry);

        c1 = new TextButton("Suran", new Skin(Gdx.files.internal("suran.json"), GameScreen.textureAtlas));
        c1.align(Align.center);
        c1.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                GameScreen.currentCountry = GameScreen.map.getCountry("Suran");
            }
        });
        window.add(c1);
        c2 = new TextButton("Nydhon", new Skin(Gdx.files.internal("nydhon.json"), GameScreen.textureAtlas));
        c2.align(Align.center);
        c2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                GameScreen.currentCountry = GameScreen.map.getCountry("Nydhon");
            }
        });
        window.add(c2);
        window.setVisible(false);
        stage.addActor(window);
    }

    public void draw(){
        stage.getViewport().update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stage.act();
        stage.draw();
    }

    public void dispose(){
        stage.dispose();
    }

    public Stage getStage() {
        return stage;
    }
}
