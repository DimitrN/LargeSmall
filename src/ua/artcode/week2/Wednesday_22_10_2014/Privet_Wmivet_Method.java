package ua.artcode.week2.Wednesday_22_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 01.11.14
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
public class Privet_Wmivet_Method {
    public static String generateAnswer(String initial){
    String[] vowels = {"а","ё","у","е","о","э","я","и","ю","ы","є","і","ї"};
    String[] consonants = {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м",
            "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};
    String result = ""; //вывожимая матодом итоговая строка
    String word = initial; //переменная word будет изменяться в ходе проверок на согласные, в то время как переменная initial в ходе проверок на гласные меняться не будет

    // вводим переменные "первая буква" для сравнения в циклах, отдельно для гласных и согласных
    String firstLaterForVol = initial.substring(0,1);
    String firstLaterForCons = initial.substring(0,1);

    /*цыкл сравнения
    * в первом цикле идет проверка на гласную, если первая буква гласная - цыкл завершается (break) и метод возвращает результат.
    * Если первая буква не гласная - она проверяется во втором цикле на согласную.
    * Если во втором цикле определяется что первая буква согласная - меняется изначальное слово (word) - первая буква удаляется,
    * и меняется первая буква для сравнения (firstLaterForCons), так происходит пока первой в слове (word) не станет гласная.
    * После чего проверяются все остальные буквы (ненужная проверка, результат уже найден!!!) и метод возвращает результат*/

        for (int i = 0; i < vowels.length; i++){
            if (firstLaterForVol.equals(vowels[i])){
                result = "Шм"+ word;
                break;
            }
            else {
                for (int j = 0; j < consonants.length; j++){
                    if (firstLaterForCons.equals(consonants[j])){
                        word = word.substring(1,word.length());
                        firstLaterForCons = word.substring(0,1);
                        result = "Шм"+word;
                    }
                }
            }
        }
        return result;
    }
}
