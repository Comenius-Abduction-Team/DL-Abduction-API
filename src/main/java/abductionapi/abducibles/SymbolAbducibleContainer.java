package abductionapi.abducibles;

import abductionapi.exception.SymbolAbducibleException;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.List;
import java.util.Set;


/**
 * * Interface declaring methods to add abducibles in the form of DL symbol names.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public interface SymbolAbducibleContainer {

    /**
     * Method that adds symbol to an enumeration that is enabled at abduction.
     *
     * @param symbol a symbol to be enabled at abduction
     * @throws SymbolAbducibleException if solver does not support this type of abducible symbol.
     */
    void addSymbol(OWLEntity symbol) throws SymbolAbducibleException;

    /**
     * Method that adds set of symbols to an enumeration that are enabled at abduction.
     *
     * @param symbols to be enabled at abduction. Can be individuals, roles or concepts.
     * @throws SymbolAbducibleException if solver does not support this type of abducible symbol.
     */
    void addSymbols(Set<OWLEntity> symbols) throws SymbolAbducibleException;

    /**
     * Method that adds list of symbols to an enumeration that are enabled at abduction.
     *
     * @param symbols to be enabled at abduction. Can be individuals, roles or concepts.
     * @throws SymbolAbducibleException if solver does not support this type of abducible symbol.
     */
    void addSymbols(List<OWLEntity> symbols) throws SymbolAbducibleException;
}
