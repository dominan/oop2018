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
public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    /**
     * @return a canh thu 1
     */
    public double getA() {
	return a;
    }
    /**
     * @param a canh thu 1
     */
    public void setA(double a) {
	this.a = a;
    }
    /**
     * @return b canh thu 2
     */
    public double getB() {
	return b;
    }
    /**
     * @param b canh thu 2
     */
    public void setB(double b) {
	this.b = b;
    }
    /**
     * @return c canh thu 3
     */
    public double getC() {
	return c;
    }
    /**
     * @param c canh thu 3
     */
    public void setC(double c) {
	this.c = c;
    }
    /**
     * @param a doi tuong hình tam giac khac
     */
    public boolean isSameTriangle(Triangle a) {
	return super.isSame(a)&&a.getA()==this.a&&a.getB()==this.b&&a.getC()==this.c;
    }
}

