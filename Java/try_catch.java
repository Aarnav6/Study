class try_catch {
    public static void main(String[] args) {
        try {
        @SuppressWarnings("unused")
        int num = 5/0;
        System.out.println("its try block");  
        }
        catch (ArithmeticException e){
        System.out.println("its an errror" + e.getMessage());
        }
        finally {
            System.out.println("this code is working fine");
        }
    }
}