package MyHero_Items.Core;

import MyHero_Core.Core.MyHeroMain;
import cn.nukkit.plugin.PluginBase;

public class MyHeroMain_Items extends PluginBase
{
	public static MyHeroMain_Items Main;
	public void onEnable()
	{
		Main = this;
		MyHeroMain.getMyHeroData().InitcializeDataItems();
		MyHeroMain.getMyHeroData().getDataItems().Start();
		
		
		//this.getServer().getPluginManager().registerEvents(this,this);
		//this.getLogger().info("-----Start load Items ------");
		/*ItemStackOptionManager.Load();
		ItemStackManager.LoadItems();*/
		
	}
	
	/*@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if(args.length > 0)
			switch (args[0]) {
				case "items":
						if(args.length > 1)
						{
							String ItemName = args[1];
							if( ItemStackManager.ItemList.containsKey(ItemName))
								if(args.length > 2)
								{
									Player p = this.getServer().getPlayerExact(args[2]);
									if(sender instanceof Player && p != null)
										p.getInventory().addItem(ItemStackManager.ItemList.get(ItemName).getItem());
									else
										sender.sendMessage(LangManager.Prefix + "Error while executing the command");
								
									
								}
								else
								{
									if(sender instanceof Player )
										((Player)sender).getInventory().addItem(ItemStackManager.ItemList.get(ItemName).getItem());
									else
										sender.sendMessage(LangManager.Prefix + "Error while executing the command");
								}
						}
					break;
				
				case "reload":
					ItemStackManager.Reload();
					break;
			}
		return true;
	}*/
}
