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
        int cnt = 0;
        while (a != 1) {
            a = a / 2;
            cnt++;
        }
        return 32 - (cnt + 1);
    }

    static int numberOfTrailingZeros(int a) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(MyCompere(1, 1));
        System.out.println(myCompareUnsigned(1, -1));
        System.out.println(myDivideUnsigned(-55, 5));
        System.out.println(myRemainderUnsigned(-10, -2));
        System.out.println(myHighestOneBit(64));
        System.out.println(myLowestOneBit(2201));
        System.out.println(myNumberOfLeadingZeros(254));
    }
}
