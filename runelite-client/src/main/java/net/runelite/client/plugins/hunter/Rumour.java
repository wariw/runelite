package net.runelite.client.plugins.hunter;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.ItemID;

import javax.annotation.Nullable;
import java.util.Map;

@Getter
public enum Rumour {
    TROPICAL_WAGTAIL("Tropical wagtail", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    WILD_KEBBIT("Wild kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SAPPHIRE_GLACIALIS("Sapphire glacialis", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SWAMP_LIZARD("Swamp lizard", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SPINED_LARUPIA("Spined larupia", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    BARB_TAILED_KEBBIT("Barb-tailed kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SNOWY_KNIGHT("Snowy knight", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    PRICKLY_KEBBIT("Prickly kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    EMBERTAILED_JERBOA("Embertailed jerboa", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    HORNED_GRAAHK("Horned graahk", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SPOTTED_KEBBIT("Spotted kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    BLACK_WARLOCK("Black warlock", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    ORANGE_SALAMANDER("Orange salamander", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    RAZOR_BACKED_KEBBIT("Razor-backed kebbit", ItemID.KEBBIT_9954, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SABRE_TOOTHED_KEBBIT("Sabre-toothed kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    GREY_CHINCHOMPA("Grey Chinchompa", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SABRE_TOOTHED_KYATT("Sabre-toothed kyatt", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    DARK_KEBBIT("Dark Kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    PYRE_FOX("Pyre Fox", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    RED_SALAMANDER("Red Salamander", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    RED_CHINCHOMPA("Red Chinchompa", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SUNLIGHT_MOTH("Sunlight Moth", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    DASHING_KEBBIT("Dashing kebbit", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    SUNLIGHT_ANTELOPE("Sunlight antelope", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    MOONLIGHT_MOTH("Moonlight Moth", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    TECU_SALAMANDER("Tecu Salamander", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    HERBIBOAR("Herbiboar", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE),
    MOONLIGHT_ANTELOPE("Moonlight Antelope", ItemID.TROPICAL_WAGTAIL, ItemID.TAILFEATHERS, ItemID.BIRD_SNARE);


    private final String name;
    private final int creatureSpriteId;
    private final int rarePartSpriteId;
    private final int methodSpriteId;

    private static final Map<String, Rumour> rumours;

    Rumour(String name, int itemSpriteId, int rarePartSpriteId, int methodSpriteId)
    {
        Preconditions.checkArgument(itemSpriteId >= 0);

        this.name = name;
        this.creatureSpriteId = itemSpriteId;
        this.rarePartSpriteId = rarePartSpriteId;
        this.methodSpriteId = methodSpriteId;
    }

    static
    {
        ImmutableMap.Builder<String, Rumour> builder = new ImmutableMap.Builder<>();

        for (Rumour rumour : values())
        {
            builder.put(rumour.getName().toLowerCase(), rumour);
        }

        rumours = builder.build();
    }

    static Rumour getRumour(String creatureName)
    {
        return rumours.get(creatureName.toLowerCase());
    }
}
