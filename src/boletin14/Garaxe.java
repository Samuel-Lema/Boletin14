package boletin14;

public class Garaxe {
    
    static int numeroCoches = 0;
    private String matricula;

    // Constructor
    
    public Garaxe(){
        
    }
    
    public Garaxe(String matricula) {
        
        if (numeroCoches < 5){
           
            System.out.print("Coche " + matricula + " registrado. ");
            this.numeroCoches += 1;
            this.matricula = matricula;
            System.out.println("Quedan " + (5 - numeroCoches) + " prazas disponibles.");
              
        } else {
            
            System.out.println("Completo.");
        }
        
    }

    // Get y Set
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // Pagar Factura
    
    public void PagarFactura(float cartos, float tempo){
        
        double precio = 1.5;
        
        for(int i = 0; i < tempo; i++){
            
            if(i <= 3){
                precio = 1.5;
            } else {
                precio += 0.20; 
            }
        }
        
        if(cartos >= precio){
            
            System.out.println("FACTURA\n" +
                            "MATRICULA COCHE: " + matricula + "\n" +
                            "TEMPO: " + tempo + "\n" +
                            "PRECIO: " + precio + "\n" +
                            "CARTOS RECIBIDOS: " + cartos + "\n" +
                            "CARTOS DEVOLTOS: " + (cartos - precio) + "\n\n" +
                            "GRACIAS POR USAR O NOSO APARCADOIRO ");
            this.numeroCoches -= 1;
        } else {
            
            System.out.println("Faltan " + (precio - cartos) + " para pagar a tarifa.");
        }
        
    }
}
