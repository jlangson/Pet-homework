public class Fork {
    private String location;
    private String material;
    private double mass; //in grams

    public Fork(){
        location = "no where";
        material = "none";
        mass = 0.0;
    }
    public Fork(String location, String material){
        this.location = location;
        this.material = material;
    }
    public Fork(String location, String material, double mass){
        this.location = location;
        this.material = material;
        this.mass = mass;
    }
    //getters


    public String getLocation() {
        return location;
    }
    public String getMaterial() {
        return material;
    }
    public double getMass() {
        return mass;
    }
    //setters
    public void setLocation(String location){
        this.location = location;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    //methods
    public boolean isHeavy(){
        return mass > 250;
    }
    public String toString(){
        return this.location + " " + this.material + " " + " " + String.valueOf(this.mass);
    }
}
