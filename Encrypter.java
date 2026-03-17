public class Encrypter{

private static String textToEncrypt = "zzzz";
static int mayusLowerValue=65;
static int mayusUpperValue=90;
static int minusLowerValue=97;
static int minusUpperValue=122;

    public static void main(String[] args){
        Encrypt(textToEncrypt,2);
    }


    public static void Encrypt(String text, int spaceToMove){
        for(int i=0;i<text.length();i++) {
            int asciiValue=(int)text.charAt(i);
            char newChar;
                    
            if(asciiValue + spaceToMove>=mayusLowerValue && asciiValue + spaceToMove<=mayusUpperValue || 
                asciiValue + spaceToMove>=minusLowerValue && asciiValue + spaceToMove<=minusUpperValue){
                
                newChar=(char)(asciiValue+spaceToMove);
                System.out.print(newChar);

            }else if(asciiValue+spaceToMove>=mayusUpperValue){
                    
                newChar=(char)((asciiValue+spaceToMove)-26);

                System.out.print(newChar);
            }else if(asciiValue+spaceToMove>=minusLowerValue){
                    
                newChar=(char)((asciiValue+spaceToMove)-26);

                System.out.print(newChar);
            }
            
            
        }
        System.out.println();
    }
    


}