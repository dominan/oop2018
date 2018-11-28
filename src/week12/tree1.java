/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan12;

/**
 *
 * @author Minh Anh
 */
 class tree1 extends person{
    private String name;

    public tree1(String name) {
        this.name = name;
    }

    public tree1() {
    }

    public tree1(String ngaysinh, String gioi_tinh, String vk_ck, String name) {
        super(ngaysinh, gioi_tinh, vk_ck);
        this.name= name;
    }
    @Override
    public void ds_single(){
        if(super.getVk_ck()=="single") System.out.println(name);
        
    }
}
