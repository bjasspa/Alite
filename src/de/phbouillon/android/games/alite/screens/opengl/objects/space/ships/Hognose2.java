package de.phbouillon.android.games.alite.screens.opengl.objects.space.ships;

/* Alite - Discover the Universe on your Favorite Android Device
 * Copyright (C) 2015 Philipp Bouillon
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful and
 * fun, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see
 * http://http://www.gnu.org/licenses/gpl-3.0.txt.
 */

/**
 * Alternative Hognose model and texture by Rolf Schuetteler. 
 */

import de.phbouillon.android.framework.impl.gl.GlUtils;
import de.phbouillon.android.framework.math.Vector3f;
import de.phbouillon.android.games.alite.Alite;
import de.phbouillon.android.games.alite.Settings;
import de.phbouillon.android.games.alite.model.statistics.ShipType;
import de.phbouillon.android.games.alite.screens.opengl.ingame.EngineExhaust;
import de.phbouillon.android.games.alite.screens.opengl.ingame.ObjectType;
import de.phbouillon.android.games.alite.screens.opengl.objects.space.SpaceObject;

public class Hognose2 extends SpaceObject {
	private static final long serialVersionUID = -3727674529032481594L;

	public static final Vector3f HUD_COLOR = new Vector3f(0.55f, 0.67f, 0.94f);

    private static final float [] VERTEX_DATA = new float [] {
        -35.00f, -20.20f, -97.94f,  35.02f, -20.20f, -97.94f, 
          7.11f,  16.49f, -97.94f,  -7.10f,  16.49f, -97.94f, 
         27.98f, -24.26f, -87.10f, -27.96f, -24.26f, -87.10f, 
         -5.67f,   5.05f, -87.10f,   5.69f,   5.05f, -87.10f, 
        -27.96f, -24.26f, 115.37f,  27.98f, -24.26f, 115.37f, 
          5.69f,   5.05f, 148.72f,  -5.67f,   5.05f, 148.72f, 
         25.97f, -25.42f, 249.84f, -25.95f, -25.42f, 249.84f, 
          0.01f,   1.79f, 249.84f,   0.01f, -80.83f, -97.94f, 
        -52.77f, -62.79f, -97.94f, -45.77f, -74.93f, -97.94f, 
          0.01f, -72.71f, -87.10f, -36.57f, -67.99f, -87.10f, 
        -42.16f, -58.30f, -87.10f,   0.01f, -72.71f, 115.37f, 
        -42.16f, -58.30f, 148.72f, -36.57f, -67.99f, 148.72f, 
        -36.54f, -57.66f, 249.84f,   0.01f, -70.39f, 249.84f, 
         45.72f, -75.03f, -97.94f,  52.85f, -62.69f, -97.94f, 
         42.23f, -58.21f, -87.10f,  36.54f, -68.07f, -87.10f, 
         36.54f, -68.07f, 148.72f,  42.23f, -58.21f, 148.72f, 
         36.55f, -57.66f, 249.84f,  10.24f,  65.10f, 158.19f, 
        -10.22f,  65.10f, 158.19f,  86.25f, -102.05f, 158.17f, 
         96.51f, -84.29f, 158.17f, -96.41f, -84.43f, 158.16f, 
        -86.33f, -101.89f, 158.16f, 140.00f, -121.24f, -292.72f, 
        140.00f, -121.24f, -46.21f,   0.01f, 121.24f, -292.72f, 
          0.01f, 121.24f, -46.00f, -140.00f, -121.21f, -292.72f, 
        -140.00f, -121.21f, -46.00f,  12.75f, -47.77f, 292.72f, 
          0.01f, -59.64f, 292.72f, -12.74f, -47.77f, 292.72f, 
          0.01f, -25.69f, 292.72f
    };

