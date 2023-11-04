class Test
{
    int  a = 22;

    public static void main(String  args[])
    {
        int  a = 11;
        
        Test  X = new Test();

        System.out.println("\n\t Local A = "+a);
   
        System.out.println("\n\t Instance A = "+ X.a);

        System.out.println("\n\t Instance A = "+ new Test().a);
    }
}