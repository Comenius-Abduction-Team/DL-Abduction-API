package sk.uniba.fmph.dai.abduction_api.abducer;

import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.*;

public interface IExplanation {

    Set<OWLAxiom> getAxiomSet();

    String getTextRepresentation();

    int size();
}
