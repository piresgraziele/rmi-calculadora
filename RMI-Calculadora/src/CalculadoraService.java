import java.rmi.Naming;

public class CalculadoraService {

   public CalculadoraService() {
     try {
       Calculadora c = new CalculadoraImpl();
       Naming.rebind("rmi://localhost:1099/CalculadoraService", c);
     } catch (Exception e) {
       System.out.println("Problema: " + e);
     }
   }

   public static void main(String args[]) {
     new CalculadoraService();
   }
}
