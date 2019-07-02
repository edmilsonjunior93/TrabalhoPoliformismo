/**
 * Classe define diferentes modos do metodo reagir para demonstrar SOBRECARGA
 * @author User
 */

public class Cachorro {
    /**
     * Metedo para reagir de acordo do a frase
     * @param frase 
     */
    public void reagir(String frase){
        if(frase.equals("Pode comer")||frase.equals("Bom Garoto!"))
            System.out.println("Abanar o rabo");
        else
            System.out.println("Rosnar");
    }
    
    /**
     * Metodo para reagir de acordo com o horario do dia
     * @param hora
     * @param min 
     */
    public void reagir(int hora,int min){
        if(hora<12)
            System.out.println("Abanar o rabo");
        else if(hora>=18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanar e Latir");
    }
    
    /**
     * Metodo para reagir ao dono
     * @param dono 
     */
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }
    
    /**
     * Metodo para reagir de acordo com a idade e o peso
     * @param idade
     * @param peso 
     */
    public void reagir(int idade, double peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso<10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
        
    }
}
