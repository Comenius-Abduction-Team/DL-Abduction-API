package abductionapi.manager;

import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class ExplanationWrapper {

    private final Set<OWLAxiom> explanation;

    public ExplanationWrapper(Set<OWLAxiom> axioms){
        explanation = axioms;
    }

    public ExplanationWrapper(OWLAxiom axiom){
        explanation = Collections.singleton(axiom);
    }

    public Set<OWLAxiom> getExplanationSet(){
        return explanation;
    }

    public OWLAxiom getExplanationAxiom(){
        Iterator<OWLAxiom> iter = explanation.iterator();
        if (iter.hasNext())
            return explanation.iterator().next();
        return null;
    }

}
