package Homework2;

public class Dog {
   private String breed;
   private String name;
   private int age;
   private boolean isMale;
   private long price;
   private FurColor FurColor;
//empty constructor
   public Dog(){
   }
//constructor with parameter
   public Dog(String breed, String name, int age, boolean isMale, long price, FurColor FurColor){
       this.breed = breed;
       this.name = name;
       this.age = age;
       this.isMale = isMale;
       this.price = price;
       this.FurColor = FurColor;
   }
//parameter override
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", price=" + price +
                ", FurColor=" + FurColor +
                '}';
    }
    //getters
    public String getBreed(){
        return breed;
    }
    public String getName(){
       return name;
    }
    public int getAge(){
       return age;
    }
    public boolean getIsMale(){
       return isMale;
    }
    public long getPrice(){
       return price;
    }
    public String getFurColor() {
        return String.valueOf(FurColor);
    }
    //setters
    public void setBreed(String breed){
       this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIsMale(boolean isMale){
        this.isMale = isMale;
    }
    public void setPrice(long price){
        this.price = price;
    }
    public void setFurColor(FurColor furColor) {
        FurColor = furColor;
    }
}
