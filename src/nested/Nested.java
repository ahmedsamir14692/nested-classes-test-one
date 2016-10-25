
package nested;


public class Nested {

 
    public static void main(String[] args) {
        
        outer.inner obj= new outer.inner (); 
     
         outer.retirnobj(); // object of privte static nested class
        //outer.retirnobj().y=7; error
        outer obj2 = new outer();
       // outer.inner2 r= obj2.new inner2(); 
         
         
    }
    
    
    
}
