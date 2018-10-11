/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
public class traicay {
    public static void main(String args[]){
        QuaCam qc= new QuaCam("hong", "my", "20/10", 20000,30);
        System.out.println(qc.Tonggiathanh());
        qc.print();
        QuaTao qt= new QuaTao(310, "quang chau", "24/12", 20000,30);
        System.out.println(qt.Tonggiathanh());
        qt.print();
        CamSanh cs= new CamSanh("day", "vietNam", "5/10", 20000,30);
        System.out.println(cs.Tonggiathanh());
        cs.print();
        CamCaoPhong ccp= new CamCaoPhong("thu h", "phap", "5/10", 20000,30);
        System.out.println(ccp.Tonggiathanh());
        ccp.print();     
    }
}

