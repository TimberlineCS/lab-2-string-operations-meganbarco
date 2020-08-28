/*
Megan Barco
AP CS A
8/28/2020
*/

public class StringOperations{
  public static void main(String args[]){
    //challenge 1
    //word scrambler
      String word1 = "scissors";
      int word1l = (word1.length()/2);
      String word1f = word1.substring(0, word1l);
      String word1b = word1.substring(word1l);
      String finalWord1 = word1b + word1f;

      String word2 = "picture";
      int word2l = (word2.length()/2);
      String word2f = word2.substring(0, word1l);
      String word2b = word2.substring(word1l);
      String finalWord2 = word2b + word2f;

      String word3 = "computer";
      int word3l = (word3.length()/2);
      String word3f = word3.substring(0, word1l);
      String word3b = word3.substring(word1l);
      String finalWord3 = word3b + word3f;

      System.out.println(finalWord1);
      System.out.println(finalWord2);
      System.out.println(finalWord3);

      //challenge 2
      //more complex ascii art; its a dog

      System.out.println("      _");
      System.out.println("(___()'`;");
      System.out.println("//,   //`");
      System.out.println("\\\\'-- \\\\0");

  }
}