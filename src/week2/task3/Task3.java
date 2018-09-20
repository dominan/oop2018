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
    private String name, chu;
    public dog(){
    }
    public dog(float cao, float nang, String name, String chu){
        this.cao =cao; this.nang=nang; this.name=name; this.chu=chu;
    }
    public float getcao(){
        return cao;
    }
    public float getnang(){
        return nang;
    }
    public String getname(){
        return name;
    }
    public String getchu(){
        return chu;
    }
    public void setcao(float cao){
        this.cao=cao;
    }
    public void setnang(float nang){
        this.nang=nang;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setchu(String chu){
        this.chu= chu;
    }
    public void samechu(dog other){
        if(chu.equals(other.getchu())==true){
            System.out.print("cung chu");
        }
        else {
           System.out.print("khac chu");
        }
    }
    public void print_(){
        System.out.println("thong tin :\nTen cho: "+ name+ "\nChu: "+chu+"\nCan nang: "+ nang+"Chieu cao: "+cao);
    }
    public float BMI(){
        return nang/(cao*cao/10000);
    }
}
class benhnhan{
    private String name, gioi_tinh, benh, tinh_trang;
    private int tuoi;
    public benhnhan(){}
    public benhnhan(String name,String gioi_tinh, String benh,String tinh_trang, int tuoi){
        this.name=name;
        this.gioi_tinh=gioi_tinh;
        this.benh=benh;
        this.tinh_trang=tinh_trang;
        this.tuoi=tuoi;
    }
    public String getname(){
        return name;
    }
    public String getbenh(){
        return benh;
    }
    public String getgioi_tinh(){
        return gioi_tinh;
    }
    public String gettinh_trang(){
        return tinh_trang;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setbenh(String benh){
        this.benh=benh;
    }
    public void setgioi_tinh(String gioi_tinh){
        this.gioi_tinh=gioi_tinh;
    }
    public void settinh_trang(String tinh_trang){
        this.tinh_trang=tinh_trang;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public void getInf(){
        System.out.println("Thong tin benh nhan :\nTen: "+name+"Tuoi: "+tuoi+"Gioi tinh: "+ gioi_tinh+"\nBenh: "+ benh+ "Tinh trang suc khoe: "+ tinh_trang);
        
    }
    public void uu_tien(){
        if (tinh_trang.equals("yeu")==true){
            System.out.println("Gap");
        }
        else if(tinh_trang.equals("hoi phuc")==true){
            System.out.println("Xep lich ra vien");
        }
        else if(tinh_trang.equals("khoe")==true){
            System.out.println("Ra vien");
        }
        else if(tinh_trang.equals("nguy kich")==true){
            System.out.println("Can cap cuu gap");
        }
    }
}


public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
