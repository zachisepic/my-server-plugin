package org.zach.mainplugin.mobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;

public class the_doctor {

    public the_doctor(Location location){
        Zombie zombie = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);

        zombie.setAdult();
        zombie.setCustomName(ChatColor.RED + "THE DOCTOR");
        zombie.setHealth(200.0);
        zombie.setFireTicks(0);
        zombie.setGlowing(true);

    }
}
