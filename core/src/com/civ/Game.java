package com.civ;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.civ.utils.Assets;
import com.civ.view.GameScreen;
import com.civ.view.MainMenu;


public class Game extends com.badlogic.gdx.Game {
	private Screen gameScreen;
	private Assets assets;
	private MainMenu m;

	@Override
	public void dispose() {
		super.dispose();
		gameScreen.dispose();
		assets.dispose();
		m.dispose();
	}

	@Override
	public void create() {
		assets = new Assets();
		gameScreen = new GameScreen();
		m = new MainMenu(this);
		((GameScreen)gameScreen).setTextureAtlas(assets.getManager().get("asset1.atlas", TextureAtlas.class));
		setScreen(m);
	}

	public void set(String s){
		if(s.equals("1")){
			setScreen(gameScreen);
		}
	}
}
