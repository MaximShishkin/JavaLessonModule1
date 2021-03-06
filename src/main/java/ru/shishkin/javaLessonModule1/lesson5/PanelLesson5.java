package ru.shishkin.javaLessonModule1.lesson5;

//библиотеки
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelLesson5 extends JPanel {
    // конструктор класса
    PanelLesson5() {
        Random rnd = new Random();
        // описание таймера
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // устанавливаем случайны цвет
                setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
            }
        });

        // запуск таймера
        timer.start();
    }
}
