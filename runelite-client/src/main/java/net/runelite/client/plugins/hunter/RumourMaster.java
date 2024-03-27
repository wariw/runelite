package net.runelite.client.plugins.hunter;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public enum RumourMaster {
    GILMAN("Huntmaster Gilman", RumourTier.NOVICE),
    CERVUS("Guild Hunter Cervus", RumourTier.ADEPT),
    ORNUS("Guild Hunter Ornus", RumourTier.ADEPT),
    ACO("Guild Hunter Aco", RumourTier.EXPERT),
    TECO("Guild Hunter Teco", RumourTier.EXPERT),
    WOLF("Guild Hunter Wolf", RumourTier.MASTER);

    private final String name;
    private final RumourTier tier;

    private static final Map<String, RumourMaster> masters;

    RumourMaster(String name, RumourTier tier) {
        this.name = name;
        this.tier = tier;
    }

    static {
        ImmutableMap.Builder<String, RumourMaster> builder = new ImmutableMap.Builder<>();

        for (RumourMaster master : values()) {
            builder.put(master.getName().toLowerCase(), master);
        }

        masters = builder.build();
    }

    static RumourMaster getMaster(String name) {
        return masters.get(name.toLowerCase());
    }

}
