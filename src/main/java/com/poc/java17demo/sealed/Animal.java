package com.poc.java17demo.sealed;

public sealed abstract class Animal permits Dog, Cat {

    public abstract String makeSound();

}
