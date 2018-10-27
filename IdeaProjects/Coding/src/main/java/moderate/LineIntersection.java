package moderate;

public class LineIntersection {

    public void swap(Point a, Point b) {
        double x = b.x;
        double y = b.y;
        b.setLocation(a.x, a.y);
        a.setLocation(x, y);
    }

    public boolean isBetween(double start, double mid, double end) {
        if(start > end) {
            return (end <= mid) && (start >= mid);
        } else {
            return (start <= mid) && (end >= mid);
        }
    }

    public boolean isBetween(Point start, Point mid, Point end) {
        return isBetween(start.x, mid.x, end.x) && isBetween(start.y, mid.y, end.y);
    }

    public Point intersection(Point start1, Point end1, Point start2, Point end2) {

        if(start1.x > end1.x) {
            swap(start1, end1);
        }

        if(start2.x > end2.x) {
            swap(start2, end2);
        }

        if(start1.x > start2.x) {
            swap(start1, start2);
            swap(end1, end2);
        }

        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);

        if(line1.slope == line2.slope) {
            if (line1.yintercept == line2.yintercept && isBetween(start1, start2, end1)) {
                return start2;
            } else {
                return null;
            }
        }

        double x = (line2.yintercept - line1.yintercept) / (line1.slope - line2.slope);
        double y = x * line1.slope + line1.yintercept;

        Point intersection = new Point(x, y);

        if(isBetween(start1, intersection, end1) && isBetween(start2, intersection, end2)) {
            return intersection;
        } else {
            return null;
        }


    }

    public static void main(String[] args) {

        Point start1 = new Point(1,1);
        Point end1 = new Point(4, 4);
        Point start2 = new Point(1, 3);
        Point end2 = new Point(4, 1);

        LineIntersection lineIntersection = new LineIntersection();

        Point intersection = lineIntersection.intersection(start1, end1, start2, end2);

        if(intersection != null) {
            System.out.println(intersection.x+" "+intersection.y);
        } else {
            System.out.println("No intersection");
        }

    }
}
