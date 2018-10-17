/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author Minh Anh
 */
public class Rectangle extends Shape{
    private double width=1.0, length=1.0;
    /**
     * ham contructor khong chua tham so
     */
    public Rectangle(){}
    /**
     * @param width chieu rong
     * @param length chieu dai
     */
    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }
    /**
     * @param width chieu rong
     * @param length chieu dai
     * @param color mau sac
     * @param filled day
     */
    public Rectangle(double width, double length,String color, boolean filled){
        super( color, filled);
        this.length=length;
        this.width=width;
    }
    /**
     * @return width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param width chieu rong
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @return length
     */
    public double getLength() {
        return length;
    }
    /**
     * @param length chieu dai
     */
    public void setLength(double length) {
        this.length = length;
    }
    /**
     * @return dien tich
     */
    public double getArea(){
        return this.length*this.width;
    }
    /**
     * @return chu vi
     */
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    /**
     * hien thi thong tin hinh 
     * @return String 
     */
    @Override
    public String toString(){
        return "Rectangle: { Width: "+ this.width 
                + "\nLength: "+this.length+ "\nColor: "+ super.getColor()
                + "\nFilled: "+ super.isFilled()+ "\nArea: "+ this.getArea()
                + "\nPerimeter: "+ this.getPerimeter();
    }
    /**
     * @param o mot doi tuong kieu Shape khac
     * @return boolean 
     */
    public boolean isSame(Shape o) {
	return super.isSame(o);
    }
    /**
     * @param a mot hinh chu nhat khac
     * @return giong hay khac: true/false 
     */
    public boolean isSameRectangle (Rectangle a) {
	return super.isSame(a)&&a.getLength()==this.length&&a.getWidth()== this.width;
    }
}