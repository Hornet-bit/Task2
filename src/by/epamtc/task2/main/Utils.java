package by.epamtc.task2.main;

public class Utils {
    public static void divisionByEvenOdd(String string) {

        char[] arrayOfSymbols = string.toCharArray();

        String evenSymbols = "";
        String oddSymbols = "";

        for (int i = 0; i < string.length(); i++) {

            if (i % 2 == 0) {
                oddSymbols += arrayOfSymbols[i];
            } else {
                evenSymbols += arrayOfSymbols[i];
            }

        }
        System.out.println("Чёные символы: " + evenSymbols);
        System.out.println("нечёные символы: " + oddSymbols);


    }

    public static void persent(String str) {

        String tempString = str.toLowerCase();
        char[] arrayStr = str.toCharArray();
        char[] arrayTemp = tempString.toCharArray();

        double lowerCount = 0;
        double upperCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (arrayStr[i] == arrayTemp[i]) {
                lowerCount++;
            } else {
                upperCount++;
            }

        }

        System.out.println("% КАПСА = " + 100 * (upperCount / (lowerCount + upperCount)));
        System.out.println("% прописи = " + 100 * (lowerCount / (lowerCount + upperCount)));

    }


    public static void deletingIdentical(String str) {


        char[] arrayStr = str.toCharArray();
        char[] arrayStr2 = str.toCharArray();

        for (int i = 0; i < arrayStr.length; i++) {

            char symbol = arrayStr[i];

            for (int j = 0; j < arrayStr.length; j++) {

                if (symbol == arrayStr[j] && i < j) {
                    arrayStr2[j] = '0';
                }

            }

        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayStr2.length; i++) {
            if (arrayStr2[i] != '0') {
                result.append(arrayStr2[i]);
            }

        }

        System.out.println(result);

    }


    public static void frequency(String str, char ch) {

        char[] arrayStr = str.toCharArray();
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            if (arrayStr[i] == ch) {

                frequency++;
            }

        }
        System.out.println("Частота встречаемости символа \'" + ch + "\' равна " + frequency);

    }

    public static void revertingString(String str) {

        StringBuilder result = new StringBuilder(str);
        result.reverse();
        System.out.println(result);


    }

    public static void inputString(String str1, String strInput, int position) {

        StringBuilder result = new StringBuilder(str1);
        result.insert(position, strInput);
        System.out.println(result);

    }

    public static void deletingString(String str1, String delete) {

        str1 = str1.replaceAll(delete, "");
        System.out.println(str1);
    }

    public static void copy(String str, int start, int end) {

        String result = str.substring(start, end);
        System.out.println(result);

    }

    public static void length(String str) {

        System.out.println(str.length());


    }

    public static void amountOfEntries(String str, String subString) {

        StringBuilder string = new StringBuilder(str);

        int count = 0;
        int position = 0;

        while (string.indexOf(subString) != -1) {

            position = string.indexOf(subString);

            string.delete(position, position + subString.length());

            count++;
        }
        System.out.println(count);

    }

    public static void revertingWords(String str) {

        StringBuilder string = new StringBuilder(str);

        String result = "";

        int index = str.length();


        while (index != 0) {

            index = string.lastIndexOf(" ") + 1;

            result += string.substring(index) + " ";

            if (index == 0) {
                break;
            }

            string.delete(index - 1, index + string.substring(index).length());
        }

        System.out.println(result);
    }


    public static void replaceSpaces(String str) {
        System.out.println(str);
        boolean replaseFlag = false;

        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (array[i] == ' ' && replaseFlag == false) {
                array[i] = '*';
                replaseFlag = !replaseFlag;
            } else if (array[i] != ' ') {
                replaseFlag = false;
            } else if (array[i] == ' ' && replaseFlag == true) {
                array[i] = 22;
            }

        }

        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 22) {
                result += array[i];
            }
        }


        System.out.println(result);

    }


    public static void mostShortWord(String str) {

        char[] array = str.toCharArray();
        int minimalLength = 40;
        for (int i = 0, newSpacePosition = 0; i < array.length; i++) {

            if (array[i] == ' ') {

                if (minimalLength > i - newSpacePosition) {
                    minimalLength = i - newSpacePosition;
                }

                newSpacePosition = i;

            }

        }
        System.out.println(minimalLength - 1);

    }

    public static void countOfWord(String str) {

        char[] array = str.toCharArray();

        int countOfWord = 0;
        boolean checkSpace = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ' && checkSpace == false) {
                countOfWord++;
                checkSpace = true;
            } else if (array[i] == ' ' && checkSpace == true) {
                checkSpace = false;
            }

//            if(array[i] == ' '&& array[i+1]!=' ' || (i+1 == array.length)){
//                countOfWord++;
//            }
        }

        System.out.println(countOfWord);

    }

    public static void deletendExstraSpases(String str) {

        System.out.println(str);
        boolean replaseFlag = false;

        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (array[i] == ' ' && replaseFlag == false) {
                replaseFlag = !replaseFlag;
            } else if (array[i] != ' ') {
                replaseFlag = false;
            } else if (array[i] == ' ' && replaseFlag == true) {
                array[i] = 22;
            }

        }

        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 22) {
                result += array[i];
            }
        }


        System.out.println(result);

    }

    public static void extractingWords(String str) {


        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void deleteByLength(String str, int length) {

        String[] array = str.split(" ");
        String result = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != length)

                result += array[i] + " ";
        }
        System.out.println(result);

    }


    public static void changeByPosition(String str, int firstWord, int secondWord) {

        String[] array = str.split(" ");
        String result = "";


        String tempStr;
        tempStr = array[firstWord - 1];

        array[firstWord - 1] = array[secondWord - 1];

        array[secondWord - 1] = tempStr;

        for (int i = 0; i < array.length; i++) {
            result += array[i]+" ";
        }
        System.out.println(result);

    }

    public static void deleteLastWord(String str){

        String[] array = str.split(" ");
        String result = "";

        for (int i = 0; i < array.length-1; i++) {
            result += array[i]+" ";
        }
        System.out.println(result);

    }

    public static void palindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);




        if(str.equals(stringBuilder.toString())){
            System.out.println("Строка является палиндромом!");
        }
        else {
            System.out.println("Не является палиндромом");
        }
    }

    public static void replaseInMostLongWord(String str){
        String[] array = str.split(" ");
        String result = "";

        int IndexMaxLength = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[IndexMaxLength].length() < array[i].length()){
                IndexMaxLength = i;
            }


        }
        array[IndexMaxLength] = array[IndexMaxLength].replaceAll("a", "b");

        for (int i = 0; i < array.length; i++) {

            result+=array[i]+" ";

        }
        System.out.println(result);

    }
}
