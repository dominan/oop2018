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
public class QuaCam extends HoaQua{
    private String chatluong;
    /**
     * hàm khai báo không chứa tham số đầu vào
     */
    public QuaCam(){}
    /**
     * @param chatluong thông số thứ 1
     * @param xuatxu thông số 2
     * @param ngaynhap thông số 3
     * @param gia thong số 4
     * @param soluong thông số 5
     * @since HoaQua
     */
    public QuaCam(String chatluong,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.chatluong= chatluong;     
    }
    /**
     * @return chatluong
     */
    public String getChatluong() {
        return chatluong;
    }
    /**
     * @param chatluong thông số 1
     */
    public void setChatluong(String chatluong) {
        this.chatluong = chatluong;
    }
    /**
     * hiện thị ghi chú cho thuộc tính của đối tượng
     */
    public void kiemtra(){
        if(chatluong.equals("hong")==true) System.out.println("can tieu huy");
        else if(chatluong.equals("chin")==true) System.out.println("can som tieu thu");
        else System.out.println("con tot");
    }
    /**
     * @return tích hai thuộc tính của đối tượng (giaban và so luong) được kế thừa từ lớp HoaQua
     */
    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }
    /**
     * hiện thị thông tin của đối tượng
     */
    public void print(){
        System.out.println("Thong tin: " + this.chatluong+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}