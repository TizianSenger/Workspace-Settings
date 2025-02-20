package com.airbus.ds.mss.core.common.gisluciad.symbols.util;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.luciad.gui.ILcdIcon;
import com.luciad.util.ELcdHorizontalAlignment;

/**
 * Multi-line text icon. See the setLines method to change the text.
 * The resized method is called if the icon size changes.
 */
public class DogHouseIcon implements ILcdIcon {

    private List<String> fLines = new ArrayList<>();

    private Color fColor = new Color(255, 255, 255, 0);

    private int fWidth;

    private int fHeight;

    private int fTextWidth;

    private int fWidthIncrement = 20;

    private ELcdHorizontalAlignment fAlignment = ELcdHorizontalAlignment.CENTER;

    private final BufferedImage fImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);

    private double dogHouseTransparency = 0.5;

    private int dogHouseBorderWidth = 5;

    private Font dogHouseFont = new Font("dialog", Font.PLAIN, 13);

    private Color backC = new Color(255, 255, 255, 230); // Hintergrundfarbe

    private Color borderC = new Color(0, 0, 0, 255); // Randfarbe & Linien

    private Color textC = new Color(0, 0, 0, 255); // Textfarbe

    private int squareWidth = 700;

    private int squareHeight = 1400;

    private int padding = 10;

    private boolean defaultFlag = true; // Standardmäßig true

    public DogHouseIcon() {
    }

    public DogHouseIcon(String[] attributes, Color[] colors, double trans, int widthB,
            Font textF, boolean defaultFlag) {
        for (String attribute : attributes) {
            fLines.add(attribute);
        }
        this.backC = colors[0];
        this.borderC = colors[1];
        this.textC = colors[2];
        this.dogHouseTransparency = trans / 100;
        this.dogHouseBorderWidth = widthB;
        this.dogHouseFont = textF;
        this.defaultFlag = defaultFlag;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3 * (float) dogHouseBorderWidth));

        // Transparenz setzen
        Composite originalComposite = g2d.getComposite();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) dogHouseTransparency));

        List<String> validLines = new ArrayList<>();
        for (String line : fLines) {
            if (!line.isEmpty()) {
                validLines.add(line);
            }
        }

        int rectY = y + squareHeight / 3;

        // Hintergrund zeichnen
        g2d.setColor(backC);
        g2d.fillRect(x + padding, rectY, squareWidth, squareHeight);

        // Fünfeck (Dach) zeichnen
        Polygon pentagon = new Polygon();
        pentagon.addPoint(x + padding + squareWidth / 2, y);
        pentagon.addPoint(x + padding, y + 200);
        pentagon.addPoint(x + padding, rectY);
        pentagon.addPoint(x + padding + squareWidth, rectY);
        pentagon.addPoint(x + padding + squareWidth, y + 200);

        g2d.fillPolygon(pentagon);

        // Rand zeichnen
        g2d.setColor(borderC);
        g2d.setComposite(originalComposite);
        g2d.drawRect(x + padding, rectY, squareWidth, squareHeight);
        g2d.drawPolygon(pentagon);

        // Falls defaultFlag false ist, zeichne einen zusätzlichen äußeren Rahmen
        if (!defaultFlag) {
            g2d.setStroke(new BasicStroke(5 * (float) dogHouseBorderWidth)); // Dickeren Rahmen setzen
            g2d.setColor(Color.RED); // Farblich hervorheben

            // Äußeres Fünfeck zeichnen
            Polygon outerPentagon = new Polygon();
            int offset = 10; // Abstand zum inneren Rahmen
            outerPentagon.addPoint(x + padding + squareWidth / 2, y - offset);
            outerPentagon.addPoint(x + padding - offset, y + 200 - offset);
            outerPentagon.addPoint(x + padding - offset, rectY - offset);
            outerPentagon.addPoint(x + padding + squareWidth + offset, rectY - offset);
            outerPentagon.addPoint(x + padding + squareWidth + offset, y + 200 - offset);

            g2d.drawPolygon(outerPentagon);

            // Äußeres Rechteck zeichnen
            g2d.drawRect(x + padding - offset, rectY - offset, squareWidth + 2 * offset, squareHeight + 2 * offset);
        }

        // Text zeichnen
        g2d.setFont(dogHouseFont);
        g2d.setColor(textC);
        FontMetrics fm = g2d.getFontMetrics();

        if (!validLines.isEmpty()) {
            drawWrappedText(g2d, validLines.get(0), pentagon.getBounds(), fm);
        }

        int visibleFieldCount = validLines.size() - 1;
        if (visibleFieldCount > 0) {
            int fieldHeight = squareHeight / visibleFieldCount;

            for (int i = 1; i <= visibleFieldCount; i++) {
                int fieldY = rectY + (i - 1) * fieldHeight;
                Rectangle fieldBounds = new Rectangle(x + padding, fieldY, squareWidth, fieldHeight);
                drawWrappedText(g2d, validLines.get(i), fieldBounds, fm);
            }

            g2d.setStroke(new BasicStroke(3 * (float) dogHouseBorderWidth));
            for (int i = 1; i < visibleFieldCount; i++) {
                int lineY = rectY + i * fieldHeight;
                g2d.setColor(borderC);
                g2d.drawLine(x + padding, lineY, x + padding + squareWidth, lineY);
            }
        }
    }

    private void drawWrappedText(Graphics2D g2d, String text, Rectangle bounds, FontMetrics fm) {
        int lineHeight = fm.getHeight();
        int availableWidth = bounds.width;

        String[] words = text.split(" ");
        StringBuilder currentLine = new StringBuilder();
        List<String> lines = new ArrayList<>();

        for (String word : words) {
            if (fm.stringWidth(currentLine + word) < availableWidth) {
                currentLine.append(word).append(" ");
            } else {
                lines.add(currentLine.toString().trim());
                currentLine = new StringBuilder(word).append(" ");
            }
        }
        lines.add(currentLine.toString().trim());

        int totalTextHeight = lines.size() * lineHeight;
        int startY = bounds.y + (bounds.height - totalTextHeight) / 2 + fm.getAscent();

        for (String line : lines) {
            int x = bounds.x + (bounds.width - fm.stringWidth(line)) / 2;
            g2d.drawString(line, x, startY);
            startY += lineHeight;
        }
    }

    public boolean isDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(boolean defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    @Override
    public int getIconWidth() {
        return squareWidth + 2 * padding;
    }

    @Override
    public int getIconHeight() {
        return squareHeight + 2 * padding;
    }
}