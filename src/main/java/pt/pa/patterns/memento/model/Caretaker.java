/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.pa.patterns.memento.model;

import java.util.*;

public class Caretaker {
  // Nivel 2
  // private Memento memento;

  // Nível 5
  private Stack<Memento> mementos;

  private Originator originator;

  public Caretaker(Originator originator) {
    // Nível 2
    // this.memento = null;
    //
    this.mementos = new Stack<>();
    this.originator = originator;
  }

  void saveState() {
    // Nível 2
    // memento = originator.createMemento();

    // Nível 5
    mementos.push(originator.createMemento());
  }

  void restoreState() {
    // Nível 2
//    if (memento==null)
//      throw new NoMementoException("No memento.");
//    originator.setMemento(memento);

   // Nível 5
   if (mementos.isEmpty())
     throw new NoMementoException("No memento.");
   originator.setMemento(mementos.pop());
  }
}
