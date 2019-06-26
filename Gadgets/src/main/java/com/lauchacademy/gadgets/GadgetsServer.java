package com.lauchacademy.gadgets;

import com.lauchacademy.gadgets.model.Gadget;
import java.util.ArrayList;
import java.util.List;

public class GadgetsServer {

  private static final List<Gadget> gadgetList = new ArrayList<>();

  public GadgetsServer() {
  }

  public void add(Gadget g) {
    gadgetList.add(g);
  }

  public Gadget get(int id) {
    for (Gadget g : gadgetList) {
      if (g.getId()==id) {
        return g;
      }
    }
    return null;
  }

  public List<Gadget> getGadgetList() {
    return gadgetList;
  }

  public boolean remove(Gadget gadget) {
    return gadgetList.remove(gadget);
  }

  public Gadget remove(int id) {
    return gadgetList.remove(id);
  }

}
