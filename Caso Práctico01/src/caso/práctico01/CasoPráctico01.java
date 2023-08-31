/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.práctico01;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana Ulate
 */
public class CasoPráctico01{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        //Se pone variable para almacenar el monto/salario total
        double SalarioT=0;
        
        // Se pide al usuario la cantidad de empleados
        String empleadosInfo = JOptionPane.showInputDialog("Digite la cantidad de empleados: ");
        int empleados= Integer.parseInt(empleadosInfo);
        
        // Bucle que se ejecuta para cada empleado
        for(int i=1;i<=empleados;i++){
            // Se pide al usuario el salario del empleado
            String salariosInfo = (JOptionPane.showInputDialog("Digite el salario del empleado: "));
            int salarios = Integer.parseInt(salariosInfo);
            
            // Cálculo de la contribución al seguro social (SEM)
            Double SEM= salarios*0.0925;
            // Cálculo de la contribución al seguro médico (IVM)
            Double IVM= salarios*0.0508;
            // Se calcula el monto total de la contribución de IVM (5.08% del salario total)
            Double montoIVM = salarios * 0.0508;
            // Se agrega el monto fijo que la empresa debe pagar a la CCSS (₡42,990)
            double salarioTotal = salarios - SEM - IVM - montoIVM + 42990.0;

            // Se enseña un mensaje con el salario total con respecto a cada empleado
            JOptionPane.showMessageDialog(null, "Salario total del empleado " + i + ": " + salarioTotal);
        }
    }
}