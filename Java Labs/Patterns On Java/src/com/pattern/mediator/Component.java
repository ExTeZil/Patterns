package com.pattern.mediator;

public interface Component {
    void setMediator(Mediator mediator);
    void notify(String event);
}