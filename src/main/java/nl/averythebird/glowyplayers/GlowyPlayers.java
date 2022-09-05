package nl.averythebird.glowyplayers;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

import static nl.averythebird.glowyplayers.Reference.getLogger;

public class GlowyPlayers implements ModInitializer {
	public static final Logger logger = getLogger("main");

	@Override
	public void onInitialize() {
		logger.info("GlowyPlayers started up!");
	}
}
