package pt.pa.patterns.memento.model;

import java.util.List;

public interface Originator {

    public Memento createMemento();

    // Before level 5
    // public void setMemento(Memento savedState);
    // Level 5
    public void setMemento(Memento savedState);
}
