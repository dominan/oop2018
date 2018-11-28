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
 class person {
     private String name;
    private String  ngaysinh, gioi_tinh;
    private String vk_ck;
    public person(){}
    public person(String name,String ngaysinh, String gioi_tinh, String vk_ck){
        this.name= name;
        this.gioi_tinh= gioi_tinh;
        this.ngaysinh= ngaysinh;
        this.vk_ck= vk_ck;
    }
    public person(String ngaysinh, String gioi_tinh, String vk_ck){
        
        this.gioi_tinh= gioi_tinh;
        this.ngaysinh= ngaysinh;
        this.vk_ck= vk_ck;
    }
    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public String getVk_ck() {
        return vk_ck;
    }

    public void setVk_ck(String vk_ck) {
        this.vk_ck = vk_ck;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }
    public void ds_single(){
        if(this.getVk_ck()=="single") System.out.println(name); 
    }
    public  void ds_doublechild(){};
}
