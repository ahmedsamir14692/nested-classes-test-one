
package nested;

public class outer {
    public int x=6;
    public static int t=4;
    private int d=4;
    static String last="dsd";
     inner r= new inner();
    public static class inner{ 
        public int x=3;
        public String name;
          public static int t=4;
         // inner r= new inner(); stack over flow   
        public void acssess ()
        {
            t=5; // t of inner
            last="fdf";
            outer.t=3; // t0f outer
           // d=5; error d is not stattic
            
        }
        public static void sstatic (){
            
            
            last="ffd";
        }
        
//        private static class privatst {
//            
//            int y=5;
//            
//            public void privatt ()
//            {
//                System.out.println("accsees to private");
//                
//            }
//            
//            
//        }
        
        
       
        
    }
    
//     static inner.privatst retirnobj ()
//        {
//            
//            return new inner.privatst ();
//        }
//    
            private static class privatst {
            
            int y=5;
            
            public void privatt ()
            {
                System.out.println("accsees to private");
                
            }
            
            
        }
               static privatst retirnobj ()
        {
            
            return new privatst ();
        }  
               
             public class inner2 {
                   
                   public int x=6;
//    public static int t=4;
    private int d=4;
//    static String last="dsd";
                   
                   public void accsess ()
                   {
                       t=4;
                       x=5;
                       d=5;
                       outer.this.d=9; // acses to d in outer
                       
                   }
                   
               } 
             
             // inthis  class u can make object of any nested class
             //with out full name/
             // even that called inner2 !!!!!
             //
             
      inner2 p= new inner2(); // new inner2() from class inner2 in this object
          // static inner2 e= new inner2()  // onfucken way to use static with inner2
             /////////////  local class
      
      public static void  local(final int x){
          
          int r=5;
          class local{
              int t=x;
              int e= r;
              
          }
          local rt= new local ();
      }
      
     // local rt= new local ();locall is on avaliable here
      
}
