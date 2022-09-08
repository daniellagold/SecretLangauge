package com.techelevator;
import java.util.*;

public class SecretLanguage {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< CODE-AVA-JAY >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
        System.out.println("    I don't know about you but when I was growing up, knowing how to speak in a secret language promoted you to the coolest kid in school.");
        System.out.println(    "With that, I herby present to you..(drumroll).... everything you can ask for: A SECRET CODE TRANSLATOR THAT DOES THE WORK FOR YOU!!!!!");
        System.out.println("                                                      Here is the magic behind it:" +
                       "\nThe first letter of every word (that is longer than two letters) is transferred to a new word, where the letters AY are added to that first letter.");
        System.out.println("                                            For example, the word HELLO becomes ELLO-HAY");
        System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< CODE-AVA-JAY >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<");
        System.out.println("");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please write out what you would like translated to the secret language:");
        String regularWords = "";
        try {
            regularWords = userInput.nextLine();
            String secretWords = "";
            List<String> regularWordsList = new ArrayList<>();


        for (String word : regularWords.split(" ") ){
            regularWordsList.add(word.toLowerCase());
            char lastChar = word.charAt(word.length()-1);
            char firstChar = word.charAt(0);

                 if (firstChar != 'a' && firstChar!= 'e' && firstChar != 'i' && firstChar !='o' && firstChar !='u' && word.length()>2
                 && Character.isLetter(lastChar) ){
                     secretWords += word.substring(1);
                     secretWords += "-" + firstChar;
                     secretWords+="ay ";
                 } else if (firstChar != 'a' && firstChar != 'e' && firstChar != 'i' && firstChar !='o' && firstChar !='u' && word.length()>3
                         && !Character.isLetter(lastChar)){
                     secretWords += word.substring(1, word.length()-1);
                     secretWords += "-" + firstChar + "ay" + lastChar;
                 } else if (word.length()<=3 && !Character.isLetter(lastChar)){
                     secretWords += word.substring(0, word.length()-1) + "-ay" + lastChar + " ";
                 }
                 else{
                     secretWords+= word + "-ay ";
                 }

        }

        System.out.println(secretWords);
        } catch (Exception e){
            System.out.println("Please enter a valid sentence followed by the enter key");
        }
    }
}
