package dev.fabled.edprisonsellpriceexpansion;

import com.edwardbelt.edprison.EdPrison;
import com.edwardbelt.edprison.api.models.AutosellModel;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class EdPrisonSellPriceExpansion extends PlaceholderExpansion {

    private AutosellModel autosellApi;

    @Override
    public @NotNull String getIdentifier() {
        return "edsellprice";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Mantice";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getRequiredPlugin() {
        return "EdPrison";
    }

    @Override
    public boolean canRegister() {
        final Plugin plugin = Bukkit.getPluginManager().getPlugin(getRequiredPlugin());
        if (!(plugin instanceof EdPrison)) {
            return false;
        }

        final EdPrison edPrison = (EdPrison) plugin;
        autosellApi = edPrison.getApi().getAutosellApi();
        return true;
    }

    @Override
    public @Nullable String onRequest(final @NotNull OfflinePlayer player, final @NotNull String params) {
        if (!params.contains(":")) {
            return null;
        }

        final String[] split = params.split(":");
        if (split.length < 2) {
            return null;
        }

        final Material material;
        try { material = Material.valueOf(split[1].toUpperCase()); }
        catch (IllegalArgumentException e) {
            return null;
        }

        final Map<String, Double> materialCurrencies = autosellApi.getMaterialCurrencies(material, player.getUniqueId());
        final String value = String.valueOf(materialCurrencies.getOrDefault(split[0], 0.0d));

        if (split.length == 3 && split[2].equalsIgnoreCase("int") && value.endsWith(".0")) {
            return value.substring(0, value.length() - 2);
        }

        return value;
    }

}
