package com.civ.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector3;
import com.civ.control.GameInput;
import com.civ.control.UIInput;
import com.civ.model.Map.Country;
import com.civ.model.Map.Map;
import com.civ.model.UICreator;


public class GameScreen implements Screen {
    private static SpriteBatch batch;
    public static GameInput gameInput;
    public static UIInput uiInput;
    public static OrthographicCamera camera;
    public static float deltaT;
    public static Vector3 temp = new Vector3();
    public static TextureAtlas textureAtlas;
    public static Country currentCountry;
    UICreator uiCreator;
    InputMultiplexer multiplexer;
    // temp
    public static Map map;
    //test
    @Override
    public void show() {
        batch = new SpriteBatch();
        gameInput = new GameInput();
        uiInput = new UIInput();
        map = new Map(50, 50);

        uiCreator = new UICreator();

        multiplexer = new InputMultiplexer();
        multiplexer.addProcessor(uiCreator.getStage());
        multiplexer.addProcessor(gameInput);

        Gdx.input.setInputProcessor(multiplexer);
    }

    @Override
    public void render(float delta) {
        camera.update();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        deltaT = delta;

        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        map.draw(batch);
        batch.end();
        uiCreator.draw();
    }


    @Override
    public void resize(int width, int height) {
        float aspecrRatio = (float) height / width;
        camera = new OrthographicCamera(20f, 20f * aspecrRatio);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public void setTextureAtlas(TextureAtlas textureAtlas) {
        this.textureAtlas = textureAtlas;
    }
}
