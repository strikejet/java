package p1;

public class Complex {
    int real;
    int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "Real = " + this.real + ", Imag = " + this.imag;
    }
}
