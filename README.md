# Learn-Java-Lambdas
A series to learn about Java lambdas

There are 2 key concepts to understanding Lambda's

- Lambda Expression
- Functional interface


``
A lambda expression is an anonymous method.
``

### X-tics of a lambda expression

- It's part of an anonymous class. So it's not executed on its own. Instead, it is used to implement a method defined by a functional interface.

``NB: Lambda expressions are also known as closures``

`` A functional interface is an interface that contains one and only one abstract method``

### History

#### Motivation
Lambda's in Java started as an attempt to bring functional programming paradigm concepts into
Java. One of the key functional programming ideas were _declarative programming_. The idea expresses what should be done with data rather than how it should be done.

#### Effects

- Streamlined the way constructs are implemented. i.e. Now you no longer needed 
an implementation class to access an interface method
- Took advantage of parallel processing capabilities of multicore environments by being the foundation needed for Streams API
to be built on.