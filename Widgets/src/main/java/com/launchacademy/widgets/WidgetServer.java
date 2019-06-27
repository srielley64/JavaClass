package com.launchacademy.widgets;

import com.launchacademy.widgets.model.Widget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class WidgetServer {

  private List<Widget> widgetList = new ArrayList<>();

  public List<Widget> getWidgetList() {
    return widgetList;
  }

  public void setWidgetList(List<Widget> widgetList) {
    this.widgetList = widgetList;
  }

  public Iterator<Widget> iterator() {
    return widgetList.iterator();
  }

  public <T> T[] toArray(T[] a) {
    return widgetList.toArray(a);
  }

  public boolean add(Widget widget) {
    return widgetList.add(widget);
  }

  public boolean addAll(Collection<? extends Widget> c) {
    return widgetList.addAll(c);
  }

  public boolean addAll(int index,
      Collection<? extends Widget> c) {
    return widgetList.addAll(index, c);
  }

  public void replaceAll(
      UnaryOperator<Widget> operator) {
    widgetList.replaceAll(operator);
  }

  public void sort(Comparator<? super Widget> c) {
    widgetList.sort(c);
  }

  public Widget set(int index, Widget element) {
    return widgetList.set(index, element);
  }

  public void add(int index, Widget element) {
    widgetList.add(index, element);
  }

  public boolean removeIf(
      Predicate<? super Widget> filter) {
    return widgetList.removeIf(filter);
  }

  public void forEach(
      Consumer<? super Widget> action) {
    widgetList.forEach(action);
  }
}
