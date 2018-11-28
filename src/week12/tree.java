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
public class tree extends person{
    String name;
    ArrayList<person> ds_con = new ArrayList<>();
    public tree(){}
    public tree(String name, ArrayList<person> ds_con){
        this.ds_con= ds_con;
        this.name= name;
    }
    public tree(String name, String ngaysinh, String gioi_tinh, ArrayList<person> ds_con, String vk_ck){
        super(ngaysinh, gioi_tinh, vk_ck);
        this.name= name;
        this.ds_con= ds_con;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<person> getDs_con() {
        return ds_con;
    }

    public void setDs_con(ArrayList<person> ds_con) {
        this.ds_con = ds_con;
    }
    public int getchild(){
        return ds_con.size();
    }
    public void add_child(person other){
        if(ds_con.contains(other)==false) {
            ds_con.add(other);
        }
    }
    @Override
    public void ds_single(){
        if(super.getVk_ck()=="single") System.out.println(name);
        if(ds_con!=null){
            for (int i=0; i<ds_con.size(); i++){
                ds_con.get(i).ds_single();
            }
        }
    }
    @Override
    public void ds_doublechild(){
        if(ds_con!=null){
            if(ds_con.size()==2) System.out.println(name);
            for(int i=0; i<ds_con.size(); i++){
                ds_con.get(i).ds_doublechild();
            }
        }
    }
    
}
