public class FormulaOne {
    double currentSpeed;
    double maxSpeed;
    String team;

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FormulaOne(String team){
        setCurrentSpeed(0);
        setMaxSpeed(350);
        setTeam(team);
    };

    void accelerate(){
        if(!(getCurrentSpeed()+5>getMaxSpeed())){
            setCurrentSpeed(getCurrentSpeed()+5);
        }else{
            setCurrentSpeed(getMaxSpeed());
        }
    }

    void brake(){
        if(!(getCurrentSpeed()-10<0)){
            setCurrentSpeed(getCurrentSpeed()-10);
        }else{
            setCurrentSpeed(0);
        }
    }
}