    private static final float [] NORMAL_DATA = new float [] {
          0.00000f,   0.00000f,   1.00000f,   0.00000f,   0.00000f,   1.00000f, 
         -0.63875f,  -0.48579f,  -0.59667f,   0.00000f,   0.00000f,  -1.00000f, 
          0.00000f,   0.00000f,  -1.00000f,   0.63874f,  -0.48579f,  -0.59667f, 
          0.63875f,  -0.48579f,  -0.59667f,   0.00000f,  -0.75106f,   0.66024f, 
          0.00000f,  -0.75106f,   0.66024f,  -0.80514f,  -0.59283f,  -0.01715f, 
          0.72206f,  -0.68898f,  -0.06279f,   0.00000f,   0.00000f,   1.00000f, 
          0.00000f,   0.00000f,   1.00000f,   0.74068f,  -0.30899f,  -0.59659f, 
          0.00000f,  -0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -1.00000f, 
          0.10271f,   0.79595f,  -0.59658f,   0.10272f,   0.79595f,  -0.59659f, 
          0.65045f,   0.37554f,   0.66022f,   0.65046f,   0.37535f,   0.66032f, 
          0.90442f,  -0.42398f,  -0.04765f,   0.32889f,   0.94423f,  -0.01629f, 
          0.00000f,   0.00000f,   1.00000f,   0.00000f,  -0.00000f,   1.00000f, 
         -0.10107f,   0.79609f,  -0.59668f,   0.00000f,   0.00000f,  -1.00000f, 
          0.00000f,   0.00000f,  -1.00000f,  -0.73996f,  -0.31053f,  -0.59668f, 
         -0.73996f,  -0.31052f,  -0.59669f,  -0.65044f,   0.37553f,   0.66023f, 
         -0.65039f,   0.37557f,   0.66026f,  -0.03276f,   0.99421f,  -0.10237f, 
         -0.94999f,  -0.31184f,  -0.01689f,  -0.99506f,   0.08383f,  -0.05315f, 
          0.00004f,  -0.82276f,  -0.56839f,   0.99506f,   0.08381f,  -0.05316f, 
          0.57307f,   0.81518f,  -0.08404f,  -0.70549f,   0.40750f,  -0.57986f, 
         -0.43015f,  -0.90255f,  -0.01920f,   0.43134f,  -0.90200f,  -0.01832f, 
          0.70567f,   0.40727f,  -0.57979f,  -0.57186f,   0.81612f,  -0.08319f, 
         -0.39692f,  -0.91780f,  -0.00971f,   0.86599f,  -0.50007f,   0.00000f, 
          0.86599f,  -0.50007f,   0.00000f,   0.56423f,   0.82562f,   0.00000f, 
          0.99334f,   0.11485f,  -0.00968f,  -0.99714f,   0.07560f,   0.00000f, 
          0.00000f,   1.00000f,   0.00000f,   0.00000f,   1.00000f,   0.00000f, 
         -0.86613f,  -0.49982f,  -0.00000f,  -0.86614f,  -0.49981f,  -0.00000f, 
         -0.59481f,   0.80381f,  -0.00956f,   0.43401f,  -0.90091f,   0.00000f, 
          0.76269f,  -0.44042f,   0.47365f,   0.47074f,   0.88207f,   0.01856f, 
         -0.83503f,   0.48224f,  -0.26488f,  -0.52865f,  -0.84864f,   0.01857f, 
         -0.64759f,  -0.76199f,   0.00000f,  -0.00000f,   0.88071f,   0.47365f, 
         -0.99927f,  -0.03334f,   0.01852f,   0.00002f,  -0.96422f,  -0.26511f, 
          0.99927f,  -0.03334f,   0.01852f,   0.98381f,  -0.17924f,   0.00000f, 
         -0.76282f,  -0.44019f,   0.47365f,   0.52794f,  -0.84909f,   0.01823f, 
          0.83512f,   0.48194f,  -0.26515f,  -0.47100f,   0.88194f,   0.01828f, 
         -0.33870f,   0.94090f,   0.00000f,   0.00000f,  -1.00000f,   0.00000f, 
         -0.00000f,  -1.00000f,   0.00000f,   0.86602f,   0.50000f,   0.00000f, 
          0.86602f,   0.50000f,   0.00000f,  -0.86602f,   0.50000f,   0.00000f, 
         -0.86602f,   0.50000f,   0.00000f,  -0.00000f,   0.00000f,  -1.00000f, 
          0.00000f,   0.00000f,  -1.00000f,  -0.66163f,  -0.63131f,  -0.40458f, 
         -0.86469f,  -0.28384f,  -0.41443f,  -0.30537f,   0.87670f,  -0.37169f, 
          0.30537f,   0.87670f,  -0.37169f,   0.67044f,   0.71971f,  -0.18037f, 
          0.86469f,  -0.28383f,  -0.41443f,   0.76599f,  -0.44225f,  -0.46656f, 
          0.66163f,  -0.63132f,  -0.40458f,  -0.76599f,  -0.44224f,  -0.46656f, 
         -0.72206f,  -0.68897f,  -0.06279f,  -0.90319f,  -0.42652f,  -0.04836f, 
          0.80514f,  -0.59283f,  -0.01715f,   0.94999f,  -0.31183f,  -0.01689f, 
          0.03570f,   0.99419f,  -0.10157f,  -0.32889f,   0.94423f,  -0.01629f, 
         -0.00000f,   0.00000f,   1.00000f,  -0.99333f,   0.11486f,  -0.00968f, 
         -0.43295f,  -0.90142f,   0.00000f,   0.99714f,   0.07559f,   0.00000f, 
          0.39868f,  -0.91704f,  -0.00953f,  -0.56308f,   0.82640f,  -0.00000f, 
          0.59638f,   0.80264f,  -0.00970f,   0.64493f,  -0.76424f,  -0.00000f, 
         -0.98380f,  -0.17926f,   0.00000f,   0.33633f,   0.94175f,   0.00000f, 
         -0.67044f,   0.71970f,  -0.18037f,  -0.10107f,   0.79609f,  -0.59668f, 
          0.74068f,  -0.30899f,  -0.59658f,  -0.63874f,  -0.48579f,  -0.59668f
    };

