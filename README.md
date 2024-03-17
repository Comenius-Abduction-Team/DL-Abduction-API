# DL ABDUCTION API

An OWL API based Java library that provides a common interface to work with abduction solvers. 

# Update notes

## Version 2.2.0

 - Complicated class names were simplified, e.g. `AbductionManager` → `Abducer`
 - Observations and explanations are now always treated as sets as opposed to single objects (e.g. there is no difference between an observation and a "multi-observation" now)
 - Added new `SolverDescriptor` interface, which can be used to either statically or dynamically pass information about the solver's supported functionality, eliminating the need to manually check which interfaces are implemented and which are not (when you work universally with an unknown implementation).
 - Extended abducible interfaces with more methods.
 - Finally added a readme!
