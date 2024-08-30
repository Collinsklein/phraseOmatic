package phraseomatic;

public class PhraseOmatic {
    public static void main(String[] args) {
        String smart = "smart";
        String[] wordListOne =  {"multi-Tier","perasive","smart" };
        String[] wordLisTwo = {"sticky","centric","aligned"};
        String[] wordListThree = {"process","solution","mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordLisTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random () * threeLength);

        String phrase = wordListOne[rand1] + " " + wordLisTwo[rand2] + " " + wordListThree[rand3] ;

        System.out.println("What we need is a" + phrase);

    }
}
