//Класс
public class Point {
 /**ключевое слова privet - сделано для того, что бы в другом классе не могли изменятьвызывать эти поля и в
  * них менять значения.
  * Ключевое слово final - делает это поле как константой. То есть как бы из ссылочного типа данных
  * делает примитивным. Хоть и передаём копию ссылки в памяти, но при этом поменять значения нельзя.
  * Смысл ключевого слова private уже подразумевает, что подкласс не может переопределить метод и
  * описание private метода еще и как final — избыточно.
  * Подробно тут https://pro-prof.com/forums/topic/private-final-java */
    private final double pointX;
    private final double pointY;
    private final String pointName;


/** Конструктор */
    public Point(double pointX, double pointY, String pointName) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointName = pointName;
    }
 /** Ключивае слово this - означет "Это" в этом обекте положи "pointX" положи
  * это значение "pointX", это нужно дабы избежать конфликта имён.*/
    public Point inverse() {
        return new Point(pointY, pointX, pointName);
    }

    public void printSelf() {
        System.out.println("pointX: " + pointX + " pointY: " + pointY);
    }

    public void setArg100(int arg) {
        arg = 100;
    }
}