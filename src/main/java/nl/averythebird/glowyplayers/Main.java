/*
 * Glowy Players
 *
 * (C) Jordy Slagter
 * MIT LICENSE
 */

package nl.averythebird.glowyplayers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import nl.averythebird.glowyplayers.events.WorldJoinEvent;
import org.slf4j.Logger;

import static nl.averythebird.glowyplayers.util.Reference.getLogger;

public class Main implements ModInitializer {
  private static final Logger logger = getLogger("main");

  @Override
  public void onInitialize() {
    logger.info("GlowyPlayers started up!");
    registerEvents();
  }

  private void registerEvents() {
    ServerEntityEvents.ENTITY_LOAD.register(
      (Entity entity, ServerWorld world) -> WorldJoinEvent.onSpawn(world, entity));
    logger.info("Registered events.");
  }
}
