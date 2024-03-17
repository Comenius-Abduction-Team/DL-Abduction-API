package sk.uniba.fmph.dai.abduction_api.exception;

import org.semanticweb.owlapi.model.OWLEntity;

public class SymbolAbducibleException extends CommonException {

    public SymbolAbducibleException(OWLEntity symbol) {
        super("Solver does not support this type of symbol abducible: " +
                symbol + " of type " + symbol.getEntityType());
    }
}
