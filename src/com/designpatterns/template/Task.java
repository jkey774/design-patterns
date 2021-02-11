package com.designpatterns.template;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    // where we define a template for executing our tasks
    public void execute() {
        auditTrail.record();

        // what happens after is determined by subclasses
        doExecute();
    }

    protected abstract void doExecute();
}
