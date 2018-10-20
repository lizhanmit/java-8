# Java 8 Lambda Note 

If you use an interface to declare the lambda function, this interface can only have one abstract method. But it is allowed to have one or more implemented methods.  

Runnable interface is a typical example as it only contains one abstract method: run().

> From Java 8, an interface can have implemented methods. (Before Java 8, an interface can only have abstract methods.)

Functional interface: the interface only has one abstract method, which is used for declaring lambda functions. 

In order to make sure the interface is a functional interface and it will not be misused by others, it is a good practice to add the annotation `@FunctionalInterface` at the top of the interface, although it is optional.

Java 8 has some out-of-box interfaces for using lambda expression in common scenarios, such as `Prediction`, `Supplier`, and `Function`, so that you do not need to create an interface yourself. 
