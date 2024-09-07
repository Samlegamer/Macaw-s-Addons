package fr.samlegamer.mcwbiomesoplenty;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.ModList;

public class Icon
{
		public static class Properties
		{
			private boolean roofs = false;
			private boolean fences = false;
			private boolean bridges = false;
			private boolean furnitures = false;
			private boolean windows = false;
			private boolean doors = false;
			private boolean trapdoors = false;
			private boolean paths = false;
			private Block roofsIcon, fencesIcon, furnituresIcon, bridgesIcon, windowsIcon, doorsIcon, trapdoorsIcon, pathsIcon;
			private int depedencies = 0;

			/**
			 * Is For Wood Compat ex:Macaw's BOP
			 * Parameter : (roofsIcon, fencesIcon, furnituresIcon, bridgesIcon)
			 */
			public Properties(Block roofsIcon, Block fencesIcon, Block furnituresIcon, Block bridgesIcon, 
			Block windowsIcon, Block doorsIcon, Block trapdoorsIcon, Block pathsIcon)
			{
				this.roofsIcon = roofsIcon;
				this.fencesIcon = fencesIcon;
				this.furnituresIcon = furnituresIcon;
				this.bridgesIcon = bridgesIcon;
				this.windowsIcon = windowsIcon;
				this.doorsIcon = doorsIcon;
				this.trapdoorsIcon = trapdoorsIcon;
				this.pathsIcon = pathsIcon;
			}
			
			/**
			 * Is For Wood Compat ex:Macaw's BOP
			 * Parameter : (roofsIcon, fencesIcon, furnituresIcon, bridgesIcon)
			 */
			/*public Properties(RegistryObject<Item> roofsIcon, RegistryObject<Item> fencesIcon, RegistryObject<Item> furnituresIcon, RegistryObject<Item> bridgesIcon)
			{
				this.roofsIcon = roofsIcon;
				this.fencesIcon = fencesIcon;
				this.furnituresIcon = furnituresIcon;
				this.bridgesIcon = bridgesIcon;
			}
			
			/**
			 * Is For Stone Compat ex:Macaw's Quark
			 * Parameter : (roofsIcon, fencesIcon, bridgesIcon)
			 */
			public Properties(Block roofsIcon, Block fencesIcon, Block bridgesIcon)
			{
				this.roofsIcon = roofsIcon;
				this.fencesIcon = fencesIcon;
				this.bridgesIcon = bridgesIcon;
			}
			
			public Properties windows()
			{
				windows=true;
				return this;
			}
			
			public Properties doors()
			{
				doors=true;
				return this;
			}
			
			public Properties trapdoors()
			{
				trapdoors=true;
				return this;
			}
			
			public Properties paths()
			{
				paths=true;
				return this;
			}
			
			public Properties roofs()
			{
				roofs=true;
				return this;
			}
			
			public Properties fences()
			{
				fences=true;
				return this;
			}

			public Properties bridges()
			{
				bridges=true;
				return this;
			}
			
			public Properties furnitures()
			{
				furnitures=true;
				return this;
			}
			
			public Block buildWood()
			{
				loadedBool(bridges);
				loadedBool(fences);
				loadedBool(roofs);
				loadedBool(furnitures);
				loadedBool(paths);
				loadedBool(trapdoors);
				loadedBool(doors);
				loadedBool(windows);
				if(loadedAllWood())
				{
					Random rand = new Random();
		    		int i = rand.nextInt(depedencies - 1);
		    		switch (i) {
					case 1:
			    		return bridgesIcon;
					case 2:
			    		return fencesIcon;
					case 0:
			    		return roofsIcon;
					case 3:
			    		return furnituresIcon;
					case 4:
			    		return pathsIcon;
					case 5:
			    		return trapdoorsIcon;
					case 6:
			    		return doorsIcon;
					case 7:
			    		return windowsIcon;
					default:
						break;
					}
				}
				else
				{
					if(loaded("mcwfurnitures"))
					{
						return furnituresIcon;
					}
					else if(loaded("mcwbridges"))
					{
						return bridgesIcon;
					}
					else if(loaded("mcwfences"))
					{
						return fencesIcon;
					}
					else if(loaded("mcwroofs"))
					{
						return roofsIcon;
					}
					else if(loaded("mcwpaths"))
					{
						return pathsIcon;
					}
					else if(loaded("mcwdoors"))
					{
						return doorsIcon;
					}
					else if(loaded("mcwtrpdoors"))
					{
						return trapdoorsIcon;
					}
					else if(loaded("mcwwindows"))
					{
						return windowsIcon;
					}
				}
				return Blocks.CRAFTING_TABLE;
			}
			
			public Block buildStone()
			{
				loadedBool(bridges);
				loadedBool(fences);
				loadedBool(roofs);
				if(loadedAllStone())
				{
					Random rand = new Random();
		    		int i = rand.nextInt(depedencies - 1);
		    		switch (i) {
					case 1:
			    		return bridgesIcon;
					case 2:
			    		return fencesIcon;
					case 0:
			    		return roofsIcon;
					default:
						break;
					}
				}
				else
				{
					if(loaded("mcwbridges"))
					{
						return bridgesIcon;
					}
					else if(loaded("mcwfences"))
					{
						return fencesIcon;
					}
					else if(loaded("mcwroofs"))
					{
						return roofsIcon;
					}
				}
				return Blocks.CRAFTING_TABLE;
			}
					
			private void loadedBool(boolean b)
			{
				if(b) { this.depedencies=this.depedencies+1; }
			}
			
			private boolean loaded(String modid)
		    {
		    	return ModList.get().isLoaded(modid);
		    }
			
		    private boolean loadedAllStone()
		    {
		    	return loaded("mcwbridges") && loaded("mcwfences") && loaded("mcwroofs");
		    }

		    
		    private boolean loadedAllWood()
		    {
		    	return loaded("mcwbridges") && loaded("mcwfences") && loaded("mcwroofs") && loaded("mcwfurnitures") && loaded("mcwpaths") && loaded("mcwdoors") && loaded("mcwtrpdoors") && loaded("mcwwindows");
		    }
		}
	}