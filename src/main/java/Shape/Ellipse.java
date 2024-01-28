package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        int nPointsWidth = (int) (widthDiameter / 0.5);
        int nPointsHeight = (int) (heightDiameter / 0.5);

        Double botLeftX = -widthDiameter / 2;
        Double botLeftY = -heightDiameter / 2;

        Double x = botLeftX;
        Double y = botLeftY;

        for (int i = 0; i < nPointsWidth; i++) {
            for (int j = 0; j < nPointsHeight; j++) {
                Point2d newPoint = new Point2d(x, y);
                Double adjustedX = x / (widthDiameter / 2);
                Double adjustedY = y / (heightDiameter / 2);

                if ((Math.pow(adjustedX, 2) + Math.pow(adjustedY, 2)) <= 1) {
                    this.add(newPoint);
                }
                y += 0.5;
            }
            x += 0.5;
            y = botLeftY;
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        BaseShape prelim = new BaseShape(coords);
        Double width = (prelim.getMaxX() - prelim.getMinX() > 0 ? prelim.getMaxX() : prelim.getMinX());
        Double height = (prelim.getMaxY() - prelim.getMinY() > 0 ? prelim.getMaxY() : prelim.getMinY());
        new Ellipse(width, height); //?????
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return this.clone();
    }
}
