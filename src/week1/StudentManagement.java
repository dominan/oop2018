package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    
    public static Student sv[]= new Student[100];
    private static int size = 4;

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getgroup().equals(s2.getgroup())==true) return true;
        else return false;
    }

    void studentsByGroup() {
        // TODO:
          for(int i=0; i<size; i++){
            int kt=1;
            for (int j=0; j<i; j++){
                if(sv[i].getgroup().equals(sv[j].getgroup())==true) {
                    kt=0;
                    break;
                }
            }
            if (kt==1) {
                System.out.println("SV lop :"+sv[i].getgroup()+ " gom: ");
                System.out.println(sv[i].getname());
                for(int j=i+1; j<size; j++){
                    if(sv[i].getgroup().equals(sv[j].getgroup())==true){
                        System.out.println(sv[j].getname());
                    }
                }
            }
        }
    
    }

    void removeStudent(String id) {
        // TODO:
    for(int i=0; i<size; i++){
             if(sv[i].getid().equals(id)==true){
                 for(int j=i; j<size-1; j++){
                     sv[j]=sv[j+1];
                 }
                size--; 
                break;
             }
         }
    }

    public static void main(String[] args) {
        // TODO:
          Student sv1 = new Student();
        sv1.setname("Minh anh");
        sv1.setid("17020568");
        sv1.setgroup("INT22081");
        sv1.setemail("uet@vnu.edu.vn");
        String name =sv1.getname();
        System.out.println(name);
        sv1.getInfo();
        //
        Student sv2= new Student();
        sv2.getInfo();
        //
        Student sv3= new Student("Nguyen Van A","17020999", "INT22082", "nguyenA@gmail.com");
        sv3.getInfo();
        //
        Student sv4 =new Student(sv1);
        sv4.getInfo();
        
        //goi ham kiem tra 2 sinh vien co cung lop hay k?
        System.out.println(sameGroup(sv4, sv3));
        
        sv[0]=sv1;sv[1]=sv2;sv[2]=sv3;sv[3]=sv4;
        //tham chieu den phuong thuc in ra danh sach sinh vien theo tung lop 
        StudentManagement sc=new StudentManagement();
        
        //in sinh vien theo lop
        sc.studentsbyGroup();
        
        //xoa mot sv theo id
        sc.removeStudent("17020111");
        sc.studentsbyGroup();
    }
}
