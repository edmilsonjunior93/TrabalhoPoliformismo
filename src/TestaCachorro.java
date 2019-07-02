public class TestaCachorro {
    public static void main(String[] args){
        Cachorro c = new Cachorro();
        
        System.out.println("Reagir por Frase");
        c.reagir("Pode comer");
        c.reagir("Vai apanhar");
        System.out.println("");
        System.out.println("Reagir por horario do dia");
        c.reagir(11, 45);
        c.reagir(21, 00);
        System.out.println("");
        System.out.println("Reagir ao Dono");
        c.reagir(true);
        c.reagir(false);
        System.out.println("");
        System.out.println("Reagir a idade e o peso");
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
    }
}
