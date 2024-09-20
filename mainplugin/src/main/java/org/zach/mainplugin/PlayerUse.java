package org.zach.mainplugin;

import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class PlayerUse implements Listener {
    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event) {

        Player p = event.getPlayer();

            if (p.getInventory().getItemInMainHand().equals(ItemManager.Fire_Wand)) {

            Fireball fire = p.getWorld().spawn(event.getPlayer().getLocation().add(new Vector(0.0D, 2.0D, 0.0D)), Fireball.class);
            fire.setFireTicks(0);
            fire.setShooter(p);
        }
    }
}