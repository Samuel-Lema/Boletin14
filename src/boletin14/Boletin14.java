package boletin14;

public class Boletin14 {

    public static void main(String[] args) {
        
        // Coche con Matricula 45ESP paga 1 euro por 4 horas estacionado. (Le faltan 0.5 por pagar).
        
        Garaxe coche1 = new Garaxe("45ESP");
        coche1.PagarFactura(1, 4);
        
        // Coche con Matricula 98UKA paga 15 euros por 7 horas estacionado.
        
        Garaxe coche2 = new Garaxe("98UKA");
        coche1.PagarFactura(15, 7);
    }
    
}
