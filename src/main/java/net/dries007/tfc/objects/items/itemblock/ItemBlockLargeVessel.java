/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.objects.items.itemblock;

import javax.annotation.Nullable;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import net.dries007.tfc.api.capability.heat.ItemHeatHandler;
import net.dries007.tfc.objects.blocks.BlockLargeVessel;

public class ItemBlockLargeVessel extends ItemBlock
{
    public ItemBlockLargeVessel(BlockLargeVessel block)
    {
        super(block);
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt)
    {
        // Since this is technically still a pottery item, despite being a block
        return new ItemHeatHandler(nbt, 1.0f, 1599f);
    }
}
