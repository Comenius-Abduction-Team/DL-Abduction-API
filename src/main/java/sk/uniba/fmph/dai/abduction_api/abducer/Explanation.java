package sk.uniba.fmph.dai.abduction_api.abducer;

import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Explanation {

    private final Set<OWLAxiom> axioms;
    private String textRepresentation;
    private final int size;

    public Explanation(String textRepresentation){
        axioms = new HashSet<>();
        this.textRepresentation = textRepresentation;
        size = 0;
    }

    public Explanation(Set<OWLAxiom> axioms, String textRepresentation){
        this.axioms = axioms;
        this.textRepresentation = textRepresentation;
        size = axioms.size();
    }

    public Explanation(OWLAxiom axiom, String textRepresentation){
        axioms = Collections.singleton(axiom);
        this.textRepresentation = textRepresentation;
        size = 1;
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

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return textRepresentation;
    }
}
