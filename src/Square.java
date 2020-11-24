
public class Square {
    private Segment a;
    private Segment b;
    private Segment c;
    private Segment d;
    private String color;

    public Square(Segment a, Segment b, Segment c, Segment d, String color)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.color = color;
        
    }

    public Square(int width, String color)
    {
        this.a = new Segment(new Point(0, 0), new Point(0, width), width);
        this.b = new Segment(new Point(0, width), new Point(width, width), width);
        this.c = new Segment(new Point(width, width), new Point(width, 0), width);
        this.d = new Segment(new Point(width, 0), new Point(0, 0), width);

    }

    public void rotate(int angle)
    {
        a.rotate(angle);
        b.rotate(angle);
        c.rotate(angle);
        d.rotate(angle);
    }

    public void shrink(int amount)
    {
        if (a.getLength() - amount <= 0)
        {
            System.out.println("Can't shrink length to <= 0");
        }
        else
        {
            int width = a.getLength() - amount;
            resize(width);
        }
    }

    public void grow(int amount)
    {
        int width = a.getLength() + amount;
        resize(width);
    }

    public void resize(int width)
    {
        int angle = a.getA().getAngle();

        this.a = new Segment(new Point(0, 0), new Point(0, width), width);
        this.b = new Segment(new Point(0, width), new Point(width, width), width);
        this.c = new Segment(new Point(width, width), new Point(width, 0), width);
        this.d = new Segment(new Point(width, 0), new Point(0, 0), width);

        rotate(angle);
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj){return true;}
        if (obj == null){return false;}
        if(getClass() != obj.getClass()){return false;}
        Square other = (Square)obj;
        if(!a.equals(other.getA()) || !b.equals(other.getB()) || !c.equals(other.getC()) || !d.equals(other.getD())) {return false;}
        if(!color.equals(other.color)){return false;}
        return true;
    }

    @Override
    public int hashCode()
    {
        return (int) 31*color.hashCode()+a.hashCode()+b.hashCode()+c.hashCode()+d.hashCode();
    }

    @Override
    public String toString()
    {
        return getClass().getName()+'@'+Integer.toHexString(hashCode());
    }



    /**
     * @param a the a to set
     */
    public void setA(Segment a) {
        this.a = a;
    }

    /**
     * @param b the b to set
     */
    public void setB(Segment b) {
        this.b = b;
    }

    /**
     * @param d the d to set
     */
    public void setD(Segment d) {
        this.d = d;
    }

       /**
     * @return Segment return the a
     */
    public Segment getA() {
        return a;
    }

       /**
     * @return Segment return the d
     */
    public Segment getB() {
        return b;
    }

       /**
     * @return Segment return the d
     */
    public Segment getC() {
        return c;
    }

    /**
     * @return Segment return the d
     */
    public Segment getD() {
        return d;
    }

}
