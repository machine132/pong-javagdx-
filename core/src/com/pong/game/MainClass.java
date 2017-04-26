package com.pong.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.badlogic.gdx.Input.Keys.*;

public class MainClass extends ApplicationAdapter {
	SpriteBatch batch;
	//define las texturas prontas as er imagen
	Texture img;
	Texture imgbarra;
	Texture imgpelota;
	Texture imgbarra2;
	// se define posicion como float
	float posicion1y;
	float posicion2y;
	@Override
	public void create () {
		batch = new SpriteBatch();
		// llama a las imagenes
		img = new Texture("background.jpg");
		imgbarra = new Texture("barra.jpg");
		imgbarra2 = new Texture("barra.jpg");
		imgpelota = new Texture("pelota.jpg");
		// asigna posiciones en el eje y
		 posicion1y=280;
		 posicion2y=280;

	}

	@Override
	public void render () {
		batch.begin();
		//asigna la posicion del recuadro de fondo
		batch.draw(img, 0, 0);
		//posicion inicial de barra 1
		batch.draw(imgbarra, 4, posicion1y);
		//asigna la letra w
		if(Gdx.input.isKeyPressed(W)) {
			if (posicion1y < (Gdx.graphics.getWidth() + 220)) {
				posicion1y += 10f;
			}
			//limite superior
			if (posicion1y==530){
				posicion1y-=10f;
			}

		}
		//se asigna la tecla s
		if(Gdx.input.isKeyPressed(S)) {
			if (posicion1y < (Gdx.graphics.getWidth() + 220)) {
				posicion1y -= 10f;
			}
			//limite inferiror
			if (posicion1y==0){
				posicion1y+=10f;
			}

		}
		//posicion inicial de barra 2
		batch.draw(imgbarra2,786 , posicion2y);
		//asigna boton arriba
		if(Gdx.input.isKeyPressed(DPAD_UP)) {
			if (posicion2y < (Gdx.graphics.getWidth() + 220)) {
				posicion2y += 10f;
			}
			//limite superior
			if (posicion2y==530){
				posicion2y-=10f;
			}
		}
		// asigna el pad abajo
		if(Gdx.input.isKeyPressed(DPAD_DOWN)) {
			if (posicion2y < (Gdx.graphics.getWidth() + 220)) {
				posicion2y -= 10f;
			}
			//ayuda al limite inferior
			if (posicion2y==-0){
				posicion2y+=10f;
			}

		}
		//posicion pelota
		batch.draw(imgpelota, 390,320);
		batch.end();


	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
