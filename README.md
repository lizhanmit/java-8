# Java 8 Lambda Note 

If you use an interface to declare the lambda function, this interface can only have one abstract method. But it is allowed to have one or more implemented methods.  

`Runnable` interface is a typical example as it only contains one abstract method: `run()`.

From Java 8, an interface can have implemented methods. (Before Java 8, an interface can only have abstract methods.)

**Functional interface**: the interface only has one abstract method, which is used for declaring lambda functions. 

In order to make sure the interface is a functional interface and it will not be misused by others, it is a good practice to add the annotation `@FunctionalInterface` at the top of the interface, although it is optional.

## Java Build-in Functional Interfaces

Java 8 has some out-of-box interfaces for using lambda expression in common scenarios, such as `Prediction`, `Supplier`, and `Function`, so that you do not need to create an interface yourself. 

### Predicate<T>

Represents a predicate (boolean-valued function) of one argument. Accepts a single input argument and returns a boolean result. 

### Consumer<T>	

Represents an operation that accepts a single input argument and returns no result. E.g. print an object. 

### BiConsumer<T,U>	

Represents an operation that accepts two input arguments and returns no result.

## Method References 

- No input argument of the lambda expression and the method (static method)

	- Lambda expression: `() -> <method_name>()`

	- Method reference expression: `<class_name>::<method_name>`

## Iteration 

In Java 7, for loop and foreach loop are external iteration. 

In Java 8, the `forEach()` method of collection is internal iteration, which makes it possible to use multi-threading and parallelism. 

## Stream

Stream is a sequence of elements supporting sequential and parallel aggregate operations. 

Three elements of the stream: 

- Source: collection. 
- Operations that need to be performed on the stream. 
- Terminal operation or end condition.

Parallel stream can be created if multiple cores are potentially to be used. 