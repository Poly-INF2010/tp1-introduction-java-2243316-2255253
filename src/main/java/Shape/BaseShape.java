package Shape;

import Interface.Transform;
import Point.Point2d;

import java.util.*;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class BaseShape extends Transform implements Cloneable {
    private final Collection<Point2d> coords;

//helper function to clone a list of points 
  public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /** TODO
     * Create a BaseShape with empty coordinates
     */
    public BaseShape() {
        this.coords = null;
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        this.coords = coords;
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        Double[] newVector = {coord.X(), coord.Y()};
        Point2d newCoord = new Point2d(newVector);
        this.coords.add(newCoord);
        return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        for (Point2d coordinate: shape.coords){
            Double[] newVector = {coordinate.X(), coordinate.Y()};
            Point2d newCoord = new Point2d(newVector);
            this.coords.add(newCoord);
        }
        return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        for (Point2d coordinate: coords){
            Double[] newVector = {coordinate.X(), coordinate.Y()};
            Point2d newCoord = new Point2d(newVector);
            this.coords.add(newCoord);
        }
        return this;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        this.coords.remove(coord);
        return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        for (Point2d coordinate: shape.coords){
            this.coords.remove(coordinate);
        }
        return this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
            for (Point2d coordinate: coords){
            this.coords.remove(coordinate);
        }
        return this;
    }

    /** TODO
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {
        this.coords.clear();
        this.addAll(newCoords);
        return this;
    }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {
        return this.coords;
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        return null;
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {
        Double maxX = 0.0;
        if (this.coords.isEmpty()){
            return null;
        }
        for (Point2d coordinate: this.coords){
            if (coordinate.X() > maxX){
                maxX = coordinate.X();
            }
        }
        return maxX;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {
        Double maxY = 0.0;
        if (this.coords.isEmpty()){
            return null;
        }
        for (Point2d coordinate: this.coords){
            if (coordinate.Y() > maxY){
                maxY = coordinate.Y();
            }
        }
        return maxY;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        Double maxX = this.getMaxX();
        Double maxY = this.getMaxY();
        Double maxCoord = ((maxX >= maxY) ? maxX : maxY);
        for (Point2d coordinate: this.coords){
            if (coordinate.X() == maxCoord || coordinate.Y() == maxCoord){
                return coordinate;
            }
        }
        return null;
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {
        return null;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {
        return null;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        return null;
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {
        return null;
    }
}
