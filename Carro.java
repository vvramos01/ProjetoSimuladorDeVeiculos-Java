class Carro extends Veiculo {
   int portas;
   void buzinar() {
       System.out.println("Buzina: BEEP BEEP!");
   }
   public String toString() {
       return "Carro [marca=" + marca + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual + ", portas=" + portas + "]";
   }
}
