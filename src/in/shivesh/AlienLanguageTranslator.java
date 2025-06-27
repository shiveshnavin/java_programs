package in.shivesh;


/* 

Write a class class AlienLanguageTranslator that implements all the funcionality of the given
LanguageTranslator class. You will need to override all the methods given in the LanguageTranslator
interface.

*/
public class AlienLanguageTranslator implements LanguageTranslator
{

    int offset=3;
    @Override
    public String fromDefaultLanguage(String languageTokens) {

        char [] car=languageTokens.toCharArray();
        for(int i=0;i<car.length;i++)
        {
            car[i]+=car[i]+offset;
        }

        return new String(car);
    }

    @Override
    public String toDefaultLanguage(String languageTokens) {
        char [] car=languageTokens.toCharArray();
        for(int i=0;i<car.length;i++)
        {
            car[i]+=car[i]-offset;
        }
        return new String(car);
    }


}


