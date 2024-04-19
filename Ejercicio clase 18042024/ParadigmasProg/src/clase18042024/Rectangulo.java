package clase18042024;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getArea() 
    {
        return base * altura;
    }

    public double getPerimetro() 
    {
        return 2 * (base + altura);
    }

    public static void main(String[] args) 
    {
        Rectangulo rectangulo = new Rectangulo(10, 3);

        System.out.println("Base: " + rectangulo.base);
        System.out.println("Altura: " + rectangulo.altura);
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimetro());
    }
}