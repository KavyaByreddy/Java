 
class Parent{
    Parent(){
        super();
        System.out.println("Parent class constructor");
    }

    @Override
    public String toString() {
        return "Parent []";
    }
}
class Child extends Parent{
   void child(){
    System.out.println("Child class constructor");
    }
    public static void main(String[] args) {
       Child f1= new Child();
	   f1.child();
        
    }
} 