import javax.swing.JOptionPane;

public class Televisao {
    int currentChannel;
    int maxChannels;
    double volume;
    boolean isOn;

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getMaxChannels() {
        return this.maxChannels;
    }

    public void setMaxChannels(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isIsOn() {
        return this.isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
 
    public Televisao(){
        setCurrentChannel(1);
        setMaxChannels(15);
        setVolume(25);
        setIsOn(false);
    }

    void changeChannel(int channel){
        if(this.isIsOn()){
            if(!(channel<=0||channel>getMaxChannels())){
                this.setCurrentChannel(channel);
            }else{
                this.setCurrentChannel(1);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Television is off");
        }
    }

    void changeVolume(double volume){
        if(this.isIsOn()){
            if(!(volume<0||volume>100)){
                this.setVolume(volume);
            }else{
                this.setVolume(1);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Television is off");
        }
    }

    void turnOn(){
        if(this.isIsOn()){
            this.setIsOn(false);
        }else{
            this.setIsOn(true);
        }
    }
}
