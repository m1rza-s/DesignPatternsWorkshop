# Design Patterns Workshop: Explore Our Solar System

This workshop guides you through a space mission project. As you work through the project, you'll learn how to create efficient, scalable
solutions that ensure smooth operations, from the launch to interplanetary communication. By the end, you'll have a hands-on understanding
of 19 design patterns that help solve real problems.

## Requirements

1. intermediate understanding of Java
2. JDK 21
3. an IDE of your choice

## HowTo

This workshop will have you pass through a series of test classes. The patterns are located in the `src/main/java/patterns` directory.
Each class will guide you through a specific design pattern. Every pattern is paired with a test class in the `src/test/java/tests`
directory. In you will find a test which showcases the pattern, alongside a disabled todo test. Your task is to complete the todo. You are
free to experiment with the pattern.

You can either the tests in order or jump to a specific design pattern you want to learn about.

### Creational Patterns

Creational patterns focus on object creation mechanisms, providing flexible ways to instantiate objects. They abstract the instantiation
process, making it easier to manage complex creation logic

- [Factory](src/test/java/tests/creational/FactoryTest.java)
- [Builder](src/test/java/tests/creational/BuilderTest.java)
- [Singleton](src/test/java/tests/creational/SingletonTest.java)
- [Prototype](src/test/java/tests/creational/PrototypeTest.java)

### Structural Patterns

Structural patterns deal with the composition of classes or objects, simplifying the design by identifying reusable structures. They help in
creating robust and maintainable systems by promoting flexibility and reusability.

- [Adapter](src/test/java/tests/structural/AdapterTest.java)
- [Bridge](src/test/java/tests/structural/BridgeTest.java)
- [Composite](src/test/java/tests/structural/CompositeTest.java)
- [Decorator](src/test/java/tests/structural/DecoratorTest.java)
- [Facade](src/test/java/tests/structural/FacadeTest.java)
- [Flyweight](src/test/java/tests/structural/FlyweightTest.java)

### Behavioral Patterns

Behavioral patterns concentrate on communication between objects, defining clear interaction protocols. They encapsulate common interaction
patterns, making it easier to manage and modify object collaborations.

- [Chain of Responsibility](src/test/java/tests/behavioural/ResponsibilityChainTest.java)
- [Command](src/test/java/tests/behavioural/CommandTest.java)
- [Mediator](src/test/java/tests/behavioural/MediatorTest.java)
- [Memento](src/test/java/tests/behavioural/MementoTest.java)
- [Observer](src/test/java/tests/behavioural/ObserverTest.java)
- [State](src/test/java/tests/behavioural/StateTest.java)
- [Strategy](src/test/java/tests/behavioural/StrategyTest.java)
- [Template](src/test/java/tests/behavioural/TemplateTest.java)
- [Visitor](src/test/java/tests/behavioural/VisitorTest.java)

## Resources

- [Geekific](https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=0PgkVld96VvYrPUS)
- [Refactoring Guru](https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=0PgkVld96VvYrPUS)
---