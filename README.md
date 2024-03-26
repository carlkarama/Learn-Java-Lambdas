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

#### Fundamentals of lambda expressions

A lambda expression is divided into 2 parts. 

- _The left side_. Specifies any parameters required by the lambda expression. If there aren't any parameters it is left empty.
- _The right side_. Also known as the _lambda body_. Which specifies the actions of the lambda expression. 


Example 1

```java
() -> 123.45
```

The example above is a concise version of the method below

```java
double myMethod() { return 123.45 } 
```

Example 2

```java
 (n) -> (n % 2) == 0 
 ```

If you notice from the example above, _n_ does not have a type specified. That is because the return type in lambdas are _inferred_

### Functional Interfaces

`` A functional interface is an interface that specifies only one abstract method.``

Since a lambda expression isn't executed on its own, you should note the lambda forms
the implementation of the abstract method defined by the functional interface that specifies the target type (interface).

```java
interface MyNumber {
    double getValue();
}
```

```java
public class LambdaExample {
    public static void main(String[]args) {
        
        MyNumber myNumber;
        
        myNumber = () -> 123.45;
    }
}
```

`` A target type context is th process that occurs when a lambda expression is assigned to a functional interface
reference.``

In the above example, when a lambda expression occurs within the target type context, an instance of a class is automatically created that implements the functional interface, with a 
lambda expression defining the behaviour of the abstract method declared by the functional interface.

When that method is called through the target, the lambda expression is executed.

``NB: A lambda expression gives us a way to transform code segments into an object.``