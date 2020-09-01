package com.DesignPattern.prototype.solution1;

/**
 * 羊
 */
public class Sheep {
    private String name;
    private String color;

    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
