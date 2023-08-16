package net.mcreator.queens.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;

import net.mcreator.queens.block.BlockWeedStage6;
import net.mcreator.queens.ElementsQueens;

@ElementsQueens.ModElement.Tag
public class ProcedureStage5Update extends ElementsQueens.ModElement {
	public ProcedureStage5Update(ElementsQueens instance) {
		super(instance, 25);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Stage5Update!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Stage5Update!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Stage5Update!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Stage5Update!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double casuale = 0;
		casuale = (double) Math.random();
		if (((casuale) >= 0.99)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockWeedStage6.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}