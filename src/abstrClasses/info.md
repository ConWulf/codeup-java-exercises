# Interfaces & Abstract Classes - Cheat Sheet

### Both of Them
Think of an `interface` or an `abstract class` like a **set of rules/requirements** for the class that uses them.

`public interface/abstract class truck` (rules) | `public class Car implements truck` (follows all the rules)
---|---
generateHorsepower() | public void generateHorsepower(){...}
burnFuelEfficiently() | public void burnFuelEfficiently(){...}
turnOnAc() | public void turnOnAc(){...}
⬆ _(here's what should exist️)_ |⬆ _(here's the actual function written out when this interface is implemented)_

## Abstract Class (extends)

- Good for declaring non-public members (abstrClasses.interfaces.interfaces only allow public)
- Easier to add methods in the future without breaking functionality
- Can partially implement functionality (write out the methods), whereas you can’t implement ANY functionality in an interface.
- **Contains**
    - instance and static variables.
    - instance and static constants.
    - instance and static methods.

## Interface (implements)

- Good for providing common functionality to unrelated classes
- Good when we want to implement multiple abstrClasses.interfaces.interfaces
- If we’re designing small, concise bits of functionality, use abstrClasses.interfaces.interfaces. If we’re designing large functionality, use an abstract class.
- **Contains**
    - abstract methods.
    - static constants.