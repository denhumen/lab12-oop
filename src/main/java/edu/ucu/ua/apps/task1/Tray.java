package edu.ucu.ua.apps.task1;

public class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Tray tray) {
        this.next = tray;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        }
        else if (amount  % denomination > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("You should take " + amount / denomination + " of denomination " + denomination);
    }
}