package com.launchacademy.bakery;

import com.launchacademy.bakery.model.Order;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class OrderServer {
  private static final List<Order> orderList = new ArrayList<>();

  public static List<Order> getOrderList() {
    return orderList;
  }

  public static int size() {
    return orderList.size();
  }

  public static boolean isEmpty() {
    return orderList.isEmpty();
  }

  public static boolean contains(Object o) {
    return orderList.contains(o);
  }

  public static Iterator<Order> iterator() {
    return orderList.iterator();
  }

  public static Object[] toArray() {
    return orderList.toArray();
  }

  public static <T> T[] toArray(T[] a) {
    return orderList.toArray(a);
  }

  public static boolean add(Order order) {
    return orderList.add(order);
  }

  public static boolean remove(Object o) {
    return orderList.remove(o);
  }

  public static boolean containsAll(Collection<?> c) {
    return orderList.containsAll(c);
  }

  public static boolean addAll(Collection<? extends Order> c) {
    return orderList.addAll(c);
  }

  public static boolean addAll(int index, Collection<? extends Order> c) {
    return orderList.addAll(index, c);
  }

  public static boolean removeAll(Collection<?> c) {
    return orderList.removeAll(c);
  }

  public static boolean retainAll(Collection<?> c) {
    return orderList.retainAll(c);
  }

  public static void replaceAll(UnaryOperator<Order> operator) {
    orderList.replaceAll(operator);
  }

  public static void sort(Comparator<? super Order> c) {
    orderList.sort(c);
  }

  public static void clear() {
    orderList.clear();
  }

  public static Order get(int index) {
    return orderList.get(index);
  }

  public static Order set(int index, Order element) {
    return orderList.set(index, element);
  }

  public static void add(int index, Order element) {
    orderList.add(index, element);
  }

  public static Order remove(int index) {
    return orderList.remove(index);
  }

  public static int indexOf(Object o) {
    return orderList.indexOf(o);
  }

  public static int lastIndexOf(Object o) {
    return orderList.lastIndexOf(o);
  }

  public static ListIterator<Order> listIterator() {
    return orderList.listIterator();
  }

  public static ListIterator<Order> listIterator(int index) {
    return orderList.listIterator(index);
  }

  public static List<Order> subList(int fromIndex, int toIndex) {
    return orderList.subList(fromIndex, toIndex);
  }

  public static Spliterator<Order> spliterator() {
    return orderList.spliterator();
  }

  public static <E> List<E> of() {
    return List.of();
  }

  public static <E> List<E> of(E e1) {
    return List.of(e1);
  }

  public static <E> List<E> of(E e1, E e2) {
    return List.of(e1, e2);
  }

  public static <E> List<E> of(E e1, E e2, E e3) {
    return List.of(e1, e2, e3);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4) {
    return List.of(e1, e2, e3, e4);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5) {
    return List.of(e1, e2, e3, e4, e5);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
    return List.of(e1, e2, e3, e4, e5, e6);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
    return List.of(e1, e2, e3, e4, e5, e6, e7);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
    return List.of(e1, e2, e3, e4, e5, e6, e7, e8);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
    return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9);
  }

  public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
    return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
  }

  @SafeVarargs
  public static <E> List<E> of(E... elements) {
    return List.of(elements);
  }

  public static <E> List<E> copyOf(Collection<? extends E> coll) {
    return List.copyOf(coll);
  }

  public static <T> T[] toArray(IntFunction<T[]> generator) {
    return orderList.toArray(generator);
  }

  public static boolean removeIf(Predicate<? super Order> filter) {
    return orderList.removeIf(filter);
  }

  public static Stream<Order> stream() {
    return orderList.stream();
  }

  public static Stream<Order> parallelStream() {
    return orderList.parallelStream();
  }

  public static void forEach(Consumer<? super Order> action) {
    orderList.forEach(action);
  }
}
