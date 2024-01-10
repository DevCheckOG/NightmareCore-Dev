package com.nightmare.Mobs;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public final class Mobs {

    private final Random random = new Random();

    public final void setNightmareZombie(Entity entity, YamlConfiguration config) {

        Zombie mob = (Zombie) entity;

        int randomNumber = random.nextInt(40 - 15 + 1) + random.nextInt(20);
 
        if (randomNumber == 25 - 1 || randomNumber == 25 - 2 || randomNumber == 25 - 3|| randomNumber == 25 - 4) {

            mob.setVisualFire(false);
            mob.setCanPickupItems(false);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, PotionEffect.INFINITE_DURATION, 1));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 5));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 3));

            mob.setPersistent(true);

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.zombie.name_c")));
            mob.setCustomNameVisible(true);
            
            EntityEquipment equipment = mob.getEquipment();

            ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemStack leggins = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemStack boots = new ItemStack(Material.IRON_BOOTS, 1);

            ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);

            chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            leggins.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

            sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);

            equipment.setChestplate(chestplate);
            equipment.setLeggings(leggins);
            equipment.setBoots(boots);

            mob.getEquipment().setItemInMainHand(sword);

        } else if (randomNumber == 25 - 5 || randomNumber == 25 - 6 || randomNumber == 25 - 7 || randomNumber == 25 - 8 || randomNumber == 25 - 9) {

            mob.setVisualFire(false);
            mob.setCanPickupItems(false);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 4));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, PotionEffect.INFINITE_DURATION, 1));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));

            mob.setPersistent(true);

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.zombie.name_b")));
            mob.setCustomNameVisible(true);

            ItemStack sword = new ItemStack(Material.DIAMOND_AXE, 1);

            sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);

            mob.getEquipment().setItemInMainHand(sword);

        } else if (randomNumber == 25 - 10 || randomNumber == 25 - 11 || randomNumber == 25 - 12 || randomNumber == 25 - 13 || randomNumber == 25 - 14) {
            

            mob.setVisualFire(false);
            mob.setCanPickupItems(false);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, PotionEffect.INFINITE_DURATION, 1));

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.zombie.name_a")));
            mob.setCustomNameVisible(true);

        }

        return;

    }

    public final void setNightmareCreeper(Entity entity, YamlConfiguration config) {
        
        Creeper mob = (Creeper) entity;

        int randomNumber = random.nextInt(40 - 15 + 1) + random.nextInt(20);

        if (randomNumber == 25 - 1 || randomNumber == 25 - 2 || randomNumber == 25 - 3|| randomNumber == 25 - 4) {

            mob.setExplosionRadius(20);
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 4));

            mob.setPersistent(true);
            
            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.creeper.name_c")));
            mob.setCustomNameVisible(true);

            if (mob.getLocation().getY() >= mob.getWorld().getHighestBlockAt((int) mob.getLocation().getX(), (int) mob.getLocation().getZ()).getLocation().getY()) {

                mob.getWorld().spawnEntity(mob.getLocation(), EntityType.LIGHTNING);

            }

        } else if (randomNumber == 25 - 5 || randomNumber == 25 - 6 || randomNumber == 25 - 7 || randomNumber == 25 - 8 || randomNumber == 25 - 9) {

            mob.setExplosionRadius(10);
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 2));
            
            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.creeper.name_b")));
            mob.setCustomNameVisible(true);

        } else if (randomNumber == 25 - 10 || randomNumber == 25 - 11 || randomNumber == 25 - 12 || randomNumber == 25 - 13 || randomNumber == 25 - 14) {
            
            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 1));
            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.creeper.name_a")));
            mob.setCustomNameVisible(true);

        }

    }

    public final void setNightmareSpider(Entity entity, YamlConfiguration config) {
        
        Spider mob = (Spider) entity;

        int randomNumber = random.nextInt(40 - 15 + 1) + random.nextInt(20);

        if (randomNumber == 25 - 1 || randomNumber == 25 - 2 || randomNumber == 25 - 3|| randomNumber == 25 - 4) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.spider.name_c")));
            mob.setCustomNameVisible(true);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 5));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 7));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, PotionEffect.INFINITE_DURATION, 1));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, PotionEffect.INFINITE_DURATION, 1));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, PotionEffect.INFINITE_DURATION, 5));

        } else if (randomNumber == 25 - 5 || randomNumber == 25 - 6 || randomNumber == 25 - 7 || randomNumber == 25 - 8 || randomNumber == 25 - 9) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.spider.name_b")));
            mob.setCustomNameVisible(true);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 1));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 5));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, PotionEffect.INFINITE_DURATION, 3));

        } else if (randomNumber == 25 - 10 || randomNumber == 25 - 11 || randomNumber == 25 - 12 || randomNumber == 25 - 13 || randomNumber == 25 - 14) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.spider.name_a")));
            mob.setCustomNameVisible(true);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 2));

        }

    }

    public final void setNightmareSkeleton(Entity entity, YamlConfiguration config) {
        
        Skeleton mob = (Skeleton) entity;

        int randomNumber = random.nextInt(40 - 15 + 1) + random.nextInt(20);

        if (randomNumber == 25 - 1 || randomNumber == 25 - 2 || randomNumber == 25 - 3|| randomNumber == 25 - 4) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.skeleton.name_c")));
            mob.setCustomNameVisible(true);
            mob.setPersistent(true);

            EntityEquipment equipment = mob.getEquipment();

            ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
            ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            ItemStack leggins = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
            ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);

            helmet.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            helmet.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            chestplate.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            leggins.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            leggins.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            boots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            boots.addUnsafeEnchantment(Enchantment.DURABILITY, 5);

            equipment.setHelmet(helmet);
            equipment.setChestplate(chestplate);
            equipment.setLeggings(leggins);
            equipment.setBoots(boots);

            mob.setArrowCooldown(10);
            mob.setCanPickupItems(false);
            
            ItemStack bow = equipment.getItemInMainHand();

            if (bow.getType() == Material.BOW) {
                
                bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
                bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
                
                ItemMeta meta = bow.getItemMeta();

                meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lNightmare Bow &4☠"));

                bow.setItemMeta(meta);

            }

            mob.getEquipment().setItemInMainHand(bow);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 5));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 4));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, PotionEffect.INFINITE_DURATION, 1));
            
        } else if (randomNumber == 25 - 5 || randomNumber == 25 - 6 || randomNumber == 25 - 7 || randomNumber == 25 - 8 || randomNumber == 25 - 9) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.skeleton.name_b")));
            mob.setCustomNameVisible(true);
            mob.setPersistent(true);

            ItemStack helmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemStack leggins = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemStack boots = new ItemStack(Material.IRON_BOOTS, 1);

            EntityEquipment equipment = mob.getEquipment();

            helmet.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            helmet.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            chestplate.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            leggins.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            leggins.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
            boots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
            boots.addUnsafeEnchantment(Enchantment.DURABILITY, 5);

            equipment.setHelmet(helmet);
            equipment.setChestplate(chestplate);
            equipment.setLeggings(leggins);
            equipment.setBoots(boots);

            ItemStack bow = equipment.getItemInMainHand();

            if (bow.getType() == Material.BOW) {
                
                bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 7);
                bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
                
                ItemMeta meta = bow.getItemMeta();

                bow.setItemMeta(meta);

            }

            mob.getEquipment().setItemInMainHand(bow);

            mob.setArrowCooldown(20);
            mob.setCanPickupItems(false);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 5));
            
        } else if (randomNumber == 25 - 10 || randomNumber == 25 - 11 || randomNumber == 25 - 12 || randomNumber == 25 - 13 || randomNumber == 25 - 14) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.skeleton.name_a")));
            mob.setCustomNameVisible(true);

            ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);

            EntityEquipment equipment = mob.getEquipment();

            helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
            helmet.addUnsafeEnchantment(Enchantment.DURABILITY, 5);

            equipment.setHelmet(helmet);

            mob.setArrowCooldown(25);
            mob.setCanPickupItems(false);

            mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, PotionEffect.INFINITE_DURATION, 6));
            
        }

    }


    public final void setNightmareEnderman(Entity entity, YamlConfiguration config) {
        
        Enderman mob = (Enderman) entity;

        int randomNumber = random.nextInt(40 - 15 + 1) + random.nextInt(20);

        if (randomNumber == 25 - 1 || randomNumber == 25 - 2 || randomNumber == 25 - 3|| randomNumber == 25 - 4) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.enderman.name_c")));
            mob.setCustomNameVisible(true);

            mob.setCanPickupItems(false);
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 5));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 5));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, PotionEffect.INFINITE_DURATION, 1));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, PotionEffect.INFINITE_DURATION, 4));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 2));


        } else if (randomNumber == 25 - 5 || randomNumber == 25 - 6 || randomNumber == 25 - 7 || randomNumber == 25 - 8 || randomNumber == 25 - 9) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.enderman.name_b")));
            mob.setCustomNameVisible(true);

            mob.setCanPickupItems(false);
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, PotionEffect.INFINITE_DURATION, 3));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 1));


        } else if (randomNumber == 25 - 10 || randomNumber == 25 - 11 || randomNumber == 25 - 12 || randomNumber == 25 - 13 || randomNumber == 25 - 14) {

            mob.setCustomName(ChatColor.translateAlternateColorCodes('&', config.getString("config.mobs.enderman.name_a")));
            mob.setCustomNameVisible(true);

            mob.setCanPickupItems(false);
            mob.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, PotionEffect.INFINITE_DURATION, 2));
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, PotionEffect.INFINITE_DURATION, 1));

        }

    }

    
}
