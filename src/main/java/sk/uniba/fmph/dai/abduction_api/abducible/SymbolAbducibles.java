package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.SymbolAbducibleException;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.Collection;
import java.util.Set;

public interface SymbolAbducibles extends IAbducibles {

    void add(OWLEntity symbol) throws SymbolAbducibleException;

    void addAll(Collection<OWLEntity> symbols) throws SymbolAbducibleException;

    void remove(OWLEntity symbol) throws SymbolAbducibleException;

    void removeAll(Collection<OWLEntity> symbols) throws SymbolAbducibleException;

    void setSymbols(Collection<OWLEntity> symbols) throws SymbolAbducibleException;

    Set<OWLEntity> getSymbols();

}
