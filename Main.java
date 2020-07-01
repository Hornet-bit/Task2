package by.epamtc.task2.main;

import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {
	    String string = "123456789";
        Utils.divisionByEvenOdd(string);

        String persentStr = "аааaaaААА";
        Utils.persent(persentStr);

        String sameSumbols = "abcdaefj";
        Utils.deletingIdentical(sameSumbols);

        //Частота встречаемости символа в строке
        Utils.frequency("mamihlapinatapai", 'a');

        //Переворот строки
        Utils.revertingString("a b c d e f");

//        ..Вставка подстроки
       Utils.inputString("string","AAA", 3 );

//        Удаление подстроки
        Utils.deletingString("abcdef", "def");


//        Копирование части строки
        Utils.copy("мыла раму", 5, 9);

//        Определение длины строки
        Utils.length("Длина строки");

//        Количество вхождений подстроки в строку
        Utils.amountOfEntries("aaabbbaaaaaa", "aaa");

//        Вывести слова строки в обратном порядке
        Utils.revertingWords("Мама мыла раму");

//        Заменить пробел и группы пробелов символом "*"
        Utils.replaceSpaces("  aaa bbbb   cccc  ");

//        Заменить в самом длинном слове строки буквы 'a' на 'b'
Utils.replaseInMostLongWord("aba aabbaaabbccccaab abbacc");



//        Определить длину самого короткого слова в строке
Utils.mostShortWord("aa bbbbbbb c eeeeeee ");

//        Подсчет количества слов в строке
        Utils.countOfWord(" aaaaa bb  cccccc  dd ");


//        Поменять слова местами
        Utils.changeByPosition("aaa bb cccc dddd", 2, 4);


//        Удаление последнего слова в строке
        Utils.deleteLastWord("aaaa bbb cccccc");

//        Добавление пробелов в строку
        Utils.addSpace("abcdef");


//        Является ли строка палиндром?
Utils.palindrome("aba");


//        Замена подстроки в строке
Utils.replaceSubstring("ABCD", "A", "W");


//        Удаление из строки слов заданной длины
Utils.deleteByLength("aaa aa bbbb bbb c ccc cc", 3);

//        Удаление лишних пробелов
Utils.deletendExstraSpases(" aaa    aaa a aaaa aaa");


//        Выделение слов из строки
Utils.extractingWords("aaa bbbbb cccccc");
    }

}
