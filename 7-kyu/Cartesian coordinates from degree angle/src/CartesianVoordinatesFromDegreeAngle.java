import java.awt.geom.Point2D;

public class CartesianVoordinatesFromDegreeAngle {
    public static Point2D coordinates(Double degrees, Double radius) {
        Point2D.Double result = new Point2D.Double();
        result.x = Double.valueOf(String.format("%.10f", radius * Math.cos(Math.toRadians(degrees))));
        result.y = Double.valueOf(String.format("%.10f", radius * Math.sin(Math.toRadians(degrees))));
        return result;
    }
}
