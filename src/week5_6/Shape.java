package week5_6;

/**
 *
 * @author Minh Anh
 */
public class Shape{
    private double x,y;
    private String color;
    private boolean filled= true;
    public Shape(){}
    /**
     * @param color mau
     * @param filled day
     */
    public Shape(String color, boolean filled){
        this.color= color;
        this.filled= filled;       
    }
    /**
     * @return x 
     */
    public double getX() {
        return x;
    }
    /**
     * @param x toa do x
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * @return y
     */
    public double getY() {
        return y;
    }
    /**
     * @param y toa do y
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color mau
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return filled 
     */
    public boolean isFilled() {
        return filled;
    }
    /**
     * @param filled day
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /**
     * @param o doi tuong thuoc lop Shape khac
     * @return so sanh hai hình giong hay khac
     */
    public boolean isSame(Shape o) {
	return(this.x==o.getX()&&this.y==o.getY());
    }
}