    private static final float [] TEXTURE_COORDINATE_DATA = new float [] {
          0.21f,   0.83f,   0.05f,   0.83f,   0.12f,   0.74f, 
          0.12f,   0.74f,   0.15f,   0.74f,   0.21f,   0.83f, 
          0.81f,   0.08f,   0.82f,   0.09f,   0.86f,   0.01f, 
          0.82f,   0.09f,   0.92f,   0.09f,   0.88f,   0.03f, 
          0.88f,   0.03f,   0.86f,   0.03f,   0.82f,   0.09f, 
          0.92f,   0.09f,   0.93f,   0.08f,   0.88f,   0.01f, 
          0.88f,   0.01f,   0.88f,   0.03f,   0.92f,   0.09f, 
          0.45f,   0.61f,   0.45f,   0.72f,   0.34f,   0.68f, 
          0.34f,   0.68f,   0.34f,   0.65f,   0.45f,   0.61f, 
          0.33f,   0.33f,   0.10f,   0.33f,   0.28f,   0.25f, 
          0.10f,   0.33f,   0.28f,   0.25f,   0.11f,   0.25f, 
          0.13f,   0.99f,   0.21f,   0.83f,   0.26f,   0.94f, 
          0.26f,   0.94f,   0.24f,   0.97f,   0.13f,   0.99f, 
          0.93f,   0.08f,   0.92f,   0.09f,   0.96f,   0.16f, 
          0.92f,   0.09f,   0.87f,   0.18f,   0.94f,   0.17f, 
          0.94f,   0.17f,   0.95f,   0.15f,   0.92f,   0.09f, 
          0.87f,   0.18f,   0.87f,   0.19f,   0.95f,   0.18f, 
          0.95f,   0.18f,   0.94f,   0.17f,   0.87f,   0.18f, 
          0.45f,   0.61f,   0.45f,   0.72f,   0.34f,   0.68f, 
          0.34f,   0.68f,   0.34f,   0.65f,   0.45f,   0.61f, 
          0.33f,   0.33f,   0.09f,   0.40f,   0.26f,   0.40f, 
          0.09f,   0.66f,   0.32f,   0.66f,   0.08f,   0.60f, 
          0.05f,   0.83f,   0.13f,   0.99f,   0.03f,   0.97f, 
          0.03f,   0.97f,   0.01f,   0.94f,   0.05f,   0.83f, 
          0.87f,   0.19f,   0.87f,   0.18f,   0.79f,   0.18f, 
          0.87f,   0.18f,   0.82f,   0.09f,   0.80f,   0.15f, 
          0.80f,   0.15f,   0.81f,   0.17f,   0.87f,   0.18f, 
          0.82f,   0.09f,   0.81f,   0.08f,   0.78f,   0.16f, 
          0.78f,   0.16f,   0.80f,   0.15f,   0.82f,   0.09f, 
          0.45f,   0.61f,   0.45f,   0.72f,   0.34f,   0.68f, 
          0.34f,   0.68f,   0.34f,   0.65f,   0.45f,   0.61f, 
          0.32f,   0.66f,   0.08f,   0.73f,   0.26f,   0.73f, 
          0.10f,   0.33f,   0.33f,   0.33f,   0.09f,   0.40f, 
          0.18f,   0.58f,   0.00f,   0.58f,   0.18f,   0.44f, 
          0.97f,   0.97f,   0.99f,   0.76f,   0.94f,   0.76f, 
          0.00f,   0.06f,   0.18f,   0.06f,   0.18f,   0.20f, 
          0.18f,   0.58f,   0.00f,   0.58f,   0.18f,   0.44f, 
          0.97f,   0.97f,   0.99f,   0.76f,   0.94f,   0.76f, 
          0.00f,   0.06f,   0.18f,   0.06f,   0.18f,   0.20f, 
          0.18f,   0.58f,   0.00f,   0.58f,   0.18f,   0.44f, 
          0.97f,   0.97f,   0.99f,   0.76f,   0.94f,   0.76f, 
          0.00f,   0.06f,   0.18f,   0.06f,   0.18f,   0.20f, 
          0.18f,   0.20f,   0.61f,   0.06f,   0.64f,   0.10f, 
          0.18f,   0.01f,   0.61f,   0.01f,   0.61f,   0.06f, 
          0.61f,   0.06f,   0.18f,   0.06f,   0.18f,   0.01f, 
          0.18f,   0.58f,   0.18f,   0.44f,   0.61f,   0.58f, 
          0.18f,   0.20f,   0.61f,   0.06f,   0.64f,   0.10f, 
          0.18f,   0.58f,   0.18f,   0.44f,   0.61f,   0.58f, 
          0.61f,   0.06f,   0.18f,   0.06f,   0.18f,   0.01f, 
          0.18f,   0.01f,   0.61f,   0.01f,   0.61f,   0.06f, 
          0.61f,   0.06f,   0.18f,   0.06f,   0.18f,   0.01f, 
          0.18f,   0.01f,   0.61f,   0.01f,   0.61f,   0.06f, 
          0.18f,   0.20f,   0.61f,   0.06f,   0.64f,   0.10f, 
          0.18f,   0.58f,   0.18f,   0.44f,   0.61f,   0.58f, 
          0.97f,   0.29f,   0.99f,   0.29f,   0.98f,   0.12f, 
          0.64f,   0.54f,   0.18f,   0.44f,   0.99f,   0.32f, 
          0.94f,   0.76f,   0.99f,   0.76f,   0.97f,   0.37f, 
          0.18f,   0.20f,   0.64f,   0.10f,   0.99f,   0.32f, 
          0.99f,   0.32f,   0.54f,   0.32f,   0.18f,   0.20f, 
          0.97f,   0.29f,   0.99f,   0.29f,   0.98f,   0.12f, 
          0.64f,   0.54f,   0.18f,   0.44f,   0.99f,   0.32f, 
          0.94f,   0.76f,   0.99f,   0.76f,   0.97f,   0.37f, 
          0.18f,   0.20f,   0.64f,   0.10f,   0.99f,   0.32f, 
          0.99f,   0.32f,   0.54f,   0.32f,   0.18f,   0.20f, 
          0.97f,   0.29f,   0.99f,   0.29f,   0.98f,   0.12f, 
          0.64f,   0.54f,   0.18f,   0.44f,   0.99f,   0.32f, 
          0.94f,   0.76f,   0.99f,   0.76f,   0.97f,   0.37f, 
          0.18f,   0.20f,   0.64f,   0.10f,   0.99f,   0.32f, 
          0.99f,   0.32f,   0.54f,   0.32f,   0.18f,   0.20f, 
          0.92f,   0.61f,   0.92f,   0.72f,   0.45f,   0.72f, 
          0.45f,   0.72f,   0.45f,   0.61f,   0.92f,   0.61f, 
          0.92f,   0.61f,   0.92f,   0.72f,   0.45f,   0.72f, 
          0.45f,   0.72f,   0.45f,   0.61f,   0.92f,   0.61f, 
          0.92f,   0.72f,   0.92f,   0.61f,   0.45f,   0.61f, 
          0.45f,   0.61f,   0.45f,   0.72f,   0.92f,   0.72f, 
          0.01f,   0.47f,   0.04f,   0.50f,   0.07f,   0.47f, 
          0.07f,   0.47f,   0.04f,   0.42f,   0.01f,   0.47f, 
          0.11f,   0.25f,   0.10f,   0.33f,   0.02f,   0.30f, 
          0.10f,   0.33f,   0.09f,   0.40f,   0.02f,   0.36f, 
          0.08f,   0.73f,   0.09f,   0.66f,   0.01f,   0.69f, 
          0.09f,   0.66f,   0.08f,   0.60f,   0.01f,   0.64f, 
          0.01f,   0.64f,   0.01f,   0.66f,   0.09f,   0.66f, 
          0.09f,   0.40f,   0.10f,   0.33f,   0.02f,   0.36f, 
          0.10f,   0.33f,   0.02f,   0.30f,   0.02f,   0.36f, 
          0.10f,   0.33f,   0.11f,   0.25f,   0.02f,   0.30f, 
          0.10f,   0.33f,   0.02f,   0.36f,   0.02f,   0.30f, 
          0.10f,   0.33f,   0.11f,   0.25f,   0.28f,   0.25f, 
          0.33f,   0.33f,   0.26f,   0.40f,   0.09f,   0.40f, 
          0.10f,   0.33f,   0.33f,   0.33f,   0.28f,   0.25f, 
          0.33f,   0.33f,   0.10f,   0.33f,   0.09f,   0.40f, 
          0.32f,   0.66f,   0.26f,   0.60f,   0.08f,   0.60f, 
          0.32f,   0.66f,   0.09f,   0.66f,   0.08f,   0.73f, 
          0.21f,   0.83f,   0.13f,   0.99f,   0.05f,   0.83f, 
          0.18f,   0.44f,   0.64f,   0.54f,   0.61f,   0.58f, 
          0.18f,   0.20f,   0.18f,   0.06f,   0.61f,   0.06f, 
          0.18f,   0.20f,   0.18f,   0.06f,   0.61f,   0.06f, 
          0.18f,   0.44f,   0.64f,   0.54f,   0.61f,   0.58f, 
          0.18f,   0.20f,   0.18f,   0.06f,   0.61f,   0.06f, 
          0.18f,   0.44f,   0.64f,   0.54f,   0.61f,   0.58f, 
          0.18f,   0.44f,   0.54f,   0.32f,   0.99f,   0.32f, 
          0.18f,   0.44f,   0.54f,   0.32f,   0.99f,   0.32f, 
          0.18f,   0.44f,   0.54f,   0.32f,   0.99f,   0.32f, 
          0.09f,   0.66f,   0.01f,   0.66f,   0.01f,   0.69f, 
          0.87f,   0.18f,   0.81f,   0.17f,   0.79f,   0.18f, 
          0.92f,   0.09f,   0.95f,   0.15f,   0.96f,   0.16f, 
          0.82f,   0.09f,   0.86f,   0.03f,   0.86f,   0.01f
    };

