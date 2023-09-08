import javax.swing.JOptionPane;

public class TesteTelevisao {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao();

        tv1.turnOn();
        JOptionPane.showMessageDialog(null, "Turned TV on\n"
        +"Current Channel: "+tv1.getCurrentChannel()+"\n"
        +"Current Volume: "+tv1.getVolume()+"\n"
        +"Found "+tv1.getMaxChannels()+" channels available");
        tv1.changeChannel(4);
        JOptionPane.showMessageDialog(null, "Change to channel  "+tv1.getCurrentChannel());
        tv1.changeChannel(25);
        JOptionPane.showMessageDialog(null, "Change to channel  "+tv1.getCurrentChannel());
        tv1.changeVolume(60);
        JOptionPane.showMessageDialog(null, "Change to volume "+tv1.getVolume());
        tv1.changeChannel(13);
        JOptionPane.showMessageDialog(null, "Change to channel "+tv1.getCurrentChannel());
        JOptionPane.showMessageDialog(null, "Current TV state\n"
        +"Current Channel: "+tv1.getCurrentChannel()+"\n"
        +"Current Volume: "+tv1.getVolume()+"\n"
        +"Found "+tv1.getMaxChannels()+" channels available");
        tv1.turnOn();
        JOptionPane.showMessageDialog(null, "Turning off TV");
        tv1.changeVolume(5);
    }
}
