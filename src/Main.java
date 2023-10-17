public class Main {
    public static void main(String[] args) {
        Integer x = 0;
        int test = countNumOfOnesInBin(x);
        System.out.println(test);
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
}