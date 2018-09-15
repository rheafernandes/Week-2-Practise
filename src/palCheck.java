public class palCheck {
    boolean checkPalindrome(String test){
        String temp="";
        test=test.toLowerCase();
        test = test.replaceAll("\\s","");
        for(int j=test.length()-1;j>=0;j--) {
            temp = temp + test.charAt(j);
        }
//        System.out.println("Output is:" + temp);
//        System.out.println("Output is:" + test);
        if(test.equals(temp))
            return true;
        else
            return false;
    }
}

