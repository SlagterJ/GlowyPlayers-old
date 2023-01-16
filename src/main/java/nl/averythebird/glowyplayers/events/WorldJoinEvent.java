/*
 * Glowy Players
 *
 * (C) Jordy Slagter
 * MIT LICENSE
 */

package nl.averythebird.glowyplayers.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import org.slf4j.Logger;

import static nl.averythebird.glowyplayers.util.Reference.getLogger;

public class WorldJoinEvent {
  private static final Logger logger = getLogger("event");

  public static void onSpawn(ServerWorld world, Entity entity) {
    if (world.isClient()) return;
    if (!(entity instanceof final PlayerEntity player)) return;

    logger.debug("Applying glowing effect to player " + player.getDisplayName());
    player.setGlowing(true);
  }
}
