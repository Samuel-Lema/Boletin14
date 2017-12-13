package boletin14;

public class Garaxe {
    
    static int numeroCoches = 0;
    private String matricula;
    long startTime;

    // Constructor
    
    public Garaxe(){
        
    }
    
    public Garaxe(String matricula) {
        
        if (numeroCoches < 5){
           
            System.out.print("Coche " + matricula + " registrado. ");
            this.numeroCoches += 1;
            this.matricula = matricula;
            this.startTime = System.currentTimeMillis();
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
    
    public void PagarFactura(float cartos){
        
        double precio = 1.5;

        long tempo = (long) (Math.floor(System.currentTimeMillis() / 3600) - Math.floor(startTime / 3600));
        
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
