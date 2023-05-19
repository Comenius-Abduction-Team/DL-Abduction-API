package abduction_api.abducible;

import abduction_api.exception.SymbolAbducibleException;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.Collection;

public interface SymbolAbducibleContainer extends AbducibleContainer {

    void addSymbol(OWLEntity symbol) throws SymbolAbducibleException;

    void addSymbols(Collection<OWLEntity> symbols) throws SymbolAbducibleException;
}
