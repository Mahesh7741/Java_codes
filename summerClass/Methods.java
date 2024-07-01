package summerClass;

public class Methods {
    static int MyCompere(int a, int b) {
        return (a - b);
    }

    static int myCompareUnsigned(int a, int b) {
        int result = (a - b) == 0 ? 0 : -1;
        return result;
    }

    static int myDivideUnsigned(int a, int b) {
        if ((a < 0 && b < 0) || a < 0) {
            return 858993448;
        }
        if (b < 0) {
            return 0;
        }
        return (a / b);
    }

    static int myRemainderUnsigned(int a, int b) {
        if ((b < 0) || (a < 0 && b < 0))
            return a;
        int result = (a % b);
        return result;
    }

    static int myHighestOneBit(int a) {
        int cnt = 0;
        while (a != 1) {
            a = a / 2;
            cnt++;
        }
        int result = (int) Math.pow(2, cnt);
        return result;
    }

    static int myLowestOneBit(int a) {
        int rem = 0;
        int cnt = 0;
        while (a != 1) {
            rem = a % 2;
            if (rem == 1) {
                break;
            }
            a = a / 2;
            cnt++;
        }
        int result = (int) Math.pow(2, cnt);
        return result;
    }

    static int myNumberOfLeadingZeros(int a) {
        if (a == 0) {
            return 32;
        } else if (a < 0) {
            return 0;
        }
        int cnt = 0;
        while (a != 1) {
            a = a / 2;
            cnt++;
        }
        return 32 - (cnt + 1);
    }

    static int myNumberOfTrailingZeros(int a) {
        int cnt = 0;
        while (a != 0) {
            int k = a & 1;
            if (k == 1) {
                break;
            }
            cnt++;
            a = a >> 1;
        }
        return cnt;
    }

    static int myBitCount(int a) {
        if(a<0){
            a=a*(-1);
            int cnt = 0;
        while(a != 0) {
            int k=a & 1;
            if(k == 1) {
                cnt++;
            }
            a = a >>1;
        }
        return 32-cnt;
        }
        int cnt = 0;
        while(a != 0) {
            int k=a & 1;
            if(k == 1) {
                cnt++;
            }
            a = a >>1;
        }
        return cnt;
    }
    static int myRotateLeft(int a,int r){
        if(r<0){
            r=r*(-1);
            a=a>>r;
            return a;
        }
         a=a<<r;
        return a;
    }
    static int mySum(int a,int b){
        return a+b;
    }
    static int myMax(int a,int b){
        if((a-b)>0){
            return a;
        }
        else if((a-b)<0){
            return b;
        }
        else{
            return a;
        }
    }
    static int myMin(int a,int b){
        if((a-b)<0){
            return a;
        }
        else if((a-b)>=0){
            return b;
        }
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println(MyCompere(1, 1));
        System.out.println(myCompareUnsigned(1, -1));
        System.out.println(myDivideUnsigned(-55, 5));
        System.out.println(myRemainderUnsigned(-10, -2));
        System.out.println(myHighestOneBit(64));
        System.out.println(myLowestOneBit(2201));
        System.out.println(myNumberOfLeadingZeros(-1));
        System.out.println(myNumberOfTrailingZeros(-50));
        System.out.println(myBitCount(10));
        System.out.println(myRotateLeft(-10, 1));
        System.out.println(mySum(2, 10));
        System.out.println(myMax(10, 10));
        System.out.println(myMin(1, 10));
    }
}
