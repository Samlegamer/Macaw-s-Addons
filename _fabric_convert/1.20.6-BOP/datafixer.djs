// 
// Allows registry fixers (not schemas) to convert all IDs
// whether or not a valid entry exists
// By default, registry fixers will only run if the entry with the ID is missing.
// WARNING: THIS CAN POTENTIALLY CAUSE UNWANTED EFFECTS TO YOUR WORLDS, USE WITH CAUTION
// 
overrideRealEntries: false
// 
// The data fixer's main data version. Increment this when you add a new schema.
// Any schemas with a data version higher than this will be ignored.
// 
dataVersion: 53
// 
// The list of schemas to use for data fixing.
// Each schema has a data version and a list of data fix entries.
// Each data fix entry has a type and a list of fixers.
// The four types are 'biome', 'block', 'entity', and 'item'.
// Although, it is recommended to use a registry fixer for items instead of a schema fixer.
// Each fixer contains an old id and a new id, and will replace all instances of the old id with the new id.
// However, if the old id is still found in the registry, it will not be replaced.
// 
schemas: [
{
    version: 1
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:dead_wardrobe'
            new_id: 'mcwbiomesoplenty:dead_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:dead_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:dead_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_wardrobe'
            new_id: 'mcwbiomesoplenty:dead_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:dead_bookshelf'
            new_id: 'mcwbiomesoplenty:dead_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:dead_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:dead_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:dead_drawer'
            new_id: 'mcwbiomesoplenty:dead_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_drawer'
            new_id: 'mcwbiomesoplenty:dead_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:dead_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:dead_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_large_drawer'
            new_id: 'mcwbiomesoplenty:dead_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:dead_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_triple_drawer'
            new_id: 'mcwbiomesoplenty:dead_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_desk'
            new_id: 'mcwbiomesoplenty:dead_desk'
          }
          {
            old_id: 'mcwfurnituresbop:dead_covered_desk'
            new_id: 'mcwbiomesoplenty:dead_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:dead_modern_desk'
            new_id: 'mcwbiomesoplenty:dead_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:dead_table'
            new_id: 'mcwbiomesoplenty:dead_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_end_table'
            new_id: 'mcwbiomesoplenty:dead_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_coffee_table'
            new_id: 'mcwbiomesoplenty:dead_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_glass_table'
            new_id: 'mcwbiomesoplenty:dead_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_chair'
            new_id: 'mcwbiomesoplenty:dead_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_modern_chair'
            new_id: 'mcwbiomesoplenty:dead_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_striped_chair'
            new_id: 'mcwbiomesoplenty:dead_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_stool_chair'
            new_id: 'mcwbiomesoplenty:dead_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_counter'
            new_id: 'mcwbiomesoplenty:dead_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_drawer_counter'
            new_id: 'mcwbiomesoplenty:dead_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:dead_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_cupboard_counter'
            new_id: 'mcwbiomesoplenty:dead_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_dead_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_dead_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_desk'
            new_id: 'mcwbiomesoplenty:stripped_dead_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_dead_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_dead_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_end_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:dead_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:dead_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:dead_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:dead_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_dead_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_dead_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:dead_wardrobe'
            new_id: 'mcwbiomesoplenty:dead_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:dead_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:dead_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_wardrobe'
            new_id: 'mcwbiomesoplenty:dead_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:dead_bookshelf'
            new_id: 'mcwbiomesoplenty:dead_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:dead_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:dead_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:dead_drawer'
            new_id: 'mcwbiomesoplenty:dead_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_drawer'
            new_id: 'mcwbiomesoplenty:dead_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:dead_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:dead_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_large_drawer'
            new_id: 'mcwbiomesoplenty:dead_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:dead_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_triple_drawer'
            new_id: 'mcwbiomesoplenty:dead_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:dead_desk'
            new_id: 'mcwbiomesoplenty:dead_desk'
          }
          {
            old_id: 'mcwfurnituresbop:dead_covered_desk'
            new_id: 'mcwbiomesoplenty:dead_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:dead_modern_desk'
            new_id: 'mcwbiomesoplenty:dead_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:dead_table'
            new_id: 'mcwbiomesoplenty:dead_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_end_table'
            new_id: 'mcwbiomesoplenty:dead_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_coffee_table'
            new_id: 'mcwbiomesoplenty:dead_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_glass_table'
            new_id: 'mcwbiomesoplenty:dead_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:dead_chair'
            new_id: 'mcwbiomesoplenty:dead_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_modern_chair'
            new_id: 'mcwbiomesoplenty:dead_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_striped_chair'
            new_id: 'mcwbiomesoplenty:dead_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_stool_chair'
            new_id: 'mcwbiomesoplenty:dead_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:dead_counter'
            new_id: 'mcwbiomesoplenty:dead_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_drawer_counter'
            new_id: 'mcwbiomesoplenty:dead_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:dead_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_cupboard_counter'
            new_id: 'mcwbiomesoplenty:dead_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_dead_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_dead_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_dead_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_desk'
            new_id: 'mcwbiomesoplenty:stripped_dead_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_dead_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_dead_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_end_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_dead_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_dead_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_dead_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:dead_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:dead_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:dead_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:dead_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:dead_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:dead_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_dead_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_dead_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_dead_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_dead_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 2
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:dead_roof'
            new_id: 'mcwbiomesoplenty:dead_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_attic_roof'
            new_id: 'mcwbiomesoplenty:dead_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_top_roof'
            new_id: 'mcwbiomesoplenty:dead_top_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_top_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:dead_roof'
            new_id: 'mcwbiomesoplenty:dead_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_attic_roof'
            new_id: 'mcwbiomesoplenty:dead_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_top_roof'
            new_id: 'mcwbiomesoplenty:dead_top_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_top_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:dead_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:dead_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 3
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:dead_picket_fence'
            new_id: 'mcwbiomesoplenty:dead_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_stockade_fence'
            new_id: 'mcwbiomesoplenty:dead_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_horse_fence'
            new_id: 'mcwbiomesoplenty:dead_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_wired_fence'
            new_id: 'mcwbiomesoplenty:dead_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_highley_gate'
            new_id: 'mcwbiomesoplenty:dead_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:dead_pyramid_gate'
            new_id: 'mcwbiomesoplenty:dead_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:dead_picket_fence'
            new_id: 'mcwbiomesoplenty:dead_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_stockade_fence'
            new_id: 'mcwbiomesoplenty:dead_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_horse_fence'
            new_id: 'mcwbiomesoplenty:dead_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_wired_fence'
            new_id: 'mcwbiomesoplenty:dead_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:dead_highley_gate'
            new_id: 'mcwbiomesoplenty:dead_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:dead_pyramid_gate'
            new_id: 'mcwbiomesoplenty:dead_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 4
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:dead_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:dead_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_dead_bridge'
            new_id: 'mcwbiomesoplenty:rope_dead_bridge'
          }
          {
            old_id: 'macawsbridgesbop:dead_bridge_pier'
            new_id: 'mcwbiomesoplenty:dead_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:dead_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:dead_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:dead_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:dead_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:dead_rail_bridge'
            new_id: 'mcwbiomesoplenty:dead_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:dead_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:dead_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_dead_bridge'
            new_id: 'mcwbiomesoplenty:rope_dead_bridge'
          }
          {
            old_id: 'macawsbridgesbop:dead_bridge_pier'
            new_id: 'mcwbiomesoplenty:dead_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:dead_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:dead_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:dead_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:dead_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:dead_rail_bridge'
            new_id: 'mcwbiomesoplenty:dead_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 5
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:fir_wardrobe'
            new_id: 'mcwbiomesoplenty:fir_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:fir_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:fir_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_wardrobe'
            new_id: 'mcwbiomesoplenty:fir_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:fir_bookshelf'
            new_id: 'mcwbiomesoplenty:fir_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:fir_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:fir_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:fir_drawer'
            new_id: 'mcwbiomesoplenty:fir_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_drawer'
            new_id: 'mcwbiomesoplenty:fir_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:fir_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:fir_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_large_drawer'
            new_id: 'mcwbiomesoplenty:fir_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:fir_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_triple_drawer'
            new_id: 'mcwbiomesoplenty:fir_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_desk'
            new_id: 'mcwbiomesoplenty:fir_desk'
          }
          {
            old_id: 'mcwfurnituresbop:fir_covered_desk'
            new_id: 'mcwbiomesoplenty:fir_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:fir_modern_desk'
            new_id: 'mcwbiomesoplenty:fir_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:fir_table'
            new_id: 'mcwbiomesoplenty:fir_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_end_table'
            new_id: 'mcwbiomesoplenty:fir_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_coffee_table'
            new_id: 'mcwbiomesoplenty:fir_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_glass_table'
            new_id: 'mcwbiomesoplenty:fir_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_chair'
            new_id: 'mcwbiomesoplenty:fir_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_modern_chair'
            new_id: 'mcwbiomesoplenty:fir_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_striped_chair'
            new_id: 'mcwbiomesoplenty:fir_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_stool_chair'
            new_id: 'mcwbiomesoplenty:fir_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_counter'
            new_id: 'mcwbiomesoplenty:fir_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_drawer_counter'
            new_id: 'mcwbiomesoplenty:fir_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:fir_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_cupboard_counter'
            new_id: 'mcwbiomesoplenty:fir_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_fir_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_fir_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_desk'
            new_id: 'mcwbiomesoplenty:stripped_fir_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_fir_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_fir_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_end_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:fir_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:fir_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:fir_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:fir_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_fir_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_fir_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:fir_wardrobe'
            new_id: 'mcwbiomesoplenty:fir_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:fir_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:fir_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_wardrobe'
            new_id: 'mcwbiomesoplenty:fir_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:fir_bookshelf'
            new_id: 'mcwbiomesoplenty:fir_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:fir_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:fir_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:fir_drawer'
            new_id: 'mcwbiomesoplenty:fir_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_drawer'
            new_id: 'mcwbiomesoplenty:fir_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:fir_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:fir_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_large_drawer'
            new_id: 'mcwbiomesoplenty:fir_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:fir_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_triple_drawer'
            new_id: 'mcwbiomesoplenty:fir_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:fir_desk'
            new_id: 'mcwbiomesoplenty:fir_desk'
          }
          {
            old_id: 'mcwfurnituresbop:fir_covered_desk'
            new_id: 'mcwbiomesoplenty:fir_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:fir_modern_desk'
            new_id: 'mcwbiomesoplenty:fir_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:fir_table'
            new_id: 'mcwbiomesoplenty:fir_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_end_table'
            new_id: 'mcwbiomesoplenty:fir_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_coffee_table'
            new_id: 'mcwbiomesoplenty:fir_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_glass_table'
            new_id: 'mcwbiomesoplenty:fir_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:fir_chair'
            new_id: 'mcwbiomesoplenty:fir_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_modern_chair'
            new_id: 'mcwbiomesoplenty:fir_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_striped_chair'
            new_id: 'mcwbiomesoplenty:fir_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_stool_chair'
            new_id: 'mcwbiomesoplenty:fir_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:fir_counter'
            new_id: 'mcwbiomesoplenty:fir_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_drawer_counter'
            new_id: 'mcwbiomesoplenty:fir_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:fir_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_cupboard_counter'
            new_id: 'mcwbiomesoplenty:fir_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_fir_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_fir_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_fir_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_desk'
            new_id: 'mcwbiomesoplenty:stripped_fir_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_fir_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_fir_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_end_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_fir_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_fir_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_fir_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:fir_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:fir_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:fir_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:fir_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:fir_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:fir_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_fir_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_fir_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_fir_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_fir_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 6
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:fir_roof'
            new_id: 'mcwbiomesoplenty:fir_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_attic_roof'
            new_id: 'mcwbiomesoplenty:fir_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_top_roof'
            new_id: 'mcwbiomesoplenty:fir_top_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_top_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:fir_roof'
            new_id: 'mcwbiomesoplenty:fir_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_attic_roof'
            new_id: 'mcwbiomesoplenty:fir_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_top_roof'
            new_id: 'mcwbiomesoplenty:fir_top_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_top_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:fir_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:fir_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 7
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:fir_picket_fence'
            new_id: 'mcwbiomesoplenty:fir_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_stockade_fence'
            new_id: 'mcwbiomesoplenty:fir_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_horse_fence'
            new_id: 'mcwbiomesoplenty:fir_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_wired_fence'
            new_id: 'mcwbiomesoplenty:fir_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_highley_gate'
            new_id: 'mcwbiomesoplenty:fir_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:fir_pyramid_gate'
            new_id: 'mcwbiomesoplenty:fir_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:fir_picket_fence'
            new_id: 'mcwbiomesoplenty:fir_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_stockade_fence'
            new_id: 'mcwbiomesoplenty:fir_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_horse_fence'
            new_id: 'mcwbiomesoplenty:fir_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_wired_fence'
            new_id: 'mcwbiomesoplenty:fir_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:fir_highley_gate'
            new_id: 'mcwbiomesoplenty:fir_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:fir_pyramid_gate'
            new_id: 'mcwbiomesoplenty:fir_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 8
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:fir_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:fir_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_fir_bridge'
            new_id: 'mcwbiomesoplenty:rope_fir_bridge'
          }
          {
            old_id: 'macawsbridgesbop:fir_bridge_pier'
            new_id: 'mcwbiomesoplenty:fir_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:fir_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:fir_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:fir_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:fir_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:fir_rail_bridge'
            new_id: 'mcwbiomesoplenty:fir_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:fir_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:fir_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_fir_bridge'
            new_id: 'mcwbiomesoplenty:rope_fir_bridge'
          }
          {
            old_id: 'macawsbridgesbop:fir_bridge_pier'
            new_id: 'mcwbiomesoplenty:fir_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:fir_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:fir_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:fir_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:fir_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:fir_rail_bridge'
            new_id: 'mcwbiomesoplenty:fir_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 9
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:hellbark_wardrobe'
            new_id: 'mcwbiomesoplenty:hellbark_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:hellbark_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_wardrobe'
            new_id: 'mcwbiomesoplenty:hellbark_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_bookshelf'
            new_id: 'mcwbiomesoplenty:hellbark_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:hellbark_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_large_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_triple_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_desk'
            new_id: 'mcwbiomesoplenty:hellbark_desk'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_covered_desk'
            new_id: 'mcwbiomesoplenty:hellbark_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_modern_desk'
            new_id: 'mcwbiomesoplenty:hellbark_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_table'
            new_id: 'mcwbiomesoplenty:hellbark_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_end_table'
            new_id: 'mcwbiomesoplenty:hellbark_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_coffee_table'
            new_id: 'mcwbiomesoplenty:hellbark_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_glass_table'
            new_id: 'mcwbiomesoplenty:hellbark_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_chair'
            new_id: 'mcwbiomesoplenty:hellbark_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_modern_chair'
            new_id: 'mcwbiomesoplenty:hellbark_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_striped_chair'
            new_id: 'mcwbiomesoplenty:hellbark_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_stool_chair'
            new_id: 'mcwbiomesoplenty:hellbark_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_counter'
            new_id: 'mcwbiomesoplenty:hellbark_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_drawer_counter'
            new_id: 'mcwbiomesoplenty:hellbark_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:hellbark_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_cupboard_counter'
            new_id: 'mcwbiomesoplenty:hellbark_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_desk'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_end_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:hellbark_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:hellbark_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:hellbark_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:hellbark_wardrobe'
            new_id: 'mcwbiomesoplenty:hellbark_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:hellbark_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_wardrobe'
            new_id: 'mcwbiomesoplenty:hellbark_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_bookshelf'
            new_id: 'mcwbiomesoplenty:hellbark_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:hellbark_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_large_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_triple_drawer'
            new_id: 'mcwbiomesoplenty:hellbark_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_desk'
            new_id: 'mcwbiomesoplenty:hellbark_desk'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_covered_desk'
            new_id: 'mcwbiomesoplenty:hellbark_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_modern_desk'
            new_id: 'mcwbiomesoplenty:hellbark_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_table'
            new_id: 'mcwbiomesoplenty:hellbark_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_end_table'
            new_id: 'mcwbiomesoplenty:hellbark_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_coffee_table'
            new_id: 'mcwbiomesoplenty:hellbark_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_glass_table'
            new_id: 'mcwbiomesoplenty:hellbark_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_chair'
            new_id: 'mcwbiomesoplenty:hellbark_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_modern_chair'
            new_id: 'mcwbiomesoplenty:hellbark_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_striped_chair'
            new_id: 'mcwbiomesoplenty:hellbark_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_stool_chair'
            new_id: 'mcwbiomesoplenty:hellbark_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_counter'
            new_id: 'mcwbiomesoplenty:hellbark_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_drawer_counter'
            new_id: 'mcwbiomesoplenty:hellbark_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:hellbark_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_cupboard_counter'
            new_id: 'mcwbiomesoplenty:hellbark_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_desk'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_end_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:hellbark_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:hellbark_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:hellbark_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:hellbark_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_hellbark_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 10
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:hellbark_roof'
            new_id: 'mcwbiomesoplenty:hellbark_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_attic_roof'
            new_id: 'mcwbiomesoplenty:hellbark_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_top_roof'
            new_id: 'mcwbiomesoplenty:hellbark_top_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_top_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:hellbark_roof'
            new_id: 'mcwbiomesoplenty:hellbark_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_attic_roof'
            new_id: 'mcwbiomesoplenty:hellbark_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_top_roof'
            new_id: 'mcwbiomesoplenty:hellbark_top_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_top_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:hellbark_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:hellbark_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 11
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:hellbark_picket_fence'
            new_id: 'mcwbiomesoplenty:hellbark_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_stockade_fence'
            new_id: 'mcwbiomesoplenty:hellbark_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_horse_fence'
            new_id: 'mcwbiomesoplenty:hellbark_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_wired_fence'
            new_id: 'mcwbiomesoplenty:hellbark_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_highley_gate'
            new_id: 'mcwbiomesoplenty:hellbark_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:hellbark_pyramid_gate'
            new_id: 'mcwbiomesoplenty:hellbark_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:hellbark_picket_fence'
            new_id: 'mcwbiomesoplenty:hellbark_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_stockade_fence'
            new_id: 'mcwbiomesoplenty:hellbark_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_horse_fence'
            new_id: 'mcwbiomesoplenty:hellbark_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_wired_fence'
            new_id: 'mcwbiomesoplenty:hellbark_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:hellbark_highley_gate'
            new_id: 'mcwbiomesoplenty:hellbark_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:hellbark_pyramid_gate'
            new_id: 'mcwbiomesoplenty:hellbark_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 12
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_hellbark_bridge'
            new_id: 'mcwbiomesoplenty:rope_hellbark_bridge'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_bridge_pier'
            new_id: 'mcwbiomesoplenty:hellbark_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:hellbark_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:hellbark_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_rail_bridge'
            new_id: 'mcwbiomesoplenty:hellbark_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_hellbark_bridge'
            new_id: 'mcwbiomesoplenty:rope_hellbark_bridge'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_bridge_pier'
            new_id: 'mcwbiomesoplenty:hellbark_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:hellbark_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:hellbark_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:hellbark_rail_bridge'
            new_id: 'mcwbiomesoplenty:hellbark_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 13
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:jacaranda_wardrobe'
            new_id: 'mcwbiomesoplenty:jacaranda_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:jacaranda_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_wardrobe'
            new_id: 'mcwbiomesoplenty:jacaranda_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_bookshelf'
            new_id: 'mcwbiomesoplenty:jacaranda_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_large_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_triple_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_desk'
            new_id: 'mcwbiomesoplenty:jacaranda_desk'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_covered_desk'
            new_id: 'mcwbiomesoplenty:jacaranda_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_modern_desk'
            new_id: 'mcwbiomesoplenty:jacaranda_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_table'
            new_id: 'mcwbiomesoplenty:jacaranda_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_end_table'
            new_id: 'mcwbiomesoplenty:jacaranda_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_coffee_table'
            new_id: 'mcwbiomesoplenty:jacaranda_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_glass_table'
            new_id: 'mcwbiomesoplenty:jacaranda_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_modern_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_striped_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_stool_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_drawer_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_cupboard_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_desk'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_end_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:jacaranda_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:jacaranda_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:jacaranda_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:jacaranda_wardrobe'
            new_id: 'mcwbiomesoplenty:jacaranda_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:jacaranda_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_wardrobe'
            new_id: 'mcwbiomesoplenty:jacaranda_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_bookshelf'
            new_id: 'mcwbiomesoplenty:jacaranda_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_large_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_triple_drawer'
            new_id: 'mcwbiomesoplenty:jacaranda_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_desk'
            new_id: 'mcwbiomesoplenty:jacaranda_desk'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_covered_desk'
            new_id: 'mcwbiomesoplenty:jacaranda_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_modern_desk'
            new_id: 'mcwbiomesoplenty:jacaranda_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_table'
            new_id: 'mcwbiomesoplenty:jacaranda_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_end_table'
            new_id: 'mcwbiomesoplenty:jacaranda_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_coffee_table'
            new_id: 'mcwbiomesoplenty:jacaranda_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_glass_table'
            new_id: 'mcwbiomesoplenty:jacaranda_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_modern_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_striped_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_stool_chair'
            new_id: 'mcwbiomesoplenty:jacaranda_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_drawer_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_cupboard_counter'
            new_id: 'mcwbiomesoplenty:jacaranda_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_desk'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_end_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:jacaranda_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:jacaranda_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:jacaranda_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:jacaranda_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 14
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:jacaranda_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_attic_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_top_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_top_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_top_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:jacaranda_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_attic_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_top_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_top_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_top_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:jacaranda_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 15
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:jacaranda_picket_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_stockade_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_horse_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_wired_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_highley_gate'
            new_id: 'mcwbiomesoplenty:jacaranda_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_pyramid_gate'
            new_id: 'mcwbiomesoplenty:jacaranda_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:jacaranda_picket_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_stockade_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_horse_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_wired_fence'
            new_id: 'mcwbiomesoplenty:jacaranda_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_highley_gate'
            new_id: 'mcwbiomesoplenty:jacaranda_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_pyramid_gate'
            new_id: 'mcwbiomesoplenty:jacaranda_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 16
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_jacaranda_bridge'
            new_id: 'mcwbiomesoplenty:rope_jacaranda_bridge'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_bridge_pier'
            new_id: 'mcwbiomesoplenty:jacaranda_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:jacaranda_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_rail_bridge'
            new_id: 'mcwbiomesoplenty:jacaranda_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_jacaranda_bridge'
            new_id: 'mcwbiomesoplenty:rope_jacaranda_bridge'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_bridge_pier'
            new_id: 'mcwbiomesoplenty:jacaranda_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:jacaranda_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:jacaranda_rail_bridge'
            new_id: 'mcwbiomesoplenty:jacaranda_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 17
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:magic_wardrobe'
            new_id: 'mcwbiomesoplenty:magic_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:magic_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:magic_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_wardrobe'
            new_id: 'mcwbiomesoplenty:magic_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:magic_bookshelf'
            new_id: 'mcwbiomesoplenty:magic_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:magic_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:magic_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:magic_drawer'
            new_id: 'mcwbiomesoplenty:magic_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_drawer'
            new_id: 'mcwbiomesoplenty:magic_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:magic_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:magic_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_large_drawer'
            new_id: 'mcwbiomesoplenty:magic_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:magic_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_triple_drawer'
            new_id: 'mcwbiomesoplenty:magic_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_desk'
            new_id: 'mcwbiomesoplenty:magic_desk'
          }
          {
            old_id: 'mcwfurnituresbop:magic_covered_desk'
            new_id: 'mcwbiomesoplenty:magic_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:magic_modern_desk'
            new_id: 'mcwbiomesoplenty:magic_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:magic_table'
            new_id: 'mcwbiomesoplenty:magic_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_end_table'
            new_id: 'mcwbiomesoplenty:magic_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_coffee_table'
            new_id: 'mcwbiomesoplenty:magic_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_glass_table'
            new_id: 'mcwbiomesoplenty:magic_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_chair'
            new_id: 'mcwbiomesoplenty:magic_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_modern_chair'
            new_id: 'mcwbiomesoplenty:magic_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_striped_chair'
            new_id: 'mcwbiomesoplenty:magic_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_stool_chair'
            new_id: 'mcwbiomesoplenty:magic_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_counter'
            new_id: 'mcwbiomesoplenty:magic_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_drawer_counter'
            new_id: 'mcwbiomesoplenty:magic_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:magic_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_cupboard_counter'
            new_id: 'mcwbiomesoplenty:magic_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_magic_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_magic_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_desk'
            new_id: 'mcwbiomesoplenty:stripped_magic_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_magic_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_magic_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_end_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:magic_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:magic_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:magic_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:magic_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_magic_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_magic_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:magic_wardrobe'
            new_id: 'mcwbiomesoplenty:magic_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:magic_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:magic_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_wardrobe'
            new_id: 'mcwbiomesoplenty:magic_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:magic_bookshelf'
            new_id: 'mcwbiomesoplenty:magic_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:magic_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:magic_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:magic_drawer'
            new_id: 'mcwbiomesoplenty:magic_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_drawer'
            new_id: 'mcwbiomesoplenty:magic_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:magic_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:magic_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_large_drawer'
            new_id: 'mcwbiomesoplenty:magic_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:magic_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_triple_drawer'
            new_id: 'mcwbiomesoplenty:magic_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:magic_desk'
            new_id: 'mcwbiomesoplenty:magic_desk'
          }
          {
            old_id: 'mcwfurnituresbop:magic_covered_desk'
            new_id: 'mcwbiomesoplenty:magic_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:magic_modern_desk'
            new_id: 'mcwbiomesoplenty:magic_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:magic_table'
            new_id: 'mcwbiomesoplenty:magic_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_end_table'
            new_id: 'mcwbiomesoplenty:magic_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_coffee_table'
            new_id: 'mcwbiomesoplenty:magic_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_glass_table'
            new_id: 'mcwbiomesoplenty:magic_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:magic_chair'
            new_id: 'mcwbiomesoplenty:magic_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_modern_chair'
            new_id: 'mcwbiomesoplenty:magic_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_striped_chair'
            new_id: 'mcwbiomesoplenty:magic_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_stool_chair'
            new_id: 'mcwbiomesoplenty:magic_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:magic_counter'
            new_id: 'mcwbiomesoplenty:magic_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_drawer_counter'
            new_id: 'mcwbiomesoplenty:magic_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:magic_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_cupboard_counter'
            new_id: 'mcwbiomesoplenty:magic_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_magic_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_magic_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_magic_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_desk'
            new_id: 'mcwbiomesoplenty:stripped_magic_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_magic_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_magic_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_end_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_magic_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_magic_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_magic_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:magic_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:magic_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:magic_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:magic_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:magic_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:magic_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_magic_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_magic_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_magic_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_magic_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 18
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:magic_roof'
            new_id: 'mcwbiomesoplenty:magic_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_attic_roof'
            new_id: 'mcwbiomesoplenty:magic_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_top_roof'
            new_id: 'mcwbiomesoplenty:magic_top_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_top_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:magic_roof'
            new_id: 'mcwbiomesoplenty:magic_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_attic_roof'
            new_id: 'mcwbiomesoplenty:magic_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_top_roof'
            new_id: 'mcwbiomesoplenty:magic_top_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_top_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:magic_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:magic_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 19
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:magic_picket_fence'
            new_id: 'mcwbiomesoplenty:magic_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_stockade_fence'
            new_id: 'mcwbiomesoplenty:magic_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_horse_fence'
            new_id: 'mcwbiomesoplenty:magic_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_wired_fence'
            new_id: 'mcwbiomesoplenty:magic_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_highley_gate'
            new_id: 'mcwbiomesoplenty:magic_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:magic_pyramid_gate'
            new_id: 'mcwbiomesoplenty:magic_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:magic_picket_fence'
            new_id: 'mcwbiomesoplenty:magic_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_stockade_fence'
            new_id: 'mcwbiomesoplenty:magic_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_horse_fence'
            new_id: 'mcwbiomesoplenty:magic_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_wired_fence'
            new_id: 'mcwbiomesoplenty:magic_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:magic_highley_gate'
            new_id: 'mcwbiomesoplenty:magic_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:magic_pyramid_gate'
            new_id: 'mcwbiomesoplenty:magic_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 20
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:magic_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:magic_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_magic_bridge'
            new_id: 'mcwbiomesoplenty:rope_magic_bridge'
          }
          {
            old_id: 'macawsbridgesbop:magic_bridge_pier'
            new_id: 'mcwbiomesoplenty:magic_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:magic_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:magic_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:magic_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:magic_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:magic_rail_bridge'
            new_id: 'mcwbiomesoplenty:magic_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:magic_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:magic_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_magic_bridge'
            new_id: 'mcwbiomesoplenty:rope_magic_bridge'
          }
          {
            old_id: 'macawsbridgesbop:magic_bridge_pier'
            new_id: 'mcwbiomesoplenty:magic_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:magic_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:magic_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:magic_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:magic_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:magic_rail_bridge'
            new_id: 'mcwbiomesoplenty:magic_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 21
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:mahogany_wardrobe'
            new_id: 'mcwbiomesoplenty:mahogany_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:mahogany_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_wardrobe'
            new_id: 'mcwbiomesoplenty:mahogany_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_bookshelf'
            new_id: 'mcwbiomesoplenty:mahogany_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:mahogany_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_large_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_triple_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_desk'
            new_id: 'mcwbiomesoplenty:mahogany_desk'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_covered_desk'
            new_id: 'mcwbiomesoplenty:mahogany_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_modern_desk'
            new_id: 'mcwbiomesoplenty:mahogany_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_table'
            new_id: 'mcwbiomesoplenty:mahogany_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_end_table'
            new_id: 'mcwbiomesoplenty:mahogany_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_coffee_table'
            new_id: 'mcwbiomesoplenty:mahogany_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_glass_table'
            new_id: 'mcwbiomesoplenty:mahogany_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_chair'
            new_id: 'mcwbiomesoplenty:mahogany_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_modern_chair'
            new_id: 'mcwbiomesoplenty:mahogany_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_striped_chair'
            new_id: 'mcwbiomesoplenty:mahogany_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_stool_chair'
            new_id: 'mcwbiomesoplenty:mahogany_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_counter'
            new_id: 'mcwbiomesoplenty:mahogany_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_drawer_counter'
            new_id: 'mcwbiomesoplenty:mahogany_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:mahogany_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_cupboard_counter'
            new_id: 'mcwbiomesoplenty:mahogany_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_desk'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_end_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:mahogany_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:mahogany_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:mahogany_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:mahogany_wardrobe'
            new_id: 'mcwbiomesoplenty:mahogany_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:mahogany_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_wardrobe'
            new_id: 'mcwbiomesoplenty:mahogany_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_bookshelf'
            new_id: 'mcwbiomesoplenty:mahogany_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:mahogany_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_large_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_triple_drawer'
            new_id: 'mcwbiomesoplenty:mahogany_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_desk'
            new_id: 'mcwbiomesoplenty:mahogany_desk'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_covered_desk'
            new_id: 'mcwbiomesoplenty:mahogany_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_modern_desk'
            new_id: 'mcwbiomesoplenty:mahogany_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_table'
            new_id: 'mcwbiomesoplenty:mahogany_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_end_table'
            new_id: 'mcwbiomesoplenty:mahogany_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_coffee_table'
            new_id: 'mcwbiomesoplenty:mahogany_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_glass_table'
            new_id: 'mcwbiomesoplenty:mahogany_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_chair'
            new_id: 'mcwbiomesoplenty:mahogany_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_modern_chair'
            new_id: 'mcwbiomesoplenty:mahogany_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_striped_chair'
            new_id: 'mcwbiomesoplenty:mahogany_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_stool_chair'
            new_id: 'mcwbiomesoplenty:mahogany_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_counter'
            new_id: 'mcwbiomesoplenty:mahogany_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_drawer_counter'
            new_id: 'mcwbiomesoplenty:mahogany_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:mahogany_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_cupboard_counter'
            new_id: 'mcwbiomesoplenty:mahogany_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_desk'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_end_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:mahogany_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:mahogany_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:mahogany_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:mahogany_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_mahogany_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 22
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:mahogany_roof'
            new_id: 'mcwbiomesoplenty:mahogany_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_attic_roof'
            new_id: 'mcwbiomesoplenty:mahogany_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_top_roof'
            new_id: 'mcwbiomesoplenty:mahogany_top_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_top_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:mahogany_roof'
            new_id: 'mcwbiomesoplenty:mahogany_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_attic_roof'
            new_id: 'mcwbiomesoplenty:mahogany_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_top_roof'
            new_id: 'mcwbiomesoplenty:mahogany_top_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_top_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:mahogany_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:mahogany_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 23
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:mahogany_picket_fence'
            new_id: 'mcwbiomesoplenty:mahogany_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_stockade_fence'
            new_id: 'mcwbiomesoplenty:mahogany_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_horse_fence'
            new_id: 'mcwbiomesoplenty:mahogany_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_wired_fence'
            new_id: 'mcwbiomesoplenty:mahogany_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_highley_gate'
            new_id: 'mcwbiomesoplenty:mahogany_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:mahogany_pyramid_gate'
            new_id: 'mcwbiomesoplenty:mahogany_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:mahogany_picket_fence'
            new_id: 'mcwbiomesoplenty:mahogany_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_stockade_fence'
            new_id: 'mcwbiomesoplenty:mahogany_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_horse_fence'
            new_id: 'mcwbiomesoplenty:mahogany_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_wired_fence'
            new_id: 'mcwbiomesoplenty:mahogany_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:mahogany_highley_gate'
            new_id: 'mcwbiomesoplenty:mahogany_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:mahogany_pyramid_gate'
            new_id: 'mcwbiomesoplenty:mahogany_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 24
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_mahogany_bridge'
            new_id: 'mcwbiomesoplenty:rope_mahogany_bridge'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_bridge_pier'
            new_id: 'mcwbiomesoplenty:mahogany_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:mahogany_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:mahogany_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_rail_bridge'
            new_id: 'mcwbiomesoplenty:mahogany_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_mahogany_bridge'
            new_id: 'mcwbiomesoplenty:rope_mahogany_bridge'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_bridge_pier'
            new_id: 'mcwbiomesoplenty:mahogany_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:mahogany_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:mahogany_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:mahogany_rail_bridge'
            new_id: 'mcwbiomesoplenty:mahogany_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 25
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:palm_wardrobe'
            new_id: 'mcwbiomesoplenty:palm_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:palm_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:palm_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_wardrobe'
            new_id: 'mcwbiomesoplenty:palm_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:palm_bookshelf'
            new_id: 'mcwbiomesoplenty:palm_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:palm_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:palm_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:palm_drawer'
            new_id: 'mcwbiomesoplenty:palm_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_drawer'
            new_id: 'mcwbiomesoplenty:palm_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:palm_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:palm_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_large_drawer'
            new_id: 'mcwbiomesoplenty:palm_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:palm_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_triple_drawer'
            new_id: 'mcwbiomesoplenty:palm_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_desk'
            new_id: 'mcwbiomesoplenty:palm_desk'
          }
          {
            old_id: 'mcwfurnituresbop:palm_covered_desk'
            new_id: 'mcwbiomesoplenty:palm_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:palm_modern_desk'
            new_id: 'mcwbiomesoplenty:palm_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:palm_table'
            new_id: 'mcwbiomesoplenty:palm_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_end_table'
            new_id: 'mcwbiomesoplenty:palm_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_coffee_table'
            new_id: 'mcwbiomesoplenty:palm_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_glass_table'
            new_id: 'mcwbiomesoplenty:palm_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_chair'
            new_id: 'mcwbiomesoplenty:palm_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_modern_chair'
            new_id: 'mcwbiomesoplenty:palm_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_striped_chair'
            new_id: 'mcwbiomesoplenty:palm_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_stool_chair'
            new_id: 'mcwbiomesoplenty:palm_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_counter'
            new_id: 'mcwbiomesoplenty:palm_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_drawer_counter'
            new_id: 'mcwbiomesoplenty:palm_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:palm_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_cupboard_counter'
            new_id: 'mcwbiomesoplenty:palm_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_palm_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_palm_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_desk'
            new_id: 'mcwbiomesoplenty:stripped_palm_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_palm_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_palm_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_end_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:palm_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:palm_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:palm_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:palm_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_palm_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_palm_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:palm_wardrobe'
            new_id: 'mcwbiomesoplenty:palm_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:palm_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:palm_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_wardrobe'
            new_id: 'mcwbiomesoplenty:palm_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:palm_bookshelf'
            new_id: 'mcwbiomesoplenty:palm_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:palm_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:palm_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:palm_drawer'
            new_id: 'mcwbiomesoplenty:palm_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_drawer'
            new_id: 'mcwbiomesoplenty:palm_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:palm_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:palm_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_large_drawer'
            new_id: 'mcwbiomesoplenty:palm_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:palm_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_triple_drawer'
            new_id: 'mcwbiomesoplenty:palm_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:palm_desk'
            new_id: 'mcwbiomesoplenty:palm_desk'
          }
          {
            old_id: 'mcwfurnituresbop:palm_covered_desk'
            new_id: 'mcwbiomesoplenty:palm_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:palm_modern_desk'
            new_id: 'mcwbiomesoplenty:palm_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:palm_table'
            new_id: 'mcwbiomesoplenty:palm_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_end_table'
            new_id: 'mcwbiomesoplenty:palm_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_coffee_table'
            new_id: 'mcwbiomesoplenty:palm_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_glass_table'
            new_id: 'mcwbiomesoplenty:palm_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:palm_chair'
            new_id: 'mcwbiomesoplenty:palm_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_modern_chair'
            new_id: 'mcwbiomesoplenty:palm_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_striped_chair'
            new_id: 'mcwbiomesoplenty:palm_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_stool_chair'
            new_id: 'mcwbiomesoplenty:palm_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:palm_counter'
            new_id: 'mcwbiomesoplenty:palm_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_drawer_counter'
            new_id: 'mcwbiomesoplenty:palm_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:palm_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_cupboard_counter'
            new_id: 'mcwbiomesoplenty:palm_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_palm_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_palm_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_palm_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_desk'
            new_id: 'mcwbiomesoplenty:stripped_palm_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_palm_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_palm_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_end_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_palm_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_palm_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_palm_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:palm_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:palm_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:palm_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:palm_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:palm_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:palm_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_palm_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_palm_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_palm_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_palm_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 26
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:palm_roof'
            new_id: 'mcwbiomesoplenty:palm_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_attic_roof'
            new_id: 'mcwbiomesoplenty:palm_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_top_roof'
            new_id: 'mcwbiomesoplenty:palm_top_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_top_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:palm_roof'
            new_id: 'mcwbiomesoplenty:palm_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_attic_roof'
            new_id: 'mcwbiomesoplenty:palm_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_top_roof'
            new_id: 'mcwbiomesoplenty:palm_top_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_top_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:palm_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:palm_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 27
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:palm_picket_fence'
            new_id: 'mcwbiomesoplenty:palm_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_stockade_fence'
            new_id: 'mcwbiomesoplenty:palm_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_horse_fence'
            new_id: 'mcwbiomesoplenty:palm_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_wired_fence'
            new_id: 'mcwbiomesoplenty:palm_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_highley_gate'
            new_id: 'mcwbiomesoplenty:palm_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:palm_pyramid_gate'
            new_id: 'mcwbiomesoplenty:palm_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:palm_picket_fence'
            new_id: 'mcwbiomesoplenty:palm_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_stockade_fence'
            new_id: 'mcwbiomesoplenty:palm_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_horse_fence'
            new_id: 'mcwbiomesoplenty:palm_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_wired_fence'
            new_id: 'mcwbiomesoplenty:palm_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:palm_highley_gate'
            new_id: 'mcwbiomesoplenty:palm_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:palm_pyramid_gate'
            new_id: 'mcwbiomesoplenty:palm_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 28
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:palm_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:palm_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_palm_bridge'
            new_id: 'mcwbiomesoplenty:rope_palm_bridge'
          }
          {
            old_id: 'macawsbridgesbop:palm_bridge_pier'
            new_id: 'mcwbiomesoplenty:palm_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:palm_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:palm_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:palm_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:palm_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:palm_rail_bridge'
            new_id: 'mcwbiomesoplenty:palm_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:palm_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:palm_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_palm_bridge'
            new_id: 'mcwbiomesoplenty:rope_palm_bridge'
          }
          {
            old_id: 'macawsbridgesbop:palm_bridge_pier'
            new_id: 'mcwbiomesoplenty:palm_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:palm_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:palm_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:palm_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:palm_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:palm_rail_bridge'
            new_id: 'mcwbiomesoplenty:palm_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 29
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:redwood_wardrobe'
            new_id: 'mcwbiomesoplenty:redwood_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:redwood_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_wardrobe'
            new_id: 'mcwbiomesoplenty:redwood_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_bookshelf'
            new_id: 'mcwbiomesoplenty:redwood_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:redwood_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_drawer'
            new_id: 'mcwbiomesoplenty:redwood_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_drawer'
            new_id: 'mcwbiomesoplenty:redwood_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:redwood_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:redwood_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_large_drawer'
            new_id: 'mcwbiomesoplenty:redwood_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:redwood_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_triple_drawer'
            new_id: 'mcwbiomesoplenty:redwood_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_desk'
            new_id: 'mcwbiomesoplenty:redwood_desk'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_covered_desk'
            new_id: 'mcwbiomesoplenty:redwood_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_modern_desk'
            new_id: 'mcwbiomesoplenty:redwood_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_table'
            new_id: 'mcwbiomesoplenty:redwood_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_end_table'
            new_id: 'mcwbiomesoplenty:redwood_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_coffee_table'
            new_id: 'mcwbiomesoplenty:redwood_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_glass_table'
            new_id: 'mcwbiomesoplenty:redwood_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_chair'
            new_id: 'mcwbiomesoplenty:redwood_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_modern_chair'
            new_id: 'mcwbiomesoplenty:redwood_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_striped_chair'
            new_id: 'mcwbiomesoplenty:redwood_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_stool_chair'
            new_id: 'mcwbiomesoplenty:redwood_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_counter'
            new_id: 'mcwbiomesoplenty:redwood_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_drawer_counter'
            new_id: 'mcwbiomesoplenty:redwood_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:redwood_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_cupboard_counter'
            new_id: 'mcwbiomesoplenty:redwood_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_redwood_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_redwood_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_desk'
            new_id: 'mcwbiomesoplenty:stripped_redwood_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_redwood_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_redwood_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_end_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:redwood_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:redwood_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:redwood_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_redwood_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_redwood_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:redwood_wardrobe'
            new_id: 'mcwbiomesoplenty:redwood_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:redwood_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_wardrobe'
            new_id: 'mcwbiomesoplenty:redwood_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_bookshelf'
            new_id: 'mcwbiomesoplenty:redwood_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:redwood_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_drawer'
            new_id: 'mcwbiomesoplenty:redwood_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_drawer'
            new_id: 'mcwbiomesoplenty:redwood_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:redwood_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:redwood_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_large_drawer'
            new_id: 'mcwbiomesoplenty:redwood_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:redwood_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_triple_drawer'
            new_id: 'mcwbiomesoplenty:redwood_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_desk'
            new_id: 'mcwbiomesoplenty:redwood_desk'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_covered_desk'
            new_id: 'mcwbiomesoplenty:redwood_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_modern_desk'
            new_id: 'mcwbiomesoplenty:redwood_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_table'
            new_id: 'mcwbiomesoplenty:redwood_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_end_table'
            new_id: 'mcwbiomesoplenty:redwood_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_coffee_table'
            new_id: 'mcwbiomesoplenty:redwood_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_glass_table'
            new_id: 'mcwbiomesoplenty:redwood_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_chair'
            new_id: 'mcwbiomesoplenty:redwood_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_modern_chair'
            new_id: 'mcwbiomesoplenty:redwood_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_striped_chair'
            new_id: 'mcwbiomesoplenty:redwood_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_stool_chair'
            new_id: 'mcwbiomesoplenty:redwood_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_counter'
            new_id: 'mcwbiomesoplenty:redwood_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_drawer_counter'
            new_id: 'mcwbiomesoplenty:redwood_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:redwood_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_cupboard_counter'
            new_id: 'mcwbiomesoplenty:redwood_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_redwood_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_redwood_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_redwood_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_desk'
            new_id: 'mcwbiomesoplenty:stripped_redwood_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_redwood_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_redwood_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_end_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_redwood_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_redwood_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_redwood_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:redwood_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:redwood_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:redwood_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:redwood_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_redwood_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_redwood_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_redwood_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_redwood_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 30
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:redwood_roof'
            new_id: 'mcwbiomesoplenty:redwood_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_attic_roof'
            new_id: 'mcwbiomesoplenty:redwood_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_top_roof'
            new_id: 'mcwbiomesoplenty:redwood_top_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_top_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:redwood_roof'
            new_id: 'mcwbiomesoplenty:redwood_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_attic_roof'
            new_id: 'mcwbiomesoplenty:redwood_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_top_roof'
            new_id: 'mcwbiomesoplenty:redwood_top_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_top_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:redwood_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:redwood_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 31
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:redwood_picket_fence'
            new_id: 'mcwbiomesoplenty:redwood_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_stockade_fence'
            new_id: 'mcwbiomesoplenty:redwood_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_horse_fence'
            new_id: 'mcwbiomesoplenty:redwood_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_wired_fence'
            new_id: 'mcwbiomesoplenty:redwood_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_highley_gate'
            new_id: 'mcwbiomesoplenty:redwood_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:redwood_pyramid_gate'
            new_id: 'mcwbiomesoplenty:redwood_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:redwood_picket_fence'
            new_id: 'mcwbiomesoplenty:redwood_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_stockade_fence'
            new_id: 'mcwbiomesoplenty:redwood_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_horse_fence'
            new_id: 'mcwbiomesoplenty:redwood_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_wired_fence'
            new_id: 'mcwbiomesoplenty:redwood_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:redwood_highley_gate'
            new_id: 'mcwbiomesoplenty:redwood_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:redwood_pyramid_gate'
            new_id: 'mcwbiomesoplenty:redwood_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 32
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_redwood_bridge'
            new_id: 'mcwbiomesoplenty:rope_redwood_bridge'
          }
          {
            old_id: 'macawsbridgesbop:redwood_bridge_pier'
            new_id: 'mcwbiomesoplenty:redwood_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:redwood_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:redwood_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:redwood_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:redwood_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:redwood_rail_bridge'
            new_id: 'mcwbiomesoplenty:redwood_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_redwood_bridge'
            new_id: 'mcwbiomesoplenty:rope_redwood_bridge'
          }
          {
            old_id: 'macawsbridgesbop:redwood_bridge_pier'
            new_id: 'mcwbiomesoplenty:redwood_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:redwood_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:redwood_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:redwood_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:redwood_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:redwood_rail_bridge'
            new_id: 'mcwbiomesoplenty:redwood_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 33
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:umbran_wardrobe'
            new_id: 'mcwbiomesoplenty:umbran_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:umbran_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_wardrobe'
            new_id: 'mcwbiomesoplenty:umbran_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_bookshelf'
            new_id: 'mcwbiomesoplenty:umbran_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:umbran_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_drawer'
            new_id: 'mcwbiomesoplenty:umbran_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_drawer'
            new_id: 'mcwbiomesoplenty:umbran_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:umbran_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:umbran_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_large_drawer'
            new_id: 'mcwbiomesoplenty:umbran_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:umbran_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_triple_drawer'
            new_id: 'mcwbiomesoplenty:umbran_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_desk'
            new_id: 'mcwbiomesoplenty:umbran_desk'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_covered_desk'
            new_id: 'mcwbiomesoplenty:umbran_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_modern_desk'
            new_id: 'mcwbiomesoplenty:umbran_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_table'
            new_id: 'mcwbiomesoplenty:umbran_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_end_table'
            new_id: 'mcwbiomesoplenty:umbran_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_coffee_table'
            new_id: 'mcwbiomesoplenty:umbran_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_glass_table'
            new_id: 'mcwbiomesoplenty:umbran_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_chair'
            new_id: 'mcwbiomesoplenty:umbran_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_modern_chair'
            new_id: 'mcwbiomesoplenty:umbran_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_striped_chair'
            new_id: 'mcwbiomesoplenty:umbran_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_stool_chair'
            new_id: 'mcwbiomesoplenty:umbran_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_counter'
            new_id: 'mcwbiomesoplenty:umbran_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_drawer_counter'
            new_id: 'mcwbiomesoplenty:umbran_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:umbran_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_cupboard_counter'
            new_id: 'mcwbiomesoplenty:umbran_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_umbran_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_umbran_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_desk'
            new_id: 'mcwbiomesoplenty:stripped_umbran_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_umbran_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_umbran_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_end_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:umbran_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:umbran_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:umbran_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_umbran_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_umbran_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:umbran_wardrobe'
            new_id: 'mcwbiomesoplenty:umbran_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:umbran_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_wardrobe'
            new_id: 'mcwbiomesoplenty:umbran_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_bookshelf'
            new_id: 'mcwbiomesoplenty:umbran_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:umbran_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_drawer'
            new_id: 'mcwbiomesoplenty:umbran_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_drawer'
            new_id: 'mcwbiomesoplenty:umbran_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:umbran_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:umbran_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_large_drawer'
            new_id: 'mcwbiomesoplenty:umbran_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:umbran_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_triple_drawer'
            new_id: 'mcwbiomesoplenty:umbran_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_desk'
            new_id: 'mcwbiomesoplenty:umbran_desk'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_covered_desk'
            new_id: 'mcwbiomesoplenty:umbran_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_modern_desk'
            new_id: 'mcwbiomesoplenty:umbran_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_table'
            new_id: 'mcwbiomesoplenty:umbran_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_end_table'
            new_id: 'mcwbiomesoplenty:umbran_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_coffee_table'
            new_id: 'mcwbiomesoplenty:umbran_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_glass_table'
            new_id: 'mcwbiomesoplenty:umbran_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_chair'
            new_id: 'mcwbiomesoplenty:umbran_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_modern_chair'
            new_id: 'mcwbiomesoplenty:umbran_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_striped_chair'
            new_id: 'mcwbiomesoplenty:umbran_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_stool_chair'
            new_id: 'mcwbiomesoplenty:umbran_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_counter'
            new_id: 'mcwbiomesoplenty:umbran_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_drawer_counter'
            new_id: 'mcwbiomesoplenty:umbran_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:umbran_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_cupboard_counter'
            new_id: 'mcwbiomesoplenty:umbran_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_umbran_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_umbran_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_umbran_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_desk'
            new_id: 'mcwbiomesoplenty:stripped_umbran_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_umbran_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_umbran_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_end_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_umbran_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_umbran_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_umbran_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:umbran_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:umbran_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:umbran_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:umbran_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_umbran_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_umbran_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_umbran_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_umbran_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 34
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:umbran_roof'
            new_id: 'mcwbiomesoplenty:umbran_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_attic_roof'
            new_id: 'mcwbiomesoplenty:umbran_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_top_roof'
            new_id: 'mcwbiomesoplenty:umbran_top_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_top_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:umbran_roof'
            new_id: 'mcwbiomesoplenty:umbran_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_attic_roof'
            new_id: 'mcwbiomesoplenty:umbran_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_top_roof'
            new_id: 'mcwbiomesoplenty:umbran_top_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_top_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:umbran_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:umbran_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 35
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:umbran_picket_fence'
            new_id: 'mcwbiomesoplenty:umbran_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_stockade_fence'
            new_id: 'mcwbiomesoplenty:umbran_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_horse_fence'
            new_id: 'mcwbiomesoplenty:umbran_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_wired_fence'
            new_id: 'mcwbiomesoplenty:umbran_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_highley_gate'
            new_id: 'mcwbiomesoplenty:umbran_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:umbran_pyramid_gate'
            new_id: 'mcwbiomesoplenty:umbran_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:umbran_picket_fence'
            new_id: 'mcwbiomesoplenty:umbran_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_stockade_fence'
            new_id: 'mcwbiomesoplenty:umbran_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_horse_fence'
            new_id: 'mcwbiomesoplenty:umbran_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_wired_fence'
            new_id: 'mcwbiomesoplenty:umbran_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:umbran_highley_gate'
            new_id: 'mcwbiomesoplenty:umbran_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:umbran_pyramid_gate'
            new_id: 'mcwbiomesoplenty:umbran_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 36
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_umbran_bridge'
            new_id: 'mcwbiomesoplenty:rope_umbran_bridge'
          }
          {
            old_id: 'macawsbridgesbop:umbran_bridge_pier'
            new_id: 'mcwbiomesoplenty:umbran_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:umbran_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:umbran_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:umbran_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:umbran_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:umbran_rail_bridge'
            new_id: 'mcwbiomesoplenty:umbran_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_umbran_bridge'
            new_id: 'mcwbiomesoplenty:rope_umbran_bridge'
          }
          {
            old_id: 'macawsbridgesbop:umbran_bridge_pier'
            new_id: 'mcwbiomesoplenty:umbran_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:umbran_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:umbran_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:umbran_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:umbran_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:umbran_rail_bridge'
            new_id: 'mcwbiomesoplenty:umbran_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 37
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:willow_wardrobe'
            new_id: 'mcwbiomesoplenty:willow_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:willow_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:willow_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_wardrobe'
            new_id: 'mcwbiomesoplenty:willow_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:willow_bookshelf'
            new_id: 'mcwbiomesoplenty:willow_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:willow_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:willow_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:willow_drawer'
            new_id: 'mcwbiomesoplenty:willow_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_drawer'
            new_id: 'mcwbiomesoplenty:willow_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:willow_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:willow_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_large_drawer'
            new_id: 'mcwbiomesoplenty:willow_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:willow_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_triple_drawer'
            new_id: 'mcwbiomesoplenty:willow_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_desk'
            new_id: 'mcwbiomesoplenty:willow_desk'
          }
          {
            old_id: 'mcwfurnituresbop:willow_covered_desk'
            new_id: 'mcwbiomesoplenty:willow_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:willow_modern_desk'
            new_id: 'mcwbiomesoplenty:willow_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:willow_table'
            new_id: 'mcwbiomesoplenty:willow_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_end_table'
            new_id: 'mcwbiomesoplenty:willow_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_coffee_table'
            new_id: 'mcwbiomesoplenty:willow_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_glass_table'
            new_id: 'mcwbiomesoplenty:willow_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_chair'
            new_id: 'mcwbiomesoplenty:willow_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_modern_chair'
            new_id: 'mcwbiomesoplenty:willow_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_striped_chair'
            new_id: 'mcwbiomesoplenty:willow_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_stool_chair'
            new_id: 'mcwbiomesoplenty:willow_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_counter'
            new_id: 'mcwbiomesoplenty:willow_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_drawer_counter'
            new_id: 'mcwbiomesoplenty:willow_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:willow_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_cupboard_counter'
            new_id: 'mcwbiomesoplenty:willow_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_willow_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_willow_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_desk'
            new_id: 'mcwbiomesoplenty:stripped_willow_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_willow_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_willow_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_end_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:willow_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:willow_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:willow_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:willow_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_willow_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_willow_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:willow_wardrobe'
            new_id: 'mcwbiomesoplenty:willow_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:willow_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:willow_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_wardrobe'
            new_id: 'mcwbiomesoplenty:willow_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:willow_bookshelf'
            new_id: 'mcwbiomesoplenty:willow_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:willow_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:willow_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:willow_drawer'
            new_id: 'mcwbiomesoplenty:willow_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_drawer'
            new_id: 'mcwbiomesoplenty:willow_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:willow_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:willow_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_large_drawer'
            new_id: 'mcwbiomesoplenty:willow_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:willow_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_triple_drawer'
            new_id: 'mcwbiomesoplenty:willow_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:willow_desk'
            new_id: 'mcwbiomesoplenty:willow_desk'
          }
          {
            old_id: 'mcwfurnituresbop:willow_covered_desk'
            new_id: 'mcwbiomesoplenty:willow_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:willow_modern_desk'
            new_id: 'mcwbiomesoplenty:willow_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:willow_table'
            new_id: 'mcwbiomesoplenty:willow_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_end_table'
            new_id: 'mcwbiomesoplenty:willow_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_coffee_table'
            new_id: 'mcwbiomesoplenty:willow_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_glass_table'
            new_id: 'mcwbiomesoplenty:willow_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:willow_chair'
            new_id: 'mcwbiomesoplenty:willow_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_modern_chair'
            new_id: 'mcwbiomesoplenty:willow_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_striped_chair'
            new_id: 'mcwbiomesoplenty:willow_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_stool_chair'
            new_id: 'mcwbiomesoplenty:willow_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:willow_counter'
            new_id: 'mcwbiomesoplenty:willow_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_drawer_counter'
            new_id: 'mcwbiomesoplenty:willow_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:willow_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_cupboard_counter'
            new_id: 'mcwbiomesoplenty:willow_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_willow_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_willow_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_willow_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_desk'
            new_id: 'mcwbiomesoplenty:stripped_willow_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_willow_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_willow_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_end_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_willow_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_willow_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_willow_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:willow_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:willow_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:willow_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:willow_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:willow_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:willow_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_willow_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_willow_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_willow_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_willow_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 38
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:willow_roof'
            new_id: 'mcwbiomesoplenty:willow_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_attic_roof'
            new_id: 'mcwbiomesoplenty:willow_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_top_roof'
            new_id: 'mcwbiomesoplenty:willow_top_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_top_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:willow_roof'
            new_id: 'mcwbiomesoplenty:willow_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_attic_roof'
            new_id: 'mcwbiomesoplenty:willow_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_top_roof'
            new_id: 'mcwbiomesoplenty:willow_top_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_top_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:willow_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:willow_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 39
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:willow_picket_fence'
            new_id: 'mcwbiomesoplenty:willow_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_stockade_fence'
            new_id: 'mcwbiomesoplenty:willow_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_horse_fence'
            new_id: 'mcwbiomesoplenty:willow_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_wired_fence'
            new_id: 'mcwbiomesoplenty:willow_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_highley_gate'
            new_id: 'mcwbiomesoplenty:willow_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:willow_pyramid_gate'
            new_id: 'mcwbiomesoplenty:willow_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:willow_picket_fence'
            new_id: 'mcwbiomesoplenty:willow_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_stockade_fence'
            new_id: 'mcwbiomesoplenty:willow_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_horse_fence'
            new_id: 'mcwbiomesoplenty:willow_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_wired_fence'
            new_id: 'mcwbiomesoplenty:willow_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:willow_highley_gate'
            new_id: 'mcwbiomesoplenty:willow_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:willow_pyramid_gate'
            new_id: 'mcwbiomesoplenty:willow_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 40
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:willow_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:willow_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_willow_bridge'
            new_id: 'mcwbiomesoplenty:rope_willow_bridge'
          }
          {
            old_id: 'macawsbridgesbop:willow_bridge_pier'
            new_id: 'mcwbiomesoplenty:willow_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:willow_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:willow_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:willow_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:willow_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:willow_rail_bridge'
            new_id: 'mcwbiomesoplenty:willow_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:willow_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:willow_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_willow_bridge'
            new_id: 'mcwbiomesoplenty:rope_willow_bridge'
          }
          {
            old_id: 'macawsbridgesbop:willow_bridge_pier'
            new_id: 'mcwbiomesoplenty:willow_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:willow_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:willow_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:willow_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:willow_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:willow_rail_bridge'
            new_id: 'mcwbiomesoplenty:willow_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 41
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:empyreal_wardrobe'
            new_id: 'mcwbiomesoplenty:empyreal_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:empyreal_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_wardrobe'
            new_id: 'mcwbiomesoplenty:empyreal_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_bookshelf'
            new_id: 'mcwbiomesoplenty:empyreal_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:empyreal_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_large_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_triple_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_desk'
            new_id: 'mcwbiomesoplenty:empyreal_desk'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_covered_desk'
            new_id: 'mcwbiomesoplenty:empyreal_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_modern_desk'
            new_id: 'mcwbiomesoplenty:empyreal_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_table'
            new_id: 'mcwbiomesoplenty:empyreal_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_end_table'
            new_id: 'mcwbiomesoplenty:empyreal_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_coffee_table'
            new_id: 'mcwbiomesoplenty:empyreal_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_glass_table'
            new_id: 'mcwbiomesoplenty:empyreal_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_chair'
            new_id: 'mcwbiomesoplenty:empyreal_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_modern_chair'
            new_id: 'mcwbiomesoplenty:empyreal_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_striped_chair'
            new_id: 'mcwbiomesoplenty:empyreal_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_stool_chair'
            new_id: 'mcwbiomesoplenty:empyreal_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_counter'
            new_id: 'mcwbiomesoplenty:empyreal_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_drawer_counter'
            new_id: 'mcwbiomesoplenty:empyreal_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:empyreal_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_cupboard_counter'
            new_id: 'mcwbiomesoplenty:empyreal_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_desk'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_end_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:empyreal_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:empyreal_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:empyreal_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:empyreal_wardrobe'
            new_id: 'mcwbiomesoplenty:empyreal_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:empyreal_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_wardrobe'
            new_id: 'mcwbiomesoplenty:empyreal_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_bookshelf'
            new_id: 'mcwbiomesoplenty:empyreal_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:empyreal_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_large_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_triple_drawer'
            new_id: 'mcwbiomesoplenty:empyreal_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_desk'
            new_id: 'mcwbiomesoplenty:empyreal_desk'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_covered_desk'
            new_id: 'mcwbiomesoplenty:empyreal_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_modern_desk'
            new_id: 'mcwbiomesoplenty:empyreal_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_table'
            new_id: 'mcwbiomesoplenty:empyreal_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_end_table'
            new_id: 'mcwbiomesoplenty:empyreal_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_coffee_table'
            new_id: 'mcwbiomesoplenty:empyreal_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_glass_table'
            new_id: 'mcwbiomesoplenty:empyreal_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_chair'
            new_id: 'mcwbiomesoplenty:empyreal_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_modern_chair'
            new_id: 'mcwbiomesoplenty:empyreal_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_striped_chair'
            new_id: 'mcwbiomesoplenty:empyreal_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_stool_chair'
            new_id: 'mcwbiomesoplenty:empyreal_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_counter'
            new_id: 'mcwbiomesoplenty:empyreal_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_drawer_counter'
            new_id: 'mcwbiomesoplenty:empyreal_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:empyreal_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_cupboard_counter'
            new_id: 'mcwbiomesoplenty:empyreal_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_desk'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_end_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:empyreal_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:empyreal_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:empyreal_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:empyreal_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_empyreal_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 42
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:empyreal_roof'
            new_id: 'mcwbiomesoplenty:empyreal_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_attic_roof'
            new_id: 'mcwbiomesoplenty:empyreal_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_top_roof'
            new_id: 'mcwbiomesoplenty:empyreal_top_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_top_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:empyreal_roof'
            new_id: 'mcwbiomesoplenty:empyreal_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_attic_roof'
            new_id: 'mcwbiomesoplenty:empyreal_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_top_roof'
            new_id: 'mcwbiomesoplenty:empyreal_top_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_top_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:empyreal_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:empyreal_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 43
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:empyreal_picket_fence'
            new_id: 'mcwbiomesoplenty:empyreal_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_stockade_fence'
            new_id: 'mcwbiomesoplenty:empyreal_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_horse_fence'
            new_id: 'mcwbiomesoplenty:empyreal_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_wired_fence'
            new_id: 'mcwbiomesoplenty:empyreal_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_highley_gate'
            new_id: 'mcwbiomesoplenty:empyreal_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:empyreal_pyramid_gate'
            new_id: 'mcwbiomesoplenty:empyreal_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:empyreal_picket_fence'
            new_id: 'mcwbiomesoplenty:empyreal_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_stockade_fence'
            new_id: 'mcwbiomesoplenty:empyreal_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_horse_fence'
            new_id: 'mcwbiomesoplenty:empyreal_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_wired_fence'
            new_id: 'mcwbiomesoplenty:empyreal_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:empyreal_highley_gate'
            new_id: 'mcwbiomesoplenty:empyreal_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:empyreal_pyramid_gate'
            new_id: 'mcwbiomesoplenty:empyreal_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 44
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_empyreal_bridge'
            new_id: 'mcwbiomesoplenty:rope_empyreal_bridge'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_bridge_pier'
            new_id: 'mcwbiomesoplenty:empyreal_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:empyreal_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:empyreal_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_rail_bridge'
            new_id: 'mcwbiomesoplenty:empyreal_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_empyreal_bridge'
            new_id: 'mcwbiomesoplenty:rope_empyreal_bridge'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_bridge_pier'
            new_id: 'mcwbiomesoplenty:empyreal_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:empyreal_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:empyreal_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:empyreal_rail_bridge'
            new_id: 'mcwbiomesoplenty:empyreal_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 45
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:maple_wardrobe'
            new_id: 'mcwbiomesoplenty:maple_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:maple_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:maple_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_wardrobe'
            new_id: 'mcwbiomesoplenty:maple_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:maple_bookshelf'
            new_id: 'mcwbiomesoplenty:maple_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:maple_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:maple_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:maple_drawer'
            new_id: 'mcwbiomesoplenty:maple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_drawer'
            new_id: 'mcwbiomesoplenty:maple_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:maple_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:maple_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_large_drawer'
            new_id: 'mcwbiomesoplenty:maple_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:maple_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_triple_drawer'
            new_id: 'mcwbiomesoplenty:maple_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_desk'
            new_id: 'mcwbiomesoplenty:maple_desk'
          }
          {
            old_id: 'mcwfurnituresbop:maple_covered_desk'
            new_id: 'mcwbiomesoplenty:maple_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:maple_modern_desk'
            new_id: 'mcwbiomesoplenty:maple_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:maple_table'
            new_id: 'mcwbiomesoplenty:maple_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_end_table'
            new_id: 'mcwbiomesoplenty:maple_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_coffee_table'
            new_id: 'mcwbiomesoplenty:maple_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_glass_table'
            new_id: 'mcwbiomesoplenty:maple_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_chair'
            new_id: 'mcwbiomesoplenty:maple_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_modern_chair'
            new_id: 'mcwbiomesoplenty:maple_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_striped_chair'
            new_id: 'mcwbiomesoplenty:maple_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_stool_chair'
            new_id: 'mcwbiomesoplenty:maple_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_counter'
            new_id: 'mcwbiomesoplenty:maple_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_drawer_counter'
            new_id: 'mcwbiomesoplenty:maple_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:maple_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_cupboard_counter'
            new_id: 'mcwbiomesoplenty:maple_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_maple_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_maple_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_desk'
            new_id: 'mcwbiomesoplenty:stripped_maple_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_maple_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_maple_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_end_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:maple_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:maple_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:maple_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:maple_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_maple_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_maple_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:maple_wardrobe'
            new_id: 'mcwbiomesoplenty:maple_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:maple_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:maple_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_wardrobe'
            new_id: 'mcwbiomesoplenty:maple_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:maple_bookshelf'
            new_id: 'mcwbiomesoplenty:maple_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:maple_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:maple_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:maple_drawer'
            new_id: 'mcwbiomesoplenty:maple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_drawer'
            new_id: 'mcwbiomesoplenty:maple_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:maple_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:maple_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_large_drawer'
            new_id: 'mcwbiomesoplenty:maple_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:maple_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_triple_drawer'
            new_id: 'mcwbiomesoplenty:maple_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:maple_desk'
            new_id: 'mcwbiomesoplenty:maple_desk'
          }
          {
            old_id: 'mcwfurnituresbop:maple_covered_desk'
            new_id: 'mcwbiomesoplenty:maple_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:maple_modern_desk'
            new_id: 'mcwbiomesoplenty:maple_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:maple_table'
            new_id: 'mcwbiomesoplenty:maple_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_end_table'
            new_id: 'mcwbiomesoplenty:maple_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_coffee_table'
            new_id: 'mcwbiomesoplenty:maple_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_glass_table'
            new_id: 'mcwbiomesoplenty:maple_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:maple_chair'
            new_id: 'mcwbiomesoplenty:maple_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_modern_chair'
            new_id: 'mcwbiomesoplenty:maple_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_striped_chair'
            new_id: 'mcwbiomesoplenty:maple_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_stool_chair'
            new_id: 'mcwbiomesoplenty:maple_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:maple_counter'
            new_id: 'mcwbiomesoplenty:maple_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_drawer_counter'
            new_id: 'mcwbiomesoplenty:maple_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:maple_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_cupboard_counter'
            new_id: 'mcwbiomesoplenty:maple_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_maple_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_maple_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_maple_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_desk'
            new_id: 'mcwbiomesoplenty:stripped_maple_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_maple_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_maple_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_end_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_maple_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_maple_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_maple_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:maple_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:maple_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:maple_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:maple_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:maple_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:maple_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_maple_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_maple_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_maple_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_maple_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 46
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:maple_roof'
            new_id: 'mcwbiomesoplenty:maple_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_attic_roof'
            new_id: 'mcwbiomesoplenty:maple_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_top_roof'
            new_id: 'mcwbiomesoplenty:maple_top_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_top_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:maple_roof'
            new_id: 'mcwbiomesoplenty:maple_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_attic_roof'
            new_id: 'mcwbiomesoplenty:maple_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_top_roof'
            new_id: 'mcwbiomesoplenty:maple_top_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_top_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:maple_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:maple_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 47
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:maple_picket_fence'
            new_id: 'mcwbiomesoplenty:maple_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_stockade_fence'
            new_id: 'mcwbiomesoplenty:maple_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_horse_fence'
            new_id: 'mcwbiomesoplenty:maple_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_wired_fence'
            new_id: 'mcwbiomesoplenty:maple_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_highley_gate'
            new_id: 'mcwbiomesoplenty:maple_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:maple_pyramid_gate'
            new_id: 'mcwbiomesoplenty:maple_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:maple_picket_fence'
            new_id: 'mcwbiomesoplenty:maple_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_stockade_fence'
            new_id: 'mcwbiomesoplenty:maple_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_horse_fence'
            new_id: 'mcwbiomesoplenty:maple_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_wired_fence'
            new_id: 'mcwbiomesoplenty:maple_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:maple_highley_gate'
            new_id: 'mcwbiomesoplenty:maple_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:maple_pyramid_gate'
            new_id: 'mcwbiomesoplenty:maple_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 48
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:maple_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:maple_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_maple_bridge'
            new_id: 'mcwbiomesoplenty:rope_maple_bridge'
          }
          {
            old_id: 'macawsbridgesbop:maple_bridge_pier'
            new_id: 'mcwbiomesoplenty:maple_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:maple_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:maple_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:maple_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:maple_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:maple_rail_bridge'
            new_id: 'mcwbiomesoplenty:maple_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:maple_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:maple_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_maple_bridge'
            new_id: 'mcwbiomesoplenty:rope_maple_bridge'
          }
          {
            old_id: 'macawsbridgesbop:maple_bridge_pier'
            new_id: 'mcwbiomesoplenty:maple_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:maple_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:maple_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:maple_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:maple_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:maple_rail_bridge'
            new_id: 'mcwbiomesoplenty:maple_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 49
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:pine_wardrobe'
            new_id: 'mcwbiomesoplenty:pine_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:pine_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:pine_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_wardrobe'
            new_id: 'mcwbiomesoplenty:pine_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:pine_bookshelf'
            new_id: 'mcwbiomesoplenty:pine_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:pine_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:pine_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:pine_drawer'
            new_id: 'mcwbiomesoplenty:pine_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_drawer'
            new_id: 'mcwbiomesoplenty:pine_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:pine_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:pine_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_large_drawer'
            new_id: 'mcwbiomesoplenty:pine_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:pine_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_triple_drawer'
            new_id: 'mcwbiomesoplenty:pine_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_desk'
            new_id: 'mcwbiomesoplenty:pine_desk'
          }
          {
            old_id: 'mcwfurnituresbop:pine_covered_desk'
            new_id: 'mcwbiomesoplenty:pine_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:pine_modern_desk'
            new_id: 'mcwbiomesoplenty:pine_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:pine_table'
            new_id: 'mcwbiomesoplenty:pine_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_end_table'
            new_id: 'mcwbiomesoplenty:pine_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_coffee_table'
            new_id: 'mcwbiomesoplenty:pine_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_glass_table'
            new_id: 'mcwbiomesoplenty:pine_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_chair'
            new_id: 'mcwbiomesoplenty:pine_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_modern_chair'
            new_id: 'mcwbiomesoplenty:pine_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_striped_chair'
            new_id: 'mcwbiomesoplenty:pine_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_stool_chair'
            new_id: 'mcwbiomesoplenty:pine_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_counter'
            new_id: 'mcwbiomesoplenty:pine_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_drawer_counter'
            new_id: 'mcwbiomesoplenty:pine_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:pine_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_cupboard_counter'
            new_id: 'mcwbiomesoplenty:pine_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_pine_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_pine_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_desk'
            new_id: 'mcwbiomesoplenty:stripped_pine_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_pine_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_pine_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_end_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:pine_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:pine_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:pine_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:pine_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_pine_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_pine_glass_kitchen_cabinet'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfurnituresbop:pine_wardrobe'
            new_id: 'mcwbiomesoplenty:pine_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:pine_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:pine_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_wardrobe'
            new_id: 'mcwbiomesoplenty:pine_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:pine_bookshelf'
            new_id: 'mcwbiomesoplenty:pine_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:pine_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:pine_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:pine_drawer'
            new_id: 'mcwbiomesoplenty:pine_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_drawer'
            new_id: 'mcwbiomesoplenty:pine_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:pine_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:pine_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_large_drawer'
            new_id: 'mcwbiomesoplenty:pine_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:pine_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_triple_drawer'
            new_id: 'mcwbiomesoplenty:pine_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:pine_desk'
            new_id: 'mcwbiomesoplenty:pine_desk'
          }
          {
            old_id: 'mcwfurnituresbop:pine_covered_desk'
            new_id: 'mcwbiomesoplenty:pine_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:pine_modern_desk'
            new_id: 'mcwbiomesoplenty:pine_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:pine_table'
            new_id: 'mcwbiomesoplenty:pine_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_end_table'
            new_id: 'mcwbiomesoplenty:pine_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_coffee_table'
            new_id: 'mcwbiomesoplenty:pine_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_glass_table'
            new_id: 'mcwbiomesoplenty:pine_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:pine_chair'
            new_id: 'mcwbiomesoplenty:pine_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_modern_chair'
            new_id: 'mcwbiomesoplenty:pine_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_striped_chair'
            new_id: 'mcwbiomesoplenty:pine_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_stool_chair'
            new_id: 'mcwbiomesoplenty:pine_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:pine_counter'
            new_id: 'mcwbiomesoplenty:pine_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_drawer_counter'
            new_id: 'mcwbiomesoplenty:pine_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:pine_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_cupboard_counter'
            new_id: 'mcwbiomesoplenty:pine_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_pine_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_modern_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_pine_modern_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_wardrobe'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_wardrobe'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_bookshelf'
            new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_cupboard'
            new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_cupboard'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_lower_bookshelf_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_lower_bookshelf_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_large_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_large_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_lower_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_lower_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_triple_drawer'
            new_id: 'mcwbiomesoplenty:stripped_pine_triple_drawer'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_desk'
            new_id: 'mcwbiomesoplenty:stripped_pine_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_covered_desk'
            new_id: 'mcwbiomesoplenty:stripped_pine_covered_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_modern_desk'
            new_id: 'mcwbiomesoplenty:stripped_pine_modern_desk'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_end_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_end_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_coffee_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_coffee_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_glass_table'
            new_id: 'mcwbiomesoplenty:stripped_pine_glass_table'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_modern_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_modern_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_striped_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_striped_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_stool_chair'
            new_id: 'mcwbiomesoplenty:stripped_pine_stool_chair'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_drawer_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer_counter'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_cupboard_counter'
            new_id: 'mcwbiomesoplenty:stripped_pine_cupboard_counter'
          }
          {
            old_id: 'mcwfurnituresbop:pine_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:pine_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:pine_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:pine_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:pine_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:pine_glass_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_pine_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_double_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_pine_double_kitchen_cabinet'
          }
          {
            old_id: 'mcwfurnituresbop:stripped_pine_glass_kitchen_cabinet'
            new_id: 'mcwbiomesoplenty:stripped_pine_glass_kitchen_cabinet'
          }
        ]
      }
    ]
  }
{
    version: 50
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsroofsbop:pine_roof'
            new_id: 'mcwbiomesoplenty:pine_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_attic_roof'
            new_id: 'mcwbiomesoplenty:pine_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_top_roof'
            new_id: 'mcwbiomesoplenty:pine_top_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_top_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_upper_steep_roof'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsroofsbop:pine_roof'
            new_id: 'mcwbiomesoplenty:pine_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_attic_roof'
            new_id: 'mcwbiomesoplenty:pine_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_top_roof'
            new_id: 'mcwbiomesoplenty:pine_top_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_upper_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_attic_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_attic_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_top_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_top_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_steep_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_upper_lower_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_upper_lower_roof'
          }
          {
            old_id: 'macawsroofsbop:pine_planks_upper_steep_roof'
            new_id: 'mcwbiomesoplenty:pine_planks_upper_steep_roof'
          }
        ]
      }
    ]
  }
{
    version: 51
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:pine_picket_fence'
            new_id: 'mcwbiomesoplenty:pine_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_stockade_fence'
            new_id: 'mcwbiomesoplenty:pine_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_horse_fence'
            new_id: 'mcwbiomesoplenty:pine_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_wired_fence'
            new_id: 'mcwbiomesoplenty:pine_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_highley_gate'
            new_id: 'mcwbiomesoplenty:pine_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:pine_pyramid_gate'
            new_id: 'mcwbiomesoplenty:pine_pyramid_gate'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:pine_picket_fence'
            new_id: 'mcwbiomesoplenty:pine_picket_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_stockade_fence'
            new_id: 'mcwbiomesoplenty:pine_stockade_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_horse_fence'
            new_id: 'mcwbiomesoplenty:pine_horse_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_wired_fence'
            new_id: 'mcwbiomesoplenty:pine_wired_fence'
          }
          {
            old_id: 'mcwfencesbop:pine_highley_gate'
            new_id: 'mcwbiomesoplenty:pine_highley_gate'
          }
          {
            old_id: 'mcwfencesbop:pine_pyramid_gate'
            new_id: 'mcwbiomesoplenty:pine_pyramid_gate'
          }
        ]
      }
    ]
  }
{
    version: 52
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'macawsbridgesbop:pine_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:pine_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_pine_bridge'
            new_id: 'mcwbiomesoplenty:rope_pine_bridge'
          }
          {
            old_id: 'macawsbridgesbop:pine_bridge_pier'
            new_id: 'mcwbiomesoplenty:pine_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:pine_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:pine_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:pine_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:pine_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:pine_rail_bridge'
            new_id: 'mcwbiomesoplenty:pine_rail_bridge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'macawsbridgesbop:pine_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:pine_log_bridge_middle'
            new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
          }
          {
            old_id: 'macawsbridgesbop:rope_pine_bridge'
            new_id: 'mcwbiomesoplenty:rope_pine_bridge'
          }
          {
            old_id: 'macawsbridgesbop:pine_bridge_pier'
            new_id: 'mcwbiomesoplenty:pine_bridge_pier'
          }
          {
            old_id: 'macawsbridgesbop:pine_log_bridge_stair'
            new_id: 'mcwbiomesoplenty:pine_log_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:pine_rope_bridge_stair'
            new_id: 'mcwbiomesoplenty:pine_rope_bridge_stair'
          }
          {
            old_id: 'macawsbridgesbop:pine_rail_bridge'
            new_id: 'mcwbiomesoplenty:pine_rail_bridge'
          }
        ]
      }
    ]
  }
{
    version: 53
    data_fixes: [
      {
        type: 'block'
        fixers: [
          {
            old_id: 'mcwfencesbop:dead_hedge'
            new_id: 'mcwbiomesoplenty:dead_hedge'
          }
          {
            old_id: 'mcwfencesbop:fir_hedge'
            new_id: 'mcwbiomesoplenty:fir_hedge'
          }
          {
            old_id: 'mcwfencesbop:hellbark_hedge'
            new_id: 'mcwbiomesoplenty:hellbark_hedge'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_hedge'
            new_id: 'mcwbiomesoplenty:jacaranda_hedge'
          }
          {
            old_id: 'mcwfencesbop:magic_hedge'
            new_id: 'mcwbiomesoplenty:magic_hedge'
          }
          {
            old_id: 'mcwfencesbop:mahogany_hedge'
            new_id: 'mcwbiomesoplenty:mahogany_hedge'
          }
          {
            old_id: 'mcwfencesbop:palm_hedge'
            new_id: 'mcwbiomesoplenty:palm_hedge'
          }
          {
            old_id: 'mcwfencesbop:redwood_hedge'
            new_id: 'mcwbiomesoplenty:redwood_hedge'
          }
          {
            old_id: 'mcwfencesbop:umbran_hedge'
            new_id: 'mcwbiomesoplenty:umbran_hedge'
          }
          {
            old_id: 'mcwfencesbop:willow_hedge'
            new_id: 'mcwbiomesoplenty:willow_hedge'
          }
          {
            old_id: 'mcwfencesbop:empyreal_hedge'
            new_id: 'mcwbiomesoplenty:empyreal_hedge'
          }
          {
            old_id: 'mcwfencesbop:pine_hedge'
            new_id: 'mcwbiomesoplenty:pine_hedge'
          }
          {
            old_id: 'mcwfencesbop:orange_maple_hedge'
            new_id: 'mcwbiomesoplenty:orange_maple_hedge'
          }
          {
            old_id: 'mcwfencesbop:red_maple_hedge'
            new_id: 'mcwbiomesoplenty:red_maple_hedge'
          }
          {
            old_id: 'mcwfencesbop:yellow_maple_hedge'
            new_id: 'mcwbiomesoplenty:yellow_maple_hedge'
          }
          {
            old_id: 'mcwfencesbop:cypress_hedge'
            new_id: 'mcwbiomesoplenty:cypress_hedge'
          }
          {
            old_id: 'mcwfencesbop:snowblossom_hedge'
            new_id: 'mcwbiomesoplenty:snowblossom_hedge'
          }
          {
            old_id: 'mcwfencesbop:flowering_oak_hedge'
            new_id: 'mcwbiomesoplenty:flowering_oak_hedge'
          }
          {
            old_id: 'mcwfencesbop:rainbow_birch_hedge'
            new_id: 'mcwbiomesoplenty:rainbow_birch_hedge'
          }
          {
            old_id: 'mcwfencesbop:origin_hedge'
            new_id: 'mcwbiomesoplenty:origin_hedge'
          }
        ]
      }
      {
        type: 'item'
        fixers: [
          {
            old_id: 'mcwfencesbop:dead_hedge'
            new_id: 'mcwbiomesoplenty:dead_hedge'
          }
          {
            old_id: 'mcwfencesbop:fir_hedge'
            new_id: 'mcwbiomesoplenty:fir_hedge'
          }
          {
            old_id: 'mcwfencesbop:hellbark_hedge'
            new_id: 'mcwbiomesoplenty:hellbark_hedge'
          }
          {
            old_id: 'mcwfencesbop:jacaranda_hedge'
            new_id: 'mcwbiomesoplenty:jacaranda_hedge'
          }
          {
            old_id: 'mcwfencesbop:magic_hedge'
            new_id: 'mcwbiomesoplenty:magic_hedge'
          }
          {
            old_id: 'mcwfencesbop:mahogany_hedge'
            new_id: 'mcwbiomesoplenty:mahogany_hedge'
          }
          {
            old_id: 'mcwfencesbop:palm_hedge'
            new_id: 'mcwbiomesoplenty:palm_hedge'
          }
          {
            old_id: 'mcwfencesbop:redwood_hedge'
            new_id: 'mcwbiomesoplenty:redwood_hedge'
          }
          {
            old_id: 'mcwfencesbop:umbran_hedge'
            new_id: 'mcwbiomesoplenty:umbran_hedge'
          }
          {
            old_id: 'mcwfencesbop:willow_hedge'
            new_id: 'mcwbiomesoplenty:willow_hedge'
          }
          {
            old_id: 'mcwfencesbop:empyreal_hedge'
            new_id: 'mcwbiomesoplenty:empyreal_hedge'
          }
          {
            old_id: 'mcwfencesbop:pine_hedge'
            new_id: 'mcwbiomesoplenty:pine_hedge'
          }
          {
            old_id: 'mcwfencesbop:orange_maple_hedge'
            new_id: 'mcwbiomesoplenty:orange_maple_hedge'
          }
          {
            old_id: 'mcwfencesbop:red_maple_hedge'
            new_id: 'mcwbiomesoplenty:red_maple_hedge'
          }
          {
            old_id: 'mcwfencesbop:yellow_maple_hedge'
            new_id: 'mcwbiomesoplenty:yellow_maple_hedge'
          }
          {
            old_id: 'mcwfencesbop:cypress_hedge'
            new_id: 'mcwbiomesoplenty:cypress_hedge'
          }
          {
            old_id: 'mcwfencesbop:snowblossom_hedge'
            new_id: 'mcwbiomesoplenty:snowblossom_hedge'
          }
          {
            old_id: 'mcwfencesbop:flowering_oak_hedge'
            new_id: 'mcwbiomesoplenty:flowering_oak_hedge'
          }
          {
            old_id: 'mcwfencesbop:rainbow_birch_hedge'
            new_id: 'mcwbiomesoplenty:rainbow_birch_hedge'
          }
          {
            old_id: 'mcwfencesbop:origin_hedge'
            new_id: 'mcwbiomesoplenty:origin_hedge'
          }
        ]
      }
    ]
  }
]
// 
// The list of registry fixers to use for data fixing.
// Each registry fixer contains a registry key and a list of fixers.
// Each fixer contains an old id and a new id, and will replace all instances of the old id with the new id.
// However, if the old id is still found in the registry, it will not be replaced (unless the overrideRealEntries option is set to true).
// 
registryFixers: [
  {
    registry_key: 'minecraft:block'
    fixers: [
      {
        old_id: 'examplemod:example_block'
        new_id: 'minecraft:stone'
      }
        {
          old_id: 'mcwfurnituresbop:dead_wardrobe'
          new_id: 'mcwbiomesoplenty:dead_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:dead_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:dead_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_wardrobe'
          new_id: 'mcwbiomesoplenty:dead_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:dead_bookshelf'
          new_id: 'mcwbiomesoplenty:dead_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:dead_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:dead_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:dead_drawer'
          new_id: 'mcwbiomesoplenty:dead_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_drawer'
          new_id: 'mcwbiomesoplenty:dead_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:dead_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:dead_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_large_drawer'
          new_id: 'mcwbiomesoplenty:dead_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:dead_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_triple_drawer'
          new_id: 'mcwbiomesoplenty:dead_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_desk'
          new_id: 'mcwbiomesoplenty:dead_desk'
        }
        {
          old_id: 'mcwfurnituresbop:dead_covered_desk'
          new_id: 'mcwbiomesoplenty:dead_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:dead_modern_desk'
          new_id: 'mcwbiomesoplenty:dead_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:dead_table'
          new_id: 'mcwbiomesoplenty:dead_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_end_table'
          new_id: 'mcwbiomesoplenty:dead_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_coffee_table'
          new_id: 'mcwbiomesoplenty:dead_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_glass_table'
          new_id: 'mcwbiomesoplenty:dead_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_chair'
          new_id: 'mcwbiomesoplenty:dead_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_modern_chair'
          new_id: 'mcwbiomesoplenty:dead_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_striped_chair'
          new_id: 'mcwbiomesoplenty:dead_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_stool_chair'
          new_id: 'mcwbiomesoplenty:dead_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_counter'
          new_id: 'mcwbiomesoplenty:dead_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_drawer_counter'
          new_id: 'mcwbiomesoplenty:dead_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:dead_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_cupboard_counter'
          new_id: 'mcwbiomesoplenty:dead_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_dead_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_dead_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_desk'
          new_id: 'mcwbiomesoplenty:stripped_dead_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_dead_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_dead_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_end_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:dead_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:dead_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:dead_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:dead_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_dead_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_dead_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:dead_roof'
          new_id: 'mcwbiomesoplenty:dead_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_attic_roof'
          new_id: 'mcwbiomesoplenty:dead_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_top_roof'
          new_id: 'mcwbiomesoplenty:dead_top_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_top_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:dead_picket_fence'
          new_id: 'mcwbiomesoplenty:dead_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_stockade_fence'
          new_id: 'mcwbiomesoplenty:dead_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_horse_fence'
          new_id: 'mcwbiomesoplenty:dead_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_wired_fence'
          new_id: 'mcwbiomesoplenty:dead_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_highley_gate'
          new_id: 'mcwbiomesoplenty:dead_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:dead_pyramid_gate'
          new_id: 'mcwbiomesoplenty:dead_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:dead_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:dead_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_dead_bridge'
          new_id: 'mcwbiomesoplenty:rope_dead_bridge'
        }
        {
          old_id: 'macawsbridgesbop:dead_bridge_pier'
          new_id: 'mcwbiomesoplenty:dead_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:dead_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:dead_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:dead_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:dead_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:dead_rail_bridge'
          new_id: 'mcwbiomesoplenty:dead_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:fir_wardrobe'
          new_id: 'mcwbiomesoplenty:fir_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:fir_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:fir_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_wardrobe'
          new_id: 'mcwbiomesoplenty:fir_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:fir_bookshelf'
          new_id: 'mcwbiomesoplenty:fir_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:fir_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:fir_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:fir_drawer'
          new_id: 'mcwbiomesoplenty:fir_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_drawer'
          new_id: 'mcwbiomesoplenty:fir_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:fir_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:fir_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_large_drawer'
          new_id: 'mcwbiomesoplenty:fir_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:fir_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_triple_drawer'
          new_id: 'mcwbiomesoplenty:fir_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_desk'
          new_id: 'mcwbiomesoplenty:fir_desk'
        }
        {
          old_id: 'mcwfurnituresbop:fir_covered_desk'
          new_id: 'mcwbiomesoplenty:fir_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:fir_modern_desk'
          new_id: 'mcwbiomesoplenty:fir_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:fir_table'
          new_id: 'mcwbiomesoplenty:fir_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_end_table'
          new_id: 'mcwbiomesoplenty:fir_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_coffee_table'
          new_id: 'mcwbiomesoplenty:fir_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_glass_table'
          new_id: 'mcwbiomesoplenty:fir_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_chair'
          new_id: 'mcwbiomesoplenty:fir_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_modern_chair'
          new_id: 'mcwbiomesoplenty:fir_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_striped_chair'
          new_id: 'mcwbiomesoplenty:fir_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_stool_chair'
          new_id: 'mcwbiomesoplenty:fir_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_counter'
          new_id: 'mcwbiomesoplenty:fir_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_drawer_counter'
          new_id: 'mcwbiomesoplenty:fir_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:fir_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_cupboard_counter'
          new_id: 'mcwbiomesoplenty:fir_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_fir_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_fir_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_desk'
          new_id: 'mcwbiomesoplenty:stripped_fir_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_fir_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_fir_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_end_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:fir_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:fir_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:fir_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:fir_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_fir_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_fir_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:fir_roof'
          new_id: 'mcwbiomesoplenty:fir_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_attic_roof'
          new_id: 'mcwbiomesoplenty:fir_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_top_roof'
          new_id: 'mcwbiomesoplenty:fir_top_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_top_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:fir_picket_fence'
          new_id: 'mcwbiomesoplenty:fir_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_stockade_fence'
          new_id: 'mcwbiomesoplenty:fir_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_horse_fence'
          new_id: 'mcwbiomesoplenty:fir_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_wired_fence'
          new_id: 'mcwbiomesoplenty:fir_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_highley_gate'
          new_id: 'mcwbiomesoplenty:fir_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:fir_pyramid_gate'
          new_id: 'mcwbiomesoplenty:fir_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:fir_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:fir_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_fir_bridge'
          new_id: 'mcwbiomesoplenty:rope_fir_bridge'
        }
        {
          old_id: 'macawsbridgesbop:fir_bridge_pier'
          new_id: 'mcwbiomesoplenty:fir_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:fir_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:fir_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:fir_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:fir_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:fir_rail_bridge'
          new_id: 'mcwbiomesoplenty:fir_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_wardrobe'
          new_id: 'mcwbiomesoplenty:hellbark_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:hellbark_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_wardrobe'
          new_id: 'mcwbiomesoplenty:hellbark_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_bookshelf'
          new_id: 'mcwbiomesoplenty:hellbark_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:hellbark_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_large_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_triple_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_desk'
          new_id: 'mcwbiomesoplenty:hellbark_desk'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_covered_desk'
          new_id: 'mcwbiomesoplenty:hellbark_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_modern_desk'
          new_id: 'mcwbiomesoplenty:hellbark_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_table'
          new_id: 'mcwbiomesoplenty:hellbark_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_end_table'
          new_id: 'mcwbiomesoplenty:hellbark_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_coffee_table'
          new_id: 'mcwbiomesoplenty:hellbark_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_glass_table'
          new_id: 'mcwbiomesoplenty:hellbark_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_chair'
          new_id: 'mcwbiomesoplenty:hellbark_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_modern_chair'
          new_id: 'mcwbiomesoplenty:hellbark_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_striped_chair'
          new_id: 'mcwbiomesoplenty:hellbark_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_stool_chair'
          new_id: 'mcwbiomesoplenty:hellbark_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_counter'
          new_id: 'mcwbiomesoplenty:hellbark_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_drawer_counter'
          new_id: 'mcwbiomesoplenty:hellbark_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:hellbark_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_cupboard_counter'
          new_id: 'mcwbiomesoplenty:hellbark_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_desk'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_end_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:hellbark_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:hellbark_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:hellbark_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:hellbark_roof'
          new_id: 'mcwbiomesoplenty:hellbark_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_attic_roof'
          new_id: 'mcwbiomesoplenty:hellbark_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_top_roof'
          new_id: 'mcwbiomesoplenty:hellbark_top_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_top_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:hellbark_picket_fence'
          new_id: 'mcwbiomesoplenty:hellbark_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_stockade_fence'
          new_id: 'mcwbiomesoplenty:hellbark_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_horse_fence'
          new_id: 'mcwbiomesoplenty:hellbark_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_wired_fence'
          new_id: 'mcwbiomesoplenty:hellbark_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_highley_gate'
          new_id: 'mcwbiomesoplenty:hellbark_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:hellbark_pyramid_gate'
          new_id: 'mcwbiomesoplenty:hellbark_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_hellbark_bridge'
          new_id: 'mcwbiomesoplenty:rope_hellbark_bridge'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_bridge_pier'
          new_id: 'mcwbiomesoplenty:hellbark_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:hellbark_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:hellbark_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_rail_bridge'
          new_id: 'mcwbiomesoplenty:hellbark_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_wardrobe'
          new_id: 'mcwbiomesoplenty:jacaranda_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:jacaranda_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_wardrobe'
          new_id: 'mcwbiomesoplenty:jacaranda_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_bookshelf'
          new_id: 'mcwbiomesoplenty:jacaranda_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_large_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_triple_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_desk'
          new_id: 'mcwbiomesoplenty:jacaranda_desk'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_covered_desk'
          new_id: 'mcwbiomesoplenty:jacaranda_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_modern_desk'
          new_id: 'mcwbiomesoplenty:jacaranda_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_table'
          new_id: 'mcwbiomesoplenty:jacaranda_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_end_table'
          new_id: 'mcwbiomesoplenty:jacaranda_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_coffee_table'
          new_id: 'mcwbiomesoplenty:jacaranda_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_glass_table'
          new_id: 'mcwbiomesoplenty:jacaranda_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_modern_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_striped_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_stool_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_drawer_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_cupboard_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_desk'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_end_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:jacaranda_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:jacaranda_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:jacaranda_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_attic_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_top_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_top_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_top_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_picket_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_stockade_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_horse_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_wired_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_highley_gate'
          new_id: 'mcwbiomesoplenty:jacaranda_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_pyramid_gate'
          new_id: 'mcwbiomesoplenty:jacaranda_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_jacaranda_bridge'
          new_id: 'mcwbiomesoplenty:rope_jacaranda_bridge'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_bridge_pier'
          new_id: 'mcwbiomesoplenty:jacaranda_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:jacaranda_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_rail_bridge'
          new_id: 'mcwbiomesoplenty:jacaranda_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:magic_wardrobe'
          new_id: 'mcwbiomesoplenty:magic_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:magic_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:magic_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_wardrobe'
          new_id: 'mcwbiomesoplenty:magic_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:magic_bookshelf'
          new_id: 'mcwbiomesoplenty:magic_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:magic_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:magic_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:magic_drawer'
          new_id: 'mcwbiomesoplenty:magic_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_drawer'
          new_id: 'mcwbiomesoplenty:magic_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:magic_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:magic_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_large_drawer'
          new_id: 'mcwbiomesoplenty:magic_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:magic_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_triple_drawer'
          new_id: 'mcwbiomesoplenty:magic_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_desk'
          new_id: 'mcwbiomesoplenty:magic_desk'
        }
        {
          old_id: 'mcwfurnituresbop:magic_covered_desk'
          new_id: 'mcwbiomesoplenty:magic_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:magic_modern_desk'
          new_id: 'mcwbiomesoplenty:magic_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:magic_table'
          new_id: 'mcwbiomesoplenty:magic_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_end_table'
          new_id: 'mcwbiomesoplenty:magic_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_coffee_table'
          new_id: 'mcwbiomesoplenty:magic_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_glass_table'
          new_id: 'mcwbiomesoplenty:magic_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_chair'
          new_id: 'mcwbiomesoplenty:magic_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_modern_chair'
          new_id: 'mcwbiomesoplenty:magic_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_striped_chair'
          new_id: 'mcwbiomesoplenty:magic_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_stool_chair'
          new_id: 'mcwbiomesoplenty:magic_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_counter'
          new_id: 'mcwbiomesoplenty:magic_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_drawer_counter'
          new_id: 'mcwbiomesoplenty:magic_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:magic_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_cupboard_counter'
          new_id: 'mcwbiomesoplenty:magic_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_magic_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_magic_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_desk'
          new_id: 'mcwbiomesoplenty:stripped_magic_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_magic_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_magic_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_end_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:magic_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:magic_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:magic_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:magic_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_magic_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_magic_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:magic_roof'
          new_id: 'mcwbiomesoplenty:magic_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_attic_roof'
          new_id: 'mcwbiomesoplenty:magic_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_top_roof'
          new_id: 'mcwbiomesoplenty:magic_top_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_top_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:magic_picket_fence'
          new_id: 'mcwbiomesoplenty:magic_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_stockade_fence'
          new_id: 'mcwbiomesoplenty:magic_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_horse_fence'
          new_id: 'mcwbiomesoplenty:magic_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_wired_fence'
          new_id: 'mcwbiomesoplenty:magic_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_highley_gate'
          new_id: 'mcwbiomesoplenty:magic_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:magic_pyramid_gate'
          new_id: 'mcwbiomesoplenty:magic_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:magic_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:magic_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_magic_bridge'
          new_id: 'mcwbiomesoplenty:rope_magic_bridge'
        }
        {
          old_id: 'macawsbridgesbop:magic_bridge_pier'
          new_id: 'mcwbiomesoplenty:magic_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:magic_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:magic_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:magic_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:magic_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:magic_rail_bridge'
          new_id: 'mcwbiomesoplenty:magic_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_wardrobe'
          new_id: 'mcwbiomesoplenty:mahogany_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:mahogany_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_wardrobe'
          new_id: 'mcwbiomesoplenty:mahogany_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_bookshelf'
          new_id: 'mcwbiomesoplenty:mahogany_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:mahogany_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_large_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_triple_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_desk'
          new_id: 'mcwbiomesoplenty:mahogany_desk'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_covered_desk'
          new_id: 'mcwbiomesoplenty:mahogany_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_modern_desk'
          new_id: 'mcwbiomesoplenty:mahogany_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_table'
          new_id: 'mcwbiomesoplenty:mahogany_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_end_table'
          new_id: 'mcwbiomesoplenty:mahogany_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_coffee_table'
          new_id: 'mcwbiomesoplenty:mahogany_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_glass_table'
          new_id: 'mcwbiomesoplenty:mahogany_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_chair'
          new_id: 'mcwbiomesoplenty:mahogany_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_modern_chair'
          new_id: 'mcwbiomesoplenty:mahogany_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_striped_chair'
          new_id: 'mcwbiomesoplenty:mahogany_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_stool_chair'
          new_id: 'mcwbiomesoplenty:mahogany_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_counter'
          new_id: 'mcwbiomesoplenty:mahogany_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_drawer_counter'
          new_id: 'mcwbiomesoplenty:mahogany_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:mahogany_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_cupboard_counter'
          new_id: 'mcwbiomesoplenty:mahogany_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_desk'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_end_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:mahogany_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:mahogany_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:mahogany_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:mahogany_roof'
          new_id: 'mcwbiomesoplenty:mahogany_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_attic_roof'
          new_id: 'mcwbiomesoplenty:mahogany_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_top_roof'
          new_id: 'mcwbiomesoplenty:mahogany_top_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_top_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:mahogany_picket_fence'
          new_id: 'mcwbiomesoplenty:mahogany_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_stockade_fence'
          new_id: 'mcwbiomesoplenty:mahogany_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_horse_fence'
          new_id: 'mcwbiomesoplenty:mahogany_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_wired_fence'
          new_id: 'mcwbiomesoplenty:mahogany_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_highley_gate'
          new_id: 'mcwbiomesoplenty:mahogany_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:mahogany_pyramid_gate'
          new_id: 'mcwbiomesoplenty:mahogany_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_mahogany_bridge'
          new_id: 'mcwbiomesoplenty:rope_mahogany_bridge'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_bridge_pier'
          new_id: 'mcwbiomesoplenty:mahogany_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:mahogany_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:mahogany_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_rail_bridge'
          new_id: 'mcwbiomesoplenty:mahogany_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:palm_wardrobe'
          new_id: 'mcwbiomesoplenty:palm_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:palm_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:palm_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_wardrobe'
          new_id: 'mcwbiomesoplenty:palm_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:palm_bookshelf'
          new_id: 'mcwbiomesoplenty:palm_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:palm_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:palm_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:palm_drawer'
          new_id: 'mcwbiomesoplenty:palm_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_drawer'
          new_id: 'mcwbiomesoplenty:palm_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:palm_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:palm_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_large_drawer'
          new_id: 'mcwbiomesoplenty:palm_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:palm_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_triple_drawer'
          new_id: 'mcwbiomesoplenty:palm_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_desk'
          new_id: 'mcwbiomesoplenty:palm_desk'
        }
        {
          old_id: 'mcwfurnituresbop:palm_covered_desk'
          new_id: 'mcwbiomesoplenty:palm_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:palm_modern_desk'
          new_id: 'mcwbiomesoplenty:palm_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:palm_table'
          new_id: 'mcwbiomesoplenty:palm_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_end_table'
          new_id: 'mcwbiomesoplenty:palm_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_coffee_table'
          new_id: 'mcwbiomesoplenty:palm_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_glass_table'
          new_id: 'mcwbiomesoplenty:palm_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_chair'
          new_id: 'mcwbiomesoplenty:palm_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_modern_chair'
          new_id: 'mcwbiomesoplenty:palm_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_striped_chair'
          new_id: 'mcwbiomesoplenty:palm_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_stool_chair'
          new_id: 'mcwbiomesoplenty:palm_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_counter'
          new_id: 'mcwbiomesoplenty:palm_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_drawer_counter'
          new_id: 'mcwbiomesoplenty:palm_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:palm_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_cupboard_counter'
          new_id: 'mcwbiomesoplenty:palm_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_palm_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_palm_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_desk'
          new_id: 'mcwbiomesoplenty:stripped_palm_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_palm_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_palm_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_end_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:palm_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:palm_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:palm_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:palm_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_palm_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_palm_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:palm_roof'
          new_id: 'mcwbiomesoplenty:palm_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_attic_roof'
          new_id: 'mcwbiomesoplenty:palm_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_top_roof'
          new_id: 'mcwbiomesoplenty:palm_top_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_top_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:palm_picket_fence'
          new_id: 'mcwbiomesoplenty:palm_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_stockade_fence'
          new_id: 'mcwbiomesoplenty:palm_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_horse_fence'
          new_id: 'mcwbiomesoplenty:palm_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_wired_fence'
          new_id: 'mcwbiomesoplenty:palm_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_highley_gate'
          new_id: 'mcwbiomesoplenty:palm_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:palm_pyramid_gate'
          new_id: 'mcwbiomesoplenty:palm_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:palm_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:palm_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_palm_bridge'
          new_id: 'mcwbiomesoplenty:rope_palm_bridge'
        }
        {
          old_id: 'macawsbridgesbop:palm_bridge_pier'
          new_id: 'mcwbiomesoplenty:palm_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:palm_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:palm_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:palm_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:palm_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:palm_rail_bridge'
          new_id: 'mcwbiomesoplenty:palm_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_wardrobe'
          new_id: 'mcwbiomesoplenty:redwood_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:redwood_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_wardrobe'
          new_id: 'mcwbiomesoplenty:redwood_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_bookshelf'
          new_id: 'mcwbiomesoplenty:redwood_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:redwood_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_drawer'
          new_id: 'mcwbiomesoplenty:redwood_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_drawer'
          new_id: 'mcwbiomesoplenty:redwood_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:redwood_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:redwood_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_large_drawer'
          new_id: 'mcwbiomesoplenty:redwood_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:redwood_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_triple_drawer'
          new_id: 'mcwbiomesoplenty:redwood_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_desk'
          new_id: 'mcwbiomesoplenty:redwood_desk'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_covered_desk'
          new_id: 'mcwbiomesoplenty:redwood_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_modern_desk'
          new_id: 'mcwbiomesoplenty:redwood_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_table'
          new_id: 'mcwbiomesoplenty:redwood_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_end_table'
          new_id: 'mcwbiomesoplenty:redwood_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_coffee_table'
          new_id: 'mcwbiomesoplenty:redwood_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_glass_table'
          new_id: 'mcwbiomesoplenty:redwood_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_chair'
          new_id: 'mcwbiomesoplenty:redwood_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_modern_chair'
          new_id: 'mcwbiomesoplenty:redwood_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_striped_chair'
          new_id: 'mcwbiomesoplenty:redwood_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_stool_chair'
          new_id: 'mcwbiomesoplenty:redwood_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_counter'
          new_id: 'mcwbiomesoplenty:redwood_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_drawer_counter'
          new_id: 'mcwbiomesoplenty:redwood_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:redwood_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_cupboard_counter'
          new_id: 'mcwbiomesoplenty:redwood_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_redwood_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_redwood_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_desk'
          new_id: 'mcwbiomesoplenty:stripped_redwood_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_redwood_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_redwood_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_end_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:redwood_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:redwood_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:redwood_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_redwood_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_redwood_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:redwood_roof'
          new_id: 'mcwbiomesoplenty:redwood_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_attic_roof'
          new_id: 'mcwbiomesoplenty:redwood_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_top_roof'
          new_id: 'mcwbiomesoplenty:redwood_top_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_top_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:redwood_picket_fence'
          new_id: 'mcwbiomesoplenty:redwood_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_stockade_fence'
          new_id: 'mcwbiomesoplenty:redwood_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_horse_fence'
          new_id: 'mcwbiomesoplenty:redwood_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_wired_fence'
          new_id: 'mcwbiomesoplenty:redwood_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_highley_gate'
          new_id: 'mcwbiomesoplenty:redwood_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:redwood_pyramid_gate'
          new_id: 'mcwbiomesoplenty:redwood_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_redwood_bridge'
          new_id: 'mcwbiomesoplenty:rope_redwood_bridge'
        }
        {
          old_id: 'macawsbridgesbop:redwood_bridge_pier'
          new_id: 'mcwbiomesoplenty:redwood_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:redwood_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:redwood_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:redwood_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:redwood_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:redwood_rail_bridge'
          new_id: 'mcwbiomesoplenty:redwood_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_wardrobe'
          new_id: 'mcwbiomesoplenty:umbran_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:umbran_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_wardrobe'
          new_id: 'mcwbiomesoplenty:umbran_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_bookshelf'
          new_id: 'mcwbiomesoplenty:umbran_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:umbran_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_drawer'
          new_id: 'mcwbiomesoplenty:umbran_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_drawer'
          new_id: 'mcwbiomesoplenty:umbran_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:umbran_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:umbran_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_large_drawer'
          new_id: 'mcwbiomesoplenty:umbran_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:umbran_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_triple_drawer'
          new_id: 'mcwbiomesoplenty:umbran_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_desk'
          new_id: 'mcwbiomesoplenty:umbran_desk'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_covered_desk'
          new_id: 'mcwbiomesoplenty:umbran_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_modern_desk'
          new_id: 'mcwbiomesoplenty:umbran_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_table'
          new_id: 'mcwbiomesoplenty:umbran_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_end_table'
          new_id: 'mcwbiomesoplenty:umbran_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_coffee_table'
          new_id: 'mcwbiomesoplenty:umbran_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_glass_table'
          new_id: 'mcwbiomesoplenty:umbran_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_chair'
          new_id: 'mcwbiomesoplenty:umbran_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_modern_chair'
          new_id: 'mcwbiomesoplenty:umbran_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_striped_chair'
          new_id: 'mcwbiomesoplenty:umbran_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_stool_chair'
          new_id: 'mcwbiomesoplenty:umbran_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_counter'
          new_id: 'mcwbiomesoplenty:umbran_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_drawer_counter'
          new_id: 'mcwbiomesoplenty:umbran_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:umbran_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_cupboard_counter'
          new_id: 'mcwbiomesoplenty:umbran_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_umbran_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_umbran_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_desk'
          new_id: 'mcwbiomesoplenty:stripped_umbran_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_umbran_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_umbran_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_end_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:umbran_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:umbran_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:umbran_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_umbran_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_umbran_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:umbran_roof'
          new_id: 'mcwbiomesoplenty:umbran_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_attic_roof'
          new_id: 'mcwbiomesoplenty:umbran_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_top_roof'
          new_id: 'mcwbiomesoplenty:umbran_top_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_top_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:umbran_picket_fence'
          new_id: 'mcwbiomesoplenty:umbran_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_stockade_fence'
          new_id: 'mcwbiomesoplenty:umbran_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_horse_fence'
          new_id: 'mcwbiomesoplenty:umbran_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_wired_fence'
          new_id: 'mcwbiomesoplenty:umbran_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_highley_gate'
          new_id: 'mcwbiomesoplenty:umbran_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:umbran_pyramid_gate'
          new_id: 'mcwbiomesoplenty:umbran_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_umbran_bridge'
          new_id: 'mcwbiomesoplenty:rope_umbran_bridge'
        }
        {
          old_id: 'macawsbridgesbop:umbran_bridge_pier'
          new_id: 'mcwbiomesoplenty:umbran_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:umbran_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:umbran_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:umbran_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:umbran_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:umbran_rail_bridge'
          new_id: 'mcwbiomesoplenty:umbran_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:willow_wardrobe'
          new_id: 'mcwbiomesoplenty:willow_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:willow_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:willow_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_wardrobe'
          new_id: 'mcwbiomesoplenty:willow_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:willow_bookshelf'
          new_id: 'mcwbiomesoplenty:willow_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:willow_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:willow_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:willow_drawer'
          new_id: 'mcwbiomesoplenty:willow_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_drawer'
          new_id: 'mcwbiomesoplenty:willow_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:willow_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:willow_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_large_drawer'
          new_id: 'mcwbiomesoplenty:willow_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:willow_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_triple_drawer'
          new_id: 'mcwbiomesoplenty:willow_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_desk'
          new_id: 'mcwbiomesoplenty:willow_desk'
        }
        {
          old_id: 'mcwfurnituresbop:willow_covered_desk'
          new_id: 'mcwbiomesoplenty:willow_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:willow_modern_desk'
          new_id: 'mcwbiomesoplenty:willow_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:willow_table'
          new_id: 'mcwbiomesoplenty:willow_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_end_table'
          new_id: 'mcwbiomesoplenty:willow_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_coffee_table'
          new_id: 'mcwbiomesoplenty:willow_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_glass_table'
          new_id: 'mcwbiomesoplenty:willow_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_chair'
          new_id: 'mcwbiomesoplenty:willow_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_modern_chair'
          new_id: 'mcwbiomesoplenty:willow_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_striped_chair'
          new_id: 'mcwbiomesoplenty:willow_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_stool_chair'
          new_id: 'mcwbiomesoplenty:willow_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_counter'
          new_id: 'mcwbiomesoplenty:willow_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_drawer_counter'
          new_id: 'mcwbiomesoplenty:willow_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:willow_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_cupboard_counter'
          new_id: 'mcwbiomesoplenty:willow_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_willow_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_willow_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_desk'
          new_id: 'mcwbiomesoplenty:stripped_willow_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_willow_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_willow_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_end_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:willow_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:willow_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:willow_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:willow_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_willow_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_willow_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:willow_roof'
          new_id: 'mcwbiomesoplenty:willow_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_attic_roof'
          new_id: 'mcwbiomesoplenty:willow_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_top_roof'
          new_id: 'mcwbiomesoplenty:willow_top_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_top_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:willow_picket_fence'
          new_id: 'mcwbiomesoplenty:willow_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_stockade_fence'
          new_id: 'mcwbiomesoplenty:willow_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_horse_fence'
          new_id: 'mcwbiomesoplenty:willow_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_wired_fence'
          new_id: 'mcwbiomesoplenty:willow_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_highley_gate'
          new_id: 'mcwbiomesoplenty:willow_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:willow_pyramid_gate'
          new_id: 'mcwbiomesoplenty:willow_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:willow_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:willow_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_willow_bridge'
          new_id: 'mcwbiomesoplenty:rope_willow_bridge'
        }
        {
          old_id: 'macawsbridgesbop:willow_bridge_pier'
          new_id: 'mcwbiomesoplenty:willow_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:willow_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:willow_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:willow_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:willow_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:willow_rail_bridge'
          new_id: 'mcwbiomesoplenty:willow_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_wardrobe'
          new_id: 'mcwbiomesoplenty:empyreal_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:empyreal_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_wardrobe'
          new_id: 'mcwbiomesoplenty:empyreal_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_bookshelf'
          new_id: 'mcwbiomesoplenty:empyreal_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:empyreal_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_large_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_triple_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_desk'
          new_id: 'mcwbiomesoplenty:empyreal_desk'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_covered_desk'
          new_id: 'mcwbiomesoplenty:empyreal_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_modern_desk'
          new_id: 'mcwbiomesoplenty:empyreal_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_table'
          new_id: 'mcwbiomesoplenty:empyreal_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_end_table'
          new_id: 'mcwbiomesoplenty:empyreal_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_coffee_table'
          new_id: 'mcwbiomesoplenty:empyreal_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_glass_table'
          new_id: 'mcwbiomesoplenty:empyreal_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_chair'
          new_id: 'mcwbiomesoplenty:empyreal_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_modern_chair'
          new_id: 'mcwbiomesoplenty:empyreal_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_striped_chair'
          new_id: 'mcwbiomesoplenty:empyreal_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_stool_chair'
          new_id: 'mcwbiomesoplenty:empyreal_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_counter'
          new_id: 'mcwbiomesoplenty:empyreal_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_drawer_counter'
          new_id: 'mcwbiomesoplenty:empyreal_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:empyreal_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_cupboard_counter'
          new_id: 'mcwbiomesoplenty:empyreal_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_desk'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_end_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:empyreal_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:empyreal_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:empyreal_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:empyreal_roof'
          new_id: 'mcwbiomesoplenty:empyreal_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_attic_roof'
          new_id: 'mcwbiomesoplenty:empyreal_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_top_roof'
          new_id: 'mcwbiomesoplenty:empyreal_top_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_top_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:empyreal_picket_fence'
          new_id: 'mcwbiomesoplenty:empyreal_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_stockade_fence'
          new_id: 'mcwbiomesoplenty:empyreal_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_horse_fence'
          new_id: 'mcwbiomesoplenty:empyreal_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_wired_fence'
          new_id: 'mcwbiomesoplenty:empyreal_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_highley_gate'
          new_id: 'mcwbiomesoplenty:empyreal_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:empyreal_pyramid_gate'
          new_id: 'mcwbiomesoplenty:empyreal_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_empyreal_bridge'
          new_id: 'mcwbiomesoplenty:rope_empyreal_bridge'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_bridge_pier'
          new_id: 'mcwbiomesoplenty:empyreal_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:empyreal_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:empyreal_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_rail_bridge'
          new_id: 'mcwbiomesoplenty:empyreal_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:maple_wardrobe'
          new_id: 'mcwbiomesoplenty:maple_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:maple_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:maple_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_wardrobe'
          new_id: 'mcwbiomesoplenty:maple_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:maple_bookshelf'
          new_id: 'mcwbiomesoplenty:maple_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:maple_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:maple_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:maple_drawer'
          new_id: 'mcwbiomesoplenty:maple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_drawer'
          new_id: 'mcwbiomesoplenty:maple_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:maple_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:maple_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_large_drawer'
          new_id: 'mcwbiomesoplenty:maple_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:maple_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_triple_drawer'
          new_id: 'mcwbiomesoplenty:maple_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_desk'
          new_id: 'mcwbiomesoplenty:maple_desk'
        }
        {
          old_id: 'mcwfurnituresbop:maple_covered_desk'
          new_id: 'mcwbiomesoplenty:maple_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:maple_modern_desk'
          new_id: 'mcwbiomesoplenty:maple_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:maple_table'
          new_id: 'mcwbiomesoplenty:maple_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_end_table'
          new_id: 'mcwbiomesoplenty:maple_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_coffee_table'
          new_id: 'mcwbiomesoplenty:maple_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_glass_table'
          new_id: 'mcwbiomesoplenty:maple_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_chair'
          new_id: 'mcwbiomesoplenty:maple_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_modern_chair'
          new_id: 'mcwbiomesoplenty:maple_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_striped_chair'
          new_id: 'mcwbiomesoplenty:maple_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_stool_chair'
          new_id: 'mcwbiomesoplenty:maple_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_counter'
          new_id: 'mcwbiomesoplenty:maple_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_drawer_counter'
          new_id: 'mcwbiomesoplenty:maple_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:maple_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_cupboard_counter'
          new_id: 'mcwbiomesoplenty:maple_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_maple_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_maple_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_desk'
          new_id: 'mcwbiomesoplenty:stripped_maple_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_maple_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_maple_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_end_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:maple_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:maple_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:maple_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:maple_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_maple_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_maple_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:maple_roof'
          new_id: 'mcwbiomesoplenty:maple_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_attic_roof'
          new_id: 'mcwbiomesoplenty:maple_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_top_roof'
          new_id: 'mcwbiomesoplenty:maple_top_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_top_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:maple_picket_fence'
          new_id: 'mcwbiomesoplenty:maple_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_stockade_fence'
          new_id: 'mcwbiomesoplenty:maple_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_horse_fence'
          new_id: 'mcwbiomesoplenty:maple_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_wired_fence'
          new_id: 'mcwbiomesoplenty:maple_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_highley_gate'
          new_id: 'mcwbiomesoplenty:maple_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:maple_pyramid_gate'
          new_id: 'mcwbiomesoplenty:maple_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:maple_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:maple_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_maple_bridge'
          new_id: 'mcwbiomesoplenty:rope_maple_bridge'
        }
        {
          old_id: 'macawsbridgesbop:maple_bridge_pier'
          new_id: 'mcwbiomesoplenty:maple_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:maple_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:maple_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:maple_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:maple_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:maple_rail_bridge'
          new_id: 'mcwbiomesoplenty:maple_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:pine_wardrobe'
          new_id: 'mcwbiomesoplenty:pine_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:pine_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:pine_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_wardrobe'
          new_id: 'mcwbiomesoplenty:pine_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:pine_bookshelf'
          new_id: 'mcwbiomesoplenty:pine_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:pine_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:pine_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:pine_drawer'
          new_id: 'mcwbiomesoplenty:pine_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_drawer'
          new_id: 'mcwbiomesoplenty:pine_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:pine_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:pine_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_large_drawer'
          new_id: 'mcwbiomesoplenty:pine_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:pine_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_triple_drawer'
          new_id: 'mcwbiomesoplenty:pine_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_desk'
          new_id: 'mcwbiomesoplenty:pine_desk'
        }
        {
          old_id: 'mcwfurnituresbop:pine_covered_desk'
          new_id: 'mcwbiomesoplenty:pine_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:pine_modern_desk'
          new_id: 'mcwbiomesoplenty:pine_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:pine_table'
          new_id: 'mcwbiomesoplenty:pine_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_end_table'
          new_id: 'mcwbiomesoplenty:pine_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_coffee_table'
          new_id: 'mcwbiomesoplenty:pine_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_glass_table'
          new_id: 'mcwbiomesoplenty:pine_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_chair'
          new_id: 'mcwbiomesoplenty:pine_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_modern_chair'
          new_id: 'mcwbiomesoplenty:pine_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_striped_chair'
          new_id: 'mcwbiomesoplenty:pine_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_stool_chair'
          new_id: 'mcwbiomesoplenty:pine_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_counter'
          new_id: 'mcwbiomesoplenty:pine_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_drawer_counter'
          new_id: 'mcwbiomesoplenty:pine_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:pine_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_cupboard_counter'
          new_id: 'mcwbiomesoplenty:pine_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_pine_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_pine_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_desk'
          new_id: 'mcwbiomesoplenty:stripped_pine_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_pine_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_pine_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_end_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:pine_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:pine_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:pine_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:pine_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_pine_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_pine_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:pine_roof'
          new_id: 'mcwbiomesoplenty:pine_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_attic_roof'
          new_id: 'mcwbiomesoplenty:pine_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_top_roof'
          new_id: 'mcwbiomesoplenty:pine_top_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_top_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:pine_picket_fence'
          new_id: 'mcwbiomesoplenty:pine_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_stockade_fence'
          new_id: 'mcwbiomesoplenty:pine_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_horse_fence'
          new_id: 'mcwbiomesoplenty:pine_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_wired_fence'
          new_id: 'mcwbiomesoplenty:pine_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_highley_gate'
          new_id: 'mcwbiomesoplenty:pine_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:pine_pyramid_gate'
          new_id: 'mcwbiomesoplenty:pine_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:pine_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:pine_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_pine_bridge'
          new_id: 'mcwbiomesoplenty:rope_pine_bridge'
        }
        {
          old_id: 'macawsbridgesbop:pine_bridge_pier'
          new_id: 'mcwbiomesoplenty:pine_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:pine_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:pine_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:pine_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:pine_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:pine_rail_bridge'
          new_id: 'mcwbiomesoplenty:pine_rail_bridge'
        }
        {
          old_id: 'mcwfencesbop:dead_hedge'
          new_id: 'mcwbiomesoplenty:dead_hedge'
        }
        {
          old_id: 'mcwfencesbop:fir_hedge'
          new_id: 'mcwbiomesoplenty:fir_hedge'
        }
        {
          old_id: 'mcwfencesbop:hellbark_hedge'
          new_id: 'mcwbiomesoplenty:hellbark_hedge'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_hedge'
          new_id: 'mcwbiomesoplenty:jacaranda_hedge'
        }
        {
          old_id: 'mcwfencesbop:magic_hedge'
          new_id: 'mcwbiomesoplenty:magic_hedge'
        }
        {
          old_id: 'mcwfencesbop:mahogany_hedge'
          new_id: 'mcwbiomesoplenty:mahogany_hedge'
        }
        {
          old_id: 'mcwfencesbop:palm_hedge'
          new_id: 'mcwbiomesoplenty:palm_hedge'
        }
        {
          old_id: 'mcwfencesbop:redwood_hedge'
          new_id: 'mcwbiomesoplenty:redwood_hedge'
        }
        {
          old_id: 'mcwfencesbop:umbran_hedge'
          new_id: 'mcwbiomesoplenty:umbran_hedge'
        }
        {
          old_id: 'mcwfencesbop:willow_hedge'
          new_id: 'mcwbiomesoplenty:willow_hedge'
        }
        {
          old_id: 'mcwfencesbop:empyreal_hedge'
          new_id: 'mcwbiomesoplenty:empyreal_hedge'
        }
        {
          old_id: 'mcwfencesbop:pine_hedge'
          new_id: 'mcwbiomesoplenty:pine_hedge'
        }
        {
          old_id: 'mcwfencesbop:orange_maple_hedge'
          new_id: 'mcwbiomesoplenty:orange_maple_hedge'
        }
        {
          old_id: 'mcwfencesbop:red_maple_hedge'
          new_id: 'mcwbiomesoplenty:red_maple_hedge'
        }
        {
          old_id: 'mcwfencesbop:yellow_maple_hedge'
          new_id: 'mcwbiomesoplenty:yellow_maple_hedge'
        }
        {
          old_id: 'mcwfencesbop:cypress_hedge'
          new_id: 'mcwbiomesoplenty:cypress_hedge'
        }
        {
          old_id: 'mcwfencesbop:snowblossom_hedge'
          new_id: 'mcwbiomesoplenty:snowblossom_hedge'
        }
        {
          old_id: 'mcwfencesbop:flowering_oak_hedge'
          new_id: 'mcwbiomesoplenty:flowering_oak_hedge'
        }
        {
          old_id: 'mcwfencesbop:rainbow_birch_hedge'
          new_id: 'mcwbiomesoplenty:rainbow_birch_hedge'
        }
        {
          old_id: 'mcwfencesbop:origin_hedge'
          new_id: 'mcwbiomesoplenty:origin_hedge'
        }
]
  }
  {
    registry_key: 'minecraft:entity_type'
    fixers: [
      {
        old_id: 'examplemod:example_entity'
        new_id: 'minecraft:cow'
      }
    ]
  }
  {
    registry_key: 'minecraft:item'
    fixers: [
      {
        old_id: 'examplemod:example_item'
        new_id: 'minecraft:stone'
      }
        {
          old_id: 'mcwfurnituresbop:dead_wardrobe'
          new_id: 'mcwbiomesoplenty:dead_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:dead_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:dead_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_wardrobe'
          new_id: 'mcwbiomesoplenty:dead_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:dead_bookshelf'
          new_id: 'mcwbiomesoplenty:dead_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:dead_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:dead_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:dead_drawer'
          new_id: 'mcwbiomesoplenty:dead_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_drawer'
          new_id: 'mcwbiomesoplenty:dead_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:dead_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:dead_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_large_drawer'
          new_id: 'mcwbiomesoplenty:dead_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:dead_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_triple_drawer'
          new_id: 'mcwbiomesoplenty:dead_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:dead_desk'
          new_id: 'mcwbiomesoplenty:dead_desk'
        }
        {
          old_id: 'mcwfurnituresbop:dead_covered_desk'
          new_id: 'mcwbiomesoplenty:dead_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:dead_modern_desk'
          new_id: 'mcwbiomesoplenty:dead_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:dead_table'
          new_id: 'mcwbiomesoplenty:dead_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_end_table'
          new_id: 'mcwbiomesoplenty:dead_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_coffee_table'
          new_id: 'mcwbiomesoplenty:dead_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_glass_table'
          new_id: 'mcwbiomesoplenty:dead_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:dead_chair'
          new_id: 'mcwbiomesoplenty:dead_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_modern_chair'
          new_id: 'mcwbiomesoplenty:dead_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_striped_chair'
          new_id: 'mcwbiomesoplenty:dead_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_stool_chair'
          new_id: 'mcwbiomesoplenty:dead_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:dead_counter'
          new_id: 'mcwbiomesoplenty:dead_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_drawer_counter'
          new_id: 'mcwbiomesoplenty:dead_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:dead_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_cupboard_counter'
          new_id: 'mcwbiomesoplenty:dead_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_dead_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_dead_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_dead_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_desk'
          new_id: 'mcwbiomesoplenty:stripped_dead_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_dead_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_dead_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_end_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_dead_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_dead_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_dead_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:dead_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:dead_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:dead_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:dead_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:dead_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:dead_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_dead_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_dead_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_dead_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_dead_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:dead_roof'
          new_id: 'mcwbiomesoplenty:dead_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_attic_roof'
          new_id: 'mcwbiomesoplenty:dead_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_top_roof'
          new_id: 'mcwbiomesoplenty:dead_top_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_top_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:dead_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:dead_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:dead_picket_fence'
          new_id: 'mcwbiomesoplenty:dead_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_stockade_fence'
          new_id: 'mcwbiomesoplenty:dead_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_horse_fence'
          new_id: 'mcwbiomesoplenty:dead_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_wired_fence'
          new_id: 'mcwbiomesoplenty:dead_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:dead_highley_gate'
          new_id: 'mcwbiomesoplenty:dead_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:dead_pyramid_gate'
          new_id: 'mcwbiomesoplenty:dead_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:dead_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:dead_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:dead_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_dead_bridge'
          new_id: 'mcwbiomesoplenty:rope_dead_bridge'
        }
        {
          old_id: 'macawsbridgesbop:dead_bridge_pier'
          new_id: 'mcwbiomesoplenty:dead_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:dead_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:dead_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:dead_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:dead_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:dead_rail_bridge'
          new_id: 'mcwbiomesoplenty:dead_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:fir_wardrobe'
          new_id: 'mcwbiomesoplenty:fir_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:fir_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:fir_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_wardrobe'
          new_id: 'mcwbiomesoplenty:fir_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:fir_bookshelf'
          new_id: 'mcwbiomesoplenty:fir_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:fir_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:fir_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:fir_drawer'
          new_id: 'mcwbiomesoplenty:fir_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_drawer'
          new_id: 'mcwbiomesoplenty:fir_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:fir_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:fir_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_large_drawer'
          new_id: 'mcwbiomesoplenty:fir_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:fir_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_triple_drawer'
          new_id: 'mcwbiomesoplenty:fir_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:fir_desk'
          new_id: 'mcwbiomesoplenty:fir_desk'
        }
        {
          old_id: 'mcwfurnituresbop:fir_covered_desk'
          new_id: 'mcwbiomesoplenty:fir_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:fir_modern_desk'
          new_id: 'mcwbiomesoplenty:fir_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:fir_table'
          new_id: 'mcwbiomesoplenty:fir_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_end_table'
          new_id: 'mcwbiomesoplenty:fir_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_coffee_table'
          new_id: 'mcwbiomesoplenty:fir_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_glass_table'
          new_id: 'mcwbiomesoplenty:fir_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:fir_chair'
          new_id: 'mcwbiomesoplenty:fir_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_modern_chair'
          new_id: 'mcwbiomesoplenty:fir_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_striped_chair'
          new_id: 'mcwbiomesoplenty:fir_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_stool_chair'
          new_id: 'mcwbiomesoplenty:fir_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:fir_counter'
          new_id: 'mcwbiomesoplenty:fir_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_drawer_counter'
          new_id: 'mcwbiomesoplenty:fir_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:fir_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_cupboard_counter'
          new_id: 'mcwbiomesoplenty:fir_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_fir_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_fir_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_fir_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_desk'
          new_id: 'mcwbiomesoplenty:stripped_fir_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_fir_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_fir_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_end_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_fir_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_fir_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_fir_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:fir_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:fir_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:fir_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:fir_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:fir_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:fir_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_fir_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_fir_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_fir_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_fir_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:fir_roof'
          new_id: 'mcwbiomesoplenty:fir_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_attic_roof'
          new_id: 'mcwbiomesoplenty:fir_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_top_roof'
          new_id: 'mcwbiomesoplenty:fir_top_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_top_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:fir_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:fir_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:fir_picket_fence'
          new_id: 'mcwbiomesoplenty:fir_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_stockade_fence'
          new_id: 'mcwbiomesoplenty:fir_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_horse_fence'
          new_id: 'mcwbiomesoplenty:fir_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_wired_fence'
          new_id: 'mcwbiomesoplenty:fir_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:fir_highley_gate'
          new_id: 'mcwbiomesoplenty:fir_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:fir_pyramid_gate'
          new_id: 'mcwbiomesoplenty:fir_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:fir_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:fir_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:fir_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_fir_bridge'
          new_id: 'mcwbiomesoplenty:rope_fir_bridge'
        }
        {
          old_id: 'macawsbridgesbop:fir_bridge_pier'
          new_id: 'mcwbiomesoplenty:fir_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:fir_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:fir_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:fir_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:fir_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:fir_rail_bridge'
          new_id: 'mcwbiomesoplenty:fir_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_wardrobe'
          new_id: 'mcwbiomesoplenty:hellbark_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:hellbark_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_wardrobe'
          new_id: 'mcwbiomesoplenty:hellbark_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_bookshelf'
          new_id: 'mcwbiomesoplenty:hellbark_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:hellbark_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_large_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_triple_drawer'
          new_id: 'mcwbiomesoplenty:hellbark_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_desk'
          new_id: 'mcwbiomesoplenty:hellbark_desk'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_covered_desk'
          new_id: 'mcwbiomesoplenty:hellbark_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_modern_desk'
          new_id: 'mcwbiomesoplenty:hellbark_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_table'
          new_id: 'mcwbiomesoplenty:hellbark_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_end_table'
          new_id: 'mcwbiomesoplenty:hellbark_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_coffee_table'
          new_id: 'mcwbiomesoplenty:hellbark_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_glass_table'
          new_id: 'mcwbiomesoplenty:hellbark_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_chair'
          new_id: 'mcwbiomesoplenty:hellbark_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_modern_chair'
          new_id: 'mcwbiomesoplenty:hellbark_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_striped_chair'
          new_id: 'mcwbiomesoplenty:hellbark_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_stool_chair'
          new_id: 'mcwbiomesoplenty:hellbark_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_counter'
          new_id: 'mcwbiomesoplenty:hellbark_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_drawer_counter'
          new_id: 'mcwbiomesoplenty:hellbark_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:hellbark_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_cupboard_counter'
          new_id: 'mcwbiomesoplenty:hellbark_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_desk'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_end_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:hellbark_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:hellbark_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:hellbark_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:hellbark_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_hellbark_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_hellbark_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:hellbark_roof'
          new_id: 'mcwbiomesoplenty:hellbark_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_attic_roof'
          new_id: 'mcwbiomesoplenty:hellbark_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_top_roof'
          new_id: 'mcwbiomesoplenty:hellbark_top_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_top_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:hellbark_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:hellbark_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:hellbark_picket_fence'
          new_id: 'mcwbiomesoplenty:hellbark_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_stockade_fence'
          new_id: 'mcwbiomesoplenty:hellbark_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_horse_fence'
          new_id: 'mcwbiomesoplenty:hellbark_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_wired_fence'
          new_id: 'mcwbiomesoplenty:hellbark_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:hellbark_highley_gate'
          new_id: 'mcwbiomesoplenty:hellbark_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:hellbark_pyramid_gate'
          new_id: 'mcwbiomesoplenty:hellbark_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:hellbark_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_hellbark_bridge'
          new_id: 'mcwbiomesoplenty:rope_hellbark_bridge'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_bridge_pier'
          new_id: 'mcwbiomesoplenty:hellbark_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:hellbark_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:hellbark_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:hellbark_rail_bridge'
          new_id: 'mcwbiomesoplenty:hellbark_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_wardrobe'
          new_id: 'mcwbiomesoplenty:jacaranda_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:jacaranda_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_wardrobe'
          new_id: 'mcwbiomesoplenty:jacaranda_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_bookshelf'
          new_id: 'mcwbiomesoplenty:jacaranda_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_large_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_triple_drawer'
          new_id: 'mcwbiomesoplenty:jacaranda_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_desk'
          new_id: 'mcwbiomesoplenty:jacaranda_desk'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_covered_desk'
          new_id: 'mcwbiomesoplenty:jacaranda_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_modern_desk'
          new_id: 'mcwbiomesoplenty:jacaranda_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_table'
          new_id: 'mcwbiomesoplenty:jacaranda_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_end_table'
          new_id: 'mcwbiomesoplenty:jacaranda_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_coffee_table'
          new_id: 'mcwbiomesoplenty:jacaranda_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_glass_table'
          new_id: 'mcwbiomesoplenty:jacaranda_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_modern_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_striped_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_stool_chair'
          new_id: 'mcwbiomesoplenty:jacaranda_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_drawer_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_cupboard_counter'
          new_id: 'mcwbiomesoplenty:jacaranda_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_desk'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_end_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:jacaranda_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:jacaranda_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:jacaranda_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:jacaranda_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_jacaranda_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_jacaranda_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_attic_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_top_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_top_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_top_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:jacaranda_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:jacaranda_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_picket_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_stockade_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_horse_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_wired_fence'
          new_id: 'mcwbiomesoplenty:jacaranda_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_highley_gate'
          new_id: 'mcwbiomesoplenty:jacaranda_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_pyramid_gate'
          new_id: 'mcwbiomesoplenty:jacaranda_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_jacaranda_bridge'
          new_id: 'mcwbiomesoplenty:rope_jacaranda_bridge'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_bridge_pier'
          new_id: 'mcwbiomesoplenty:jacaranda_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:jacaranda_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:jacaranda_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:jacaranda_rail_bridge'
          new_id: 'mcwbiomesoplenty:jacaranda_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:magic_wardrobe'
          new_id: 'mcwbiomesoplenty:magic_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:magic_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:magic_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_wardrobe'
          new_id: 'mcwbiomesoplenty:magic_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:magic_bookshelf'
          new_id: 'mcwbiomesoplenty:magic_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:magic_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:magic_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:magic_drawer'
          new_id: 'mcwbiomesoplenty:magic_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_drawer'
          new_id: 'mcwbiomesoplenty:magic_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:magic_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:magic_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_large_drawer'
          new_id: 'mcwbiomesoplenty:magic_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:magic_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_triple_drawer'
          new_id: 'mcwbiomesoplenty:magic_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:magic_desk'
          new_id: 'mcwbiomesoplenty:magic_desk'
        }
        {
          old_id: 'mcwfurnituresbop:magic_covered_desk'
          new_id: 'mcwbiomesoplenty:magic_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:magic_modern_desk'
          new_id: 'mcwbiomesoplenty:magic_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:magic_table'
          new_id: 'mcwbiomesoplenty:magic_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_end_table'
          new_id: 'mcwbiomesoplenty:magic_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_coffee_table'
          new_id: 'mcwbiomesoplenty:magic_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_glass_table'
          new_id: 'mcwbiomesoplenty:magic_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:magic_chair'
          new_id: 'mcwbiomesoplenty:magic_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_modern_chair'
          new_id: 'mcwbiomesoplenty:magic_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_striped_chair'
          new_id: 'mcwbiomesoplenty:magic_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_stool_chair'
          new_id: 'mcwbiomesoplenty:magic_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:magic_counter'
          new_id: 'mcwbiomesoplenty:magic_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_drawer_counter'
          new_id: 'mcwbiomesoplenty:magic_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:magic_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_cupboard_counter'
          new_id: 'mcwbiomesoplenty:magic_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_magic_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_magic_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_magic_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_desk'
          new_id: 'mcwbiomesoplenty:stripped_magic_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_magic_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_magic_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_end_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_magic_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_magic_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_magic_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:magic_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:magic_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:magic_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:magic_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:magic_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:magic_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_magic_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_magic_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_magic_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_magic_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:magic_roof'
          new_id: 'mcwbiomesoplenty:magic_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_attic_roof'
          new_id: 'mcwbiomesoplenty:magic_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_top_roof'
          new_id: 'mcwbiomesoplenty:magic_top_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_top_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:magic_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:magic_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:magic_picket_fence'
          new_id: 'mcwbiomesoplenty:magic_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_stockade_fence'
          new_id: 'mcwbiomesoplenty:magic_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_horse_fence'
          new_id: 'mcwbiomesoplenty:magic_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_wired_fence'
          new_id: 'mcwbiomesoplenty:magic_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:magic_highley_gate'
          new_id: 'mcwbiomesoplenty:magic_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:magic_pyramid_gate'
          new_id: 'mcwbiomesoplenty:magic_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:magic_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:magic_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:magic_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_magic_bridge'
          new_id: 'mcwbiomesoplenty:rope_magic_bridge'
        }
        {
          old_id: 'macawsbridgesbop:magic_bridge_pier'
          new_id: 'mcwbiomesoplenty:magic_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:magic_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:magic_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:magic_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:magic_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:magic_rail_bridge'
          new_id: 'mcwbiomesoplenty:magic_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_wardrobe'
          new_id: 'mcwbiomesoplenty:mahogany_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:mahogany_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_wardrobe'
          new_id: 'mcwbiomesoplenty:mahogany_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_bookshelf'
          new_id: 'mcwbiomesoplenty:mahogany_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:mahogany_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_large_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_triple_drawer'
          new_id: 'mcwbiomesoplenty:mahogany_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_desk'
          new_id: 'mcwbiomesoplenty:mahogany_desk'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_covered_desk'
          new_id: 'mcwbiomesoplenty:mahogany_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_modern_desk'
          new_id: 'mcwbiomesoplenty:mahogany_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_table'
          new_id: 'mcwbiomesoplenty:mahogany_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_end_table'
          new_id: 'mcwbiomesoplenty:mahogany_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_coffee_table'
          new_id: 'mcwbiomesoplenty:mahogany_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_glass_table'
          new_id: 'mcwbiomesoplenty:mahogany_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_chair'
          new_id: 'mcwbiomesoplenty:mahogany_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_modern_chair'
          new_id: 'mcwbiomesoplenty:mahogany_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_striped_chair'
          new_id: 'mcwbiomesoplenty:mahogany_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_stool_chair'
          new_id: 'mcwbiomesoplenty:mahogany_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_counter'
          new_id: 'mcwbiomesoplenty:mahogany_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_drawer_counter'
          new_id: 'mcwbiomesoplenty:mahogany_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:mahogany_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_cupboard_counter'
          new_id: 'mcwbiomesoplenty:mahogany_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_desk'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_end_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:mahogany_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:mahogany_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:mahogany_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:mahogany_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_mahogany_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_mahogany_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:mahogany_roof'
          new_id: 'mcwbiomesoplenty:mahogany_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_attic_roof'
          new_id: 'mcwbiomesoplenty:mahogany_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_top_roof'
          new_id: 'mcwbiomesoplenty:mahogany_top_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_top_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:mahogany_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:mahogany_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:mahogany_picket_fence'
          new_id: 'mcwbiomesoplenty:mahogany_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_stockade_fence'
          new_id: 'mcwbiomesoplenty:mahogany_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_horse_fence'
          new_id: 'mcwbiomesoplenty:mahogany_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_wired_fence'
          new_id: 'mcwbiomesoplenty:mahogany_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:mahogany_highley_gate'
          new_id: 'mcwbiomesoplenty:mahogany_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:mahogany_pyramid_gate'
          new_id: 'mcwbiomesoplenty:mahogany_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:mahogany_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_mahogany_bridge'
          new_id: 'mcwbiomesoplenty:rope_mahogany_bridge'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_bridge_pier'
          new_id: 'mcwbiomesoplenty:mahogany_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:mahogany_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:mahogany_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:mahogany_rail_bridge'
          new_id: 'mcwbiomesoplenty:mahogany_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:palm_wardrobe'
          new_id: 'mcwbiomesoplenty:palm_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:palm_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:palm_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_wardrobe'
          new_id: 'mcwbiomesoplenty:palm_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:palm_bookshelf'
          new_id: 'mcwbiomesoplenty:palm_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:palm_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:palm_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:palm_drawer'
          new_id: 'mcwbiomesoplenty:palm_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_drawer'
          new_id: 'mcwbiomesoplenty:palm_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:palm_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:palm_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_large_drawer'
          new_id: 'mcwbiomesoplenty:palm_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:palm_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_triple_drawer'
          new_id: 'mcwbiomesoplenty:palm_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:palm_desk'
          new_id: 'mcwbiomesoplenty:palm_desk'
        }
        {
          old_id: 'mcwfurnituresbop:palm_covered_desk'
          new_id: 'mcwbiomesoplenty:palm_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:palm_modern_desk'
          new_id: 'mcwbiomesoplenty:palm_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:palm_table'
          new_id: 'mcwbiomesoplenty:palm_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_end_table'
          new_id: 'mcwbiomesoplenty:palm_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_coffee_table'
          new_id: 'mcwbiomesoplenty:palm_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_glass_table'
          new_id: 'mcwbiomesoplenty:palm_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:palm_chair'
          new_id: 'mcwbiomesoplenty:palm_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_modern_chair'
          new_id: 'mcwbiomesoplenty:palm_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_striped_chair'
          new_id: 'mcwbiomesoplenty:palm_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_stool_chair'
          new_id: 'mcwbiomesoplenty:palm_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:palm_counter'
          new_id: 'mcwbiomesoplenty:palm_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_drawer_counter'
          new_id: 'mcwbiomesoplenty:palm_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:palm_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_cupboard_counter'
          new_id: 'mcwbiomesoplenty:palm_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_palm_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_palm_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_palm_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_desk'
          new_id: 'mcwbiomesoplenty:stripped_palm_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_palm_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_palm_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_end_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_palm_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_palm_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_palm_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:palm_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:palm_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:palm_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:palm_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:palm_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:palm_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_palm_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_palm_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_palm_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_palm_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:palm_roof'
          new_id: 'mcwbiomesoplenty:palm_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_attic_roof'
          new_id: 'mcwbiomesoplenty:palm_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_top_roof'
          new_id: 'mcwbiomesoplenty:palm_top_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_top_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:palm_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:palm_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:palm_picket_fence'
          new_id: 'mcwbiomesoplenty:palm_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_stockade_fence'
          new_id: 'mcwbiomesoplenty:palm_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_horse_fence'
          new_id: 'mcwbiomesoplenty:palm_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_wired_fence'
          new_id: 'mcwbiomesoplenty:palm_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:palm_highley_gate'
          new_id: 'mcwbiomesoplenty:palm_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:palm_pyramid_gate'
          new_id: 'mcwbiomesoplenty:palm_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:palm_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:palm_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:palm_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_palm_bridge'
          new_id: 'mcwbiomesoplenty:rope_palm_bridge'
        }
        {
          old_id: 'macawsbridgesbop:palm_bridge_pier'
          new_id: 'mcwbiomesoplenty:palm_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:palm_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:palm_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:palm_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:palm_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:palm_rail_bridge'
          new_id: 'mcwbiomesoplenty:palm_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_wardrobe'
          new_id: 'mcwbiomesoplenty:redwood_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:redwood_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_wardrobe'
          new_id: 'mcwbiomesoplenty:redwood_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_bookshelf'
          new_id: 'mcwbiomesoplenty:redwood_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:redwood_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_drawer'
          new_id: 'mcwbiomesoplenty:redwood_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_drawer'
          new_id: 'mcwbiomesoplenty:redwood_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:redwood_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:redwood_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_large_drawer'
          new_id: 'mcwbiomesoplenty:redwood_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:redwood_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_triple_drawer'
          new_id: 'mcwbiomesoplenty:redwood_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_desk'
          new_id: 'mcwbiomesoplenty:redwood_desk'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_covered_desk'
          new_id: 'mcwbiomesoplenty:redwood_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_modern_desk'
          new_id: 'mcwbiomesoplenty:redwood_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_table'
          new_id: 'mcwbiomesoplenty:redwood_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_end_table'
          new_id: 'mcwbiomesoplenty:redwood_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_coffee_table'
          new_id: 'mcwbiomesoplenty:redwood_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_glass_table'
          new_id: 'mcwbiomesoplenty:redwood_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_chair'
          new_id: 'mcwbiomesoplenty:redwood_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_modern_chair'
          new_id: 'mcwbiomesoplenty:redwood_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_striped_chair'
          new_id: 'mcwbiomesoplenty:redwood_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_stool_chair'
          new_id: 'mcwbiomesoplenty:redwood_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_counter'
          new_id: 'mcwbiomesoplenty:redwood_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_drawer_counter'
          new_id: 'mcwbiomesoplenty:redwood_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:redwood_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_cupboard_counter'
          new_id: 'mcwbiomesoplenty:redwood_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_redwood_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_redwood_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_redwood_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_desk'
          new_id: 'mcwbiomesoplenty:stripped_redwood_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_redwood_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_redwood_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_end_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_redwood_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_redwood_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_redwood_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:redwood_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:redwood_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:redwood_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:redwood_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_redwood_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_redwood_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_redwood_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_redwood_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:redwood_roof'
          new_id: 'mcwbiomesoplenty:redwood_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_attic_roof'
          new_id: 'mcwbiomesoplenty:redwood_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_top_roof'
          new_id: 'mcwbiomesoplenty:redwood_top_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_top_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:redwood_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:redwood_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:redwood_picket_fence'
          new_id: 'mcwbiomesoplenty:redwood_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_stockade_fence'
          new_id: 'mcwbiomesoplenty:redwood_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_horse_fence'
          new_id: 'mcwbiomesoplenty:redwood_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_wired_fence'
          new_id: 'mcwbiomesoplenty:redwood_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:redwood_highley_gate'
          new_id: 'mcwbiomesoplenty:redwood_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:redwood_pyramid_gate'
          new_id: 'mcwbiomesoplenty:redwood_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:redwood_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:redwood_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_redwood_bridge'
          new_id: 'mcwbiomesoplenty:rope_redwood_bridge'
        }
        {
          old_id: 'macawsbridgesbop:redwood_bridge_pier'
          new_id: 'mcwbiomesoplenty:redwood_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:redwood_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:redwood_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:redwood_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:redwood_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:redwood_rail_bridge'
          new_id: 'mcwbiomesoplenty:redwood_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_wardrobe'
          new_id: 'mcwbiomesoplenty:umbran_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:umbran_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_wardrobe'
          new_id: 'mcwbiomesoplenty:umbran_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_bookshelf'
          new_id: 'mcwbiomesoplenty:umbran_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:umbran_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_drawer'
          new_id: 'mcwbiomesoplenty:umbran_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_drawer'
          new_id: 'mcwbiomesoplenty:umbran_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:umbran_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:umbran_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_large_drawer'
          new_id: 'mcwbiomesoplenty:umbran_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:umbran_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_triple_drawer'
          new_id: 'mcwbiomesoplenty:umbran_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_desk'
          new_id: 'mcwbiomesoplenty:umbran_desk'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_covered_desk'
          new_id: 'mcwbiomesoplenty:umbran_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_modern_desk'
          new_id: 'mcwbiomesoplenty:umbran_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_table'
          new_id: 'mcwbiomesoplenty:umbran_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_end_table'
          new_id: 'mcwbiomesoplenty:umbran_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_coffee_table'
          new_id: 'mcwbiomesoplenty:umbran_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_glass_table'
          new_id: 'mcwbiomesoplenty:umbran_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_chair'
          new_id: 'mcwbiomesoplenty:umbran_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_modern_chair'
          new_id: 'mcwbiomesoplenty:umbran_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_striped_chair'
          new_id: 'mcwbiomesoplenty:umbran_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_stool_chair'
          new_id: 'mcwbiomesoplenty:umbran_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_counter'
          new_id: 'mcwbiomesoplenty:umbran_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_drawer_counter'
          new_id: 'mcwbiomesoplenty:umbran_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:umbran_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_cupboard_counter'
          new_id: 'mcwbiomesoplenty:umbran_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_umbran_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_umbran_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_umbran_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_desk'
          new_id: 'mcwbiomesoplenty:stripped_umbran_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_umbran_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_umbran_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_end_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_umbran_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_umbran_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_umbran_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:umbran_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:umbran_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:umbran_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:umbran_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_umbran_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_umbran_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_umbran_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_umbran_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:umbran_roof'
          new_id: 'mcwbiomesoplenty:umbran_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_attic_roof'
          new_id: 'mcwbiomesoplenty:umbran_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_top_roof'
          new_id: 'mcwbiomesoplenty:umbran_top_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_top_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:umbran_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:umbran_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:umbran_picket_fence'
          new_id: 'mcwbiomesoplenty:umbran_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_stockade_fence'
          new_id: 'mcwbiomesoplenty:umbran_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_horse_fence'
          new_id: 'mcwbiomesoplenty:umbran_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_wired_fence'
          new_id: 'mcwbiomesoplenty:umbran_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:umbran_highley_gate'
          new_id: 'mcwbiomesoplenty:umbran_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:umbran_pyramid_gate'
          new_id: 'mcwbiomesoplenty:umbran_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:umbran_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:umbran_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_umbran_bridge'
          new_id: 'mcwbiomesoplenty:rope_umbran_bridge'
        }
        {
          old_id: 'macawsbridgesbop:umbran_bridge_pier'
          new_id: 'mcwbiomesoplenty:umbran_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:umbran_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:umbran_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:umbran_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:umbran_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:umbran_rail_bridge'
          new_id: 'mcwbiomesoplenty:umbran_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:willow_wardrobe'
          new_id: 'mcwbiomesoplenty:willow_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:willow_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:willow_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_wardrobe'
          new_id: 'mcwbiomesoplenty:willow_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:willow_bookshelf'
          new_id: 'mcwbiomesoplenty:willow_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:willow_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:willow_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:willow_drawer'
          new_id: 'mcwbiomesoplenty:willow_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_drawer'
          new_id: 'mcwbiomesoplenty:willow_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:willow_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:willow_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_large_drawer'
          new_id: 'mcwbiomesoplenty:willow_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:willow_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_triple_drawer'
          new_id: 'mcwbiomesoplenty:willow_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:willow_desk'
          new_id: 'mcwbiomesoplenty:willow_desk'
        }
        {
          old_id: 'mcwfurnituresbop:willow_covered_desk'
          new_id: 'mcwbiomesoplenty:willow_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:willow_modern_desk'
          new_id: 'mcwbiomesoplenty:willow_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:willow_table'
          new_id: 'mcwbiomesoplenty:willow_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_end_table'
          new_id: 'mcwbiomesoplenty:willow_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_coffee_table'
          new_id: 'mcwbiomesoplenty:willow_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_glass_table'
          new_id: 'mcwbiomesoplenty:willow_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:willow_chair'
          new_id: 'mcwbiomesoplenty:willow_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_modern_chair'
          new_id: 'mcwbiomesoplenty:willow_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_striped_chair'
          new_id: 'mcwbiomesoplenty:willow_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_stool_chair'
          new_id: 'mcwbiomesoplenty:willow_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:willow_counter'
          new_id: 'mcwbiomesoplenty:willow_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_drawer_counter'
          new_id: 'mcwbiomesoplenty:willow_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:willow_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_cupboard_counter'
          new_id: 'mcwbiomesoplenty:willow_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_willow_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_willow_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_willow_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_desk'
          new_id: 'mcwbiomesoplenty:stripped_willow_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_willow_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_willow_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_end_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_willow_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_willow_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_willow_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:willow_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:willow_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:willow_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:willow_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:willow_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:willow_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_willow_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_willow_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_willow_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_willow_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:willow_roof'
          new_id: 'mcwbiomesoplenty:willow_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_attic_roof'
          new_id: 'mcwbiomesoplenty:willow_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_top_roof'
          new_id: 'mcwbiomesoplenty:willow_top_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_top_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:willow_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:willow_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:willow_picket_fence'
          new_id: 'mcwbiomesoplenty:willow_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_stockade_fence'
          new_id: 'mcwbiomesoplenty:willow_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_horse_fence'
          new_id: 'mcwbiomesoplenty:willow_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_wired_fence'
          new_id: 'mcwbiomesoplenty:willow_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:willow_highley_gate'
          new_id: 'mcwbiomesoplenty:willow_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:willow_pyramid_gate'
          new_id: 'mcwbiomesoplenty:willow_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:willow_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:willow_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:willow_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_willow_bridge'
          new_id: 'mcwbiomesoplenty:rope_willow_bridge'
        }
        {
          old_id: 'macawsbridgesbop:willow_bridge_pier'
          new_id: 'mcwbiomesoplenty:willow_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:willow_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:willow_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:willow_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:willow_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:willow_rail_bridge'
          new_id: 'mcwbiomesoplenty:willow_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_wardrobe'
          new_id: 'mcwbiomesoplenty:empyreal_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:empyreal_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_wardrobe'
          new_id: 'mcwbiomesoplenty:empyreal_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_bookshelf'
          new_id: 'mcwbiomesoplenty:empyreal_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:empyreal_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_large_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_triple_drawer'
          new_id: 'mcwbiomesoplenty:empyreal_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_desk'
          new_id: 'mcwbiomesoplenty:empyreal_desk'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_covered_desk'
          new_id: 'mcwbiomesoplenty:empyreal_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_modern_desk'
          new_id: 'mcwbiomesoplenty:empyreal_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_table'
          new_id: 'mcwbiomesoplenty:empyreal_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_end_table'
          new_id: 'mcwbiomesoplenty:empyreal_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_coffee_table'
          new_id: 'mcwbiomesoplenty:empyreal_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_glass_table'
          new_id: 'mcwbiomesoplenty:empyreal_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_chair'
          new_id: 'mcwbiomesoplenty:empyreal_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_modern_chair'
          new_id: 'mcwbiomesoplenty:empyreal_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_striped_chair'
          new_id: 'mcwbiomesoplenty:empyreal_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_stool_chair'
          new_id: 'mcwbiomesoplenty:empyreal_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_counter'
          new_id: 'mcwbiomesoplenty:empyreal_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_drawer_counter'
          new_id: 'mcwbiomesoplenty:empyreal_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:empyreal_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_cupboard_counter'
          new_id: 'mcwbiomesoplenty:empyreal_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_desk'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_end_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:empyreal_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:empyreal_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:empyreal_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:empyreal_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_empyreal_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_empyreal_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:empyreal_roof'
          new_id: 'mcwbiomesoplenty:empyreal_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_attic_roof'
          new_id: 'mcwbiomesoplenty:empyreal_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_top_roof'
          new_id: 'mcwbiomesoplenty:empyreal_top_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_top_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:empyreal_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:empyreal_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:empyreal_picket_fence'
          new_id: 'mcwbiomesoplenty:empyreal_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_stockade_fence'
          new_id: 'mcwbiomesoplenty:empyreal_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_horse_fence'
          new_id: 'mcwbiomesoplenty:empyreal_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_wired_fence'
          new_id: 'mcwbiomesoplenty:empyreal_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:empyreal_highley_gate'
          new_id: 'mcwbiomesoplenty:empyreal_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:empyreal_pyramid_gate'
          new_id: 'mcwbiomesoplenty:empyreal_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:empyreal_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_empyreal_bridge'
          new_id: 'mcwbiomesoplenty:rope_empyreal_bridge'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_bridge_pier'
          new_id: 'mcwbiomesoplenty:empyreal_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:empyreal_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:empyreal_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:empyreal_rail_bridge'
          new_id: 'mcwbiomesoplenty:empyreal_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:maple_wardrobe'
          new_id: 'mcwbiomesoplenty:maple_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:maple_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:maple_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_wardrobe'
          new_id: 'mcwbiomesoplenty:maple_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:maple_bookshelf'
          new_id: 'mcwbiomesoplenty:maple_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:maple_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:maple_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:maple_drawer'
          new_id: 'mcwbiomesoplenty:maple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_drawer'
          new_id: 'mcwbiomesoplenty:maple_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:maple_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:maple_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_large_drawer'
          new_id: 'mcwbiomesoplenty:maple_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:maple_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_triple_drawer'
          new_id: 'mcwbiomesoplenty:maple_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:maple_desk'
          new_id: 'mcwbiomesoplenty:maple_desk'
        }
        {
          old_id: 'mcwfurnituresbop:maple_covered_desk'
          new_id: 'mcwbiomesoplenty:maple_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:maple_modern_desk'
          new_id: 'mcwbiomesoplenty:maple_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:maple_table'
          new_id: 'mcwbiomesoplenty:maple_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_end_table'
          new_id: 'mcwbiomesoplenty:maple_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_coffee_table'
          new_id: 'mcwbiomesoplenty:maple_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_glass_table'
          new_id: 'mcwbiomesoplenty:maple_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:maple_chair'
          new_id: 'mcwbiomesoplenty:maple_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_modern_chair'
          new_id: 'mcwbiomesoplenty:maple_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_striped_chair'
          new_id: 'mcwbiomesoplenty:maple_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_stool_chair'
          new_id: 'mcwbiomesoplenty:maple_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:maple_counter'
          new_id: 'mcwbiomesoplenty:maple_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_drawer_counter'
          new_id: 'mcwbiomesoplenty:maple_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:maple_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_cupboard_counter'
          new_id: 'mcwbiomesoplenty:maple_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_maple_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_maple_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_maple_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_desk'
          new_id: 'mcwbiomesoplenty:stripped_maple_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_maple_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_maple_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_end_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_maple_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_maple_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_maple_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:maple_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:maple_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:maple_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:maple_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:maple_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:maple_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_maple_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_maple_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_maple_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_maple_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:maple_roof'
          new_id: 'mcwbiomesoplenty:maple_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_attic_roof'
          new_id: 'mcwbiomesoplenty:maple_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_top_roof'
          new_id: 'mcwbiomesoplenty:maple_top_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_top_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:maple_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:maple_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:maple_picket_fence'
          new_id: 'mcwbiomesoplenty:maple_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_stockade_fence'
          new_id: 'mcwbiomesoplenty:maple_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_horse_fence'
          new_id: 'mcwbiomesoplenty:maple_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_wired_fence'
          new_id: 'mcwbiomesoplenty:maple_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:maple_highley_gate'
          new_id: 'mcwbiomesoplenty:maple_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:maple_pyramid_gate'
          new_id: 'mcwbiomesoplenty:maple_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:maple_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:maple_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:maple_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_maple_bridge'
          new_id: 'mcwbiomesoplenty:rope_maple_bridge'
        }
        {
          old_id: 'macawsbridgesbop:maple_bridge_pier'
          new_id: 'mcwbiomesoplenty:maple_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:maple_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:maple_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:maple_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:maple_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:maple_rail_bridge'
          new_id: 'mcwbiomesoplenty:maple_rail_bridge'
        }
        {
          old_id: 'mcwfurnituresbop:pine_wardrobe'
          new_id: 'mcwbiomesoplenty:pine_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:pine_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:pine_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_wardrobe'
          new_id: 'mcwbiomesoplenty:pine_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:pine_bookshelf'
          new_id: 'mcwbiomesoplenty:pine_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:pine_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:pine_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:pine_drawer'
          new_id: 'mcwbiomesoplenty:pine_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_drawer'
          new_id: 'mcwbiomesoplenty:pine_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:pine_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:pine_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_large_drawer'
          new_id: 'mcwbiomesoplenty:pine_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:pine_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_triple_drawer'
          new_id: 'mcwbiomesoplenty:pine_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:pine_desk'
          new_id: 'mcwbiomesoplenty:pine_desk'
        }
        {
          old_id: 'mcwfurnituresbop:pine_covered_desk'
          new_id: 'mcwbiomesoplenty:pine_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:pine_modern_desk'
          new_id: 'mcwbiomesoplenty:pine_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:pine_table'
          new_id: 'mcwbiomesoplenty:pine_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_end_table'
          new_id: 'mcwbiomesoplenty:pine_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_coffee_table'
          new_id: 'mcwbiomesoplenty:pine_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_glass_table'
          new_id: 'mcwbiomesoplenty:pine_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:pine_chair'
          new_id: 'mcwbiomesoplenty:pine_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_modern_chair'
          new_id: 'mcwbiomesoplenty:pine_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_striped_chair'
          new_id: 'mcwbiomesoplenty:pine_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_stool_chair'
          new_id: 'mcwbiomesoplenty:pine_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:pine_counter'
          new_id: 'mcwbiomesoplenty:pine_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_drawer_counter'
          new_id: 'mcwbiomesoplenty:pine_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:pine_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_cupboard_counter'
          new_id: 'mcwbiomesoplenty:pine_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_pine_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_modern_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_pine_modern_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_wardrobe'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_wardrobe'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_bookshelf'
          new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_cupboard'
          new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_cupboard'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_lower_bookshelf_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_lower_bookshelf_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_large_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_large_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_lower_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_lower_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_triple_drawer'
          new_id: 'mcwbiomesoplenty:stripped_pine_triple_drawer'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_desk'
          new_id: 'mcwbiomesoplenty:stripped_pine_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_covered_desk'
          new_id: 'mcwbiomesoplenty:stripped_pine_covered_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_modern_desk'
          new_id: 'mcwbiomesoplenty:stripped_pine_modern_desk'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_end_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_end_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_coffee_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_coffee_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_glass_table'
          new_id: 'mcwbiomesoplenty:stripped_pine_glass_table'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_modern_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_modern_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_striped_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_striped_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_stool_chair'
          new_id: 'mcwbiomesoplenty:stripped_pine_stool_chair'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_drawer_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_drawer_counter'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_cupboard_counter'
          new_id: 'mcwbiomesoplenty:stripped_pine_cupboard_counter'
        }
        {
          old_id: 'mcwfurnituresbop:pine_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:pine_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:pine_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:pine_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:pine_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:pine_glass_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_pine_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_double_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_pine_double_kitchen_cabinet'
        }
        {
          old_id: 'mcwfurnituresbop:stripped_pine_glass_kitchen_cabinet'
          new_id: 'mcwbiomesoplenty:stripped_pine_glass_kitchen_cabinet'
        }
        {
          old_id: 'macawsroofsbop:pine_roof'
          new_id: 'mcwbiomesoplenty:pine_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_attic_roof'
          new_id: 'mcwbiomesoplenty:pine_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_top_roof'
          new_id: 'mcwbiomesoplenty:pine_top_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_upper_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_attic_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_attic_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_top_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_top_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_steep_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_upper_lower_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_upper_lower_roof'
        }
        {
          old_id: 'macawsroofsbop:pine_planks_upper_steep_roof'
          new_id: 'mcwbiomesoplenty:pine_planks_upper_steep_roof'
        }
        {
          old_id: 'mcwfencesbop:pine_picket_fence'
          new_id: 'mcwbiomesoplenty:pine_picket_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_stockade_fence'
          new_id: 'mcwbiomesoplenty:pine_stockade_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_horse_fence'
          new_id: 'mcwbiomesoplenty:pine_horse_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_wired_fence'
          new_id: 'mcwbiomesoplenty:pine_wired_fence'
        }
        {
          old_id: 'mcwfencesbop:pine_highley_gate'
          new_id: 'mcwbiomesoplenty:pine_highley_gate'
        }
        {
          old_id: 'mcwfencesbop:pine_pyramid_gate'
          new_id: 'mcwbiomesoplenty:pine_pyramid_gate'
        }
        {
          old_id: 'macawsbridgesbop:pine_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:pine_log_bridge_middle'
          new_id: 'mcwbiomesoplenty:pine_log_bridge_middle'
        }
        {
          old_id: 'macawsbridgesbop:rope_pine_bridge'
          new_id: 'mcwbiomesoplenty:rope_pine_bridge'
        }
        {
          old_id: 'macawsbridgesbop:pine_bridge_pier'
          new_id: 'mcwbiomesoplenty:pine_bridge_pier'
        }
        {
          old_id: 'macawsbridgesbop:pine_log_bridge_stair'
          new_id: 'mcwbiomesoplenty:pine_log_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:pine_rope_bridge_stair'
          new_id: 'mcwbiomesoplenty:pine_rope_bridge_stair'
        }
        {
          old_id: 'macawsbridgesbop:pine_rail_bridge'
          new_id: 'mcwbiomesoplenty:pine_rail_bridge'
        }
        {
          old_id: 'mcwfencesbop:dead_hedge'
          new_id: 'mcwbiomesoplenty:dead_hedge'
        }
        {
          old_id: 'mcwfencesbop:fir_hedge'
          new_id: 'mcwbiomesoplenty:fir_hedge'
        }
        {
          old_id: 'mcwfencesbop:hellbark_hedge'
          new_id: 'mcwbiomesoplenty:hellbark_hedge'
        }
        {
          old_id: 'mcwfencesbop:jacaranda_hedge'
          new_id: 'mcwbiomesoplenty:jacaranda_hedge'
        }
        {
          old_id: 'mcwfencesbop:magic_hedge'
          new_id: 'mcwbiomesoplenty:magic_hedge'
        }
        {
          old_id: 'mcwfencesbop:mahogany_hedge'
          new_id: 'mcwbiomesoplenty:mahogany_hedge'
        }
        {
          old_id: 'mcwfencesbop:palm_hedge'
          new_id: 'mcwbiomesoplenty:palm_hedge'
        }
        {
          old_id: 'mcwfencesbop:redwood_hedge'
          new_id: 'mcwbiomesoplenty:redwood_hedge'
        }
        {
          old_id: 'mcwfencesbop:umbran_hedge'
          new_id: 'mcwbiomesoplenty:umbran_hedge'
        }
        {
          old_id: 'mcwfencesbop:willow_hedge'
          new_id: 'mcwbiomesoplenty:willow_hedge'
        }
        {
          old_id: 'mcwfencesbop:empyreal_hedge'
          new_id: 'mcwbiomesoplenty:empyreal_hedge'
        }
        {
          old_id: 'mcwfencesbop:pine_hedge'
          new_id: 'mcwbiomesoplenty:pine_hedge'
        }
        {
          old_id: 'mcwfencesbop:orange_maple_hedge'
          new_id: 'mcwbiomesoplenty:orange_maple_hedge'
        }
        {
          old_id: 'mcwfencesbop:red_maple_hedge'
          new_id: 'mcwbiomesoplenty:red_maple_hedge'
        }
        {
          old_id: 'mcwfencesbop:yellow_maple_hedge'
          new_id: 'mcwbiomesoplenty:yellow_maple_hedge'
        }
        {
          old_id: 'mcwfencesbop:cypress_hedge'
          new_id: 'mcwbiomesoplenty:cypress_hedge'
        }
        {
          old_id: 'mcwfencesbop:snowblossom_hedge'
          new_id: 'mcwbiomesoplenty:snowblossom_hedge'
        }
        {
          old_id: 'mcwfencesbop:flowering_oak_hedge'
          new_id: 'mcwbiomesoplenty:flowering_oak_hedge'
        }
        {
          old_id: 'mcwfencesbop:rainbow_birch_hedge'
          new_id: 'mcwbiomesoplenty:rainbow_birch_hedge'
        }
        {
          old_id: 'mcwfencesbop:origin_hedge'
          new_id: 'mcwbiomesoplenty:origin_hedge'
        }
]
  }
]