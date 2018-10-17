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
public class Circle extends Shape{
    private double radius =1.0;
    /**
     * hàm contructor khong chua tham so
     */
    public Circle() {}
    /**
     * hàm contructor chua tham so
     * @param radius ban kinh hinh tron
     */
    public Circle(double radius) {
	this.radius = radius;
    }
    /**
     * @return radius 
     */
    public double getRadius() {
	return radius;
    }
    /**
     * @param radius ban kinh hinh tron
     */
    public void setRadius(double radius) {
	this.radius = radius;
    }
    /**
     * @param a hinh tron khac
     * @return boolean
     */
    public boolean isSameCircle(Circle a) {	
	return super.isSame(a)&&this.radius==a.getRadius();	
    }  
}
