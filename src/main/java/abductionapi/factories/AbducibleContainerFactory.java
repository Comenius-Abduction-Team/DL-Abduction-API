package abductionapi.factories;

import abductionapi.abducibles.AbducibleContainer;

/**
 * AbductionManagerAndAbducibleContainerFactory generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 * @param <ABDUCIBLE_CONTAINER> AbducibleContainer type parameter
 */
public interface AbducibleContainerFactory<ABDUCIBLE_CONTAINER extends AbducibleContainer> {

    /**
     * Creates an abduction manager.
     * @return a new instance of AbductionManager.
     */
    ABDUCIBLE_CONTAINER createAuducibleContainer();
}
