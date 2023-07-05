class Product{
        int prodId;
    static String prodCat;
//default const
    Product(){
        super();
    }
}

class Test{
    public static void main(String[] args){
       Product p1 = new Product();
       Product p2 = new Product();
       System.out.println(p1.prodId); //0
       System.out.println(p2.prodId); //0
       System.out.println(p2.prodCat); //null
    }

}