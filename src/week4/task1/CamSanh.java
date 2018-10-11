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
 * đối tượng Cam Sành kế thừa từ lớp Hoa Quả
 * @since HoaQua
 */
public class CamSanh extends HoaQua{
    private String tinhtrangkho;
    /**
     * contructor khong có tham số
     */
    public CamSanh(){}
    /**
     * hàm khai báo thong tin đối tượng
     * @param tinhtrangkho thông số thứ 1
     * @param xuatxu thông số thứ 2
     * @param ngaynhap thông số thứ 3
     * @param gia thông số thứ 4
     * @param soluong thông số 5
     */
    public CamSanh(String tinhtrangkho,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.tinhtrangkho= tinhtrangkho;     
    }
    /**
     * lay thong tin tình trạng kho hàng của đối tượng
     * @return tinhtrangkho
     */
    public String getTinhtrang() {
        return tinhtrangkho;
    }
    /**
     * truyền thong tin cho đối tượng
     * @param tinhtrangkho thông số 1
     */
    public void setTinhtrang(String tinhtrangkho) {
        this.tinhtrangkho = tinhtrangkho;
    }  
    /**
     * @return xâu hiển ghi chú cho đối tượng
     */
    public String kiemtra( ){
        if(this.tinhtrangkho.equals("day")==true) return "khong the nhap them";
        else if(this.tinhtrangkho.equals("chua day")==true) return "co the nhap them";
        else return "can nhap them gap"  ;
    }
    /**
     * @return tích của giá bán 1 cân và số lượng (hai thuộc tính của đối tượng)
     */
    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }
    /**
     * hiện thị thông tin thuộc tính của đối tượng
     */
    public void print(){
        System.out.println("Thong tin: " + this.tinhtrangkho+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}
