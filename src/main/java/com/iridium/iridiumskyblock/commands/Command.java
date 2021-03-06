package com.iridium.iridiumskyblock.commands;

import com.iridium.iridiumskyblock.Island;
import java.util.List;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public abstract class Command {
    @NotNull public final List<String> aliases;
    @NotNull public final String description;
    @NotNull public final String permission;
    public final boolean player;
    public final boolean enabled = true;

    public Command(@NotNull List<String> aliases, @NotNull String description, @NotNull String permission, boolean player) {
        this.aliases = aliases;
        this.description = description;
        this.permission = permission;
        this.player = player;
    }

    public abstract void execute(CommandSender sender, String[] args);

    public abstract void admin(CommandSender sender, String[] args, Island island);

    public abstract List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args);
}
