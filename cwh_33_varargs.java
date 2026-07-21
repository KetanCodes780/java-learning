public class cwh_33_varargs {

    // static int sum(int a ,int b){
    //     return a+b;
    // }
    // static int sum(int a ,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a ,int b,int c,int d){
    //     return a+b+c+d;
    // }
    // Varags->Varargs (Variable Arguments) in Java allow a method to 
    // accept any number of arguments of the same type.
    // static int sum(int x,int..arr)-> here the x argument is compulsory.
    static int sum(int... arr){
        // Available as int []arr;
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varags tutorial ");
        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 4,3 and 5 is:"+sum(4,3,5));
        System.out.println("The sum of 4,3,3and 5 is:"+sum(4,3,3,5));
    }
}
