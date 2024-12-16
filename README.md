# Scala Auxiliary Constructor Subtleties

This repository demonstrates a subtle issue that can arise when using auxiliary constructors in Scala, specifically concerning how they can affect subclassing.

## The Problem

The `MyClass` class utilizes an auxiliary constructor. While functional, this design may introduce unexpected behavior when extending this class. The core issue is the way the `x` variable is initialized and potentially accessed/modified by subclasses.

## Solution

The solution involves a more careful and explicit approach to managing the initialization of member variables in conjunction with auxiliary constructors. Ensuring that subclasses have clear and predictable access to these variables is vital.