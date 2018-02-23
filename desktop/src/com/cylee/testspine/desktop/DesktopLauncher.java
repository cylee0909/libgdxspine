package com.cylee.testspine.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cylee.testspine.GdxMainGame;
import com.esotericsoftware.spine.Box2DExample;
import com.esotericsoftware.spine.MixTest;
import com.esotericsoftware.spine.SkeletonViewer;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		new LwjglApplication(new SkeletonViewer(), config);
		new LwjglApplication(new Box2DExample(), config);
	}
}
