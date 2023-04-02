package abductionapi.manager;

import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class ExplanationWrapper {

    private final Set<OWLAxiom> axioms;
    private String textRepresentation;

    public ExplanationWrapper(Set<OWLAxiom> axioms){
        this.axioms = axioms;
    }

    public ExplanationWrapper(OWLAxiom axiom){
        axioms = Collections.singleton(axiom);
    }

    public Set<OWLAxiom> getAxiomSet(){
        return axioms;
    }

    public OWLAxiom getSingleAxiom(){
        Iterator<OWLAxiom> iter = axioms.iterator();
        if (iter.hasNext())
            return axioms.iterator().next();
        return null;
    }

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public void setTextRepresentation(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    public boolean containsMultipleAxioms(){
        return axioms.size() > 1;
    }
}
