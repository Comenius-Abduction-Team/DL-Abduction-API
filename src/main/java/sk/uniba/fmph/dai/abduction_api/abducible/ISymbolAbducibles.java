package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.SymbolAbducibleException;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.Collection;
import java.util.Set;

/**
 * Interface of an object storing the symbol abducibles - the only individuals, classes, roles... that are allowed to
 * occur in the explanation axioms.
 */
public interface ISymbolAbducibles extends IAbducibles {

    void add(OWLEntity symbol) throws SymbolAbducibleException;

    void addAll(Collection<OWLEntity> symbols) throws SymbolAbducibleException;

    void remove(OWLEntity symbol) throws SymbolAbducibleException;

    void removeAll(Collection<OWLEntity> symbols) throws SymbolAbducibleException;

    void setSymbols(Set<OWLEntity> symbols) throws SymbolAbducibleException;

    Set<OWLEntity> getSymbols();

}
