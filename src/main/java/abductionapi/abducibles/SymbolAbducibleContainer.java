package abductionapi.abducibles;

import abductionapi.exception.SymbolAbducibleException;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface SymbolAbducibleContainer extends AbducibleContainer {

    void addSymbol(OWLEntity symbol) throws SymbolAbducibleException;

    void addSymbols(Collection<OWLEntity> symbols) throws SymbolAbducibleException;
}
