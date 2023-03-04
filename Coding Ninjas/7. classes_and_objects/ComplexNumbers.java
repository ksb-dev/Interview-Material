public class ComplexNumbers {
	// Complete this class
    private int real;
    private int imaginary;

	public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public void multiply(ComplexNumbers c2) {

        int real_1 = (real * c2.real);
        int real_2 = -(imaginary * c2.imaginary);

        int imaginary_1 = (real * c2.imaginary);
        int imaginary_2 = (imaginary * c2.real);

        real = real_1 + real_2;
        imaginary = imaginary_1 + imaginary_2;

        System.out.println(real+" "+imaginary);
        System.out.println("---------------------");
    }

    public void print() {
        //System.out.println(real+" + "+"i"+imaginary);
        System.out.println(imaginary);
    }

    public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(3, 6);
		ComplexNumbers c2 = new ComplexNumbers(7, 9);

		c1.multiply(c2);
	    c1.print();
	}
}