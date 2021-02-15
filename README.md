## Design Patterns

<hr>

### Behavioral Patterns

<b>Memento</b>: Allows restoring an object to a previous state.

<b>State</b>: Allows an object to behave differently depending on the state it is in.

<b>Iterator</b>: Allows iterating over an object without having to expose the object’s internal structure (which may change in the future).

<b>Strategy</b>: Allows passing different algorithms (behaviours) to an object. Allows defining a template (skeleton) for an operation. Specific steps will then
be implemented in subclasses.

<b>Command</b>: Allows decouple a sender from a receiver. The sender will talk to the receive through a command. Commands can be undone and persisted.

<b>Observer</b>: Allows an object notify other objects when its state changes. 

<b>Mediator</b>: Allows an object to encapsulate the communication between other objects.

<b>Chain of Responsibility</b>: Allows building a chain of objects to process a request.

<b>Visitor</b>: Allows adding new operations to an object structure without modifying it.

<hr>

### Structural Patterns

<b>Composite</b>: Represents object hierarchies where individual objects and compositions of objects are treated the same way.

<b>Adapter</b>: Allows converting the interface of a class into another interface that clients expect.

<b>Decorator</b>: Adds additional behavior to an object dynamically.

<b>Facade</b>: Provides a simplified, higher-level interface to a subsystem. Clients can talk to the facade rather than individual classes in the subsystem.

<b>Flyweight</b>: Allows sharing common state between multiple objects.

<b>Bridge</b>: Allows representing hierarchies that grow in two different dimensions independently.

<b>Proxy</b>: Allows providing a substitute for another object. The proxy object delegates all the work to the target object and contains some additional behavior.
