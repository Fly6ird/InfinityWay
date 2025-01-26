package huix.infinity.common.core.attachment;

import com.mojang.serialization.Codec;
import huix.infinity.init.InfinityWay;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class IFWAttachment {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, InfinityWay.MOD_ID);

    public static final Supplier<AttachmentType<Integer>> respawn_xp = ATTACHMENT_TYPES.register(
            "respawn_xp", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );

    public static final Supplier<AttachmentType<Float>> food = ATTACHMENT_TYPES.register(
            "food", () -> AttachmentType.builder(() -> 0.0F).serialize(Codec.FLOAT).build()
    );
    public static final Supplier<AttachmentType<Float>> water = ATTACHMENT_TYPES.register(
            "water", () -> AttachmentType.builder(() -> 0.0F).serialize(Codec.FLOAT).build()
    );
    public static final Supplier<AttachmentType<Float>> freedom = ATTACHMENT_TYPES.register(
            "freedom", () -> AttachmentType.builder(() -> 0.0F).serialize(Codec.FLOAT).build()
    );
    public static final Supplier<AttachmentType<Integer>> production_counter = ATTACHMENT_TYPES.register(
            "production_counter", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Integer>> manure_period = ATTACHMENT_TYPES.register(
            "manure_period", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Integer>> manure_countdown = ATTACHMENT_TYPES.register(
            "manure_countdown", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );



}
