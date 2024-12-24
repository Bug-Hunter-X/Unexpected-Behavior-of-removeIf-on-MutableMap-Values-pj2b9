# Unexpected Behavior of removeIf on MutableMap Values in Kotlin

This repository demonstrates an unexpected behavior of the `removeIf` function when used with the values of a `MutableMap` in Kotlin.  While `removeIf` functions correctly on `MutableList`s, applying it directly to the `values` of a `MutableMap` does not result in the expected modifications to the map.

The `Bug.kt` file shows the unexpected behavior. The `BugSolution.kt` file illustrates the correct approach to remove elements from a map based on a condition.