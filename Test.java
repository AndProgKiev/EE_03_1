public class Test {
    @MyNewAnotation(a=5,b=3)
    public void testMethod(int a, int b){
        System.out.println("a: "+ a + "||"+" b: "+ b);
    }

}
