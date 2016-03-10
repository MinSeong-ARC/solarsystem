package com.cardbookvr.solarsystem;

import com.cardbookvr.renderbox.Transform;
import com.cardbookvr.solarsystem.RenderBoxExt.components.Sphere;

/**
 * Earth class
 * Created by Schoen and Jonathan on 3/10/2016.
 */
public class Earth extends Planet {

    public Earth(float distance, float radius, float rotation, float orbit, int texId, int nightTexId, Transform origin) {
        super(distance, radius, rotation, orbit, origin);
        transform.addComponent(new Sphere(texId, nightTexId));
    }

}
