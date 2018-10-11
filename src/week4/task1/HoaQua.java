/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Lai Thi Thu Phuong
 */
/**
 * tạo đối tượng hoa qua
 */
public class HoaQua{
    private String xuatxu, ngaynhap;
    private  int gia;
    private float soluong;
    /**
     * hàm contructor khong chứa tham số
     */
    public HoaQua(){
    } 
    /**
     * @param xuatxu thông số thứ 1
     * @param ngaynhap thống số thứ 2
     * @param gia thông số thứ 3
     * @param soluong thông số thứ 4
     */
    public HoaQua(String xuatxu, String ngaynhap, int gia, float soluong){
        this.xuatxu= xuatxu;
        this.ngaynhap=ngaynhap;
        this.gia=gia;
        this.soluong= soluong;
    }
    /**
     * @return xuatxu
     */
    public String getXuatxu() {
        return xuatxu;
    }
    /**
     * @param xuatxu thông số 1
     */
    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }
    /**
     * @return ngaynhap
     */
    public String getNgaynhap() {
        return ngaynhap;
    }
    /**
     * @param ngaynhap thông số 2
     */
    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    /**
     * @return gia
     */
    public int getGia() {
        return gia;
    }
    /**
     * @param gia thông số 3
     */
    public void setGia(int gia) {
        this.gia = gia;
    }
    /**
     * @return soluong
     */
    public float getSoluong() {
        return soluong;
    }
    /**
     * @param soluong thông số 4
     */
    public void setSoluong(float soluong) {
        this.soluong = soluong;
    } 
    /**
     * @return tích hai thuộc tính giá bán và số lượng của đối tượng
     */
    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }
}