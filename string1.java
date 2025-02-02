package StringPractice;

public class string1 {
    public static void main(String[] args) {
        //char by char
        //print(Ascii character, uppercase, lowercase, Digit, remove, spaces)
        //count(uppercase char, lowercase char, Digit, vowels, Any char)
        // New String(Reverse, Palindrome, only digits, only chars, reverse case, encoding)
        // word by word
        //print(Each word, starting with specific char, word length, find word, Longest)
        //count(count words, count specific words, word length, starting with specific char)
        // New String(Capitalize, Swap words, delete words)
        String s = "Its Simple";
        String s2= "NO26 Sound";
        String s3="Rar";
        String word="In the box";
        String word2="A Red Seed";
        String word3="MOM OR DAD";

        //printEachcharacterInSeparateLine(s);
        //printEachcharacterInSeparateLineWithASCIICode(s);
        //PrintOnlyUpperCaseCharacter(s);
        //printCountOfUpperCaseCharacter(s);
        //countAllVowelInAString(s);
        //createUpperCaseAndLowerCaseString(s);
        //CreateNewStringWithDigitFirst(s2);
        //convertUpperCaseToLowerSpace(s2);
        //reverseTheString(s2);
        //palindromeString(s3);

        //word Problem
        //printEachWordInSeparateLine(word);
        //PrintFirstCharacterFromWord(word);
        //printfirst2CharacterofWord(word);
        //printTheWordStartWithGivenCharacter(word2);
        specialWordInAString(word3);




    }

    private static void specialWordInAString(String word3) {
        String word4="";
        word3+=" ";
        for(int i=0;i<word3.length();i++){
            char c=word3.charAt(i);
            if(c!=' '){
                word4+=c;
            }else{
                char a=word4.charAt(0);
                char b=word4.charAt(word4.length()-1);
                if(a==b) System.out.println("Special charcter "+word4);
                word4+="";
            }
        }
    }

    private static void printTheWordStartWithGivenCharacter(String word2) {
        word2+=" ";
        String word3="";
        for(int i=0;i<word2.length();i++){
            char c=word2.charAt(i);
            if(c!=' ') word3+=c;
            else {
                if(word3.startsWith("S"))
                      System.out.println("The word Start with R is :" +word3);
                    word3="";
                }
            }
        }

    private static void printfirst2CharacterofWord(String word) {
        word+=" ";
        String word2="";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c!=' ')  word2+=c;
            else {
                System.out.print(word2.substring(0,2)+" ");
                word2="";
            }
        }
    }

    private static void PrintFirstCharacterFromWord(String word) {
        String word2="";
        word=word+" ";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c!=' ') word2=word2+c;
            else{
                System.out.print(word2.charAt(0)+" ");
                word2="";
            }
        }
    }

    private static void printEachWordInSeparateLine(String word) {
        word=word+" ";
        String word2="";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c!=' ')  word2=word2+c;
            else{
                System.out.print(word2+" ");
                word2="";
            }
        }
    }

    private static void palindromeString(String s2) {
        String reverse="";
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            reverse=c+reverse;
        }
        if(reverse.equalsIgnoreCase(s2))
            System.out.printf("The number %s is palindrome %s ",s2,reverse);
            else System.out.printf("The number %s is not Palindrome %s ",s2,reverse);
    }

    private static void reverseTheString(String s2) {
        String reverse="";
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            reverse=c + reverse;
        }
        System.out.printf("reverse of the %s is %s: ",s2,reverse);
    }

    private static void convertUpperCaseToLowerSpace(String s) {
        String s3="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)) s3=s3+Character.toLowerCase(c);
                    else  s3=s3+Character.toUpperCase(c);

        }
        System.out.println(s3);
    }

    private static void CreateNewStringWithDigitFirst(String s) {
        String s1=""; String s2="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)) s2=s2+c;
            if(Character.isAlphabetic(c)) s1=s1+c;
        }
        System.out.println(s2+" "+s1);
    }

    private static void createUpperCaseAndLowerCaseString(String s) {
        String SU=""; String SL="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)) SU=SU+c;
            if(Character.isLowerCase(c)) SL=SL+c;
        }
        System.out.println("UpperCase Character in String : "+SU);
        System.out.println("LowerCase Character in String : "+SL);
    }

    private static void countAllVowelInAString(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            char u=Character.toUpperCase(c);
            if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U'){
                count++;
            }

        }
        System.out.println(count);
    }

    private static void printCountOfUpperCaseCharacter(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)) count=count+1;
        }
        System.out.println("count "+count);
    }

    private static void PrintOnlyUpperCaseCharacter(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)) System.out.println(c);
        }
    }

    private static void printEachcharacterInSeparateLineWithASCIICode(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            System.out.println(c+" "+ (int)c);
        }
    }

    // Print each character in separate line
    private static void printEachcharacterInSeparateLine(String s) {
        for(int i=0;i<s.length();i++) System.out.println(s.charAt(i));
    }

}
