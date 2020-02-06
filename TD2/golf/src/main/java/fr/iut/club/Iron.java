package fr.iut.club;

import fr.iut.Ball;
import fr.iut.PutterExperimental;

import java.awt.geom.Point2D;

public class Iron implements PutterExperimental {

    /**
     * inner constant used to compute new position after shoot
     */
    private final static int DISTANCE_MAX = 200;

    public void shoot(double force, double direction, Ball ball) {
        double x = ball.getPosition().getX();
        double y = ball.getPosition().getY();
        x += (force * DISTANCE_MAX) * Math.sin(direction);
        y += (force * DISTANCE_MAX) * Math.cos(direction);
        ball.setPosition(new Point2D.Double(x, y));
    }
}
