/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;




public class Task2 {
   public static void main(String args[]){
       Circle tr= new Circle(3, "do",true);
       System.out.println( tr.toString());
       Rectangle cn= new Rectangle(2,4,"xanh", false);
       System.out.println(cn.toString());
   }
}