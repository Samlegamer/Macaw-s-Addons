package fr.samlegamer.mcwbyg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import net.fabricmc.loader.api.FabricLoader;

public final class Mapping
{
	private Mapping() {}
		
	public static void configDataFixerFiles()
	{
        File file = FabricLoader.getInstance().getConfigDir().resolve("configurabledatafixers.FORBYGRENAMETHISjson5").toFile();
        
        if (!file.exists())
        {
        	McwByg.LOGGER.info("DataFixerFileGen Start...");
        	try
			{
                BufferedWriter buffer = new BufferedWriter(new FileWriter(file));
				
				buffer.write("{\r\n"
						+ "	/* The data fixer's main data version. Increment this when you add a new schema.\r\n"
						+ "	   Any schemas with a data version higher than this will be ignored.\r\n"
						+ "	*/\r\n"
						+ "	\"dataVersion\": 0,\r\n"
						+ "	/* The list of schemas to use for data fixing.\r\n"
						+ "	   Each schema has a data version and a list of data fix entries.\r\n"
						+ "	   Each data fix entry has a type and a list of fixers.\r\n"
						+ "	   The four types are \"biome\", \"block\", \"entity\", and \"item\".\r\n"
						+ "	   Although, it is recommended to use a registry fixer for items instead of a schema fixer.\r\n"
						+ "	   Each fixer contains an old id and a new id, and will replace all instances of the old id with the new id.\r\n"
						+ "	   However, if the old id is still found in the registry, it will not be replaced.\r\n"
						+ "	*/\r\n"
						+ "	\"schemas\": [\r\n"
						+ "		{\r\n"
						+ "			\"version\": 1,\r\n"
						+ "			\"data_fixes\": [\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"biome\",\r\n"
						+ "					\"fixers\": [\r\n"
						+ "						{\r\n"
						+ "							\"old_id\": \"examplemod:example_biome\",\r\n"
						+ "							\"new_id\": \"minecraft:forest\",\r\n"
						+ "						},\r\n"
						+ "						{\r\n"
						+ "							\"old_id\": \"examplemod:swampy_biome\",\r\n"
						+ "							\"new_id\": \"minecraft:swamp\",\r\n"
						+ "						},\r\n"
						+ "					],\r\n"
						+ "				},\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"block\",\r\n"
						+ "					\"fixers\": [\r\n"
						+ "						{\r\n"
						+ "							\"old_id\": \"examplemod:dark_stone\",\r\n"
						+ "							\"new_id\": \"minecraft:deepslate\",\r\n"
						+ "						},\r\n"
						+ "					],\r\n"
						+ "				},\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"entity\",\r\n"
						+ "					\"fixers\": [\r\n"
						+ "						{\r\n"
						+ "							\"old_id\": \"examplemod:example_entity\",\r\n"
						+ "							\"new_id\": \"minecraft:cow\",\r\n"
						+ "						},\r\n"
						+ "					],\r\n"
						+ "				},\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"item\",\r\n"
						+ "					\"fixers\": [\r\n"
						+ "						{\r\n"
						+ "							\"old_id\": \"examplemod:example_item\",\r\n"
						+ "							\"new_id\": \"minecraft:stone\",\r\n"
						+ "						},\r\n"
						+ "					],\r\n"
						+ "				},\r\n"
						+ "			],\r\n"
						+ "		},\r\n"
						+ "		{\r\n"
						+ "			\"version\": 2,\r\n"
						+ "			\"data_fixes\": [\r\n"
						+ "				{\r\n"
						+ "					\"type\": \"block\",\r\n"
						+ "					\"fixers\": [\r\n"
						+ "						{\r\n"
						+ "							\"old_id\": \"examplemod:old_block\",\r\n"
						+ "							\"new_id\": \"minecraft:grass_block\",\r\n"
						+ "						},\r\n"
						+ "					],\r\n"
						+ "				},\r\n"
						+ "			],\r\n"
						+ "		},\r\n"
						+ "	],\r\n"
						+ "	/* The list of registry fixers to use for data fixing.\r\n"
						+ "	   Each registry fixer contains the id of the registry and a list of fixers.\r\n"
						+ "	   Each fixer contains an old id and a new id, and will replace all instances of the old id with the new id.\r\n"
						+ "	   However, if the old id is still found in the registry, it will not be replaced.\r\n"
						+ "	*/\r\n"
						+ "	\"registryFixers\": [\r\n"
						+ "		{\r\n"
						+ "			\"registry_key\": \"minecraft:block\",\r\n"
						+ "			\"fixers\": [\r\n"
						+ "				{\r\n"
						+ "					\"old_id\": \"examplemod:example_block\",\r\n"
						+ "					\"new_id\": \"minecraft:stone\",\r\n"
						+ "				},\n");

					for(String i : McwByg.WOOD)
					{
		                String[] blocksFurnitures = {
		                        i + "_wardrobe", i + "_modern_wardrobe", i + "_double_wardrobe", i + "_bookshelf",
		                        i + "_bookshelf_cupboard", i + "_drawer", i + "_double_drawer", i + "_bookshelf_drawer",
		                        i + "_lower_bookshelf_drawer", i + "_large_drawer", i + "_lower_triple_drawer", i + "_triple_drawer",
		                        i + "_desk", i + "_covered_desk", i + "_modern_desk", i + "_table", i + "_end_table",
		                        i + "_coffee_table", i + "_glass_table", i + "_chair", i + "_modern_chair", i + "_striped_chair",
		                        i + "_stool_chair", i + "_counter", i + "_drawer_counter", i + "_double_drawer_counter",
		                        i + "_cupboard_counter", "stripped_" + i + "_wardrobe", "stripped_" + i + "_modern_wardrobe",
		                        "stripped_" + i + "_double_wardrobe", "stripped_" + i + "_bookshelf", "stripped_" + i + "_bookshelf_cupboard",
		                        "stripped_" + i + "_drawer", "stripped_" + i + "_double_drawer", "stripped_" + i + "_bookshelf_drawer",
		                        "stripped_" + i + "_lower_bookshelf_drawer", "stripped_" + i + "_large_drawer",
		                        "stripped_" + i + "_lower_triple_drawer", "stripped_" + i + "_triple_drawer", "stripped_" + i + "_desk",
		                        "stripped_" + i + "_covered_desk", "stripped_" + i + "_modern_desk", "stripped_" + i + "_table",
		                        "stripped_" + i + "_end_table", "stripped_" + i + "_coffee_table", "stripped_" + i + "_glass_table",
		                        "stripped_" + i + "_chair", "stripped_" + i + "_modern_chair", "stripped_" + i + "_striped_chair",
		                        "stripped_" + i + "_stool_chair", "stripped_" + i + "_counter", "stripped_" + i + "_drawer_counter",
		                        "stripped_" + i + "_double_drawer_counter", "stripped_" + i + "_cupboard_counter", i + "_kitchen_cabinet",
		                        i + "_double_kitchen_cabinet", i + "_glass_kitchen_cabinet", "stripped_" + i + "_kitchen_cabinet",
		                        "stripped_" + i + "_double_kitchen_cabinet", "stripped_" + i + "_glass_kitchen_cabinet"
		                    };
		                
		                String[] blocksRoofs = {
		                	    i + "_roof", i + "_attic_roof", i + "_top_roof", i + "_lower_roof",
		                	    i + "_steep_roof", i + "_upper_lower_roof", i + "_upper_steep_roof",
		                	    i + "_planks_roof", i + "_planks_attic_roof", i + "_planks_top_roof",
		                	    i + "_planks_lower_roof", i + "_planks_steep_roof", i + "_planks_upper_lower_roof", i + "_planks_upper_steep_roof"
		                	};
		                
		                String[] blocksFencesWood = {
		                		i+"_picket_fence", i+"_stockade_fence", i+"_horse_fence", i+"_wired_fence", i+"_highley_gate", i+"_pyramid_gate"
		                };
		                
		                String[] blocksBridgesWood = {
		                		i+"_log_bridge_middle", i+"_log_bridge_middle", "rope_"+i+"_bridge", i+"_bridge_pier", i+"_log_bridge_stair", i+"_rope_bridge_stair", i+"_rail_bridge"
		                };
		                
		    			for (int blockIndex = 0; blockIndex < blocksFurnitures.length; blockIndex++) {
		    	            String block = blocksFurnitures[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "mcwfurnituresbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFurnitures.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }

		    			for (int blockIndex = 0; blockIndex < blocksRoofs.length; blockIndex++) {
		    	            String block = blocksRoofs[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwroofsbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksRoofs.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }

		    			for (int blockIndex = 0; blockIndex < blocksFencesWood.length; blockIndex++) {
		    	            String block = blocksFencesWood[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwfencesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFencesWood.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }

		    			for (int blockIndex = 0; blockIndex < blocksBridgesWood.length; blockIndex++) {
		    	            String block = blocksBridgesWood[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "macawsbridgesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksBridgesWood.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
					
					for(String i : McwByg.bridges_rockable)
					{
		                String[] blocksBridgesRock = {
		                		i+"_bridge", i+"_bridge", i+"_bridge_pier", i+"_bridge_stair", "balustrade_"+i+"_bridge"
		                };

		    			for (int blockIndex = 0; blockIndex < blocksBridgesRock.length; blockIndex++) {
		    	            String block = blocksBridgesRock[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "macawsbridgesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksBridgesRock.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
                    
					for(String i : McwByg.fences_rockable)
					{
		                String[] blocksFencesRock = {
		                		"modern_"+i+"_wall", "railing_"+i+"_wall", i+"_railing_gate", i+"_pillar_wall", i+"_grass_topped_wall"
		                };
		                
		    			for (int blockIndex = 0; blockIndex < blocksFencesRock.length; blockIndex++) {
		    	            String block = blocksFencesRock[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwfencesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFencesRock.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
	                
					for(String i : McwByg.LEAVES)
					{
		                String[] blocksFencesLeaves = {
		                		i+"_hedge"
		                };
		                
		                for (int blockIndex = 0; blockIndex < blocksFencesLeaves.length; blockIndex++) {
		    	            String block = blocksFencesLeaves[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwfencesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFencesLeaves.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
	                
					buffer.write("],\r\n"
							+ "		},\r\n"
							+ "		{\r\n"
							+ "			\"registry_key\": \"minecraft:entity_type\",\r\n"
							+ "			\"fixers\": [\r\n"
							+ "				{\r\n"
							+ "					\"old_id\": \"examplemod:example_entity\",\r\n"
							+ "					\"new_id\": \"minecraft:cow\",\r\n"
							+ "				},\r\n"
							+ "			],\r\n"
							+ "		},\r\n"
							+ "		{\r\n"
							+ "			\"registry_key\": \"minecraft:item\",\r\n"
							+ "			\"fixers\": [\r\n"
							+ "				{\r\n"
							+ "					\"old_id\": \"examplemod:example_item\",\r\n"
							+ "					\"new_id\": \"minecraft:stone\",\r\n"
							+ "				},");
					
					for(String i : McwByg.WOOD)
					{
		                String[] blocksFurnitures = {
		                        i + "_wardrobe", i + "_modern_wardrobe", i + "_double_wardrobe", i + "_bookshelf",
		                        i + "_bookshelf_cupboard", i + "_drawer", i + "_double_drawer", i + "_bookshelf_drawer",
		                        i + "_lower_bookshelf_drawer", i + "_large_drawer", i + "_lower_triple_drawer", i + "_triple_drawer",
		                        i + "_desk", i + "_covered_desk", i + "_modern_desk", i + "_table", i + "_end_table",
		                        i + "_coffee_table", i + "_glass_table", i + "_chair", i + "_modern_chair", i + "_striped_chair",
		                        i + "_stool_chair", i + "_counter", i + "_drawer_counter", i + "_double_drawer_counter",
		                        i + "_cupboard_counter", "stripped_" + i + "_wardrobe", "stripped_" + i + "_modern_wardrobe",
		                        "stripped_" + i + "_double_wardrobe", "stripped_" + i + "_bookshelf", "stripped_" + i + "_bookshelf_cupboard",
		                        "stripped_" + i + "_drawer", "stripped_" + i + "_double_drawer", "stripped_" + i + "_bookshelf_drawer",
		                        "stripped_" + i + "_lower_bookshelf_drawer", "stripped_" + i + "_large_drawer",
		                        "stripped_" + i + "_lower_triple_drawer", "stripped_" + i + "_triple_drawer", "stripped_" + i + "_desk",
		                        "stripped_" + i + "_covered_desk", "stripped_" + i + "_modern_desk", "stripped_" + i + "_table",
		                        "stripped_" + i + "_end_table", "stripped_" + i + "_coffee_table", "stripped_" + i + "_glass_table",
		                        "stripped_" + i + "_chair", "stripped_" + i + "_modern_chair", "stripped_" + i + "_striped_chair",
		                        "stripped_" + i + "_stool_chair", "stripped_" + i + "_counter", "stripped_" + i + "_drawer_counter",
		                        "stripped_" + i + "_double_drawer_counter", "stripped_" + i + "_cupboard_counter", i + "_kitchen_cabinet",
		                        i + "_double_kitchen_cabinet", i + "_glass_kitchen_cabinet", "stripped_" + i + "_kitchen_cabinet",
		                        "stripped_" + i + "_double_kitchen_cabinet", "stripped_" + i + "_glass_kitchen_cabinet"
		                    };
		                
		                String[] blocksRoofs = {
		                	    i + "_roof", i + "_attic_roof", i + "_top_roof", i + "_lower_roof",
		                	    i + "_steep_roof", i + "_upper_lower_roof", i + "_upper_steep_roof",
		                	    i + "_planks_roof", i + "_planks_attic_roof", i + "_planks_top_roof",
		                	    i + "_planks_lower_roof", i + "_planks_steep_roof", i + "_planks_upper_lower_roof", i + "_planks_upper_steep_roof"
		                	};
		                
		                String[] blocksFencesWood = {
		                		i+"_picket_fence", i+"_stockade_fence", i+"_horse_fence", i+"_wired_fence", i+"_highley_gate", i+"_pyramid_gate"
		                };
		                
		                String[] blocksBridgesWood = {
		                		i+"_log_bridge_middle", i+"_log_bridge_middle", "rope_"+i+"_bridge", i+"_bridge_pier", i+"_log_bridge_stair", i+"_rope_bridge_stair", i+"_rail_bridge"
		                };
		                
		    			for (int blockIndex = 0; blockIndex < blocksFurnitures.length; blockIndex++) {
		    	            String block = blocksFurnitures[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "mcwfurnituresbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFurnitures.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }

		    			for (int blockIndex = 0; blockIndex < blocksRoofs.length; blockIndex++) {
		    	            String block = blocksRoofs[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwroofsbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksRoofs.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }

		    			for (int blockIndex = 0; blockIndex < blocksFencesWood.length; blockIndex++) {
		    	            String block = blocksFencesWood[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwfencesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFencesWood.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }

		    			for (int blockIndex = 0; blockIndex < blocksBridgesWood.length; blockIndex++) {
		    	            String block = blocksBridgesWood[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "macawsbridgesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksBridgesWood.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
					
					for(String i : McwByg.bridges_rockable)
					{
		                String[] blocksBridgesRock = {
		                		i+"_bridge", i+"_bridge", i+"_bridge_pier", i+"_bridge_stair", "balustrade_"+i+"_bridge"
		                };

		    			for (int blockIndex = 0; blockIndex < blocksBridgesRock.length; blockIndex++) {
		    	            String block = blocksBridgesRock[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "macawsbridgesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksBridgesRock.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
                    
					for(String i : McwByg.fences_rockable)
					{
		                String[] blocksFencesRock = {
		                		"modern_"+i+"_wall", "railing_"+i+"_wall", i+"_railing_gate", i+"_pillar_wall", i+"_grass_topped_wall"
		                };
		                
		    			for (int blockIndex = 0; blockIndex < blocksFencesRock.length; blockIndex++) {
		    	            String block = blocksFencesRock[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwfencesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFencesRock.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}
	                
					for(String i : McwByg.LEAVES)
					{
		                String[] blocksFencesLeaves = {
		                		i+"_hedge"
		                };
		                
		                for (int blockIndex = 0; blockIndex < blocksFencesLeaves.length; blockIndex++) {
		    	            String block = blocksFencesLeaves[blockIndex];
		    	            buffer.write("        {\n");
		    	            buffer.write("          \"old_id\": \"" + "z_mcwfencesbyg" + ":" + block + "\",\n");
		    	            buffer.write("          \"new_id\": \"" + McwByg.MODID + ":" + block + "\"\n");
		    	            buffer.write("        }");
		    	            if (blockIndex < blocksFencesLeaves.length - 1) {
		    	                buffer.write(",");
		    	            }
		    	            buffer.write("\n");
		    	        }
					}

					buffer.write("],\r\n"
							+ "		},\r\n"
							+ "	],\r\n"
							+ "}");
					
				buffer.close();
				file.createNewFile();
	        	McwByg.LOGGER.info("DataFixerFileGen Finish...");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
        }
	}
}