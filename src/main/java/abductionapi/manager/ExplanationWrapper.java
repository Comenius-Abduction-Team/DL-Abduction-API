package abductionapi.manager;

import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExplanationWrapper {

    private final Set<OWLAxiom> axioms;
    private String textRepresentation;

    public ExplanationWrapper(String textRepresentation){
        axioms = new HashSet<>();
        this.textRepresentation = textRepresentation;
    }

    public ExplanationWrapper(Set<OWLAxiom> axioms, String textRepresentation){
        this.axioms = axioms;
        this.textRepresentation = textRepresentation;
    }

    public ExplanationWrapper(OWLAxiom axiom, String textRepresentation){
        axioms = Collections.singleton(axiom);
        this.textRepresentation = textRepresentation;
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
