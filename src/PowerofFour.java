public class PowerofFour {
    boolean powFour(int testnum) {
        while (testnum>=4) {
            if (testnum % 4 == 0)
                testnum /= 4;
            else
                testnum=3;

        }
        if (testnum == 1)

            return true;
        else
            return false;
    }
}
//import java.math.BigInteger;
//
//public class PowerofFour {
//
//    boolean powFour(BigInteger testnum) {
//        BigInteger four=new BigInteger("4");
//        BigInteger zero=new BigInteger("0");
//        BigInteger three=new BigInteger("3");
//        BigInteger one=new BigInteger("1");
//        while (testnum.compareTo(four)>=0) {
//            if (testnum.mod(four).compareTo(zero)==0 )
//                testnum.divide(four);
//            else
//                testnum=three;
//
//        }
//        if (testnum.compareTo(one)==0)
//
//            return true;
//        else
//            return false;
//    }
//}
