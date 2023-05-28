package events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import com.FlowMC.FlowGeneral.FlowGeneral;

public class Jump implements Listener {
	public Jump(FlowGeneral pl) {}
	
	@EventHandler
	public void SuperJump(PlayerMoveEvent j) {
		Player p = j.getPlayer();
    Location l = p.getLocation();
    Block Block = p.getWorld().getBlockAt(new Location(l.getWorld(), l.getX(), l.getY() - 2.0D, l.getZ()));

      if((Block.getType() == Material.SIGN) || (Block.getType() == Material.SIGN_POST)) {
        Sign Sign = (Sign) Block.getState();
        String Line1 = Sign.getLine(1);
        String Line2 = Sign.getLine(2);

      if (Sign.getLine(0).toUpperCase().contains("[FLOWJUMP]")) {
        p.setVelocity(l.getDirection().multiply(Float.parseFloat(Line1)).add(new Vector(0, Float.parseFloat(Line2), 0)));
      }    
    }
	}
}
