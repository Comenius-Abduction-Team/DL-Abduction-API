package abduction_api.abducible;

import abduction_api.exception.AxiomAbducibleException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Collection;
import java.util.Set;

public interface AxiomAbducibleContainer extends AbducibleContainer {

    void addAxiom(OWLAxiom axiom) throws AxiomAbducibleException;

    void addAxioms(Collection<OWLAxiom> axioms) throws AxiomAbducibleException;

    void setAxioms(Collection<OWLAxiom> axioms) throws AxiomAbducibleException;

    Set<OWLAxiom> getAxioms();
}
