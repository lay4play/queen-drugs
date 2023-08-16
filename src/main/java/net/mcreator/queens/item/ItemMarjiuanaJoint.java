
package net.mcreator.queens.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.queens.procedure.ProcedureMarijuanaJointRightClickedInAir;
import net.mcreator.queens.creativetab.TabQueens;
import net.mcreator.queens.ElementsQueens;

@ElementsQueens.ModElement.Tag
public class ItemMarjiuanaJoint extends ElementsQueens.ModElement {
	@GameRegistry.ObjectHolder("queens:marjiuanajoint")
	public static final Item block = null;
	public ItemMarjiuanaJoint(ElementsQueens instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("queens:marjiuanajoint", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(2, 0f, true);
			setUnlocalizedName("marjiuanajoint");
			setRegistryName("marjiuanajoint");
			setAlwaysEdible();
			setCreativeTab(TabQueens.tab);
			setMaxStackSize(16);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureMarijuanaJointRightClickedInAir.executeProcedure($_dependencies);
			}
		}
	}
}
