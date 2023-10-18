public class Main {
    public static void main(String[] args) {
        Integer x = 248;
        int test = countNumOfOnesInBin(x);
        System.out.println(test);
        String test1 = doSomethingWeird(x);
    }

    public static int countNumOfOnesInBin(Integer num) {
        int numOfOnes;
        numOfOnes = 0;
        String numAsBin = num.toBinaryString(num);
        for (int i = 0; i < numAsBin.length(); i++) {
            if (numAsBin.charAt(i) == '1') {
                numOfOnes += 1;
            }
        }
        return numOfOnes;
    }

    public static String doSomethingWeird(Integer num) {
        String hexifiedNum = num.toHexString(num);
        String finalString = "";
        for (int i = 0; i < hexifiedNum.length(); i++) {
            if (hexifiedNum.charAt(i) == 'F') {
                int j = Integer.parseInt(hexifiedNum, 16);
                String bin = Integer.toBinaryString(i);
                // add it to finalString
            }
            else {
                finalString += hexifiedNum.charAt(i);
            }
        }
        return finalString;
    }
}