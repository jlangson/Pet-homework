public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    //empty constructor
    public Pet(){
        name = "nameless";
        age=0;
        location = "nowhere";
        type = "none";
    }
    //regular constructor
    public Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    //getters for name age and type
    //does not say to make a getter for location so I did not
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
    //setters for name age and type.
    //instructions do not say to make a setter for location so I will not
    public void changeName(String name){
        this.name = name;
    }
    public void changeAge(int age){
        this.age = age;
    }
    public void changeType(String type){
        this.type = type;
    }

}
