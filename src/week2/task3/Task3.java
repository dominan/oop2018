package week2.task3;
class giao_vien{
    private String name, lop;
    private int tuoi;
    public giao_vien(){}
    public giao_vien(String name, String lop, int tuoi){
        this.name=name;
        this.lop=lop;
        this.tuoi=tuoi;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public String getlop(){
        return lop;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
    public void check(giao_vien other){
        if(lop.equals(other.getlop())==true) System.out.print("cung day mot lop");
        else System.out.print("khong day cung lop");
    }
    public void print_(){
        System.out.print("Thong tin giao vien: \n Ten giao vien :" + name+ "\nTuoi: "+tuoi+"Lop giang day: "+lop);
    }
    public void doi_lop(giao_vien other){
        String temp=lop;
        this.lop=other.getlop();
        other.setlop(temp);
    }
}
class dog{
    private float cao, nang;
    private String name, dia_chi;
    public dog(){
    }
    public dog(float cao, float nang, String name, String dia_chi){
        this.cao =cao; this.nang=nang; this.name=name; this.dia_chi=dia_chi;
    }
    public 
}

public class HelloWorld {
      
    
    public static void main(String[] args) {
       giao_vien n1= new giao_vien("ha", "12A", 35);
       giao_vien n2= new giao_vien("van", "11A", 25);
        n1.check(n2);
    }
    
}
public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
