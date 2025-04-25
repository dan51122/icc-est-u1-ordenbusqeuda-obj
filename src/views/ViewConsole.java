package views;

import models.Persona;

public class ViewConsole {
    public void printArray(Persona[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
