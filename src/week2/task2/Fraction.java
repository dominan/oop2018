package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
   int numerator, denominator;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
          this.numerator=numerator;
          this.denominator=denominator;
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sum = new Fraction(this.numerator*other.denominator+other.numerator*this.denominator,this.denominator*other.denominator);
        return sum;
    }
    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction hieu = new Fraction(this.numerator*other.denominator-other.numerator*this.denominator,this.denominator*other.denominator);
        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction tich = new Fraction(this.numerator*other.numerator,this.denominator*other.denominator);
        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction chia = new Fraction(this.numerator*other.denominator,this.denominator*other.numerator);
        return chia;
    }
}
