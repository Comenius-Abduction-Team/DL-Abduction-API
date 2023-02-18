package abductionapi.factories;

import abductionapi.abducibles.AbducibleContainer;
import abductionapi.manager.AbductionManager;

/**
 * AbductionManagerAndAbducibleContainerFactory generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 * @param <ABDUCTION_MANAGER> AbductionManager type parameter
 * @param <ABDUCIBLE_CONTAINER> AbducibleContainer type parameter
 */
public interface AbductionManagerFactory<
        ABDUCTION_MANAGER extends AbductionManager<ABDUCIBLE_CONTAINER>,
        ABDUCIBLE_CONTAINER extends AbducibleContainer
        > {

    /**
     * Creates an abduction manager.
     * @return a new instance of AbductionManager.
     */
    public ABDUCTION_MANAGER createAbductionManager();
}
