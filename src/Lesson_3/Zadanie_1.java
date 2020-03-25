package Lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class Zadanie_1 {

        private static final String text = "Мчатся тучи вьются тучи " +
                "Невидимкою луна " +
                "Освещает снег летучий " +
                "Мутно небо ночь мутна; " +
                "Еду еду в чистом поле " +
                "Колокольчик дин-дин-дин " +
                "Страшно страшно поневоле " +
                "Средь неведомых равнин ";

        private static final String[] words = text.split(" ");

        public static void main(String[] args) {

            HashSet<String> setWords = new HashSet<>(); // здесь убираются дубликаты
            for (String a : words) {
                setWords.add(a);
//            System.out.println(a);
            }

            HashMap<String, Integer> mapWords = new HashMap<String, Integer>(); // здесь считаем кол-во слов

            for (String b : words) {

                String lowB = b.toLowerCase();// Убираем регистр букв

                if (mapWords.containsKey(lowB)) {
                    mapWords.put(lowB, mapWords.get(lowB) + 1);
                } else {
                    mapWords.put(lowB, 1);
                }
            }
            System.out.println(mapWords);

        }

    }

// 1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
//    - Найти список слов, из которых состоит текст (дубликаты не считать);
//    - Посчитать сколько раз встречается каждое слово (использовать HashMap);


