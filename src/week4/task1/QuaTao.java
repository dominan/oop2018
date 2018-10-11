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
public class QuaTao extends HoaQua{
    private int sokho;
    /**
     * hàm khai báo không chứa tham số
     */
    public QuaTao(){}
    /**
     * @param sokho thông số 1
     * @param xuatxu thông số 2
     * @param ngaynhap thông số 3
     * @param gia thông số 4
     * @param soluong thông số 5
     * @since HoaQua
     */
    public QuaTao(int sokho,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.sokho= sokho;     
    }
    /**
     * @return sokho
     */
    public int getSokho() {
        return sokho;
    }
    /**
     * @param sokho thông sô 1
     */
    public void setSokho(int sokho) {
        this.sokho = sokho;
    } 
    /**
     * @return tích hai thuộc tính của đối tượng
     */
    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }
    /**
     * hiện thị thông tin thuộc tính của đối tượng
     */
    public void print(){
        System.out.println("Thong tin: " + this.sokho+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}