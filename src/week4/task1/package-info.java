/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task2;
class hoaqua{
    private String xuatxu, ngaynhap;
    private  int gia;
    private float soluong;
    public hoaqua(){
    } 
    public hoaqua(String xuatxu, String ngaynhap, int gia, float soluong){
        this.xuatxu= xuatxu;
        this.ngaynhap=ngaynhap;
        this.gia=gia;
        this.soluong= soluong;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public float getSoluong() {
        return soluong;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }   
}
class quacam extends hoaqua{
    private String chatluong;
    public quacam(String chatluong,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.chatluong= chatluong;     
    }

    public String getChatluong() {
        return chatluong;
    }

    public void setChatluong(String chatluong) {
        this.chatluong = chatluong;
    }
    public void kiemtra(){
        if(chatluong.equals("hong")==true) System.out.println("can tieu huy");
        else if(chatluong.equals("chin")==true) System.out.println("can som tieu thu");
        else System.out.println("con tot");
    }
}
class quatao extends hoaqua{
    private int sokho;
    public quatao(int sokho,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.sokho= sokho;     
    }

    public int getSokho() {
        return sokho;
    }

    public void setSokho(int sokho) {
        this.sokho = sokho;
    }   
}
class camcaophong extends hoaqua{
    private String nguoiquanli;
    public camcaophong(String nguoiquanli,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.nguoiquanli= nguoiquanli;     
    }

    public String getNguoiquan() {
        return nguoiquanli;
    }

    public void setNguoiquan(String nguoiquanli) {
        this.nguoiquanli = nguoiquanli;
    }   
}
class camsanh extends hoaqua{
    private String tinhtrangkho;
    public camsanh(String tinhtrangkho,String xuatxu, String ngaynhap, int gia, float soluong){
        super(xuatxu,ngaynhap,gia,soluong);
        this.tinhtrangkho= tinhtrangkho;     
    }

    public String getTinhtrang() {
        return tinhtrangkho;
    }

    public void setTinhtrang(String tinhtrangkho) {
        this.tinhtrangkho = tinhtrangkho;
    }  
    public String kiemtra( ){
        if(this.tinhtrangkho.equals("day")==true) return "khong the nhap them";
        else if(this.tinhtrangkho.equals("chua day")==true) return "co the nhap them";
        else return "can nhap them gap"  ;
    }
}
public class traicay {
    public static void main(String args[]){
        
    }
}

