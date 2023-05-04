package BasicProgram;

public class Test {

	static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable 
        System.out.println("n"+n);
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable 
        System.out.println("data"+data);
        Test t=new Test();
        t.method();
        System.out.println("m"+Test.m);
        
    }  
}//end of class   