package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        int nPointsWidth = (int)(width/0.5);
        int nPointsHeight = (int)(height/0.5);

        Double botLeftX = -width/2;
        Double botLeftY = -height/2;

        Double x = botLeftX;
        Double y = botLeftY;

        for (int i = 0; i < nPointsWidth; i++) {
            for (int j = 0; j < nPointsHeight; j++) {
                Point2d newPoint = new Point2d(x, y);
                this.add(newPoint);
                y += 0.5;
            }
            x += 0.5;
            y = botLeftY;
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        BaseShape prelim = new BaseShape(coords);
        Double width = (prelim.getMaxX()-prelim.getMinX() > 0 ? prelim.getMaxX() : prelim.getMinX());
        Double height = (prelim.getMaxY() -prelim.getMinY() > 0 ? prelim.getMaxY() : prelim.getMinY());
        new Rectangle(width, height); //?????
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return this.clone();
    }
}
