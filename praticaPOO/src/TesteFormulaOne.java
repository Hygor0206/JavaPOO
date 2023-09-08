import javax.swing.JOptionPane;

public class TesteFormulaOne {
    public static void main(String[] args) {
        FormulaOne formulaone1 = new FormulaOne("Ferrari");

        JOptionPane.showMessageDialog(null, "Largada em primeiro no pódio da equipe "+formulaone1.team+", sua velocidade no momento: "+formulaone1.getCurrentSpeed()+"Km/h");
        for (int i = 0; i < 50; i++) {
            formulaone1.accelerate();
        }
        JOptionPane.showMessageDialog(null, "Ganhando velocidade, no momento está a: "+formulaone1.getCurrentSpeed()+"Km/h");
        for (int i = 0; i < 20; i++) {
            formulaone1.brake();
        }
        JOptionPane.showMessageDialog(null, "Curva a frente, pisando no freio, no momento está a: "+formulaone1.getCurrentSpeed()+"Km/h");
        for (int i = 0; i < 60; i++) {
            formulaone1.accelerate();
        }
        JOptionPane.showMessageDialog(null, "Acelerando com tudo, sua velocidade no momento é de: "+formulaone1.getCurrentSpeed()+"Km/h\n"
        +"Velocidade Máxima");
    }
}
