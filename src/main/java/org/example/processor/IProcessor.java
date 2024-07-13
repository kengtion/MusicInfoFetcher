package org.example.processor;

public interface IProcessor {

    void process();

    void setNext(IProcessor next);
}
