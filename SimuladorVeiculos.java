public class SimuladorVeiculos {
   public static void main(String[] args) {
       Veiculo v = new Veiculo();
       v.marca = "Honda";
       v.modelo = "CG 160";
       v.velocidadeAtual = 0;
       v.acelerar(50);
       v.frear(10);
       v.parar();
       System.out.println(v);
       Carro c = new Carro();
       c.marca = "Toyota";
       c.modelo = "Corolla";
       c.portas = 4;
       c.velocidadeAtual = 0;
       c.acelerar(60);
       c.frear(20);
       c.buzinar();
       System.out.println(c);
   }
}


