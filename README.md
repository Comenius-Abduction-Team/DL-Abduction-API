# DL ABDUCTION API

An [OWL API](https://github.com/owlcs/owlapi) based Java library that provides a common interface to work with abduction solvers. 

# Update notes

## Version 3.1.0

 - `AbductionMonitor` fields are now protected.
 - Added Javadoc to most classes (mainly those not fully self-explanatory).

## Version 3.0.0

 - All interfaces now use the `I` prefix.
 - Complicated class names were simplified, e.g. `AbductionManager` → `IAbducer`
 - the `Explanation` class has been replaced with an `IExplanation` interface, allowing solvers to directly output their objects implementing the interface, instead of converting them into `Explanation` instances.
 - Observations and explanations are now always treated as sets as opposed to single objects (e.g. there is no difference between an observation and a "multi-observation" now)
 - Added new `SolverDescriptor` interface, which can be used to either statically or dynamically pass information about the solver's supported functionality, eliminating the need to manually check which interfaces are implemented and which are not (when you work universally with an unknown implementation).
 - Extended abducible interfaces with more methods.
 - Finally added a readme!
