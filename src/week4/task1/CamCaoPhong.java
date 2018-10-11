/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lai Thi Thu Phuong
 */
package week4.task1;
/**
 * doi tuong ke thua tu lop hoa quả
 * @since HoaQua
 */
public class CamCaoPhong extends HoaQua{
    private String nguoiquanli;
    /**
     * contructor khong chua tham so
     */
    public CamCaoPhong(){}
    /**
     * @param nguoiquanli thông số thứ 1
     * @param xuatxu thông số thứ 2
     * @param ngaynhap thông số thứ 3
     * @param gia thông số thứ 4
     * @param soluong thông số thứ 5
     * @since HoaQua
     */
    public CamCaoPhong(String nguoiquanli,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.nguoiquanli= nguoiquanli;     
    }
    /**
     * @return nguoiquanli
     */
    public String getNguoiquan() {
        return nguoiquanli;
    }
    /**
     * @param nguoiquanli thông số 1
     */
    public void setNguoiquan(String nguoiquanli) {
        this.nguoiquanli = nguoiquanli;
    }   
    /**
     * @return tích của giá 1 cân và số lượng
     */
    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }
    /**
     * hiển thị thông tin của quả cam cao phong
     */
    public void print(){
        System.out.println("Thong tin: " + this.nguoiquanli+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}