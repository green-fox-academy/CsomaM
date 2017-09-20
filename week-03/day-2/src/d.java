public class d
{
    public static void main(String[] args)
    {
        StdDraw.setXscale(0.0, 12.0);
        StdDraw.setYscale(0.0, 16.0);
        StdDraw.circle(2.0, 2.0 , 2);
        StdDraw.circle(6.0, 2.0 , 2);
        StdDraw.circle(4.0, 12.0 , 2);

        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledSquare(4.0, 4.0, 2.0);
        StdDraw.filledSquare(4.0, 8.0, 4.0);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(2.0, 4.0, 2.0, 12.0);
        StdDraw.line(6.0, 4.0, 6.0, 12.0);
        StdDraw.line(2.0, 11.0, 6.0, 11.0);
        StdDraw.line(4.0, 12.5, 4.0, 14.0);

        StdDraw.line(6.7, 2.5, 8.0, 4.0);
        StdDraw.line(6.4, 2.6, 7.0, 4.4);
        StdDraw.line(7.1, 2.3, 8.6, 3.2);

        StdDraw.line(1.3, 2.5, 0.0, 4.0);
        StdDraw.line(1.6, 2.6, 1.0, 4.4);
        StdDraw.line(0.9, 2.3, -0.6, 3.2);
    }
}