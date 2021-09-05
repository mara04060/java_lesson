package com.alphabank.work3;

public class Runner {
    public void run() {
        MyTranslator translator = new MyTranslator();
        translator.addWords("key", "ключ");
        translator.addWords("value", "значение");
        translator.addWords("set", "установка");
        translator.addWords("Not", "Не");
        translator.addWords("correct", "корректность");
        translator.addWords("Please", "Пожалуйста");
        translator.addWords("edit", "редактировать");
        translator.addWords("and", "и");
        translator.addWords("or", "или");

        String text = translator.translate("Not correct set ! ");
        text+= "\r\n" + translator.translate("Please edit value numOfElem=15 and / or value maxValue = 10");
        System.out.println("Перевод: " +text);

    }
}
