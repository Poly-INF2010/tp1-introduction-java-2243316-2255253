package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        // diagonal length = sqrt(h^2 + (w/2)^2)
        Double diagonalLen = Math.sqrt(Math.pow(maxHeight, 2)+Math.pow(halfMaxWidth, 2));

        Rectangle leftDiagonal = new Rectangle(diagonalLen, stripeThickness);
        leftDiagonal.rotate(leftDiagonal.getCoords(), 2*Math.PI - Math.atan(maxHeight/halfMaxWidth));

        Rectangle rightDiagonal = new Rectangle(diagonalLen, stripeThickness);
        rightDiagonal.rotate(rightDiagonal.getCoords(), Math.atan(maxHeight/halfMaxWidth));
        rightDiagonal.translate(rightDiagonal.getCoords(), new Point2d(halfMaxWidth, 0.0));

        Rectangle horizontal = new Rectangle(halfMaxWidth, stripeThickness);
        horizontal.translate(horizontal.getCoords(), new Point2d(halfMaxWidth/2,0.0));

        BaseShape A = new BaseShape();
        A.add(leftDiagonal);
        A.add(rightDiagonal);
        A.add(horizontal);

        return A;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle vertical = new Rectangle(stripeThickness, maxHeight);

        Ellipse upperEllipse = new Ellipse(maxWidth, halfMaxHeight);
        upperEllipse.translate(upperEllipse.getCoords(), new Point2d(halfMaxWidth, 3/4 * maxHeight));

        Ellipse lowerEllipse = new Ellipse(maxWidth, halfMaxHeight);
        lowerEllipse.translate(lowerEllipse.getCoords(), new Point2d(halfMaxWidth, 1/4 * maxHeight));

        BaseShape B = new BaseShape();
        B.add(vertical);
        B.add(upperEllipse);
        B.add(lowerEllipse);

        return B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);

        BaseShape C = new BaseShape();
        C.add(ellipse);
        return C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle vertical = new Rectangle(stripeThickness, maxHeight);
        vertical.translate(vertical.getCoords(), new Point2d(0.0, halfMaxHeight));

        Rectangle upperHorizontal = new Rectangle(maxWidth, stripeThickness);
        upperHorizontal.translate(upperHorizontal.getCoords(), new Point2d(halfMaxWidth, maxHeight));

        Rectangle middleHorizontal = new Rectangle(maxWidth, stripeThickness);
        middleHorizontal.translate(middleHorizontal.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight));

        Rectangle lowerHorizontal = new Rectangle(maxWidth, stripeThickness);
        lowerHorizontal.translate(lowerHorizontal.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape E = new BaseShape();
        E.add(vertical);
        E.add(upperHorizontal);
        E.add(middleHorizontal);
        E.add(lowerHorizontal);

        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle leftVertical = new Rectangle(stripeThickness, maxHeight);

        Rectangle rightVertical = new Rectangle(stripeThickness, maxHeight);
        rightVertical.translate(rightVertical.getCoords(), new Point2d(maxWidth, 0.0));

        Rectangle horizontal = new Rectangle(maxWidth, stripeThickness);
        horizontal.translate(horizontal.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape H = new BaseShape();
        H.add(leftVertical);
        H.add(rightVertical);
        H.add(horizontal);

        return H;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle leftVertical = new Rectangle(stripeThickness, maxHeight);

        Rectangle rightVertical = new Rectangle(stripeThickness, maxHeight);
        rightVertical.translate(rightVertical.getCoords(), new Point2d(maxWidth, 0.0));

        Double diagonalLen = Math.sqrt(Math.pow(maxHeight, 2) + Math.pow(maxWidth, 2));
        Rectangle diagonal = new Rectangle(diagonalLen, stripeThickness);
        diagonal.rotate(diagonal.getCoords(), Math.atan(maxHeight/maxWidth));
        diagonal.translate(diagonal.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape N = new BaseShape();
        N.add(leftVertical);
        N.add(rightVertical);
        N.add(diagonal);

        return N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);

        BaseShape O = new BaseShape();
        O.add(ellipse);
        return O;
    }

}
