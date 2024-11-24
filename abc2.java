class abc{
    int a = 10;
    int b = 20;
    
    public void sum(){
        int c = a + b;
        System.out.println("Sum: " + c);
    }
    
    public static void main(String[] args){
        abc obj = new abc();
        obj.sum();
    }
    
}