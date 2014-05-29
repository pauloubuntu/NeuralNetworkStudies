package com.github.pauloubuntu.neuralnetworkstudies.autonomouscar1.component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Project: autonomouscar1
 * User: paulomiguelalmeida
 * Date: 5/22/14
 * Time: 11:25 PM
 */
public class RoadPieceComponent extends AbstractRotateImagePanel {

    public RoadPieceComponent(int angle) throws IOException {
        super(ImageIO.read(RoadPieceComponent.class.getResourceAsStream("/road_texture.jpg")),angle, true);
        setOpaque(false);

//        Graphics2D graphics2D = drawImage.createGraphics();
//        graphics2D.setColor(Color.WHITE);
//        graphics2D.drawLine(0,0,0,this.getHeight());

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
