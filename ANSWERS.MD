# Part B

1. In Sighting, make the fields private or protected and add getters. Then answer in ANSWERS.md: what did
`private` buy you that Python's `_sightings` naming convention did not?

Java's Access modifiers gain me defensive code where developers don't have to follow convention. The fields are truly private or protected.  
2. FieldNotebook must compose its list, not inherit it. Then write two sentences on what would go wrong if
FieldNotebook extends ArrayList<Sighting>. Be specific, name a method that would become available and
should not be.

This would make flexibility of the FieldNotebook class diminished due to inheritance hierarchies. This dosen't pass the IS-A test. remove and addAll method would become available breaking the object contract of a FieldNotebook as Sightings could be arbitrairily added or removed. 
3. Add a describeAll() method to FieldNotebook that loops over List<Sighting> calling describe(). One call
site, three different outputs. In ANSWERS.md, name the mechanism that makes that work and explain where
the decision is made (compile time or run time?).

This is compile time as java staticically types during compile. This is and an example of composition and delegation.   
4. Add a second implementer of Describable that is not a Sighting — e.g. a WeatherNote. Add it to
describeAll()'s handling without changing Sighting at all. This is the moment "program to an interface"
stops being a slogan.

We should have programmed to the Descriable interface for all things in FieldNotebook. By not doing this we have coupled FieldNotebook to sightings, and made it difficult to add the WeatherNote as another Observable. 

5. Where It is

6. What Breaks 
7. Your Guess

