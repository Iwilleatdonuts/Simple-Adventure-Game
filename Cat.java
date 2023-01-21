public class Cat {
    String nameOfCat;
    public Cat(String nameOfCat){
        this.nameOfCat=nameOfCat;
    }
    public String getName(){
        return nameOfCat;
    }
    public void meow(){
        System.out.println(nameOfCat+" meows.");
    }
    public void scratch(){
        System.out.println(nameOfCat+" scratches.");
    }
    public void purr(){
        System.out.println(nameOfCat+" purrs.");
    }
    public void bite(){
        System.out.println(nameOfCat+" bites.");
    }
}
