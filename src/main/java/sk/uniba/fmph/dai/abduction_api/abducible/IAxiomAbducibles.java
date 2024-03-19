package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.AxiomAbducibleException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Collection;

public interface IAxiomAbducibles extends IAbducibles {

    void add(OWLAxiom axiom) throws AxiomAbducibleException;

    void addAll(Collection<OWLAxiom> axioms) throws AxiomAbducibleException;

    void remove(OWLAxiom axiom) throws AxiomAbducibleException;

    void removeAll(Collection<OWLAxiom> axioms) throws AxiomAbducibleException;

    void setAxioms(Collection<OWLAxiom> axioms) throws AxiomAbducibleException;

    Collection<OWLAxiom> getAxioms();
}
