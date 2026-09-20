# Assignment 2: Factory Method & Abstract Factory

This project is created for the **Software Design Patterns** course. It demonstrates assembling components for two types of robots: **Combat** and **Domestic**.

## How It Works

* **Part A (Factory Method):** `CoreCreator` creates a single product — the robot's core (`Core`)
* **Part B (Abstract Factory):** `RobotFactory` creates a family of related products — the core (`Core`) and the chassis (`Chassis`)[cite: 1, 4].

---

## Clean Code Principles Applied
### 1. Meaningful Names
Class and variable names clearly reveal their intention without confusing abbreviations.
* **Bad:** `RobotFactory f = new F1();`
* **Good:** `RobotFactory combatFactory = new CombatRobotFactory();`

### 2. Small Methods
Each factory method has a single responsibility — instantiating one specific object.
```java
@Override
public Core createCore() {
    return new CombatCore();
}
```
### 3. Validated Construction
The constructor checks parameters to prevent invalid state (`null`).
```java
if (factory == null) {
    throw new IllegalArgumentException("RobotFactory cannot be null");
}
```
### 4. Decoupling via Interfaces
The client (`RobotApplication`) depends purely on abstractions, never on concrete classes.
* **Bad:** `CombatCore core = new CombatCore();`
* **Good:** `this.core = factory.createCore();`

### 5. No Magic Strings
Object variants are picked via polymorphism, avoiding hardcoded `if (type == "combat")` conditions.