package com.javafriends.javabasic.homework.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private String name;
    private Human mother;
    private Human father;
    private final List<Human> children = new ArrayList<>();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public String childrenToString() {
        // like Arrays.toString();
        if (children.size() == 0) {
            return "[]";
        }
        int iMax = children.size() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; ; i++) {
            stringBuilder.append(children.get(i).getName());
            if (i == iMax)
                return stringBuilder.append(']').toString();
            stringBuilder.append(", ");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                (mother != null ? ", mother='" + mother.getName() + '\'' : "") +
                (father != null ? ", father='" + father.getName() + '\'' : "") +
                (children.size() > 0 ? ", children=" + childrenToString() : "") +
                '}';
    }
}
