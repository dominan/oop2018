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
public class Main {
    public static void main(String[] args) {
        Layer layer= new Layer();
        layer.shape.add(new Triangle());
        layer.shape.add(new Triangle());
        layer.shape.add(new Triangle());
        layer.shape.add(new Triangle());
        System.out.println("so hình tam giac đa xoa: "+ layer.deteleteTriange());
        layer.shape.add(new Circle());
        layer.shape.add(new Circle());
        layer.shape.add(new Circle());     
        Diagram diagram= new Diagram();
        diagram.layer.add(layer);
        System.out.println("so hinh tron đa xoa: "+ diagram.deleteCricle());
    }
}
