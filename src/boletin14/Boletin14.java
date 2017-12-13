package boletin14;

public class Boletin14 {

    public static void main(String[] args) {
        
        // Coche con Matricula 45ESP paga 1 euro.
        
        Garaxe coche1 = new Garaxe("45ESP");
        coche1.PagarFactura(1);
        
        // Coche con Matricula 98UKA paga 15 euros.
        
        Garaxe coche2 = new Garaxe("98UKA");
        coche2.PagarFactura(15);
        
        // Coche con Matricula 56YZL paga 5 euros.
        
        Garaxe coche3 = new Garaxe("56YZL");
        coche3.PagarFactura(5);
        
    }
    
}
