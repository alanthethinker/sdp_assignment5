package com.game.action;

public abstract class GameAction {
    public final void executeAction() {
        startAction();
        performAction();
        endAction();
    }

    protected void startAction() {
        System.out.println("Starting action...");
    }

    protected abstract void performAction();

    protected void endAction() {
        System.out.println("Ending action...");
    }
}