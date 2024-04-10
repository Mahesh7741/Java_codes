class AssignmentOperator{
    public static void main(String arg[]){
        int num1=7;
        int num2=5;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println(num1*num2);
        System.out.println("................................");
        num1 +=2;
        System.out.println(num1);
        num1 *=2;
        System.out.println(num1);
        num1 /=2;
        System.out.println(num1);
        num1 *=2;
        System.out.println(num1);
        System.out.println("................................");
        num2++;
        System.out.println(num2);
        num2--;
        System.out.println(num2);
        ++num2;
        System.out.println(num2);
        --num2;
        System.out.println(num2);
        System.out.println("................................");
        num1 %=num2;
        System.out.println(num1);
        System.out.println("................................");
        // int result = ++num1;
        // System.out.println(result); //Output result=4
        int result = num1++;
        System.out.println(result); //Output result=3
    }
}