public class Segment {
    private Point a;
    private Point b;
    private int length;

    public Segment(Point a, Point b, int length)
    {
        this.a = a;
        this.b = b;
        this.length = length;
    }


    /**
     * @return int return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj){return true;}
        if (obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        
        Segment other = (Segment) obj;

        if(length != other.getLength()) {return false;}
        if(!a.equals(other.getA())){return false;}
        if(!b.equals(other.getB())){return false;}
        
        return true;
    }

    @Override
    public int hashCode()
    {
        return (int) 31*length+a.hashCode()+b.hashCode();
    }

    @Override
    public String toString()
    {
        return getClass().getName()+'@'+Integer.toHexString(hashCode());
    }


    /**
     * @return Point return the a
     */
    public Point getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Point a) {
        this.a = a;
    }

    /**
     * @return Point return the b
     */
    public Point getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Point b) {
        this.b = b;
    }

    public void rotate(int angle)
    {
        a.setAngle(angle);
        b.setAngle(angle);
    }

}
