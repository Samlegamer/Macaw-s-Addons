# Macaw-s-Addons

This repository contains a collection of addons for Macaw's Mods.
These add-ons are not officially affiliated with the original Macaw's Mods. If you encounter any issues with the add-ons, please report them here.

This repository works as follows:

1 - A folder with the mod's original name, such as “Quark”.

2 - Then, several folders representing the versions, such as “1.16.5” or “1.18.2.” These folders contain the Forge, Fabric, or Neoforge MDKs—which is specified for Fabric and Neoforge—as well as for projects using Multiloader.

3 - These folders also contain global resources, such as assets or logos, that can be reused during development.

4 - Most MDKs often use the same dependencies and keys and are therefore imported from other folders via “gradle.properties” files.