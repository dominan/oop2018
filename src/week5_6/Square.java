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
public class Square extends Rectangle {
    private double side;
    public Square(){
    }
    /**
     * @param side canh hinh vuong
     */
    public Square(double side) {
        this.side= side;
        setLength(side); 
        setWidth(side);
    }
    /**
     * @param side canh hinh vuong
     * @param color mau 
     * @param filled day hay khong
     */
    public Square(double side,String color,boolean filled){
       super(side,side,color,filled);
       this.side= side;
    }
    /**
     * @return side
     */
    public double getSide() {
        return super.getLength();
    }
    /**
     * @param side canh hinh vuong
     */
    public void setSide(double side) {
        super.setLength(side); 
        super.setWidth(side);
    }
    public void setWidth() {
        super.setWidth(super.getWidth());
    }
    public void setLength(){
        super.setLength(super.getLength());
    }
    /**
     * hien thi thong tin hinh 
     * @return String 
     */
    @Override
    public String toString() {
        return "Square{ "+"side: "+super.getWidth()
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()+" }";
    }
    /**
     * @param a hinh vuong khac
     * @return so sanh hai hình giong hay khac
     */
    public boolean isSameSquare(Square a) {
	return super.isSameRectangle(a);
    }
}
