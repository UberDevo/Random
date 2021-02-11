package me.uberdevo.random.util;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */
public class C {
    public static String translate(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }

    public static List<String> translateFromArray(List<String> text) {
        List<String> messages = new ArrayList<>();

        for (String string : text) {
            messages.add(translate(string));
        }
        return messages;
    }
}