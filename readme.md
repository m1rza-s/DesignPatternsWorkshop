# Design Patterns Workshop: Explore Our Solar System

This workshop guides you through a space mission project. Along the way, you'll learn how to build efficient, scalable solutions that support everything from launch operations to
interplanetary communication. By the end, you'll have hands-on experience with 19 design patterns used to solve real-world problems.

## Requirements

1. Intermediate understanding of Java
2. JDK 21
3. An IDE of your choice

## Why Learn Design Patterns?

- **Common Vocabulary**: Design patterns provide a standard terminology for specific scenarios
- **Proven Solutions**: They represent solutions that have been refined over time
- **Code Reusability**: They promote reusable designs
- **Anticipate Change**: They help design flexible and maintainable systems

## Getting Started

This workshop will guide you through a series of test classes. The design pattern implementations are located in `src/main/java/patterns`. Each pattern has a corresponding test class in
`src/test/java/tests`. In each test class, you will find an example test demonstrating the pattern, as well as a disabled todo test. Your task is to complete the todo.
Feel free to experiment with the patterns.

You can run the tests in order or jump directly to a specific design pattern you want to explore.

### Patterns

1. **CREATIONAL PATTERNS** 
   - focus on object creation mechanisms, providing flexible ways to instantiate objects. They abstract the instantiation process, making it easier to manage
     complex creation logic.
       - [Factory](src/test/java/tests/creational/FactoryTest.java): Centralizes object creation, making it easier to introduce new types without modifying existing code.
       - [Builder](src/test/java/tests/creational/BuilderTest.java): Separates object construction from representation, allowing for more controlled and flexible creation.
       - [Singleton](src/test/java/tests/creational/SingletonTest.java): Ensures a class has only one instance while providing a global point of access to it.
       - [Prototype](src/test/java/tests/creational/PrototypeTest.java): Creates object copies without depending on specific classes, reducing repeated initialization code.
2. **STRUCTURAL PATTERNS** 
   - deal with the composition of classes or objects, simplifying the design by identifying reusable structures. They help in
     creating robust and maintainable systems by promoting flexibility and reusability.
       - [Adapter](src/test/java/tests/structural/AdapterTest.java): Transforms between incompatible types using a middle-layer class that translates one type into another.
       - [Bridge](src/test/java/tests/structural/BridgeTest.java): Separates abstraction from implementation, enabling independent development of both.
       - [Composite](src/test/java/tests/structural/CompositeTest.java): Creates tree structures of objects, allowing uniform handling of both individual objects and compositions.
       - [Decorator](src/test/java/tests/structural/DecoratorTest.java): Wraps an object to add new functionality at runtime without modifying its structure.
       - [Facade](src/test/java/tests/structural/FacadeTest.java): Simplifies access to complex subsystems through a unified interface, enhancing readability.
       - [Flyweight](src/test/java/tests/structural/FlyweightTest.java): Minimizes memory usage by sharing common state between multiple objects instead of duplicating data.
3. **BEHAVIORAL PATTERNS** 
   - concentrate on communication between objects, defining clear interaction protocols. They encapsulate common interaction
     patterns, making it easier to manage and modify object collaborations.
       - [Chain of Responsibility](src/test/java/tests/behavioural/ResponsibilityChainTest.java): Passes requests through a chain of handlers, each deciding to process or pass to the next
         handler.
       - [Command](src/test/java/tests/behavioural/CommandTest.java): Converts method calls into objects, allowing them to be passed as arguments or switched at runtime.
       - [Mediator](src/test/java/tests/behavioural/MediatorTest.java): Centralizes communication between components, reducing direct connections and dependencies.
       - [Memento](src/test/java/tests/behavioural/MementoTest.java): Captures and restores an object's internal state without violating encapsulation.
       - [Observer](src/test/java/tests/behavioural/ObserverTest.java): Notifies subscriber objects automatically when a publisher object's state changes.
       - [State](src/test/java/tests/behavioural/StateTest.java): Changes object behavior when its state changes by delegating state-specific behavior to separate classes.
       - [Strategy](src/test/java/tests/behavioural/StrategyTest.java): Defines a family of interchangeable algorithms that can be switched at runtime.
       - [Template](src/test/java/tests/behavioural/TemplateTest.java): Defines an algorithm skeleton, letting subclasses override specific steps while keeping the structure intact.
       - [Visitor](src/test/java/tests/behavioural/VisitorTest.java): Separates algorithms from the objects they operate on, allowing new operations without changing the objects.

## Best Practices

Remember, design patterns are tools, not rules. Use them when they provide clear benefits to your code's structure, maintainability, and flexibility.

1. **Understand the problem first**: Don't force a design pattern where it doesn't fit
2. **Keep it simple**: Use the simplest pattern that solves your problem
3. **Combine patterns**: Real-world solutions often involve multiple patterns working together
4. **Document your patterns**: Make it clear which patterns you're using and why
5. **Consider trade-offs**: Every pattern has advantages and disadvantages

### Design Pattern Relationships
- **Decorator vs. Composite**: Both involve object composition, but Decorator adds responsibilities to individual objects, while Composite treats individual objects and compositions uniformly.
- **Factory vs. Builder**: Factory creates objects in a single step, while Builder constructs objects step by step.
- **Adapter vs. Bridge**: Adapter makes incompatible interfaces work together, while Bridge separates abstraction from implementation.
- **Strategy vs. State**: Strategy allows algorithms to be selected at runtime, while State allows an object to change its behavior when its internal state changes.

## Resources

- **Books**:
    - "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma, Helm, Johnson, and Vlissides (the "Gang of Four")
    - "Head First Design Patterns" by Freeman and Robson
    - "Patterns of Enterprise Application Architecture" by Martin Fowler

- **Websites**:
    - [Refactoring Guru](https://refactoring.guru/design-patterns)
    - [SourceMaking](https://sourcemaking.com/design_patterns)
    - [Java Design Patterns](https://java-design-patterns.com/)

- **Videos**:
    - [Geekific](https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=0PgkVld96VvYrPUS)
    - [Christopher Okhravi](https://www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc)
    - [Derek Banas](https://www.youtube.com/playlist?list=PLF206E906175C7E07)