public class Point {
    private int x;
    private int y;
    private int angle;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.angle = 0;
    }

    public Point(int x, int y, int angle)
    {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }
    

    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return int return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj){return true;}
        if (obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        
        Point other = (Point) obj;

        if(x != other.getX()) {return false;}
        if(y != other.getY()) {return false;}
        if(angle != other.getAngle()) {return false;}

        return true;
    }

    @Override
    public int hashCode()
    {
        return (int) 31*x+y+angle;
    }

    @Override
    public String toString()
    {
        return getClass().getName()+'@'+Integer.toHexString(hashCode());
    }



    /**
     * @return int return the angle
     */
    public int getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(int a) {
        this.angle += a;
        int oldX = x;
        int oldY = y;
        double angle = Math.toRadians(a);

        this.x = (int)(x*Math.cos(angle) - y*Math.sin(angle));
        this.y = (int)(oldX*Math.sin(angle)+oldY*Math.cos(angle));
    }

}
