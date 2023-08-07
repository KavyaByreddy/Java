class Incrementdecrement{
    public static void main(String[] args){
        //int x=++5;-we can apply incr/decr for variables but not constants
       /*int x=10;
        int y=++(++x);//Nesting of increment&decrement operators is not allowed*/
        /*final int x=5;
        we cannot apply the incr/decr for final variable */
       double d=506;
       char ch='k'; //we can apply incr/decr for every primitive data type except boolean 
        System.out.println(++d);
        System.out.println(++ch);
    }
}