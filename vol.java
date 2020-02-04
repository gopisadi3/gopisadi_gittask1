//Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type).
//The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function. 

class Box
{
      double width;
      double height;
      double depth;

      Box()
      {
      }

      Box(double width , double height, double depth)
      {
              this.width=width;
              this.depth=depth;
              this.height=height;
      }
        
       void store(double width , double height, double depth)
       { 
              this.width=width;
              this.depth=depth;
              this.height=height;
       }

      double volume()
      {
               return width*depth*height;
      }

      public static void main(String args[])
      {
                Box b1=new Box();
                b1.store(1.0,2.0,3.0);
                System.out.println("The volume is: "+b1.volume());

                Box b2=new Box(1.0,2.0,3.0);
                System.out.println("The volume is: "+b2.volume());
      }

}