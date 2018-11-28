/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan12;

import java.util.ArrayList;

/**
 *
 * @author Minh Anh
 */
public class task1 {
    public static void main(String[] args) {
        tree1 p1= new tree1("2/5", "nam", "single", "Ryan");
        person Kp1= new person("Lee","1/2", "nam", "married") {};
        person Kp2= new person("Jack","6/8", "nam", "married");
        person Kp3= new person("Marry","7/12", "nu", "married");
        person Kp4= new person("Lily","22/5", "nu", "single");
        ArrayList<person> ds_con = new ArrayList<>();
        ds_con.add(Kp4);
        ds_con.add(Kp3);
        ds_con.add(Kp2);
        ds_con.add(Kp1);
        tree p2= new tree("Kai","17/4", "nam", ds_con, "jennifer");
        ArrayList<person> ds= new ArrayList<>();
        ds.add(p1);
        ds.add(p2);
        tree p= new tree("jame", "31/9", "nam",ds , "hana");
        System.out.println("danh sach nguoi khong ket hon:");
        p.ds_single();
        System.out.println("danh sach sinh hai nguoi con:");
        p.ds_doublechild();
    }
}
