package org.example.processor;

public abstract class AbsProcessor implements IProcessor{

    private IProcessor next;

    @Override
    public final void process() {
        handleProcess();
        if(next != null) {
            next.process();
        }
    }

    protected abstract void handleProcess();

    @Override
    public void setNext(IProcessor next) {
        this.next = next;
    }
}