    public Hognose2(Alite alite) {
        super(alite, "Hognose", ObjectType.EnemyShip);
        shipType = ShipType.Hognose;
        boundingBox = new float [] {-140.00f, 140.00f, -121.24f, 121.24f, -292.72f, 292.72f};
        numberOfVertices = 318;
        textureFilename = "textures/hognose2.png";
        maxSpeed          = 367.4f;
        maxPitchSpeed     = 1.500f;
        maxRollSpeed      = 2.750f;
        hullStrength      = 120.0f;
        hasEcm            = false;
        cargoType         = 5;
        aggressionLevel   = 10;
        escapeCapsuleCaps = 0;
        bounty            = 80;
        score             = 120;
        legalityType      = 1;
        maxCargoCanisters = 3;
        laserHardpoints.add(VERTEX_DATA[144]);
        laserHardpoints.add(VERTEX_DATA[145]);
        laserHardpoints.add(VERTEX_DATA[146]);
        init();
    }

    @Override
    protected void init() {
        vertexBuffer = createFaces(VERTEX_DATA, NORMAL_DATA,
                0,   1,   2,   2,   3,   0,   1,   4,   2,   4,   5,   6,   6,   7,   4, 
                5,   0,   3,   3,   6,   5,   8,   9,  10,  10,  11,   8,   9,  12,  10, 
               13,  11,  14,  15,   0,  16,  16,  17,  15,   0,   5,  16,   5,  18,  19, 
               19,  20,   5,  18,  15,  17,  17,  19,  18,  21,   8,  22,  22,  23,  21, 
                8,  24,  22,  25,  21,  24,   1,  15,  26,  26,  27,   1,  15,  18,  26, 
               18,   4,  28,  28,  29,  18,   4,   1,  27,  27,  28,   4,   9,  21,  30, 
               30,  31,   9,  21,  32,  30,  12,   9,  32,  10,  14,  33,  14,  34,  33, 
               14,  11,  34,  30,  32,  35,  32,  36,  35,  32,  31,  36,  22,  24,  37, 
               24,  38,  37,  24,  23,  38,  36,  28,  27,  30,  29,  28,  28,  31,  30, 
               30,  35,  29,  34,   6,   3,  10,  33,   7,  10,   7,   6,   6,  11,  10, 
               22,  20,  19,  19,  23,  22,  38,  19,  17,  22,  37,  20,  27,  26,  39, 
               26,  35,  39,  35,  36,  40,  36,  27,  39,  39,  40,  36,   3,   2,  41, 
                2,  33,  41,  33,  34,  42,  34,   3,  41,  41,  42,  34,  17,  16,  43, 
               16,  37,  43,  37,  38,  44,  38,  17,  43,  43,  44,  38,   5,   4,   9, 
                9,   8,   5,  18,   5,   8,   8,  21,  18,   4,  18,  21,  21,   9,   4, 
               45,  46,  47,  47,  48,  45,  14,  12,  48,  12,  32,  45,  32,  25,  45, 
               25,  24,  47,  47,  46,  25,  24,  13,  47,  13,  48,  47,  13,  14,  48, 
               12,  45,  48,  12,  14,  10,   9,  31,  32,  13,   8,  11,   8,  13,  24, 
               21,  23,  24,  21,  25,  32,   0,  15,   1,  33,   2,   7,  36,  31,  28, 
               34,  11,   6,  37,  16,  20,  38,  23,  19,  35,  26,  29,  37,  44,  43, 
               33,  42,  41,  35,  40,  39,  25,  46,  45,  18,  29,  26,   5,  20,  16, 
                4,   7,   2);
        texCoordBuffer = GlUtils.toFloatBufferPositionZero(TEXTURE_COORDINATE_DATA);
        alite.getTextureManager().addTexture(textureFilename);    
        if (Settings.engineExhaust) {
        	addExhaust(new EngineExhaust(this, 18, 15, 360, 0, -45, -195, 0.7f, 0.75f, 0.8f, 0.7f));
        }
        initTargetBox();
    }

    @Override
    public boolean isVisibleOnHud() {
        return true;
    }

    @Override
    public Vector3f getHudColor() {
        return HUD_COLOR;
    }

    @Override
    public float getDistanceFromCenterToBorder(Vector3f dir) {
        return 50.0f;
    }
}
