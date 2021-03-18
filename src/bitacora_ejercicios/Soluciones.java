package bitacora_ejercicios;
/**
 * @author 
 * Dzul Noh Jose Julio - 19070047 
 * Llanes Barrera Luis Angel - 19070023
 * Poot Pool Riger Emmanuel - 19070067 
 * Semestre: Cuarto   Grupo: A
 */
public class Soluciones {
    private double euler, discriminante, x1, x2;
    
    public Soluciones(double euler, double discriminante, int x1, int x2){
        this.euler = euler;
        this.discriminante = discriminante;
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public Soluciones(){
        
    }
    
    public double euler(int x, int n){
        euler = 0;
        for (int j = 0; j <= n; j++) {
            euler += (Math.pow(x, j) / factorial(j));
        }
        return euler;
    }
    
    public double factorial(int n) {
        double cont = 1;
        for (int i = 1; i <= n; i++) {
            cont *= i;
        }
        return cont;
    }
    
    public void ecuacion1(int a, int b, int c) {
        Mdiscriminante(a, b, c);
        if (discriminante > 0) {
            x1 = (-b + discriminante) / (2 * a);
            x2 = (-b - discriminante) / (2 * a);
        } else if (discriminante == 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = x1;
        }
        System.out.println("\nPrimer Metodo de Solucion:");
        impresion(x1, x2);
    }
    
    public void ecuacion2(int a, int b, int c) {
        Mdiscriminante(a, b, c);
        if (discriminante > 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = (-2 * c) / (b - discriminante);
        } else if (discriminante == 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = x1;
        }
        System.out.println("\nSegundo Metodo de Solucion:");
        impresion(x1, x2);
    }
    
    public void Mdiscriminante(int a, int b, int c){
        discriminante = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
    }
    
    public void impresion(double x1, double x2) {
        if (discriminante >= 0) {
            System.out.println("El resultado de x1 es " + x1);
            System.out.println("El resultado de x2 es " + x2);
        } else {
            System.out.println("No tiene ninguna solucion");
        }
    }
    
    //Metodos get
    public double geteuler(){
        return euler;
    }

    public double getX1() {
        return x1;
    }
    
    public double getX2() {
        return x2;
    }
    
    public double getDiscriminante() {
        return discriminante;
    }
    
    //Metodos set
    public void seteuler(double euler){
        this.euler = euler;
    }
    
    public void setX1(double x1) {
        this.x1 = x1;
    }
    
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
}
