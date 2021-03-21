public class Animal {
    public int numOfLegs;
    public String name;
    public boolean vegetarian;
    public double weight;
    public double height;
    public int age;
    Animal(){};
    Animal(int numOfLegs, String name, boolean vegetarian, double weight, double height, int age){
        this.numOfLegs = numOfLegs;
        this.name = name;
        this.vegetarian = vegetarian;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs=numOfLegs;
    }
    public int getNumOfLegs(){
        return numOfLegs;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setVegetarian(boolean vegetarian){
        this.vegetarian=vegetarian;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    String result;
    //"Animal{name='Tom', weight=12.5, height=40.7, age=4}"
    //"Animal{name="+name+" , weight="+weight+", height="+height+", age="+age
     public String toString() {
         this.result="Animal{name='"+name+"', weight="+weight+", height="+height+", age="+age+"}";
         return result;
     }

}
