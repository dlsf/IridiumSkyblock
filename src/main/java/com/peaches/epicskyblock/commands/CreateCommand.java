package com.peaches.epicskyblock.commands;

import com.peaches.epicskyblock.EpicSkyblock;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateCommand extends Command {

    public CreateCommand() {
        super(new ArrayList<>(Arrays.asList("create")), "EpicSkyblock.create", true);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        if (EpicSkyblock.getIslandManager().islands.containsKey(p.getName())) {
            sender.sendMessage("You already have an island");
        } else {
            EpicSkyblock.getIslandManager().createIsland(p);
        }
    }

    @Override
    public List<String> TabComplete(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        return null;
    }
}
