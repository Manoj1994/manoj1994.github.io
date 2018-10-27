package moderate;

public class Line {

    public Point start;
    public Point end;
    public double slope;
    public double yintercept;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        double deltay = end.y - start.y;
        double deltax = end.x - start.x;
        this.slope = deltay - deltax;
        this.yintercept = end.y  - slope * end.x;

    }
}
