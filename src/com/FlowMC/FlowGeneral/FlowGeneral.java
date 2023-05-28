package com.FlowMC.FlowGeneral;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import events.*;

public class FlowGeneral extends JavaPlugin implements Listener {	
	public PluginDescriptionFile pyml = getDescription();
	
  //On Server Start	
	public void onEnable() {
		this.saveDefaultConfig();
    
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Jump(this), this);
    
    // Log to console
    System.out.println("["+ pyml.getName() +"] by "+ pyml.getAuthors() +" has been enabled!");
	}
	
  //On Server Stop
	public void onDisable() {
    // Log to console
		System.out.println("["+ pyml.getName() +"] by "+ pyml.getAuthors() +" has been enabled!");
	}
}
