package cn.nukkit.entity.mob;

import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * @author Erik Miller | EinBexiii
 */
public class EntityZoglin extends EntityMob {

    public final static int NETWORK_ID = 126;

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    public EntityZoglin(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    protected void initEntity() {
        super.initEntity();
        this.setMaxHealth(40);
    }

    @Override
    public float getWidth() {
        return 0.9f;
    }

    @Override
    public float getHeight() {
        return 0.9f;
    }

    @Override
    public String getName() {
        return "Zoglin";
    }
}
