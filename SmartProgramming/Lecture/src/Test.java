interface I1
        {
            void show();
        }

interface I2
{
    void display();
}

 class Test implements I1, I2 {
   public void show()
    {
        System.out.println("1");
    }
     public void display() {
         System.out.println("2");
     }

     public static void main(String[] args) {
        // I1 i=new I1 ();
         Test t=new Test ();
         t.show();
         t.display();
     }



 }
